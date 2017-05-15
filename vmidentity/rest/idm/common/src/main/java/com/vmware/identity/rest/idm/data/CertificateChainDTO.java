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
package com.vmware.identity.rest.idm.data;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.vmware.identity.rest.core.data.CertificateDTO;
import com.vmware.identity.rest.core.data.DTO;

/**
 * The {@code CertificateChainDTO} class contains the {@link CertificateDTO}s that compose
 * a certificate chain.
 * 
 * @author Balaji Boggaram Ramanarayan
 * @author Travis Hall
 */
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(Include.NON_EMPTY)
@JsonDeserialize(builder = CertificateChainDTO.Builder.class)
public class CertificateChainDTO extends DTO {

    private final List<CertificateDTO> certificates;

    /**
     * Construct a {@code CertificateChainDTO} from a list of certificates.
     *
     * @param certificates the list of certificates that compose a chain.
     */
    public CertificateChainDTO(List<CertificateDTO> certificates) {
        this.certificates = certificates;
    }

    /**
     * Get the certificates of the chain.
     *
     * @return a list of certificates that make up the chain.
     */
    public List<CertificateDTO> getCertificates() {
        return certificates;
    }

    /**
     * Create an instance of the {@link CertificateChainDTO.Builder} class.
     *
     * @return a new {@code CertificateChainDTO.Builder}.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The JSON POJO Builder for this class. The builder class is meant mostly for
     * usage when constructing the object from its JSON string and thus only accepts
     * content for the canonical fields of the JSON representation. Other constructors
     * may exist that provide greater convenience.
     */
    @JsonIgnoreProperties(ignoreUnknown=true)
    @JsonPOJOBuilder
    public static class Builder {
        private List<CertificateDTO> certificates;

        public Builder withCertificates(List<CertificateDTO> certificates) {
            this.certificates = certificates;
            return this;
        }

        public CertificateChainDTO build() {
            return new CertificateChainDTO(certificates);
        }
    }
    
}
