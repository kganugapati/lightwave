/*
 * Copyright (c) 2012-2015 VMware, Inc.  All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.  You may obtain a copy
 * of the License at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, without
 * warranties or conditions of any kind, EITHER EXPRESS OR IMPLIED.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.vmware.identity.interop.ldap.ssl;

import java.util.Arrays;
import java.util.List;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

/*
 *
typedef struct X509_val_st
{
   ASN1_TIME *notBefore;
   ASN1_TIME *notAfter;
} X509_VAL;
*/

public class X509_VAL extends Structure
{

   public Pointer notBefore; /**{@link ASN1_String}*/
   public Pointer notAfter;  /**{@link ASN1_String}*/

   public X509_VAL(Pointer p)
   {
      super();
      useMemory(p);
      read();
   }

   @Override
   protected List<String> getFieldOrder()
   {
      return Arrays.asList("notBefore", "notAfter");
   }
}
