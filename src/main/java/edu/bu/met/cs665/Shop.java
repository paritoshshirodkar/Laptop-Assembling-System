package edu.bu.met.cs665;

import org.apache.log4j.Logger;
// import org.apache.log4j.PropertyConfigurator;

public class Shop {

  private static Logger logger = Logger.getLogger(Shop.class);


  /**
   * A main method to run examples.
   *
   * @param args not used
   */
  public static void main(String[] args) {

    // This configuration is for setting up the log4j properties file.
    // It is better to set this using java program arguments.
    // PropertyConfigurator.configure("log4j.properties");

    // Let us create an object of the Shop class.
    //    Shop m = new Shop();




    LaptopBuilder linuxBuilder = new LinuxBuilder();

    ShopTechnician linuxTechnician = new ShopTechnician(linuxBuilder);

    linuxTechnician.assembleLaptop();

    Laptop rhelLaptop = linuxTechnician.getAssembledlaptop();

    logger.info("Linux Laptop with the following configuration is ready: \n"
        + rhelLaptop.getLaptopScreenSize() + "\n"
        + rhelLaptop.getLaptopOs() + "\n"
        + rhelLaptop.getLaptopProcessor() + "\n"
        + rhelLaptop.getLaptopRam() + "\n"
        + rhelLaptop.getLaptopHardDisk() + "\n"
        + rhelLaptop.getLaptopBattery() + "\n"
        + rhelLaptop.getLaptopColor());

    LaptopBuilder windowsBuilder = new WindowsBuilder();

    ShopTechnician windowsTechnician = new ShopTechnician(windowsBuilder);

    windowsTechnician.assembleLaptop();

    Laptop windowsLaptop = windowsTechnician.getAssembledlaptop();

    logger.info("Windows Laptop with the following configuration is ready: \n"
        + windowsLaptop.getLaptopScreenSize() + "\n"
        + windowsLaptop.getLaptopOs() + "\n"
        + windowsLaptop.getLaptopProcessor() + "\n"
        + windowsLaptop.getLaptopRam() + "\n"
        + windowsLaptop.getLaptopHardDisk() + "\n"
        + windowsLaptop.getLaptopBattery() + "\n"
        + windowsLaptop.getLaptopColor());

    LaptopBuilder macBuilder = new MacBuilder();

    ShopTechnician macTechnician = new ShopTechnician(macBuilder);

    macTechnician.assembleLaptop();

    Laptop macLaptop = macTechnician.getAssembledlaptop();

    logger.info("Windows Laptop with the following configuration is ready: \n"
        + macLaptop.getLaptopScreenSize() + "\n"
        + macLaptop.getLaptopOs() + "\n"
        + macLaptop.getLaptopProcessor() + "\n"
        + macLaptop.getLaptopRam() + "\n"
        + macLaptop.getLaptopHardDisk() + "\n"
        + macLaptop.getLaptopBattery() + "\n"
        + macLaptop.getLaptopColor());


  }



}
