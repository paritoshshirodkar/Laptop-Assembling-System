package edu.bu.met.cs665;

/**
 * Concrete builder to assemble mac laptops.
 */
public class MacBuilder implements LaptopBuilder {

  private Laptop laptop;

  /**
   * Constructor to create a MacBuilder.
   */
  public MacBuilder() {
    this.laptop = new Laptop();
  }

  @Override
  public void addScreenSize() {
    laptop.setScreenSize(16.0);
  }

  @Override
  public void addOs() {
    laptop.setOS("macOS Catalina");
  }

  @Override
  public void addProcessor() {
    laptop.setProcessor("Intel core i7");
  }

  @Override
  public void addRam() {
    laptop.setRam(32.0);
  }

  @Override
  public void addHardDisk() {
    laptop.setHardDisk(1000.0);
  }

  @Override
  public void addBattery() {
    laptop.setBattery(10000.0);
  }

  @Override
  public void addColor() {
    laptop.setColor("Space Gray");
  }

  @Override
  public Laptop getLaptop() {
    return laptop;
  }

}
