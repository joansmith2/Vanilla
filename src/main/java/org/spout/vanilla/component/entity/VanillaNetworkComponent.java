/*
 * This file is part of Vanilla.
 *
 * Copyright (c) 2011 Spout LLC <http://www.spout.org/>
 * Vanilla is licensed under the Spout License Version 1.
 *
 * Vanilla is free software: you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation, either version 3 of the License, or (at your option)
 * any later version.
 *
 * In addition, 180 days after any changes are published, you can use the
 * software, incorporating those changes, under the terms of the MIT license,
 * as described in the Spout License Version 1.
 *
 * Vanilla is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License for
 * more details.
 *
 * You should have received a copy of the GNU Lesser General Public License,
 * the MIT license and the Spout License Version 1 along with this program.
 * If not, see <http://www.gnu.org/licenses/> for the GNU Lesser General Public
 * License and see <http://spout.in/licensev1> for the full license, including
 * the MIT license.
 */
package org.spout.vanilla.component.entity;

import org.spout.api.component.entity.NetworkComponent;

import org.spout.vanilla.protocol.EntityProtocol;
import org.spout.vanilla.protocol.VanillaNetworkProtocol;

public class VanillaNetworkComponent extends NetworkComponent implements VanillaNetworkProtocol {
	private EntityProtocol protocol;

	/**
	 * Returns the {@link EntityProtocol} for this type of entity
	 *
	 * @return The entity protocol for the specified id.
	 */
	@Override
	public EntityProtocol getEntityProtocol() {
		return protocol;
	}

	/**
	 * Registers the {@code protocol} as the Entity's protocol
	 *
	 * @param protocol The protocol to set
	 */
	@Override
	public void setEntityProtocol(EntityProtocol protocol) {
		this.protocol = protocol;
	}
}
