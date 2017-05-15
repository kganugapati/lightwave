/*
 *  Copyright (c) 2012-2015 VMware, Inc.  All Rights Reserved.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License"); you may not
 *   use this file except in compliance with the License.  You may obtain a copy
 *   of the License at http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS, without
 *   warranties or conditions of any kind, EITHER EXPRESS OR IMPLIED.  See the
 *   License for the specific language governing permissions and limitations
 *   under the License.
 */
package com.vmware.identity.wstrust.client.impl;

import com.vmware.vim.sso.client.exception.SsoException;
import com.vmware.identity.wstrust.client.ServerSecurityException;

/**
 * This exception is thrown if there is a problem with signature generation or
 * verification on the client.
 *
 * @see ServerSecurityException
 */
class SignatureException extends SsoException {
    private static final long serialVersionUID = 4388213594580228675L;

    public SignatureException(String message) {
        super(message);
    }

    public SignatureException(String message, Throwable cause) {
        super(message, cause);
    }
}
