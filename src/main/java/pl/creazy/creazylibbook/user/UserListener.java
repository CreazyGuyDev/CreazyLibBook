package pl.creazy.creazylibbook.user;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import pl.creazy.creazylib.part.constraints.Part;
import pl.creazy.creazylib.util.message.Message;

@Part
class UserListener implements Listener {
  @EventHandler
  void onPlayerJoin(PlayerJoinEvent event) {
    Message.sendActionBar(event.getPlayer(), "&2Welcome");
  }
}
