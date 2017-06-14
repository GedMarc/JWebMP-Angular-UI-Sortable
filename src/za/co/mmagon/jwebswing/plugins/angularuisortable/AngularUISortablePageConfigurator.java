package za.co.mmagon.jwebswing.plugins.angularuisortable;

import za.co.mmagon.jwebswing.Page;
import za.co.mmagon.jwebswing.PageConfigurator;
import za.co.mmagon.jwebswing.base.angular.AngularPageConfigurator;
import za.co.mmagon.jwebswing.plugins.PluginInformation;
import za.co.mmagon.jwebswing.plugins.jquery.JQueryPageConfigurator;

/**
 * The Angular UI Sortable Configurator
 *
 * @author Marc Magon
 * @since 08 Jun 2017
 */
@PluginInformation(pluginName = "Angular UI Sortable",
        pluginDescription = "This directive allows you to sort an array with drag & drop.",
        pluginUniqueName = "jwebswing-angular-ui-sortable",
        pluginVersion = "0.17.1",
        pluginCategories = "angular,touch, ui,web ui, framework",
        pluginSubtitle = "Instantly make UL lists into drag and drop items.",
        pluginSourceUrl = "https://github.com/angular-ui/ui-sortable",
        pluginWikiUrl = "https://github.com/GedMarc/JWebSwing-Angular-UI-Sortable/wiki",
        pluginGitUrl = "https://github.com/GedMarc/JWebSwing-Angular-UI-Sortable",
        pluginIconUrl = "",
        pluginIconImageUrl = "",
        pluginOriginalHomepage = "https://github.com/angular-ui/ui-sortable",
        pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/AngularUISortable.jar/download"
)

class AngularUISortablePageConfigurator extends PageConfigurator
{

    private static final long serialVersionUID = 1L;

    /*
     * Constructs a new AngularUISortablePageConfigurator
     */
    public AngularUISortablePageConfigurator()
    {
        //Nothing needed
    }

    @Override
    public Page configure(Page page)
    {
        if (!page.isConfigured())
        {
            JQueryPageConfigurator.setRequired(page.getBody(), true);
            AngularPageConfigurator.setRequired(page.getBody(), true);

            page.getBody().addJavaScriptReference(AngularUISortableReferencePool.AngularUISortable.getJavaScriptReference());
            page.getAngular().getAngularModules().add(new AngularUISortableModule());
        }
        return page;
    }
}
