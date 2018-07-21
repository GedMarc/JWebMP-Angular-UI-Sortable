package com.jwebmp.plugins.angularuisortable;

import com.jwebmp.core.Page;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Marc Magon
 */
public class AngularUISortablePageConfiguratorTest

{

	public AngularUISortablePageConfiguratorTest()
	{
	}

	@Test
	public void testSomeMethod()
	{
		Page p = new Page();
		System.out.println(p.toString(0));
		Assertions.assertTrue(p.toString(0)
		                       .contains("<script src=\"bower_components/angular-ui-sortable/sortable.js\" type=\"text/javascript\"></script>"));
	}

}
