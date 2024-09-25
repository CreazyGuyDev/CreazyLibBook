package pl.creazy.creazylibbook.user;

import org.bukkit.entity.Player;
import pl.creazy.creazylib.command.constraints.Args;
import pl.creazy.creazylib.command.constraints.Command;
import pl.creazy.creazylib.command.constraints.HasPermissions;
import pl.creazy.creazylib.part.constraints.Part;
import pl.creazy.creazylib.util.message.Message;

@Part
@Command("user")
class UserCommand {
  @Args("get data")
  void getUserData(Player player) {
    Message.sendChat(player, "&aYour user data: some data");
  }

  @Args("set data")
  @HasPermissions("creazylibbook.set.data")
  void setUserData(Player player) {
    Message.sendChat(player, "<#123F98>Set user data: new data");
  }
}
