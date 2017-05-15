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
package com.vmware.identity.samlservice.impl;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import com.vmware.identity.TestConstants;
import com.vmware.identity.idm.PrincipalId;
import com.vmware.identity.saml.InvalidPrincipalException;
import com.vmware.identity.saml.PrincipalAttribute;
import com.vmware.identity.saml.PrincipalAttributesExtractor;
import com.vmware.identity.saml.PrincipalAttributeDefinition;
import com.vmware.identity.saml.SystemException;

public class PrincipalAttributeExtractorImpl implements
      PrincipalAttributesExtractor {

   public final static String FIRST_NAME = "http://schemas.xmlsoap.org/ws/2005/05/identity/claims/givenname";
   public final static String LAST_NAME = "http://schemas.xmlsoap.org/ws/2005/05/identity/claims/surname";
   public final static String SUBJECT_TYPE = "http://vmware.com/schemas/attr-names/2011/07/isSolution";
   public final static String GROUP = "http://rsa.com/schemas/attr-names/2009/01/GroupIdentity";
   public final static String UPN = "http://schemas.xmlsoap.org/claims/UPN";
   public final static String EMAIL_ADDRESS = "http://schemas.xmlsoap.org/ws/2005/05/identity/claims/emailaddress";

   public final static String FIRST_NAME_FRIENDLY_NAME = "firstName";
   public final static String LAST_NAME_FRIENDLY_NAME = "lastName";
   public final static String SUBJECT_TYPE_FRIENDLY_NAME = "SubjectType";
   public final static String GROUP_FRIENDLY_NAME = "Group";
   public final static String UPN_FRIENDLY_NAME = "userPrincipalName";
   public final static String EMAIL_ADDRESS_FRIENDLY_NAME = "mail";

   public final static String SUBJECT_TYPE_SOLUTION = "http://www.rsa.com/names/2009/12/std-ext/SAML2.0/subjects/solution";
   public final static String SUBJECT_TYPE_USER = "http://www.rsa.com/names/2009/12/std-ext/SAML2.0/subjects/user";

   public Collection<PrincipalAttributeDefinition> getAllAttributeDefinitions()
      throws SystemException {
      String nameFormat = org.opensaml.saml2.core.Attribute.URI_REFERENCE;

      Set<PrincipalAttributeDefinition> attributes = new HashSet<PrincipalAttributeDefinition>();

      attributes.add(new PrincipalAttributeDefinition(FIRST_NAME, nameFormat, FIRST_NAME_FRIENDLY_NAME));
      attributes.add(new PrincipalAttributeDefinition(LAST_NAME, nameFormat, LAST_NAME_FRIENDLY_NAME));
      attributes.add(new PrincipalAttributeDefinition(GROUP, nameFormat, GROUP_FRIENDLY_NAME));
      attributes.add(new PrincipalAttributeDefinition(SUBJECT_TYPE, nameFormat, SUBJECT_TYPE_FRIENDLY_NAME));
      attributes.add(new PrincipalAttributeDefinition(UPN, nameFormat, UPN_FRIENDLY_NAME));
      attributes.add(new PrincipalAttributeDefinition(EMAIL_ADDRESS, nameFormat, EMAIL_ADDRESS_FRIENDLY_NAME));

      return attributes;
   }

   public Set<PrincipalAttribute> getAttributes(PrincipalId principalId,
      Collection<PrincipalAttributeDefinition> attributeDefinitions) {
      Set<PrincipalAttribute> attributes = new HashSet<PrincipalAttribute>();

      String nameFormat = org.opensaml.saml2.core.Attribute.URI_REFERENCE;

      String subjectTypeValue = SUBJECT_TYPE_USER;
      String groupValue = "System-Domain\\LSAdministrators";
      String firstNameValue = "Admin";
      String lastNameValue = "Admin";

      attributes.add(new PrincipalAttribute(FIRST_NAME, nameFormat,
            FIRST_NAME_FRIENDLY_NAME, firstNameValue));
      attributes.add(new PrincipalAttribute(LAST_NAME, nameFormat,
            LAST_NAME_FRIENDLY_NAME, lastNameValue));
      attributes.add(new PrincipalAttribute(GROUP, nameFormat,
            GROUP_FRIENDLY_NAME, groupValue));
      attributes.add(new PrincipalAttribute(SUBJECT_TYPE, nameFormat,
            SUBJECT_TYPE_FRIENDLY_NAME, subjectTypeValue));
      attributes.add(new PrincipalAttribute(UPN, nameFormat,
            UPN_FRIENDLY_NAME, firstNameValue + "@" + lastNameValue));
      attributes.add(new PrincipalAttribute(EMAIL_ADDRESS, nameFormat, 
            EMAIL_ADDRESS_FRIENDLY_NAME, TestConstants.EMAIL_ADDRESS_VALUE));

      return attributes;
   }

   public boolean isActive(PrincipalId principalId) {
      return true;
   }

    @Override
    public PrincipalId findActiveUser(String attributeName, String attributeValue)
            throws InvalidPrincipalException, SystemException
    {
        PrincipalId result = null;
        if ( "sAMAccountName".equalsIgnoreCase(attributeName) )
        {
            if ( ( attributeValue != null ) && (attributeValue.length() > 0) )
            {
                PrincipalId user = new PrincipalId( attributeValue, "System-Domain" );
                if ( isActive(user) )
                {
                    result = user;
                }
                else
                {
                    throw new InvalidPrincipalException("The user is not active.");
                }
            }
        }
        return result;
    }
}
