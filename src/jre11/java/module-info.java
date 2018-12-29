import com.jwebmp.core.base.angular.services.IAngularModule;
import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;
import com.jwebmp.plugins.angularuisortable.AngularUISortableModule;
import com.jwebmp.plugins.angularuisortable.AngularUISortablePageConfigurator;
import com.jwebmp.plugins.angularuisortable.implementations.AngularUISortableExclusionsModule;

module com.jwebmp.plugins.angularuisortable {
	exports com.jwebmp.plugins.angularuisortable;

	requires com.jwebmp.core;
	requires java.validation;
	requires com.jwebmp.guicedinjection;
	requires com.jwebmp.core.angularjs;

	provides IPageConfigurator with AngularUISortablePageConfigurator;
	provides IAngularModule with AngularUISortableModule;

	provides IGuiceScanModuleExclusions with AngularUISortableExclusionsModule;
	provides IGuiceScanJarExclusions with AngularUISortableExclusionsModule;
}
