/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.mmagon.jwebswing.plugins.angularuisortable;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import za.co.mmagon.jwebswing.base.html.List;

/**
 * @author Marc Magon
 */
public class AngularUISortableTest
{
	
	public AngularUISortableTest()
	{
	}
	
	@Test
	public void testSomeMethod()
	{
		List list = new List();
		AngularUISortable.applyToList(list);
		list.setID("id");
		System.out.println(list.toString(true));
		Assertions.assertEquals("<ul id=\"id\" ui-sortable></ul>", list.toString(0));
	}
	
}
