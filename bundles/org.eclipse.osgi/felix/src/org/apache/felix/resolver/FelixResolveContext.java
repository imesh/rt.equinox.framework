/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */package org.apache.felix.resolver;

import java.util.Collection;
import org.osgi.framework.namespace.PackageNamespace;
import org.osgi.resource.*;

public interface FelixResolveContext {
	/**
	 * Returns the subset of {@link Wiring#getRequiredResourceWires(String) require wires}
	 * that provide wires to {@link Capability capabilities} which substitute capabilities
	 * of the given wiring. For example, when a {@link PackageNamespace package} name is both
	 * provided and required by the same resource. If the package requirement is resolved
	 * to a capability hosted by a different wiring then the package capability is
	 * considered to be substituted.
	 *
	 * @param wiring the wiring to get the substitution wires from
	 * @return A collection containing a snapshot of the substitution {@link Wire}s
	 * for the {@link Requirement requirements} of this wiring, or an empty list
	 * if this wiring has no substitution wires.
	 */
	public Collection<Wire> getSubstitutionWires(Wiring wiring);
}
