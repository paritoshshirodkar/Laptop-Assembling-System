package edu.bu.met.cs665;

public class ShopTechnician {

  private LaptopBuilder laptopBuilder;

  /**
   * Constructor to create a shop technician.
   * @param laptopBuilder laptop builder corresponding to different options available
   */
  public ShopTechnician(LaptopBuilder laptopBuilder) {
    this.laptopBuilder = laptopBuilder;
  }

  /**
   * Method to get the laptop built using the LaptopBuilder.
   * @return laptop built using the LaptopBuilder
   */
  public Laptop getlaptop() {
    return this.laptopBuilder.getLaptop();
  }


  /**
   * Method to assemble the laptop using
   * the specified laptop builder.
   */
  public void assembleLaptop() {
    this.laptopBuilder.addScreenSize();
    this.laptopBuilder.addOs();
    this.laptopBuilder.addProcessor();
    this.laptopBuilder.addRam();
    this.laptopBuilder.addHardDisk();
    this.laptopBuilder.addBattery();
    this.laptopBuilder.addColor();
  }

}
