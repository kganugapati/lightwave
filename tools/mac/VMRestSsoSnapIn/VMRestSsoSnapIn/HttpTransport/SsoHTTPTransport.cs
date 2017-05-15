/*
 * Copyright © 2012-2016 VMware, Inc.  All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the “License”); you may not
 * use this file except in compliance with the License.  You may obtain a copy
 * of the License at http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an “AS IS” BASIS, without
 * warranties or conditions of any kind, EITHER EXPRESS OR IMPLIED.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

using System;
using System.ComponentModel;

namespace Vmware.Tools.RestSsoAdminSnapIn.HttpTransport
{
    [TypeConverter(typeof(ExpandableObjectConverter))]
    public class SsoHttpTransport
    {
        readonly string _ticks;
        public SsoHttpTransport()
        {
            _ticks = DateTime.Now.Ticks.ToString();
        }
        public string Ticks { get { return _ticks; } }
        public string Method { get; set; }
        public SsoHttpHeader RequestHeader{get;set;}
        public string Request { get; set; }
        public SsoHttpHeader ResponseHeader { get; set; }
        public string Response { get; set; }
        public string Error { get; set; }
        public string TimeTaken { get; set; }
    }
}
