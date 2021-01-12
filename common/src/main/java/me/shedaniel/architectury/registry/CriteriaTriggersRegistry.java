/*
 * This file is part of architectury.
 * Copyright (C) 2020, 2021 shedaniel
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */

package me.shedaniel.architectury.registry;

import me.shedaniel.architectury.annotations.ExpectPlatform;
import net.minecraft.advancements.CriterionTrigger;

public final class CriteriaTriggersRegistry {
    private CriteriaTriggersRegistry() {}
    
    /**
     * Invokes {@link net.minecraft.advancements.CriteriaTriggers#register(CriterionTrigger)}.
     *
     * @param trigger The trigger to register
     * @param <T>     The type of trigger
     * @return The trigger registered
     */
    @ExpectPlatform
    public static <T extends CriterionTrigger<?>> T register(T trigger) {
        throw new AssertionError();
    }
}