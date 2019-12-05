package edu.bu.met.cs665;

/**
 * This class represents a single Laptop.
 */
public class Laptop implements LaptopAssemblyBlueprint {

  private double laptopScreenSize;
  private String laptopOs;
  private String laptopProcessor;
  private double laptopRam;
  private double laptopHardDisk;
  private double laptopBattery;
  private String laptopColor;


  /**
   * Setter method for screen size of the laptop.
   * @param screenSize screen size of the laptop
   */
  @Override
  public void setScreenSize(double screenSize) {
    laptopScreenSize = screenSize;
  }

  /**
   * Setter method for os of the laptop.
   * @param os os of the laptop
   */
  @Override
  public void setOS(String os) {
    laptopOs = os;
  }

  /**
   * Setter method for processor of the laptop.
   * @param processor processor of the laptop
   */
  @Override
  public void setProcessor(String processor) {
    laptopProcessor = processor;
  }

  /**
   * Setter method for ram of the laptop.
   * @param ram ram of the laptop
   */
  @Override
  public void setRam(double ram) {
    laptopRam = ram;
  }

  /**
   * Setter method for hard disk of the laptop.
   * @param hardDisk hard disk of the laptop
   */
  @Override
  public void setHardDisk(double hardDisk) {
    laptopHardDisk = hardDisk;
  }

  /**
   * Setter method for battery of the laptop.
   * @param battery battery of the laptop
   */
  @Override
  public void setBattery(double battery) {
    laptopBattery = battery;
  }

  /**
   * Setter method for color of the laptop.
   * @param color color of the laptop
   */
  @Override
  public void setColor(String color) {
    laptopColor = color;
  }
}
