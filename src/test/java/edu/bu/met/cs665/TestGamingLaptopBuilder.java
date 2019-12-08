package edu.bu.met.cs665;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Class to test the GamingLaptopBuilder concrete class.
 */
public class TestGamingLaptopBuilder {

  @Test
  public void testGamingLaptopBuilderScreenSize() {

    LaptopBuilder gamingLaptopBuilder = new GamingLaptopBuilder();

    ShopTechnician gamingTechnician = new ShopTechnician(gamingLaptopBuilder);

    gamingTechnician.assembleLaptop();

    Laptop gamingLaptop = gamingTechnician.getAssembledlaptop();

    assertEquals(gamingLaptop.getLaptopScreenSize(), 15.0, 0.0);
  }

  @Test
  public void testWindowsBuilderOS() {

    LaptopBuilder gamingLaptopBuilder = new GamingLaptopBuilder();

    ShopTechnician gamingTechnician = new ShopTechnician(gamingLaptopBuilder);

    gamingTechnician.assembleLaptop();

    Laptop gamingLaptop = gamingTechnician.getAssembledlaptop();

    assertEquals(gamingLaptop.getLaptopOs(), "Windows 10");
  }

  @Test
  public void testWindowsBuilderProcessor() {

    LaptopBuilder gamingLaptopBuilder = new GamingLaptopBuilder();

    ShopTechnician gamingTechnician = new ShopTechnician(gamingLaptopBuilder);

    gamingTechnician.assembleLaptop();

    Laptop gamingLaptop = gamingTechnician.getAssembledlaptop();

    assertEquals(gamingLaptop.getLaptopProcessor(), "Intel core i5");
  }

  @Test
  public void testWindowsBuilderRam() {

    LaptopBuilder gamingLaptopBuilder = new GamingLaptopBuilder();

    ShopTechnician gamingTechnician = new ShopTechnician(gamingLaptopBuilder);

    gamingTechnician.assembleLaptop();

    Laptop gamingLaptop = gamingTechnician.getAssembledlaptop();

    assertEquals(gamingLaptop.getLaptopRam(), 16.0, 0.0);
  }


  @Test
  public void testWindowsBuilderHardDisk() {

    LaptopBuilder gamingLaptopBuilder = new GamingLaptopBuilder();

    ShopTechnician gamingTechnician = new ShopTechnician(gamingLaptopBuilder);

    gamingTechnician.assembleLaptop();

    Laptop gamingLaptop = gamingTechnician.getAssembledlaptop();

    assertEquals(gamingLaptop.getLaptopHardDisk(), 500.0, 0.0);
  }

  @Test
  public void testWindowsBuilderBattery() {

    LaptopBuilder gamingLaptopBuilder = new GamingLaptopBuilder();

    ShopTechnician gamingTechnician = new ShopTechnician(gamingLaptopBuilder);

    gamingTechnician.assembleLaptop();

    Laptop gamingLaptop = gamingTechnician.getAssembledlaptop();

    assertEquals(gamingLaptop.getLaptopBattery(), 8000.0, 0.0);
  }

  @Test
  public void testWindowsBuilderColor() {

    LaptopBuilder gamingLaptopBuilder = new GamingLaptopBuilder();

    ShopTechnician gamingTechnician = new ShopTechnician(gamingLaptopBuilder);

    gamingTechnician.assembleLaptop();

    Laptop gamingLaptop = gamingTechnician.getAssembledlaptop();

    assertEquals(gamingLaptop.getLaptopColor(), "White");
  }
}
