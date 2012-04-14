/*
 * This file is part of Vanilla (http://www.spout.org/).
 *
 * Vanilla is licensed under the SpoutDev License Version 1.
 *
 * Vanilla is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * In addition, 180 days after any changes are published, you can use the
 * software, incorporating those changes, under the terms of the MIT license,
 * as described in the SpoutDev License Version 1.
 *
 * Vanilla is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License,
 * the MIT license and the SpoutDev License Version 1 along with this program.
 * If not, see <http://www.gnu.org/licenses/> for the GNU Lesser General Public
 * License and see <http://www.spout.org/SpoutDevLicenseV1.txt> for the full license,
 * including the MIT license.
 */
package org.spout.vanilla.protocol.event.entity;

import org.spout.api.protocol.event.ProtocolEvent;
import org.spout.api.util.Parameter;

import java.util.List;

public class EntityMetadataEvent extends ProtocolEvent {
	private final int entityId;
	private List<Parameter<?>> parameters;
	
	public EntityMetadataEvent(int entityId, List<Parameter<?>> parameters) {
		this.entityId = entityId;
		this.parameters = parameters;
	}
	
	public int getEntityId() {
		return entityId;
	}
	
	public List<Parameter<?>> getParameters() {
		return parameters;
	}
	
	public void setParameters(List<Parameter<?>> parameters) {
		this.parameters = parameters;
	}
}