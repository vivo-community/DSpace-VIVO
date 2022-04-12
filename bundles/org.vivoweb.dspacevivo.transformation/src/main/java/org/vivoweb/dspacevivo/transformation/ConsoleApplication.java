package org.vivoweb.dspacevivo.transformation;

import java.io.IOException;
import org.vivoweb.dspacevivo.transformation.harvester.HarvesterRunner;

public class ConsoleApplication {

  public static void main(String[] args) throws IOException {
    
    HarvesterRunner r = new HarvesterRunner();
    r.init();
    r.harvest();
  }

}
