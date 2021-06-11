package org.geminicraft.bettercauldron;

import org.geminicraft.bettercauldron.command.MenuRecipeSelect;
import org.geminicraft.bettercauldron.events.CauldronInteract;
import org.geminicraft.bettercauldron.menu.CauldronRecipesMenu;
import org.mineacademy.fo.plugin.SimplePlugin;

public class MainPlugin extends SimplePlugin {

    public CauldronStorage storage;
    public CauldronCache cache;

    @Override
    protected void onPluginStart() {

        CauldronRegister register = CauldronRegister.getInstance();

        register.getCauldronFoundationList();

        registerEvents(new CauldronRecipesMenu());
//        registerEvents(new CauldronInteract(this, storage, cache));
        registerCommand(new MenuRecipeSelect());


    }


    // TODO: Refactor / implement new version on Cauldron update
    @Override
    protected void onPluginStop() {
//        if (!storage.getStringLocationMap().isEmpty()) {
//            Common.log("Storage was not empty!");
//
//            storage.saveConfig();
//        } else {
//            Common.log("Okay, storage was empty.");
//            Common.log(storage.getCauldronLocationMap().toString());
//            Common.log("Above is result");
//
//        }

    }
}
