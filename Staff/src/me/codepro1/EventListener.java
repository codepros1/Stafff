package me.codepro1;

import net.md_5.bungee.api.event.PlayerDisconnectEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;

public class EventListener
  implements Listener
{
  @EventHandler
  public void onJoin(PlayerDisconnectEvent event)
  {
    if (DataManager.getRanks().containsKey(event.getPlayer().getName())) {
      DataManager.setSeen(event.getPlayer().getName(), System.currentTimeMillis());
    }
  }
}
