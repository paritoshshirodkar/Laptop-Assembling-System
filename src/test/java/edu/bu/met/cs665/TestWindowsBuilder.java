package edu.bu.met.cs665;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Class to test the WindowsBuilder concrete class.
 */
public class TestWindowsBuilder {

  @Test
  public void testWindowsBuilderScreenSize() {

    LaptopBuilder windowsBuilder = new WindowsBuilder();

    ShopTechnician windowsTechnician = new ShopTechnician(windowsBuilder);

    windowsTechnician.assembleLaptop();

    Laptop windowsLaptop = windowsTechnician.getAssembledlaptop();

    assertEquals(windowsLaptop.getLaptopScreenSize(), 15.0, 0.0);
  }

  @Test
  public void testWindowsBuilderOS() {

    LaptopBuilder windowsBuilder = new WindowsBuilder();

    ShopTechnician windowsTechnician = new ShopTechnician(windowsBuilder);

    windowsTechnician.assembleLaptop();

    Laptop windowsLaptop = windowsTechnician.getAssembledlaptop();

    assertEquals(windowsLaptop.getLaptopOs(), "Windows 10");
  }

  @Test
  public void testWindowsBuilderProcessor() {

    LaptopBuilder windowsBuilder = new WindowsBuilder();

    ShopTechnician windowsTechnician = new ShopTechnician(windowsBuilder);

    windowsTechnician.assembleLaptop();

    Laptop windowsLaptop = windowsTechnician.getAssembledlaptop();

    assertEquals(windowsLaptop.getLaptopProcessor(), "Intel core i5");
  }

  @Test
  public void testWindowsBuilderRam() {

    LaptopBuilder windowsBuilder = new WindowsBuilder();

    ShopTechnician windowsTechnician = new ShopTechnician(windowsBuilder);

    windowsTechnician.assembleLaptop();

    Laptop windowsLaptop = windowsTechnician.getAssembledlaptop();

    assertEquals(windowsLaptop.getLaptopRam(), 16.0, 0.0);
  }


  @Test
  public void testWindowsHardDisk() {

    LaptopBuilder windowsBuilder = new WindowsBuilder();

    ShopTechnician windowsTechnician = new ShopTechnician(windowsBuilder);

    windowsTechnician.assembleLaptop();

    Laptop windowsLaptop = windowsTechnician.getAssembledlaptop();

    assertEquals(windowsLaptop.getLaptopHardDisk(), 500.0, 0.0);
  }

  @Test
  public void testWindowsBattery() {

    LaptopBuilder windowsBuilder = new WindowsBuilder();

    ShopTechnician windowsTechnician = new ShopTechnician(windowsBuilder);

    windowsTechnician.assembleLaptop();

    Laptop windowsLaptop = windowsTechnician.getAssembledlaptop();

    assertEquals(windowsLaptop.getLaptopBattery(), 8000.0, 0.0);
  }

  @Test
  public void testWindowsColor() {

    LaptopBuilder windowsBuilder = new WindowsBuilder();

    ShopTechnician windowsTechnician = new ShopTechnician(windowsBuilder);

    windowsTechnician.assembleLaptop();

    Laptop windowsLaptop = windowsTechnician.getAssembledlaptop();

    assertEquals(windowsLaptop.getLaptopColor(), "White");
  }
}
