package za.co.mmagon.jwebswing.plugins.angularuisortable;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import za.co.mmagon.jwebswing.BaseTestClass;
import za.co.mmagon.jwebswing.Page;

/**
 * @author Marc Magon
 */
public class AngularUISortablePageConfiguratorTest extends BaseTestClass
{
	
	public AngularUISortablePageConfiguratorTest()
	{
	}
	
	@Test
	public void testSomeMethod()
	{
		Page p = getInstance();
		System.out.println(p.toString(0));
		Assertions.assertTrue(p.toString(0).contains("<script src=\"bower_components/angular-ui-sortable/sortable.js\" type=\"text/javascript\"></script>"));
	}
	
}
