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



#include "includes.h"

#ifdef _WIN32
/* proper use of memcpy is safe; banned.h "hit list" */
#pragma warning(disable : 4995)
#endif

ULONG
VmDirRpcAllocateStringW(
    PWSTR  pwszSrc,
    PWSTR* ppwszDst
    )
{
    ULONG  ulError = 0;
    size_t len = 0;
    PWSTR  pwszDst = NULL;

    if (!pwszSrc || !ppwszDst)
    {
        ulError = ERROR_INVALID_PARAMETER;
        BAIL_ON_VMDIR_ERROR(ulError);
    }

    ulError = VmDirGetStringLengthW(pwszSrc, &len);
    BAIL_ON_VMDIR_ERROR(ulError);

    ulError = VmDirRpcAllocateMemory(
                    sizeof(WCHAR) * (len + 1),
                    (PVOID*)&pwszDst);
    BAIL_ON_VMDIR_ERROR(ulError);

    memcpy((PBYTE)pwszDst, (PBYTE)pwszSrc, sizeof(WCHAR) * len);

    *ppwszDst = pwszDst;

cleanup:

    return ulError;

error:

    if (ppwszDst)
    {
        *ppwszDst = NULL;
    }

    if (pwszDst)
    {
        VmDirRpcFreeMemory(pwszDst);
    }

    goto cleanup;
}
