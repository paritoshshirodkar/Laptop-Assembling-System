package edu.bu.met.cs665;

import org.apache.log4j.Logger;

/**
 * Concrete builder to assemble personal laptops.
 */
public class PersonalLaptopBuilder implements LaptopBuilder {

  private Laptop laptop;

  // We use here a logger instead of printing to system.out
  private static Logger logger = Logger.getLogger(LaptopBuilder.class);

  /**
   * Constructor to create a PersonalLaptopBuilder.
   */
  public PersonalLaptopBuilder() {
    this.laptop = new Laptop();
    logger.info("Blank Personal Laptop instance created");
  }

  @Override
  public void addScreenSize() {
    laptop.setScreenSize(16.0);
    logger.info("Personal Laptop screen size set to 16.0 inches");
  }

  @Override
  public void addOs() {
    laptop.setOS("macOS Catalina");
    logger.info("Personal Laptop OS set to macOS Catalina");
  }

  @Override
  public void addProcessor() {
    laptop.setProcessor("Intel core i7");
    logger.info("Personal Laptop processor set to Intel core i7");
  }

  @Override
  public void addRam() {
    laptop.setRam(32.0);
    logger.info("Personal Laptop RAM set to 32.0 GB");
  }

  @Override
  public void addHardDisk() {
    laptop.setHardDisk(1000.0);
    logger.info("Personal Laptop Hard Disk set to 1000.0 GB");
  }

  @Override
  public void addBattery() {
    laptop.setBattery(10000.0);
    logger.info("Personal Laptop battery set to 10000.0 mAh");
  }

  @Override
  public void addColor() {
    laptop.setColor("Space Gray");
    logger.info("Personal Laptop color set to Space Gray");
  }

  @Override
  public Laptop getLaptop() {
    logger.info("Personal Laptop returned");
    return laptop;
  }

}
