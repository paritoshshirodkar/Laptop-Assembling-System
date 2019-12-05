package edu.bu.met.cs665;

/**
 * Interface that provides the basic blueprint of assembling a laptop.
 */
public interface LaptopAssemblyBlueprint {

  public void setScreenSize(double screenSize);

  public void setOS(String os);

  public void setProcessor(String processor);

  public void setRam(double ram);

  public void setHardDisk(double hardDisk);

  public void setBattery(double battery);

  public void setColor(String color);

}
