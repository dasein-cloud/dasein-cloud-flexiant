/**
 * Copyright (C) 2012-2013 Dell, Inc.
 * See annotations for authorship information
 *
 * ====================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ====================================================================
 */

package org.dasein.cloud.flexiant;

import org.dasein.cloud.ci.AbstractCIServices;
import org.dasein.cloud.ci.ConvergedInfrastructureSupport;
import org.dasein.cloud.ci.TopologySupport;
import org.dasein.cloud.flexiant.ci.FCOConvergedInfrastructureSupport;
import org.dasein.cloud.flexiant.ci.FCOTopologySupport;

/**
 * The AbstractCIServices implementation for the Dasein FCO implementation
 * 
 * @version 2013.12 initial version
 * @since 2013.12
 */
public class FCOCIServices extends AbstractCIServices {

	private FCOProvider provider;
	
	public FCOCIServices(FCOProvider provider) {
		this.provider = provider;
	}

	@Override
	public ConvergedInfrastructureSupport getConvergedInfrastructureSupport() {
		return new FCOConvergedInfrastructureSupport(provider);
	}
	@Override
	public TopologySupport getTopologySupport() {
		return new FCOTopologySupport(provider);
	}
}
