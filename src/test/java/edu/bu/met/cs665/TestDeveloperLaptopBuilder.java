package edu.bu.met.cs665;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Class to test the DeveloperLaptopBuilder concrete class.
 */
public class TestDeveloperLaptopBuilder {

  @Test
  public void testLinuxBuilderScreenSize() {

    LaptopBuilder developerLaptopBuilder = new DeveloperLaptopBuilder();

    ShopTechnician developerTechnician = new ShopTechnician(developerLaptopBuilder);

    developerTechnician.assembleLaptop();

    Laptop developerLaptop = developerTechnician.getAssembledlaptop();

    assertEquals(developerLaptop.getLaptopScreenSize(), 13.0, 0.0);
  }

  @Test
  public void testLinuxBuilderOS() {

    LaptopBuilder developerLaptopBuilder = new DeveloperLaptopBuilder();

    ShopTechnician developerTechnician = new ShopTechnician(developerLaptopBuilder);

    developerTechnician.assembleLaptop();

    Laptop developerLaptop = developerTechnician.getAssembledlaptop();

    assertEquals(developerLaptop.getLaptopOs(), "Red Hat Enterprise Linux 8");
  }

  @Test
  public void testLinuxBuilderProcessor() {

    LaptopBuilder developerLaptopBuilder = new DeveloperLaptopBuilder();

    ShopTechnician developerTechnician = new ShopTechnician(developerLaptopBuilder);

    developerTechnician.assembleLaptop();

    Laptop developerLaptop = developerTechnician.getAssembledlaptop();

    assertEquals(developerLaptop.getLaptopProcessor(), "Intel core i3");
  }

  @Test
  public void testLinuxBuilderRam() {

    LaptopBuilder developerLaptopBuilder = new DeveloperLaptopBuilder();

    ShopTechnician developerTechnician = new ShopTechnician(developerLaptopBuilder);

    developerTechnician.assembleLaptop();

    Laptop developerLaptop = developerTechnician.getAssembledlaptop();

    assertEquals(developerLaptop.getLaptopRam(), 8.0, 0.0);
  }

  @Test
  public void testLinuxBuilderHardDisk() {

    LaptopBuilder developerLaptopBuilder = new DeveloperLaptopBuilder();

    ShopTechnician developerTechnician = new ShopTechnician(developerLaptopBuilder);

    developerTechnician.assembleLaptop();

    Laptop developerLaptop = developerTechnician.getAssembledlaptop();

    assertEquals(developerLaptop.getLaptopHardDisk(), 250.0, 0.0);
  }

  @Test
  public void testLinuxBuilderBattery() {

    LaptopBuilder developerLaptopBuilder = new DeveloperLaptopBuilder();

    ShopTechnician developerTechnician = new ShopTechnician(developerLaptopBuilder);

    developerTechnician.assembleLaptop();

    Laptop developerLaptop = developerTechnician.getAssembledlaptop();

    assertEquals(developerLaptop.getLaptopBattery(), 4000.0, 0.0);
  }

  @Test
  public void testLinuxBuilderColor() {

    LaptopBuilder developerLaptopBuilder = new DeveloperLaptopBuilder();

    ShopTechnician developerTechnician = new ShopTechnician(developerLaptopBuilder);

    developerTechnician.assembleLaptop();

    Laptop developerLaptop = developerTechnician.getAssembledlaptop();

    assertEquals(developerLaptop.getLaptopColor(), "Black");
  }


}
