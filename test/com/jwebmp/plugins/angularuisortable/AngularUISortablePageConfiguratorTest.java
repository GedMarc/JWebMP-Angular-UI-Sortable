package com.jwebmp.plugins.angularuisortable;

import com.jwebmp.BaseTestClass;
import com.jwebmp.Page;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Marc Magon
 */
public class AngularUISortablePageConfiguratorTest
		extends BaseTestClass
{

	public AngularUISortablePageConfiguratorTest()
	{
	}

	@Test
	public void testSomeMethod()
	{
		Page p = getInstance();
		System.out.println(p.toString(0));
		Assertions.assertTrue(p.toString(0)
		                       .contains("<script src=\"bower_components/angular-ui-sortable/sortable.js\" type=\"text/javascript\"></script>"));
	}

}
