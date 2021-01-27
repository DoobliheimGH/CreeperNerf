package com.doobliheim.creepernerf;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;

public class CreeperTracker implements Listener {
  @EventHandler
  public void creeperExplosion(EntityExplodeEvent e) {
    if (e.getEntityType().equals(EntityType.CREEPER)) {
      e.blockList().clear();
    } else {
      return;
    } 
  }
}
