package pl.creazy.creazylibbook;

import pl.creazy.creazylib.log.Logger;
import pl.creazy.creazylib.part.constraints.Injected;
import pl.creazy.creazylib.part.constraints.OnDisable;
import pl.creazy.creazylib.part.constraints.OnEnable;
import pl.creazy.creazylib.part.constraints.Part;
import pl.creazy.creazylib.plugin.CreazyPlugin;
import pl.creazy.creazylib.plugin.constraints.Plugin;

@Plugin
public final class CreazyLibBook extends CreazyPlugin {
  @OnEnable
  void enable(@Injected Logger logger) {
    logger.info("Loading plugin...");
  }

  @OnDisable
  void disable(@Injected Logger logger) {
    logger.info("Disabling plugin...");
  }
}
