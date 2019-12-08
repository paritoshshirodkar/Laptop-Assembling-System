package edu.bu.met.cs665;

/**
 * This class represents a single Laptop.
 */
public class Laptop {

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
  public void setScreenSize(double screenSize) {
    laptopScreenSize = screenSize;
  }

  /**
   * Setter method for os of the laptop.
   * @param os os of the laptop
   */
  public void setOS(String os) {
    laptopOs = os;
  }

  /**
   * Setter method for processor of the laptop.
   * @param processor processor of the laptop
   */
  public void setProcessor(String processor) {
    laptopProcessor = processor;
  }

  /**
   * Setter method for ram of the laptop.
   * @param ram ram of the laptop
   */
  public void setRam(double ram) {
    laptopRam = ram;
  }

  /**
   * Setter method for hard disk of the laptop.
   * @param hardDisk hard disk of the laptop
   */
  public void setHardDisk(double hardDisk) {
    laptopHardDisk = hardDisk;
  }

  /**
   * Setter method for battery of the laptop.
   * @param battery battery of the laptop
   */
  public void setBattery(double battery) {
    laptopBattery = battery;
  }

  /**
   * Setter method for color of the laptop.
   * @param color color of the laptop
   */
  public void setColor(String color) {
    laptopColor = color;
  }




  /**
   * Getter method for the screen size of the laptop.
   * @return laptop screen size
   */
  public double getLaptopScreenSize() {
    return laptopScreenSize;
  }


  /**
   * Getter method for the operating system of the laptop.
   * @return laptop operating system
   */
  public String getLaptopOs() {
    return laptopOs;
  }


  /**
   * Getter method for the processor of the laptop.
   * @return laptop processor
   */
  public String getLaptopProcessor() {
    return laptopProcessor;
  }


  /**
   * Getter method for the processor of the laptop.
   * @return laptop ram
   */
  public double getLaptopRam() {
    return laptopRam;
  }


  /**
   * Getter method for the hard disk of the laptop.
   * @return laptop hard disk
   */
  public double getLaptopHardDisk() {
    return laptopHardDisk;
  }

  /**
   * Getter method for the battery of the laptop.
   * @return laptop battery
   */
  public double getLaptopBattery() {
    return laptopBattery;
  }


  /**
   * Getter method for the color of the laptop.
   * @return laptop color
   */
  public String getLaptopColor() {
    return laptopColor;
  }

}
