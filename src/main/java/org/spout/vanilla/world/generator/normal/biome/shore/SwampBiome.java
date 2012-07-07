/*
 * This file is part of Vanilla.
 *
 * Copyright (c) 2011-2012, VanillaDev <http://www.spout.org/>
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
package org.spout.vanilla.world.generator.normal.biome.shore;

import java.util.Random;

import org.spout.vanilla.world.generator.normal.biome.GrassyBiome;
import org.spout.vanilla.world.generator.normal.decorator.OreDecorator;
import org.spout.vanilla.world.generator.normal.decorator.TreeDecorator;
import org.spout.vanilla.world.generator.normal.object.tree.SwampTreeObject;
import org.spout.vanilla.world.generator.normal.object.tree.TreeObject;

public class SwampBiome extends GrassyBiome {

	public SwampBiome(int biomeId) {
		super(biomeId, new OreDecorator(), new TreeDecorator());
		setMinMax((byte) 60, (byte) 64);
	}

	@Override
	public String getName() {
		return "Swampland";
	}

	@Override
	public byte getAmountOfTrees(Random random) {
		return (byte) (2 + super.getAmountOfTrees(random));
	}

	@Override
	public TreeObject getRandomTree(Random random) {
		return new SwampTreeObject();
	}
}
