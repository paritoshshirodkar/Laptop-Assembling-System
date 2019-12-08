package edu.bu.met.cs665;

/**
 * Concrete builder to assemble gaming laptops.
 */
public class GamingLaptopBuilder implements LaptopBuilder {

  private Laptop laptop;

  /**
   * Constructor to create a GamingLaptopBuilder.
   */
  public GamingLaptopBuilder() {
    this.laptop = new Laptop();
  }

  @Override
  public void addScreenSize() {
    laptop.setScreenSize(15.0);
  }

  @Override
  public void addOs() {
    laptop.setOS("Windows 10");
  }

  @Override
  public void addProcessor() {
    laptop.setProcessor("Intel core i5");
  }

  @Override
  public void addRam() {
    laptop.setRam(16.0);
  }

  @Override
  public void addHardDisk() {
    laptop.setHardDisk(500.0);
  }

  @Override
  public void addBattery() {
    laptop.setBattery(8000.0);
  }

  @Override
  public void addColor() {
    laptop.setColor("White");
  }

  @Override
  public Laptop getLaptop() {
    return laptop;
  }

}
