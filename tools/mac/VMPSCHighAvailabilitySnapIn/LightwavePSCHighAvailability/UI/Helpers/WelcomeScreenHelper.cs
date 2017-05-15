﻿/*
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
using VmIdentity.UI.Common;

namespace VMPSCHighAvailability.UI
{
	/// <summary>
	/// Encapsulates all the helper functions associated with the welcome screen
	/// </summary>
	public class WelcomeScreenHelper
	{
		/// <summary>
		/// Set the values for all the UI elements for the Welcome screen
		/// </summary>
		/// <param name="controller">Controller.</param>
		public static void SetDisplayElements(WelcomeScreenCommonController controller)
		{
			controller.TitleDescription = "Welcome to " + Constants.ToolName;
			controller.Description1 = "View status of PSC and related services";
			controller.Description2 = "View Site Affinity";
			controller.Description3 = "View High Availability details";
		}
	}
}

