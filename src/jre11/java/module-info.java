module com.jwebmp.plugins.angularuisortable {
	exports com.jwebmp.plugins.angularuisortable;

	requires com.jwebmp.core;
	requires java.validation;
	requires com.jwebmp.guicedinjection;
	requires com.jwebmp.core.angularjs;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.angularuisortable.AngularUISortablePageConfigurator;
	provides com.jwebmp.core.base.angular.services.IAngularModule with com.jwebmp.plugins.angularuisortable.AngularUISortableModule;

	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.angularuisortable.implementations.AngularUISortableExclusionsModule;
	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions with com.jwebmp.plugins.angularuisortable.implementations.AngularUISortableExclusionsModule;
}
