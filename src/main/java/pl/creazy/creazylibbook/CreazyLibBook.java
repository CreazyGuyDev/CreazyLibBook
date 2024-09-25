package pl.creazy.creazylibbook;

import pl.creazy.creazylib.log.Logger;
import pl.creazy.creazylib.part.constraints.OnDisable;
import pl.creazy.creazylib.part.constraints.OnEnable;
import pl.creazy.creazylib.part.constraints.Part;
import pl.creazy.creazylib.plugin.CreazyPlugin;
import pl.creazy.creazylib.plugin.constraints.Plugin;

@Plugin
public final class CreazyLibBook extends CreazyPlugin {
  @OnEnable
  void enable(@Part Logger logger) {
    logger.info("Loading plugin...");
  }

  @OnDisable
  void disable(@Part Logger logger) {
    logger.info("Disabling plugin...");
  }
}
