package edu.bu.met.cs665;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Class to test the PersonalLaptopBuilder concrete class.
 */
public class TestPersonalLaptopBuilder {

  @Test
  public void testPersonalLaptopBuilderScreenSize() {

    LaptopBuilder personalLaptopBuilder = new PersonalLaptopBuilder();

    ShopTechnician personalTechnician = new ShopTechnician(personalLaptopBuilder);

    personalTechnician.assembleLaptop();

    Laptop personalLaptop = personalTechnician.getAssembledlaptop();

    assertEquals(personalLaptop.getLaptopScreenSize(), 16.0, 0.0);
  }

  @Test
  public void testPersonalLaptopBuilderOS() {

    LaptopBuilder personalLaptopBuilder = new PersonalLaptopBuilder();

    ShopTechnician personalTechnician = new ShopTechnician(personalLaptopBuilder);

    personalTechnician.assembleLaptop();

    Laptop personalLaptop = personalTechnician.getAssembledlaptop();

    assertEquals(personalLaptop.getLaptopOs(), "macOS Catalina");
  }

  @Test
  public void testPersonalLaptopBuilderProcessor() {

    LaptopBuilder personalLaptopBuilder = new PersonalLaptopBuilder();

    ShopTechnician personalTechnician = new ShopTechnician(personalLaptopBuilder);

    personalTechnician.assembleLaptop();

    Laptop personalLaptop = personalTechnician.getAssembledlaptop();

    assertEquals(personalLaptop.getLaptopProcessor(), "Intel core i7");
  }

  @Test
  public void testPersonalLaptopBuilderRam() {

    LaptopBuilder personalLaptopBuilder = new PersonalLaptopBuilder();

    ShopTechnician personalTechnician = new ShopTechnician(personalLaptopBuilder);

    personalTechnician.assembleLaptop();

    Laptop personalLaptop = personalTechnician.getAssembledlaptop();

    assertEquals(personalLaptop.getLaptopRam(), 32.0, 0.0);
  }

  @Test
  public void testPersonalLaptopBuilderHardDisk() {

    LaptopBuilder personalLaptopBuilder = new PersonalLaptopBuilder();

    ShopTechnician personalTechnician = new ShopTechnician(personalLaptopBuilder);

    personalTechnician.assembleLaptop();

    Laptop personalLaptop = personalTechnician.getAssembledlaptop();

    assertEquals(personalLaptop.getLaptopHardDisk(), 1000.0, 0.0);
  }

  @Test
  public void testPersonalLaptopBuilderBattery() {

    LaptopBuilder personalLaptopBuilder = new PersonalLaptopBuilder();

    ShopTechnician personalTechnician = new ShopTechnician(personalLaptopBuilder);

    personalTechnician.assembleLaptop();

    Laptop personalLaptop = personalTechnician.getAssembledlaptop();

    assertEquals(personalLaptop.getLaptopBattery(), 10000.0, 0.0);
  }

  @Test
  public void testPersonalLaptopBuilderColor() {

    LaptopBuilder personalLaptopBuilder = new PersonalLaptopBuilder();

    ShopTechnician personalTechnician = new ShopTechnician(personalLaptopBuilder);

    personalTechnician.assembleLaptop();

    Laptop personalLaptop = personalTechnician.getAssembledlaptop();

    assertEquals(personalLaptop.getLaptopColor(), "Space Gray");
  }




}
