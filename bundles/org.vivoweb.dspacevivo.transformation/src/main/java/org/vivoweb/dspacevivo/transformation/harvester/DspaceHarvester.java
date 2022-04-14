package org.vivoweb.dspacevivo.transformation.harvester;

import java.util.Iterator;
import java.util.Properties;
import org.vivoweb.dspacevivo.model.Item;

public abstract class DspaceHarvester {
  protected Properties conf = null;

  public DspaceHarvester(Properties conf) {
    this.conf = conf;
  }

  public Properties getConf() {
      return conf;
  }

  public abstract void connect();
  public abstract Iterator<Item> harvestItems();
}