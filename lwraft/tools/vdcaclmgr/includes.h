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
#ifndef _WIN32

#include <config.h>
#include <getopt.h>
#include <assert.h>

#include <vmdirsys.h>

#include <vmdir.h>
#include <vmdirtypes.h>
#include <vmdirdefines.h>
#include <vmdirerrors.h>
#include <vmdircommon.h>
#include <vmdirclient.h>
#define LW_STRICT_NAMESPACE
#include <lw/hash.h>
#include "defines.h"
#include "structs.h"
#include "prototypes.h"

#else
#pragma once

#include "targetver.h"
#define WIN32_LEAN_AND_MEAN // Exclude rarely-used stuff from Windows headers

#include <windows.h>
#include <stdio.h>
#include <stdlib.h>
#include <stdint.h>
#include <tchar.h>
#include <winsock2.h>
#define LDAP_UNICODE 0

#include <vmdir.h>
#include <vmdirdefines.h>
#include <vmdirerrors.h>
#include <vmdircommon.h>
#include <vmdirclient.h>

#define LW_STRICT_NAMESPACE
#include <lw/hash.h>
#include "banned.h"

#endif
