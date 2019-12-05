package edu.bu.met.cs665;

import org.apache.log4j.Logger;
// import org.apache.log4j.PropertyConfigurator;

public class Main {

  private static Logger logger = Logger.getLogger(Main.class);


  /**
   * A main method to run examples.
   *
   * @param args not used
   */
  public static void main(String[] args) {

    // This configuration is for setting up the log4j properties file.
    // It is better to set this using java program arguments.
    // PropertyConfigurator.configure("log4j.properties");

    // Let us create an object of the Main class.
//    Main m = new Main();


//    logger.trace("Trace Message!");
//    logger.debug("Debug Message!");
//    logger.info("Info Message!");
//    logger.warn("Warn Message!");
//    logger.error("Error Message!");
//    logger.fatal("Fatal Message!");


    LaptopBuilder linuxBuilder = new LinuxBuilder();

    ShopTechnician linuxTechnician = new ShopTechnician(linuxBuilder);

    linuxTechnician.assembleLaptop();

    Laptop rhelLaptop = linuxTechnician.getAssembledlaptop();


    LaptopBuilder windowsBuilder = new WindowsBuilder();

    ShopTechnician windowsTechnician = new ShopTechnician(windowsBuilder);

    windowsTechnician.assembleLaptop();

    Laptop windowsLaptop = windowsTechnician.getAssembledlaptop();


    LaptopBuilder macBuilder = new MacBuilder();

    ShopTechnician macTechnician = new ShopTechnician(macBuilder);

    macTechnician.assembleLaptop();

    Laptop macLaptop = macTechnician.getAssembledlaptop();

  }



}
