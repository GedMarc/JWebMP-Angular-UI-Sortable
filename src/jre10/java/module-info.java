import com.jwebmp.core.base.angular.services.IAngularModule;
import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.plugins.angularuisortable.AngularUISortableModule;
import com.jwebmp.plugins.angularuisortable.AngularUISortablePageConfigurator;

module com.jwebmp.plugins.angularuisortable {
	exports com.jwebmp.plugins.angularuisortable;

	requires com.jwebmp.core;
	provides IPageConfigurator with AngularUISortablePageConfigurator;
	provides IAngularModule with AngularUISortableModule;
}
