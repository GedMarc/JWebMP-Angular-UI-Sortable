package za.co.mmagon.jwebswing.plugins.angularuisortable;

import za.co.mmagon.jwebswing.base.ComponentHierarchyBase;
import za.co.mmagon.jwebswing.base.html.List;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;

/**
 * Angular UI Sortable Helper
 *
 * @author Marc Magon
 * @since 09 Jun 2017
 */
@ComponentInformation(name = "Angular UI Sortable", description = "This directive allows you to sort an array with drag & drop.",
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
