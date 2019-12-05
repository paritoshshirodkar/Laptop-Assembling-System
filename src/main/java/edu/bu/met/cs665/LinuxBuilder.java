package edu.bu.met.cs665;

/**
 * Concrete builder to assemble linux laptops.
 */
public class LinuxBuilder implements LaptopBuilder {

  private Laptop laptop;

  /**
   * Constructor to create a LinuxBuilder.
   */
  public void LinuxBuilder() {
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
}
