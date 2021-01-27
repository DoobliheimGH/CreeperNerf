package com.doobliheim.creepernerf;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class CreeperNerf extends JavaPlugin {
  public void onEnable() {
    getLogger().info("Enabling CreeperNerf");
    getServer().getPluginManager().registerEvents(new CreeperTracker(), (Plugin)this);
  }
  
  public void onDisable() {}
}