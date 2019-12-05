package edu.bu.met.cs665;

/**
 * Abstract interface for creating parts of a Laptop object.
 */
public interface LaptopBuilder {

  public void addScreenSize();

  public void addOs();

  public void addProcessor();

  public void addRam();

  public void addHardDisk();

  public void addBattery();

  public void addColor();

  public Laptop getLaptop();

}
