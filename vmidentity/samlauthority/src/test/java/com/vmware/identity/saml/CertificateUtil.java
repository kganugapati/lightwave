/*
 *  Copyright (c) 2012-2015 VMware, Inc.  All Rights Reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not
 *  use this file except in compliance with the License.  You may obtain a copy
 *  of the License at http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS, without
 *  warranties or conditions of any kind, EITHER EXPRESS OR IMPLIED.  See the
 *  License for the specific language governing permissions and limitations
 *  under the License.
 */
package com.vmware.identity.saml;

import java.io.InputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;

/**
 * This class is responsible for test certificate provisioning
 */
public final class CertificateUtil {

   public static final String STS_CERT_ALIAS = "stskey";
   private static final String CERT_STORE_JKS = "sts-store.jks";
   private static final String PASSWORD = "ca$hc0w";
   private final KeyStore ks;

   public CertificateUtil() {
      ks = loadKeyStore();
   }

   private KeyStore loadKeyStore() {
      try {
         KeyStore ks = KeyStore.getInstance(KeyStore.getDefaultType());
         InputStream is = this.getClass().getClassLoader()
            .getResourceAsStream(CERT_STORE_JKS);
         ks.load(is, PASSWORD.toCharArray());

         return ks;
      } catch (Exception e) {
         throw new IllegalStateException("Bad setup!", e);
      }

   }

   /**
    * @param alias not null
    * @return the certificate matching the given alias
    */
   public X509Certificate loadCert(String alias) {
      assert alias != null;
      try {
         X509Certificate cert = (X509Certificate) ks.getCertificate(alias);
         assert cert != null;
         return cert;
      } catch (KeyStoreException e) {
         throw new IllegalStateException("Bad setup!", e);
      }
   }

   /**
    * @param alias not null
    * @return the certificate chain matching the given alias
    */
   public Certificate[] loadCertPath(String alias) {
      assert alias != null;
      try {
         Certificate[] certs = ks.getCertificateChain(alias);
         assert certs != null;
         return certs;
      } catch (KeyStoreException e) {
         throw new IllegalStateException("Bad setup!", e);
      }
   }

   public PrivateKey loadPrivateKey(String alias) {
      try {
         return (PrivateKey)ks.getKey(alias, PASSWORD.toCharArray());
      } catch (UnrecoverableKeyException e) {
         throw new IllegalStateException("Bad setup!", e);
      } catch (KeyStoreException e) {
         throw new IllegalStateException("Bad setup!", e);
      } catch (NoSuchAlgorithmException e) {
         throw new IllegalStateException("Bad setup!", e);
      }
   }
}
