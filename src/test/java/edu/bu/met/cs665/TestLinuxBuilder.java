package edu.bu.met.cs665;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Class to test the LinuxBuilder concrete class.
 */
public class TestLinuxBuilder {

  @Test
  public void testLinuxBuilderScreenSize() {

    LaptopBuilder linuxBuilder = new LinuxBuilder();

    ShopTechnician linuxTechnician = new ShopTechnician(linuxBuilder);

    linuxTechnician.assembleLaptop();

    Laptop rhelLaptop = linuxTechnician.getAssembledlaptop();

    assertEquals(rhelLaptop.getLaptopScreenSize(), 13.0, 0.0);
  }

  @Test
  public void testLinuxBuilderOS() {

    LaptopBuilder linuxBuilder = new LinuxBuilder();

    ShopTechnician linuxTechnician = new ShopTechnician(linuxBuilder);

    linuxTechnician.assembleLaptop();

    Laptop rhelLaptop = linuxTechnician.getAssembledlaptop();

    assertEquals(rhelLaptop.getLaptopOs(), "Red Hat Enterprise Linux 8");
  }

  @Test
  public void testLinuxBuilderProcessor() {

    LaptopBuilder linuxBuilder = new LinuxBuilder();

    ShopTechnician linuxTechnician = new ShopTechnician(linuxBuilder);

    linuxTechnician.assembleLaptop();

    Laptop rhelLaptop = linuxTechnician.getAssembledlaptop();

    assertEquals(rhelLaptop.getLaptopProcessor(), "Intel core i3");
  }

  @Test
  public void testLinuxBuilderRam() {

    LaptopBuilder linuxBuilder = new LinuxBuilder();

    ShopTechnician linuxTechnician = new ShopTechnician(linuxBuilder);

    linuxTechnician.assembleLaptop();

    Laptop rhelLaptop = linuxTechnician.getAssembledlaptop();

    assertEquals(rhelLaptop.getLaptopRam(), 8.0, 0.0);
  }

  @Test
  public void testLinuxBuilderHardDisk() {

    LaptopBuilder linuxBuilder = new LinuxBuilder();

    ShopTechnician linuxTechnician = new ShopTechnician(linuxBuilder);

    linuxTechnician.assembleLaptop();

    Laptop rhelLaptop = linuxTechnician.getAssembledlaptop();

    assertEquals(rhelLaptop.getLaptopHardDisk(), 250.0, 0.0);
  }

  @Test
  public void testLinuxBuilderBattery() {

    LaptopBuilder linuxBuilder = new LinuxBuilder();

    ShopTechnician linuxTechnician = new ShopTechnician(linuxBuilder);

    linuxTechnician.assembleLaptop();

    Laptop rhelLaptop = linuxTechnician.getAssembledlaptop();

    assertEquals(rhelLaptop.getLaptopBattery(), 4000.0, 0.0);
  }

  @Test
  public void testLinuxBuilderColor() {

    LaptopBuilder linuxBuilder = new LinuxBuilder();

    ShopTechnician linuxTechnician = new ShopTechnician(linuxBuilder);

    linuxTechnician.assembleLaptop();

    Laptop rhelLaptop = linuxTechnician.getAssembledlaptop();

    assertEquals(rhelLaptop.getLaptopColor(), "Black");
  }


}
