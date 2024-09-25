package pl.creazy.creazylibbook.user;

import org.bukkit.entity.Player;
import pl.creazy.creazylib.manager.constraints.Manager;

@Manager
class UserManager {
  String getUserData(Player player) {
    return "some user data";
  }
}
