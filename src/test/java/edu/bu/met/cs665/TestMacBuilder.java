package edu.bu.met.cs665;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Class to test the MacBuilder concrete class.
 */
public class TestMacBuilder {

  @Test
  public void testMacBuilderScreenSize() {

    LaptopBuilder macBuilder = new MacBuilder();

    ShopTechnician macTechnician = new ShopTechnician(macBuilder);

    macTechnician.assembleLaptop();

    Laptop macLaptop = macTechnician.getAssembledlaptop();

    assertEquals(macLaptop.getLaptopScreenSize(), 16.0, 0.0);
  }

  @Test
  public void testMacBuilderOS() {

    LaptopBuilder macBuilder = new MacBuilder();

    ShopTechnician macTechnician = new ShopTechnician(macBuilder);

    macTechnician.assembleLaptop();

    Laptop macLaptop = macTechnician.getAssembledlaptop();

    assertEquals(macLaptop.getLaptopOs(), "macOS Catalina");
  }

  @Test
  public void testMacBuilderProcessor() {

    LaptopBuilder macBuilder = new MacBuilder();

    ShopTechnician macTechnician = new ShopTechnician(macBuilder);

    macTechnician.assembleLaptop();

    Laptop macLaptop = macTechnician.getAssembledlaptop();

    assertEquals(macLaptop.getLaptopProcessor(), "Intel core i7");
  }

  @Test
  public void testMacBuilderRam() {

    LaptopBuilder macBuilder = new MacBuilder();

    ShopTechnician macTechnician = new ShopTechnician(macBuilder);

    macTechnician.assembleLaptop();

    Laptop macLaptop = macTechnician.getAssembledlaptop();

    assertEquals(macLaptop.getLaptopRam(), 32.0, 0.0);
  }

  @Test
  public void testMacBuilderHardDisk() {

    LaptopBuilder macBuilder = new MacBuilder();

    ShopTechnician macTechnician = new ShopTechnician(macBuilder);

    macTechnician.assembleLaptop();

    Laptop macLaptop = macTechnician.getAssembledlaptop();

    assertEquals(macLaptop.getLaptopHardDisk(), 1000.0, 0.0);
  }

  @Test
  public void testMacBuilderBattery() {

    LaptopBuilder macBuilder = new MacBuilder();

    ShopTechnician macTechnician = new ShopTechnician(macBuilder);

    macTechnician.assembleLaptop();

    Laptop macLaptop = macTechnician.getAssembledlaptop();

    assertEquals(macLaptop.getLaptopBattery(), 10000.0, 0.0);
  }

  @Test
  public void testMacBuilderColor() {

    LaptopBuilder macBuilder = new MacBuilder();

    ShopTechnician macTechnician = new ShopTechnician(macBuilder);

    macTechnician.assembleLaptop();

    Laptop macLaptop = macTechnician.getAssembledlaptop();

    assertEquals(macLaptop.getLaptopColor(), "Space Gray");
  }




}
