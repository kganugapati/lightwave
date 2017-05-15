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
package com.vmware.identity.rest.core.server.exception.client;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.vmware.identity.rest.core.data.ErrorInfo;

/**
 * Base class for all exceptions responding with HTTP/1.1 401 Unauthorized
 */
public class NotAuthorizedException extends javax.ws.rs.NotAuthorizedException {

    private static final long serialVersionUID = 4667723683917112169L;

    private static final String DEFAULT_ERROR = "unauthorized";

    public NotAuthorizedException(String error, String message) {
        super(message, Response.status(Response.Status.UNAUTHORIZED)
                .entity(new ErrorInfo(error, message))
                .type(MediaType.APPLICATION_JSON)
                .build());
    }

    public NotAuthorizedException(String message) {
        super(message, Response.status(Response.Status.UNAUTHORIZED)
                .entity(new ErrorInfo(DEFAULT_ERROR, message))
                .type(MediaType.APPLICATION_JSON)
                .build());
    }

}
