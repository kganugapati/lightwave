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
package com.vmware.identity.sts;

/**
 * This exception will be thrown when some operation require tenant information
 * to be extracted but there is no such tenant existing at the moment.
 */
public final class NoSuchIdPException extends RuntimeException {

   private static final long serialVersionUID = 3497277977148930970L;

   public NoSuchIdPException() {
      super();
   }

   public NoSuchIdPException(String message, Throwable cause) {
      super(message, cause);
   }

   public NoSuchIdPException(String message) {
      super(message);
   }

   public NoSuchIdPException(Throwable cause) {
      super(cause);
   }

}
