/*
 * Copyright 2020 shedaniel
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.shedaniel.architectury.registry;

import me.shedaniel.architectury.ExpectPlatform;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

import java.util.function.Function;

public abstract class BlockProperties extends BlockBehaviour.Properties implements BlockPropertiesExtension {
    public BlockProperties(Material material, Function<BlockState, MaterialColor> function) {
        super(material, function);
    }
    
    public static BlockProperties of(Material material) {
        return of(material, material.getColor());
    }
    
    public static BlockProperties of(Material material, DyeColor color) {
        return of(material, color.getMaterialColor());
    }
    
    @ExpectPlatform
    public static BlockProperties of(Material material, MaterialColor color) {
        throw new AssertionError();
    }
    
    @ExpectPlatform
    public static BlockProperties of(Material material, Function<BlockState, MaterialColor> color) {
        throw new AssertionError();
    }
    
    @ExpectPlatform
    public static BlockProperties copy(BlockBehaviour block) {
        throw new AssertionError();
    }
    
    @ExpectPlatform
    public static BlockProperties copy(BlockBehaviour.Properties properties) {
        throw new AssertionError();
    }
}