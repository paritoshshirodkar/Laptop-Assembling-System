package edu.bu.met.cs665;

/**
 * Concrete builder to assemble developer laptops.
 */
public class DeveloperLaptopBuilder implements LaptopBuilder {

  private Laptop laptop;

  /**
   * Constructor to create a DeveloperLaptopBuilder.
   */
  public DeveloperLaptopBuilder() {
    this.laptop = new Laptop();
  }

  @Override
  public void addScreenSize() {
    laptop.setScreenSize(13.0);
  }

  @Override
  public void addOs() {
    laptop.setOS("Red Hat Enterprise Linux 8");
  }

  @Override
  public void addProcessor() {
    laptop.setProcessor("Intel core i3");
  }

  @Override
  public void addRam() {
    laptop.setRam(8.0);
  }

  @Override
  public void addHardDisk() {
    laptop.setHardDisk(250.0);
  }

  @Override
  public void addBattery() {
    laptop.setBattery(4000.0);
  }

  @Override
  public void addColor() {
    laptop.setColor("Black");
  }

  @Override
  public Laptop getLaptop() {
    return laptop;
  }
}
