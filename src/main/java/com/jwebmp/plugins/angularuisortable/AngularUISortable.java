/*
 * Copyright (C) 2017 Marc Magon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.jwebmp.plugins.angularuisortable;

import com.jwebmp.core.base.ComponentHierarchyBase;
import com.jwebmp.core.base.html.List;
import com.jwebmp.core.plugins.ComponentInformation;

/**
 * Angular UI Sortable Helper
 *
 * @author Marc Magon
 * @since 09 Jun 2017
 */
@ComponentInformation(name = "Angular UI Sortable",
		description = "This directive allows you to sort an array with drag & drop.",
		url = "https://github.com/angular-ui/ui-sortable")
public class AngularUISortable
{

	/*
	 * Constructs a new AngularUISortable
	 */
	AngularUISortable()
	{
		//Nothing needed
	}

	/**
	 * Apply to a UL list
	 *
	 * @param list
	 */
	public static void applyToList(List list)
	{
		list.addAttribute("ui-sortable", "");
	}

	/**
	 * Apply to any component
	 *
	 * @param list
	 */
	public static void applyToComponent(ComponentHierarchyBase list)
	{
		list.addAttribute("ui-sortable", "");
	}
}
