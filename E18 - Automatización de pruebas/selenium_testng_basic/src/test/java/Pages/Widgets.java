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
  @Test(description = "Widgets_TC04 - Verificar el funcionamiento de \"Date Picker", enabled = false)
  public void Widgets_TC04() throws InterruptedException {

    // Widgets_TC01();

    //Paso 1
    
    //Acción
    Utils.chromeDriver.get("https://demoqa.com/");
    Utils.chromeDriver.findElementByXPath("//div[@class='card mt-4 top-card' and descendant::h5[text()='Widgets']]").click(); /* -> Esto hay que borrarlo */
    Utils.chromeDriver.findElementByXPath("//li[contains(@class, 'btn btn-light') and @id='item-2' and span[text()='Date Picker']]").click();
    // Thread.sleep(5000);

    //Condición
    if(Utils.chromeDriver.findElementsByXPath("//input[@id='datePickerMonthYearInput' and @class='react-datepicker-ignore-onclickoutside']").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//input[@id='dateAndTimePickerInput' and @class='react-datepicker-ignore-onclickoutside']").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//*[@id='datePickerContainer']/h1").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//span[contains(text(),'Date Picker')]/parent::li").contains("active"))
      {
        System.out.println("No hay fallos!!");
      }
    
    //Paso 2
    
    //Acción
    Utils.chromeDriver.findElementByXPath("//*[@id='datePickerMonthYearInput']").click();
    // Thread.sleep(5000);
    
    //Condición
    if(Utils.chromeDriver.findElementsByXPath("//*[@id='datePickerMonthYear']/div[2]/div[2]").size() > 0)
    {
      System.out.println("No hay fallos!!");
    }

    //Acción
    Utils.chromeDriver.findElementByXPath("//*[@id='datePickerContainer']/h1").click();
    Utils.chromeDriver.findElementByXPath("//*[@id='dateAndTimePickerInput']").click();
    // Thread.sleep(5000);
    
    //Condición
    if(Utils.chromeDriver.findElementsByXPath("//div[@class='react-datepicker__month-container']").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//*[@id='dateAndTimePicker']/div[2]/div[2]/div/div/div[3]").size() > 0)
    {
      System.out.println("No hay fallos!!");
    }
  }

  
  // -------------------------------------------------------5-----------------------------------------------------------------------------------------------------------------------------


  /**
   * Verificar el funcionamiento de "Slider" 
   * @throws InterruptedException 
   */
  @Test(description = "Widgets_TC05 - Verificar el funcionamiento de \"Slider", enabled = false)
  public void Widgets_TC05() throws InterruptedException {

    // Widgets_TC01();

    //Paso 1
    
    //Acción
    Utils.chromeDriver.get("https://demoqa.com/");
    Utils.chromeDriver.findElementByXPath("//div[@class='card mt-4 top-card' and descendant::h5[text()='Widgets']]").click(); /* -> Esto hay que borrarlo */
    Utils.chromeDriver.findElementByXPath("//li[@id='item-3' and span[@class='text' and text()='Slider']]").click();
    Thread.sleep(5000);

    //Condición
    if(Utils.chromeDriver.findElementsByXPath("//*[@id='sliderContainer']/div[1]/span").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//*[@id='sliderValue']").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//*[@id='app']/div/div/div/div[2]/form/h1").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//li[@class='btn btn-light active' and @id='item-3']").contains("active"))
    {
    System.out.println("No hay fallos!!");
    }

    //Paso 2
    
    //Acción
    Utils.chromeDriver.findElementByXPath("//*[@id='sliderContainer']/div[1]/span/input").click();
    Thread.sleep(5000);

    //Condición
    if(Utils.chromeDriver.findElementsByXPath("").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() > 0)
    {
    System.out.println("No hay fallos!!");
    }
  }

  
  // -------------------------------------------------------6-----------------------------------------------------------------------------------------------------------------------------


  /**
   * Verificar el funcionamiento de "Proggres Bar" 
   * @throws InterruptedException 
   */
  @Test(description = "Widgets_TC06 - Verificar el funcionamiento de \"Proggres Bar", enabled = true)
  public void Widgets_TC06() throws InterruptedException {

    // Widgets_TC01();

    //Paso 1
    
    //Acción
    Utils.chromeDriver.get("https://demoqa.com/");
    Utils.chromeDriver.findElementByXPath("//div[@class='card mt-4 top-card' and descendant::h5[text()='Widgets']]").click(); /* -> Esto hay que borrarlo */
    Utils.chromeDriver.findElementByXPath("//li[@id='item-4' and span[text()='Progress Bar']]").click();
    // Thread.sleep(5000);

    //Condición
    if(Utils.chromeDriver.findElementsByXPath("//*[@id='progressBarContainer']/h1").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() > 0)
    {
    System.out.println("No hay fallos!!");
    }

    //Paso 2
    
    //Acción
    Utils.chromeDriver.findElementByXPath("").click();
    // Thread.sleep(5000);

    //Condición
    if(Utils.chromeDriver.findElementsByXPath("").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() > 0)
    {
    System.out.println("No hay fallos!!");
    }

    //Paso 3
    
    //Acción
    Utils.chromeDriver.findElementByXPath("").click();
    // Thread.sleep(5000);

    //Condición
    if(Utils.chromeDriver.findElementsByXPath("").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() > 0)
    {
    System.out.println("No hay fallos!!");
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
    if(Utils.chromeDriver.findElementsByXPath("").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() > 0)
    {
    System.out.println("No hay fallos!!");
    }

    //Paso 2
    
    //Acción
    Utils.chromeDriver.findElementByXPath("").click();
    // Thread.sleep(5000);

    //Condición
    if(Utils.chromeDriver.findElementsByXPath("").size() > 0)
    {
    System.out.println("No hay fallos!!");
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
    if(Utils.chromeDriver.findElementsByXPath("").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() > 0)
    {
    System.out.println("No hay fallos!!");
    }

    //Paso 2
    
    //Acción
    Utils.chromeDriver.findElementByXPath("").click();
    // Thread.sleep(5000);

    //Condición
    if(Utils.chromeDriver.findElementsByXPath("").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("").size() > 0)
    {
    System.out.println("No hay fallos!!");
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
    if(Utils.chromeDriver.findElementsByXPath("").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() > 0)
    {
    System.out.println("No hay fallos!!");
    }

    //Paso 2
    
    //Acción
    Utils.chromeDriver.findElementByXPath("").click();
    // Thread.sleep(5000);

    //Condición
    if(Utils.chromeDriver.findElementsByXPath("").size() > 0)
    {
    System.out.println("No hay fallos!!");
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
    if(Utils.chromeDriver.findElementsByXPath("").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() > 0)
    {
    System.out.println("No hay fallos!!");
    }

    //Paso 2
    
    //Acción
    Utils.chromeDriver.findElementByXPath("").click();
    // Thread.sleep(5000);

    //Condición
    if(Utils.chromeDriver.findElementsByXPath("").size() > 0)
    {
    System.out.println("No hay fallos!!");
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
    if(Utils.chromeDriver.findElementsByXPath("").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() > 0)
    {
    System.out.println("No hay fallos!!");
    }

    //Paso 2
    
    //Acción
    Utils.chromeDriver.findElementByXPath("").click();
    // Thread.sleep(5000);

    //Condición
    if(Utils.chromeDriver.findElementsByXPath("").size() > 0)
    {
    System.out.println("No hay fallos!!");
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
    if(Utils.chromeDriver.findElementsByXPath("").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() > 0)
    {
    System.out.println("No hay fallos!!");
    }

    //Paso 2
    
    //Acción
    Utils.chromeDriver.findElementByXPath("").click();
    // Thread.sleep(5000);

    //Condición
    if(Utils.chromeDriver.findElementsByXPath("").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() > 0)
    {
    System.out.println("No hay fallos!!");
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
    if(Utils.chromeDriver.findElementsByXPath("").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() > 0)
    {
    System.out.println("No hay fallos!!");
    }

    //Paso 2
    
    //Acción
    Utils.chromeDriver.findElementByXPath("").click();
    // Thread.sleep(5000);

    //Condición
    if(Utils.chromeDriver.findElementsByXPath("").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() > 0)
    {
    System.out.println("No hay fallos!!");
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
    if(Utils.chromeDriver.findElementsByXPath("").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() > 0)
    {
    System.out.println("No hay fallos!!");
    }

    //Paso 2
    
    //Acción
    Utils.chromeDriver.findElementByXPath("").click();
    // Thread.sleep(5000);

    //Condición
    if(Utils.chromeDriver.findElementsByXPath("").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("").size() > 0)
    {
    System.out.println("No hay fallos!!");
    }
  }
}