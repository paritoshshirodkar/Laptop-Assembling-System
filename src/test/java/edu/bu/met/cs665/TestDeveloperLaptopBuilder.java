package edu.bu.met.cs665;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Class to test the DeveloperLaptopBuilder concrete class.
 */
public class TestDeveloperLaptopBuilder {

  @Test
  public void testDeveloperLaptopBuilderScreenSize() {

    LaptopBuilder developerLaptopBuilder = new DeveloperLaptopBuilder();

    ShopTechnician developerTechnician = new ShopTechnician(developerLaptopBuilder);

    developerTechnician.assembleLaptop();

    Laptop developerLaptop = developerTechnician.getAssembledlaptop();

    assertEquals(developerLaptop.getLaptopScreenSize(), 13.0, 0.0);
  }

  @Test
  public void testDeveloperLaptopBuilderOS() {

    LaptopBuilder developerLaptopBuilder = new DeveloperLaptopBuilder();

    ShopTechnician developerTechnician = new ShopTechnician(developerLaptopBuilder);

    developerTechnician.assembleLaptop();

    Laptop developerLaptop = developerTechnician.getAssembledlaptop();

    assertEquals(developerLaptop.getLaptopOs(), "Red Hat Enterprise Linux 8");
  }

  @Test
  public void testDeveloperLaptopBuilderProcessor() {

    LaptopBuilder developerLaptopBuilder = new DeveloperLaptopBuilder();

    ShopTechnician developerTechnician = new ShopTechnician(developerLaptopBuilder);

    developerTechnician.assembleLaptop();

    Laptop developerLaptop = developerTechnician.getAssembledlaptop();

    assertEquals(developerLaptop.getLaptopProcessor(), "Intel core i3");
  }

  @Test
  public void testDeveloperLaptopBuilderRam() {

    LaptopBuilder developerLaptopBuilder = new DeveloperLaptopBuilder();

    ShopTechnician developerTechnician = new ShopTechnician(developerLaptopBuilder);

    developerTechnician.assembleLaptop();

    Laptop developerLaptop = developerTechnician.getAssembledlaptop();

    assertEquals(developerLaptop.getLaptopRam(), 8.0, 0.0);
  }

  @Test
  public void testDeveloperLaptopBuilderHardDisk() {

    LaptopBuilder developerLaptopBuilder = new DeveloperLaptopBuilder();

    ShopTechnician developerTechnician = new ShopTechnician(developerLaptopBuilder);

    developerTechnician.assembleLaptop();

    Laptop developerLaptop = developerTechnician.getAssembledlaptop();

    assertEquals(developerLaptop.getLaptopHardDisk(), 250.0, 0.0);
  }

  @Test
  public void testDeveloperLaptopBuilderBattery() {

    LaptopBuilder developerLaptopBuilder = new DeveloperLaptopBuilder();

    ShopTechnician developerTechnician = new ShopTechnician(developerLaptopBuilder);

    developerTechnician.assembleLaptop();

    Laptop developerLaptop = developerTechnician.getAssembledlaptop();

    assertEquals(developerLaptop.getLaptopBattery(), 4000.0, 0.0);
  }

  @Test
  public void testDeveloperLaptopBuilderColor() {

    LaptopBuilder developerLaptopBuilder = new DeveloperLaptopBuilder();

    ShopTechnician developerTechnician = new ShopTechnician(developerLaptopBuilder);

    developerTechnician.assembleLaptop();

    Laptop developerLaptop = developerTechnician.getAssembledlaptop();

    assertEquals(developerLaptop.getLaptopColor(), "Black");
  }


}
