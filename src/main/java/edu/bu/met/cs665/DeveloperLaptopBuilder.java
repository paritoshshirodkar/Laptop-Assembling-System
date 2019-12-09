package edu.bu.met.cs665;

import org.apache.log4j.Logger;

/**
 * Concrete builder to assemble developer laptops.
 */
public class DeveloperLaptopBuilder implements LaptopBuilder {

  private Laptop laptop;

  // We use here a logger instead of printing to system.out
  private static Logger logger = Logger.getLogger(LaptopBuilder.class);

  /**
   * Constructor to create a DeveloperLaptopBuilder.
   */
  public DeveloperLaptopBuilder() {
    this.laptop = new Laptop();
    logger.info("Blank Developer Laptop instance created");
  }

  @Override
  public void addScreenSize() {
    laptop.setScreenSize(13.0);
    logger.info("Developer Laptop screen size set to 13.0 inches");
  }

  @Override
  public void addOs() {
    laptop.setOS("Red Hat Enterprise Linux 8");
    logger.info("Developer Laptop OS set to Red Hat Enterprise Linux 8");
  }

  @Override
  public void addProcessor() {
    laptop.setProcessor("Intel core i3");
    logger.info("Developer Laptop processor set to Intel core i3");
  }

  @Override
  public void addRam() {
    laptop.setRam(8.0);
    logger.info("Developer Laptop RAM set to 8.0 GB");
  }

  @Override
  public void addHardDisk() {
    laptop.setHardDisk(250.0);
    logger.info("Developer Laptop Hard Disk set to 250.0 GB");
  }

  @Override
  public void addBattery() {
    laptop.setBattery(4000.0);
    logger.info("Developer Laptop battery set to 4000.0 mAh");
  }

  @Override
  public void addColor() {
    laptop.setColor("Black");
    logger.info("Developer Laptop color set to Black");
  }

  @Override
  public Laptop getLaptop() {
    logger.info("Developer Laptop returned");
    return laptop;
  }
}
