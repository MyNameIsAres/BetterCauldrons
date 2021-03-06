package org.geminicraft.bettercauldron.configuration;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.inventory.ItemStack;
import org.mineacademy.fo.settings.YamlSectionConfig;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class RecipeConfig extends YamlSectionConfig {

    private static Map<ItemStack, Integer> cacheMap = new HashMap<>();

    /**
     * Create a new section config with a section prefix,
     * for example Players for storing player data.
     *
     * @param sectionPrefix
     */

    private final String name;
    private String testProperty;

    protected RecipeConfig(String name) {
        super(name);
        this.name = name;
        this.setTestProperty(testProperty);
        loadConfiguration(null, "data.db");
    }

    @Override
    protected void onLoadFinish() {
        testProperty = getString("Test");
    }
    
    public void setTestProperty(String testProperty) {
        this.testProperty = testProperty;
        save("Test", "Hello World");
    }


}
