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

    LaptopBuilder gamingLaptopBuilder = new GamingLaptopBuilder();

    ShopTechnician gamingTechnician = new ShopTechnician(gamingLaptopBuilder);

    gamingTechnician.assembleLaptop();

    Laptop gamingLaptop = gamingTechnician.getAssembledlaptop();

    logger.info("\nGaming Laptop with the following configuration is ready: \n"
        + "Screen Size: " + gamingLaptop.getLaptopScreenSize() + "\n"
        + "Operating System: " + gamingLaptop.getLaptopOs() + "\n"
        + "Processor: " + gamingLaptop.getLaptopProcessor() + "\n"
        + "RAM: " + gamingLaptop.getLaptopRam() + "\n"
        + "Hard Disk: " + gamingLaptop.getLaptopHardDisk() + "\n"
        + "Battery: " + gamingLaptop.getLaptopBattery() + "\n"
        + "Color: " + gamingLaptop.getLaptopColor());

    LaptopBuilder personalLaptopBuilder = new PersonalLaptopBuilder();

    ShopTechnician personalTechnician = new ShopTechnician(personalLaptopBuilder);

    personalTechnician.assembleLaptop();

    Laptop personalLaptop = personalTechnician.getAssembledlaptop();

    logger.info("\nPersonal Laptop with the following configuration is ready: \n"
        + "Screen Size: " + personalLaptop.getLaptopScreenSize() + "\n"
        + "Operating System: " + personalLaptop.getLaptopOs() + "\n"
        + "Processor: " + personalLaptop.getLaptopProcessor() + "\n"
        + "RAM: " + personalLaptop.getLaptopRam() + "\n"
        + "Hard Disk: " + personalLaptop.getLaptopHardDisk() + "\n"
        + "Battery: " + personalLaptop.getLaptopBattery() + "\n"
        + "Color: " + personalLaptop.getLaptopColor());


  }



}
