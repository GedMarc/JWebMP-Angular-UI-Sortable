package za.co.mmagon.jwebswing.plugins.angularuisortable;

import za.co.mmagon.jwebswing.base.ComponentHierarchyBase;
import za.co.mmagon.jwebswing.base.html.List;

/**
 * Angular UI Sortable Helper
 *
 * @author Marc Magon
 * @since 09 Jun 2017
 */
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
