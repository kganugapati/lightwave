/*
 * Copyright © 2012-2015 VMware, Inc.  All Rights Reserved.
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



#ifndef _VMKRB5_ENCDATA_S_H
#define _VMKRB5_ENCDATA_S_H

typedef struct _PVMKDC_ENCDATA {
    VMKDC_ENCTYPE type;
    DWORD kvno;
    PVMKDC_DATA data;
} VMKDC_ENCDATA, *PVMKDC_ENCDATA;

#define VMKDC_SAFE_FREE_ENCDATA(x) \
do { \
    if (x) \
    { \
        VmKdcFreeEncData(x); \
        x = NULL; \
    } \
} while (0)

#endif /* _VMKRB5_ENCDATA_S_H */
