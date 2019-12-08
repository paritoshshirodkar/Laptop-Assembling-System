package edu.bu.met.cs665;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

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
    PropertyConfigurator.configure("log4j.properties");

    // Let us create an object of the Shop class.
    //    Shop m = new Shop();




    LaptopBuilder developerLaptopBuilder = new DeveloperLaptopBuilder();

    ShopTechnician developerTechnician = new ShopTechnician(developerLaptopBuilder);

    developerTechnician.assembleLaptop();

    Laptop developerLaptop = developerTechnician.getAssembledlaptop();

    logger.info("\nDeveloper Laptop with the following configuration is ready: \n"
        + "Screen Size: " + developerLaptop.getLaptopScreenSize() + "\n"
        + "Operating System: " + developerLaptop.getLaptopOs() + "\n"
        + "Processor: " + developerLaptop.getLaptopProcessor() + "\n"
        + "RAM: " + developerLaptop.getLaptopRam() + "\n"
        + "Hard Disk: " + developerLaptop.getLaptopHardDisk() + "\n"
        + "Battery: " + developerLaptop.getLaptopBattery() + "\n"
        + "Color: " + developerLaptop.getLaptopColor());

    LaptopBuilder windowsBuilder = new WindowsBuilder();

    ShopTechnician windowsTechnician = new ShopTechnician(windowsBuilder);

    windowsTechnician.assembleLaptop();

    Laptop windowsLaptop = windowsTechnician.getAssembledlaptop();

    logger.info("\nWindows Laptop with the following configuration is ready: \n"
        + "Screen Size: " + windowsLaptop.getLaptopScreenSize() + "\n"
        + "Operating System: " + windowsLaptop.getLaptopOs() + "\n"
        + "Processor: " + windowsLaptop.getLaptopProcessor() + "\n"
        + "RAM: " + windowsLaptop.getLaptopRam() + "\n"
        + "Hard Disk: " + windowsLaptop.getLaptopHardDisk() + "\n"
        + "Battery: " + windowsLaptop.getLaptopBattery() + "\n"
        + "Color: " + windowsLaptop.getLaptopColor());

    LaptopBuilder macBuilder = new MacBuilder();

    ShopTechnician macTechnician = new ShopTechnician(macBuilder);

    macTechnician.assembleLaptop();

    Laptop macLaptop = macTechnician.getAssembledlaptop();

    logger.info("\nMac Laptop with the following configuration is ready: \n"
        + "Screen Size: " + macLaptop.getLaptopScreenSize() + "\n"
        + "Operating System: " + macLaptop.getLaptopOs() + "\n"
        + "Processor: " + macLaptop.getLaptopProcessor() + "\n"
        + "RAM: " + macLaptop.getLaptopRam() + "\n"
        + "Hard Disk: " + macLaptop.getLaptopHardDisk() + "\n"
        + "Battery: " + macLaptop.getLaptopBattery() + "\n"
        + "Color: " + macLaptop.getLaptopColor());


  }



}
