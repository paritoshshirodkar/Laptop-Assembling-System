package edu.bu.met.cs665;

import org.apache.log4j.Logger;

/**
 * Concrete builder to assemble gaming laptops.
 */
public class GamingLaptopBuilder implements LaptopBuilder {

  private Laptop laptop;

  // We use here a logger instead of printing to system.out
  private static Logger logger = Logger.getLogger(LaptopBuilder.class);

  /**
   * Constructor to create a GamingLaptopBuilder.
   */
  public GamingLaptopBuilder() {
    this.laptop = new Laptop();
    logger.info("Blank Gaming Laptop instance created");
  }

  @Override
  public void addScreenSize() {
    laptop.setScreenSize(15.0);
    logger.info("Gaming Laptop screen size set to 15.0 inches");
  }

  @Override
  public void addOs() {
    laptop.setOS("Windows 10");
    logger.info("Gaming Laptop OS set to Windows 10");
  }

  @Override
  public void addProcessor() {
    laptop.setProcessor("Intel core i5");
    logger.info("Gaming Laptop processor set to Intel core i5");
  }


  @Override
  public void addRam() {
    laptop.setRam(16.0);
    logger.info("Gaming Laptop RAM set to 16.0 GB");
  }

  @Override
  public void addHardDisk() {
    laptop.setHardDisk(500.0);
    logger.info("Gaming Laptop Hard Disk set to 500.0 GB");
  }

  @Override
  public void addBattery() {
    laptop.setBattery(8000.0);
    logger.info("Gaming Laptop battery set to 8000.0 mAh");
  }

  @Override
  public void addColor() {
    laptop.setColor("White");
    logger.info("Gaming Laptop color set to White");
  }

  @Override
  public Laptop getLaptop() {
    logger.info("Gaming Laptop returned");
    return laptop;
  }

}
