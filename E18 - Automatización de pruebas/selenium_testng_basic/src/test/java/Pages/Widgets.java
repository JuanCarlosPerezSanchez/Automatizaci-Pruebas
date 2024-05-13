package Pages;

import Utilities.Utils;

import java.sql.Date;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.annotations.AfterSuite;


public class Widgets {

  // Clases de utilidades

  // Instanciar acciones/condiciones
  public String testId;

  // Instanciar clases de test

  /**
   * Instanciador de la conexión entre el test y el dispositivo.
   * 
   * @throws Exception
   */
  @BeforeSuite
  public void setup_test() throws Exception {
    Utils.Instanciador_Chrome();
  }

  @AfterMethod
  public void breakup_test() throws Exception {
    Utils.CloseBrowser();
  }

  /**************************************************
   * 
   * 
   * Pruebas
   * 
   * 
   **************************************************/


  // -------------------------------------------------------4-----------------------------------------------------------------------------------------------------------------------------

  /**
   * Verificar el funcionamiento de "Date Picker"
   * @throws InterruptedException 
   */
  @Test(description = "Widgets_TC04 - Verificar el funcionamiento de \"Date Picker", enabled = true)
  public void Widgets_TC04() throws InterruptedException {

    // Widgets_TC01();

    //Paso 1
    
    //Acción
    Utils.chromeDriver.get("https://demoqa.com/");
    Utils.chromeDriver.findElementByXPath("//*[@id='app']/div/div/div[2]/div/div[4]").click();
    Utils.chromeDriver.findElementByXPath("//li[contains(@class, 'btn btn-light') and @id='item-2' and span[text()='Date Picker']]").click();
    Thread.sleep(5000);

    //Condición
    if(Utils.chromeDriver.findElementsByXPath("//input[@id='datePickerMonthYearInput' and @class='react-datepicker-ignore-onclickoutside']").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("//input[@id='dateAndTimePickerInput' and @class='react-datepicker-ignore-onclickoutside']").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("//*[@id=\"datePickerContainer\"]/h1").size() == 0 ||
      // Utils.chromeDriver.findElementsByXPath("Macro blanco?????????????????????").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("//span[contains(text(),'Date Picker')]/parent::li").contains("active"))
      {
        System.out.println("Esta prueba ha fallado!!");
      }

    //Paso 2
    
    //Acción
    Utils.chromeDriver.findElementByXPath("//input[@id='datePickerMonthYearInput' and @class='react-datepicker-ignore-onclickoutside']").click();
    
    // Thread.sleep(5000);
    
    //Condición
    if(Utils.chromeDriver.findElementsByXPath("//*[@id='datePickerMonthYear']/div[2]/div[2]").size() == 0)
    {
      System.out.println("Esta prueba ha fallado!!");
    }

    //Acción
    Utils.chromeDriver.findElementByXPath("//input[@id='dateAndTimePickerInput' and @class='react-datepicker-ignore-onclickoutside']").click();
    // Thread.sleep(5000);
    
    //Condición
    if(Utils.chromeDriver.findElementsByXPath("//*[@id=\"dateAndTimePicker\"]/div[2]/div[2]/div/div/div[2]").size() == 0 ||
    Utils.chromeDriver.findElementsByXPath("//*[@id=\"dateAndTimePicker\"]/div[2]/div[2]/div/div/div[3]").size() == 0)
    {
      System.out.println("Esta prueba ha fallado!!");
    }
  }

  
  // -------------------------------------------------------5-----------------------------------------------------------------------------------------------------------------------------


  /**
   * Verificar el funcionamiento de "Slider" 
   * @throws InterruptedException 
   */
  @Test(description = "Widgets_TC05 - Verificar el funcionamiento de \"Slider", enabled = false)
  public void Widgets_TC05() throws InterruptedException {

    Widgets_TC01();

    //Paso 1
    
    //Acción
    Utils.chromeDriver.get("https://demoqa.com/");
    Utils.chromeDriver.findElementByXPath("//li[@class='btn btn-light active' and @id='item-3']").click();
    // Thread.sleep(5000);

    //Condición
    if(Utils.chromeDriver.findElementsByXPath("//*[@id='sliderContainer']/div[1]/span").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("//*[@id='sliderValue']").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("//*[@id='app']/div/div/div/div[2]/form/h1").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("Macro blanco?????????????????????").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("//li[@class='btn btn-light active' and @id='item-3']").contains("active"))
    {
    System.out.println("Esta prueba ha fallado!!");
    }

    //Paso 2
    
    //Acción
    Utils.chromeDriver.findElementByXPath("//*[@id='sliderContainer']/div[1]/span/input").click();
    // Thread.sleep(5000);

    //Condición
    if(Utils.chromeDriver.findElementsByXPath("").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() == 0)
    {
    System.out.println("Esta prueba ha fallado!!");
    }
  }

  
  // -------------------------------------------------------6-----------------------------------------------------------------------------------------------------------------------------


  /**
   * Verificar el funcionamiento de "Proggres Bar" 
   * @throws InterruptedException 
   */
  @Test(description = "Widgets_TC06 - Verificar el funcionamiento de \"Proggres Bar", enabled = false)
  public void Widgets_TC06() throws InterruptedException {

    Widgets_TC01();

    //Paso 1
    
    //Acción
    Utils.chromeDriver.get("https://demoqa.com/");
    Utils.chromeDriver.findElementByXPath("").click();
    // Thread.sleep(5000);

    //Condición
    if(Utils.chromeDriver.findElementsByXPath("").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() == 0)
    {
    System.out.println("Esta prueba ha fallado!!");
    }

    //Paso 2
    
    //Acción
    Utils.chromeDriver.findElementByXPath("").click();
    // Thread.sleep(5000);

    //Condición
    if(Utils.chromeDriver.findElementsByXPath("").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() == 0)
    {
    System.out.println("Esta prueba ha fallado!!");
    }

    //Paso 3
    
    //Acción
    Utils.chromeDriver.findElementByXPath("").click();
    // Thread.sleep(5000);

    //Condición
    if(Utils.chromeDriver.findElementsByXPath("").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() == 0)
    {
    System.out.println("Esta prueba ha fallado!!");
    }
  }
  

  // -------------------------------------------------------7-----------------------------------------------------------------------------------------------------------------------------


  /**
   * Verificar el funcionamiento de "Tabs" 
   * @throws InterruptedException 
   */
  @Test(description = "Widgets_TC07 - Verificar el funcionamiento de \"Tabs", enabled = false)
  public void Widgets_TC07() throws InterruptedException {

    Widgets_TC01();

    //Paso 1
    
    //Acción
    Utils.chromeDriver.get("https://demoqa.com/");
    Utils.chromeDriver.findElementByXPath("").click();
    // Thread.sleep(5000);

    //Condición
    if(Utils.chromeDriver.findElementsByXPath("").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() == 0)
    {
    System.out.println("Esta prueba ha fallado!!");
    }

    //Paso 2
    
    //Acción
    Utils.chromeDriver.findElementByXPath("").click();
    // Thread.sleep(5000);

    //Condición
    if(Utils.chromeDriver.findElementsByXPath("").size() == 0)
    {
    System.out.println("Esta prueba ha fallado!!");
    }
  }
  

  // -------------------------------------------------------8-----------------------------------------------------------------------------------------------------------------------------


  /**
   * Verificar el funcionamiento de "Tool Tips" 
   * @throws InterruptedException 
   */
  @Test(description = "Widgets_TC08 - Verificar el funcionamiento de \"Tool Tips", enabled = false)
  public void Widgets_TC08() throws InterruptedException {

    Widgets_TC01();

    //Paso 1

    //Acción
    Utils.chromeDriver.get("https://demoqa.com/");
    Utils.chromeDriver.findElementByXPath("").click();
    // Thread.sleep(5000);

    //Condición
    if(Utils.chromeDriver.findElementsByXPath("").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() == 0)
    {
    System.out.println("Esta prueba ha fallado!!");
    }

    //Paso 2
    
    //Acción
    Utils.chromeDriver.findElementByXPath("").click();
    // Thread.sleep(5000);

    //Condición
    if(Utils.chromeDriver.findElementsByXPath("").size() == 0 ||
    Utils.chromeDriver.findElementsByXPath("").size() == 0 ||
    Utils.chromeDriver.findElementsByXPath("").size() == 0 ||
    Utils.chromeDriver.findElementsByXPath("").size() == 0)
    {
    System.out.println("Esta prueba ha fallado!!");
    }
  }
  

  // -------------------------------------------------------9-----------------------------------------------------------------------------------------------------------------------------


  /**
   * Verificar el funcionamiento de "Menu" - Menu 1 
   * @throws InterruptedException 
   */
  @Test(description = "Widgets_TC09 - Verificar el funcionamiento de \"Menu - Menu 1", enabled = false)
  public void Widgets_TC09() throws InterruptedException {

    Widgets_TC01();

    //Paso 1
    
    //Acción
    Utils.chromeDriver.get("https://demoqa.com/");
    Utils.chromeDriver.findElementByXPath("").click();
    // Thread.sleep(5000);

    //Condición
    if(Utils.chromeDriver.findElementsByXPath("").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() == 0)
    {
    System.out.println("Esta prueba ha fallado!!");
    }

    //Paso 2
    
    //Acción
    Utils.chromeDriver.findElementByXPath("").click();
    // Thread.sleep(5000);

    //Condición
    if(Utils.chromeDriver.findElementsByXPath("").size() == 0)
    {
    System.out.println("Esta prueba ha fallado!!");
    }
  }
  

  // -------------------------------------------------------10-----------------------------------------------------------------------------------------------------------------------------


  /**
   * Verificar el funcionamiento de "Menu" - Menu 2 
   * @throws InterruptedException 
   */
  @Test(description = "Widgets_TC10 - Verificar el funcionamiento de \"Menu - Menu 2", enabled = false)
  public void Widgets_TC10() throws InterruptedException {

    Widgets_TC01();

    //Paso 1
    
    //Acción
    Utils.chromeDriver.get("https://demoqa.com/");
    Utils.chromeDriver.findElementByXPath("").click();
    // Thread.sleep(5000);

    //Condición
    if(Utils.chromeDriver.findElementsByXPath("").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() == 0)
    {
    System.out.println("Esta prueba ha fallado!!");
    }

    //Paso 2
    
    //Acción
    Utils.chromeDriver.findElementByXPath("").click();
    // Thread.sleep(5000);

    //Condición
    if(Utils.chromeDriver.findElementsByXPath("").size() == 0)
    {
    System.out.println("Esta prueba ha fallado!!");
    }
  }
  

  // -------------------------------------------------------11-----------------------------------------------------------------------------------------------------------------------------


  /**
   * Verificar el funcionamiento de "Menu" - Menu 3 
   * @throws InterruptedException 
   */
  @Test(description = "Widgets_TC11 - Verificar el funcionamiento de \"Menu - Menu 3", enabled = false)
  public void Widgets_TC11() throws InterruptedException {

    Widgets_TC01();

    //Paso 1
    
    //Acción
    Utils.chromeDriver.get("https://demoqa.com/");
    Utils.chromeDriver.findElementByXPath("").click();
    // Thread.sleep(5000);

    //Condición
    if(Utils.chromeDriver.findElementsByXPath("").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() == 0)
    {
    System.out.println("Esta prueba ha fallado!!");
    }

    //Paso 2
    
    //Acción
    Utils.chromeDriver.findElementByXPath("").click();
    // Thread.sleep(5000);

    //Condición
    if(Utils.chromeDriver.findElementsByXPath("").size() == 0)
    {
    System.out.println("Esta prueba ha fallado!!");
    }
  }
  

  // -------------------------------------------------------12-----------------------------------------------------------------------------------------------------------------------------


  /**
   * Verificar el funcionamiento de "Select Menu" - Select Menu 1 
   * @throws InterruptedException 
   */
  @Test(description = "Widgets_TC12 - Verificar el funcionamiento de \"Select Menu - Select Menu 1", enabled = false)
  public void Widgets_TC12() throws InterruptedException {

    Widgets_TC01();

    //Paso 1
    
    //Acción
    Utils.chromeDriver.get("https://demoqa.com/");
    Utils.chromeDriver.findElementByXPath("").click();
    // Thread.sleep(5000);

    //Condición
    if(Utils.chromeDriver.findElementsByXPath("").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() == 0)
    {
    System.out.println("Esta prueba ha fallado!!");
    }

    //Paso 2
    
    //Acción
    Utils.chromeDriver.findElementByXPath("").click();
    // Thread.sleep(5000);

    //Condición
    if(Utils.chromeDriver.findElementsByXPath("").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() == 0)
    {
    System.out.println("Esta prueba ha fallado!!");
    }
  }
  

  // -------------------------------------------------------13-----------------------------------------------------------------------------------------------------------------------------


  /**
   * Verificar el funcionamiento de "Select Menu" - Select Menu 2 
   * @throws InterruptedException 
   */
  @Test(description = "Widgets_TC13 - Verificar el funcionamiento de \"Select Menu - Select Menu 2", enabled = false)
  public void Widgets_TC13() throws InterruptedException {

    Widgets_TC01();

    //Paso 1
    
    //Acción
    Utils.chromeDriver.get("https://demoqa.com/");
    Utils.chromeDriver.findElementByXPath("").click();
    // Thread.sleep(5000);

    //Condición
    if(Utils.chromeDriver.findElementsByXPath("").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() == 0)
    {
    System.out.println("Esta prueba ha fallado!!");
    }

    //Paso 2
    
    //Acción
    Utils.chromeDriver.findElementByXPath("").click();
    // Thread.sleep(5000);

    //Condición
    if(Utils.chromeDriver.findElementsByXPath("").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() == 0)
    {
    System.out.println("Esta prueba ha fallado!!");
    }
  }
  

  // -------------------------------------------------------14-----------------------------------------------------------------------------------------------------------------------------


  /**
   * Verificar el funcionamiento de "Select Menu" - Select Menu 3 
   * @throws InterruptedException 
   */
  @Test(description = "Widgets_TC14 - Verificar el funcionamiento de \"Select Menu - Select Menu 3", enabled = false)
  public void Widgets_TC14() throws InterruptedException {

    Widgets_TC01();

    //Paso 1
    
    //Acción
    Utils.chromeDriver.get("https://demoqa.com/");
    Utils.chromeDriver.findElementByXPath("").click();
    // Thread.sleep(5000);

    //Condición
    if(Utils.chromeDriver.findElementsByXPath("").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() == 0)
    {
    System.out.println("Esta prueba ha fallado!!");
    }

    //Paso 2
    
    //Acción
    Utils.chromeDriver.findElementByXPath("").click();
    // Thread.sleep(5000);

    //Condición
    if(Utils.chromeDriver.findElementsByXPath("").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() == 0)
    {
    System.out.println("Esta prueba ha fallado!!");
    }
  }
}