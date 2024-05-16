package Pages;

import Utilities.Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;




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


// -------------------------------------------------------1-----------------------------------------------------------------------------------------------------------------------------

  
  /**
   * Acceder a la pantalla de Widgets
   * @throws InterruptedException 
   */

   @Test(description = "Widgets_TC01 - Acceder a la pantalla de Widgets", enabled = false)
  public void Widgets_TC01() throws InterruptedException {

    // Paso 1

    // Acción
    Utils.chromeDriver.get("https://demoqa.com/");
    // Thread.sleep(3000);

    // Condición
    if(Utils.chromeDriver.findElementsByXPath("//img[@src='/images/Toolsqa.jpg']").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//*[@id='app']/header/a/img").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//img[@class='banner-image' and @src='/images/WB.svg' and @alt='Selenium Online Training']").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//div[@class='card mt-4 top-card']//h5[contains(text(), 'Elements')]").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//div[@class='card mt-4 top-card']//h5[text()='Forms']").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//div[@class='card mt-4 top-card']//h5[text()='Alerts, Frame & Windows']").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//div[@class='card mt-4 top-card']//h5[text()='Widgets']").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//div[@class='card mt-4 top-card']//h5[text()='Interactions']").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//div[@class='card mt-4 top-card']//h5[text()='Book Store Application']").size() > 0){
      System.out.println("No hay fallos!!");
    }
    
     // Paso 2
    // Acción
    Utils.chromeDriver.findElementByXPath("//div[@class='card mt-4 top-card']//h5[text()='Widgets']").click();
    Thread.sleep(3000);

    // Condición
    if(Utils.chromeDriver.findElementsByXPath("//li[@id='item-0'and@class='btn btn-light'and span[text()='Accordian']]").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//li[@id='item-1' and contains(@class, 'btn') and contains(@class, 'btn-light') and span[text()='Auto Complete']]").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//li[@id='item-2' and contains(@class, 'btn') and contains(@class, 'btn-light') and span[text()='Date Picker']]").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//li[@id='item-3' and contains(@class, 'btn') and contains(@class, 'btn-light') and span[text()='Slider']]").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//li[@id='item-4' and contains(@class, 'btn') and contains(@class, 'btn-light') and span[text()='Progress Bar']]").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//li[@id='item-5' and contains(@class, 'btn') and contains(@class, 'btn-light') and span[text()='Tabs']]").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//li[@id='item-6' and contains(@class, 'btn') and contains(@class, 'btn-light') and span[text()='Tool Tips']]").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//li[@id='item-8' and contains(@class, 'btn') and contains(@class, 'btn-light') and span[text()='Select Menu']]").size() > 0){
      System.out.println("No hay fallos!!");
    }
  }
    

  // -------------------------------------------------------2-----------------------------------------------------------------------------------------------------------------------------


  /**
   * Verificar el funcionamiento de "Accordian"
   * @throws InterruptedException 
   */

   @Test(description = "Widgets_TC02 - Verificar el funcionamiento de 'Accordian' ", enabled = false)
   public void Widgets_TC02() throws InterruptedException {

    Widgets_TC01();

     // Paso 1

     // Acción
     Utils.chromeDriver.findElementByXPath("//li[@id='item-0' and contains(@class, 'btn') and contains(@class, 'btn-light') and span[text()='Accordian']]").click();

     // Condición
     if(Utils.chromeDriver.findElementsByXPath("//*[@id='accordianContainer']/div").size() > 0 ||
     Utils.chromeDriver.findElementsByXPath("//*[@id='section1Heading']").size() > 0 ||
     Utils.chromeDriver.findElementsByXPath("//*[@id='section2Heading']").size() > 0 ||
     Utils.chromeDriver.findElementsByXPath("//*[@id='section3Heading']").size() > 0 ||
     Utils.chromeDriver.findElementsByXPath("//*[@id='accordianContainer']/h1").size() > 0 ||
     Utils.chromeDriver.findElementsByXPath("//li[@id='item-0' and contains(@class, 'btn') and contains(@class, 'btn-light') and contains(@class, 'active') and span[text()='Accordian']]").size() > 0){
      System.out.println("No hay fallos!!");
    }
     
      // Paso 2
     // Acción
     Utils.chromeDriver.findElementByXPath("//*[@id='accordianContainer']/div/div[1]").click();
    //  Thread.sleep(5000);
 
     // Condición
     if(Utils.chromeDriver.findElementsByXPath("//*[@id='section1Content']/p").size() > 0){
      System.out.println("No hay fallos!!");
    }

     // Acción
     Utils.chromeDriver.findElementByXPath("//*[@id='section2Heading']").click();
    //  Thread.sleep(3000);
 
     // Condición
     if(Utils.chromeDriver.findElementsByXPath("//*[@id='section2Content']").size() > 0){
      System.out.println("No hay fallos!!");
    }

     // Acción

     WebElement Accordian = Utils.chromeDriver.findElementByXPath("//*[@id='section3Heading']");
     JavascriptExecutor js = (JavascriptExecutor) Utils.chromeDriver;
     js.executeScript("arguments[0].scrollIntoView(true);", Accordian);
     Actions actions = new Actions(Utils.chromeDriver);
     actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();

     Utils.chromeDriver.findElementByXPath("//*[@id='section3Heading']").click();
     System.out.println("No hay fallos!!");
 
     // Condición
     if(Utils.chromeDriver.findElementsByXPath("//*[@id='section3Content']/p").size() > 0){
      System.out.println("No hay fallos!!");
    }
  }


// -------------------------------------------------------3-----------------------------------------------------------------------------------------------------------------------------


   /**
   * Verificar el funcionamiento de "Auto Complete"
   * @throws InterruptedException 
   */

   @Test(description = "Widgets_TC03 - Verificar el Funcionamiento de Autocomplete.", enabled = false)
   public void Elements_TC03() throws InterruptedException {
  
      Widgets_TC01();
  
      // Paso 1

      // Acción
      Utils.chromeDriver.findElementByXPath("(//li[contains(@id,'item-')]//span[@class='text' and text()='Auto Complete'])").click();
      // Thread.sleep(5000);

      // Condición
      if(Utils.chromeDriver.findElementsByXPath("//span[@class='text'][text()='Auto Complete']").size()  > 0 ||
      Utils.chromeDriver.findElementsByXPath("//span[text()='Type multiple color names']").size()  > 0 ||
      Utils.chromeDriver.findElementsByXPath("//span[text()='Type single color name']").size()  > 0 ||
      Utils.chromeDriver.findElementsByXPath("//span[@class='text'][text()='Oscurecimiento pantalla']").size()  > 0){
        System.out.println("No hay fallos!!");
      }

      
    // Paso 2

    // Acción
    Utils.chromeDriver.findElementByXPath("//input[@id='autoCompleteMultipleInput']").click();
    Utils.chromeDriver.findElement(By.xpath("//input[@id='autoCompleteMultipleInput']")).sendKeys("Red");
    Utils.chromeDriver.findElementByXPath("//input[@id='autoCompleteMultipleInput']").click();
    Utils.chromeDriver.findElement(By.xpath("//input[@id='autoCompleteMultipleInput']")).sendKeys("Black");
     
     // Condición
     if(Utils.chromeDriver.findElementsByXPath("//div[@class='auto-complete__value-container css-1hwfws3']").size() > 0 ||
     Utils.chromeDriver.findElementsByXPath("//span[text()='Type single color name']").size() > 0){
      System.out.println("No hay fallos!!");
    }
    //Acción
    Utils.chromeDriver.findElementByXPath("//span[text()='Type multiple color names']").click();
  }


// -------------------------------------------------------4-----------------------------------------------------------------------------------------------------------------------------


  /**
   * Verificar el funcionamiento de "Date Picker"
   * @throws InterruptedException 
   */
  @Test(description = "Widgets_TC04 - Verificar el funcionamiento de \"Date Picker", enabled = false)
  public void Widgets_TC04() throws InterruptedException {

    Widgets_TC01();

    //Paso 1
    
    //Acción
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

    Widgets_TC01();

    //Paso 1

    //Acción
    Utils.chromeDriver.findElementByXPath("//li[@id='item-3' and span[@class='text' and text()='Slider']]").click();
    // Thread.sleep(5000);

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
    Utils.chromeDriver.findElementByXPath("//*[@id='sliderContainer']/div[1]/span").click();
    // Thread.sleep(5000);

    //Condición

    WebElement slider = Utils.chromeDriver.findElement(By.xpath("//*[@id='sliderContainer']/div[1]/span"));
    int sliderWidth = slider.getSize().getWidth();
    int steps = 1;
    
    Actions actions = new Actions(Utils.chromeDriver);
    
    for (int i = 1; i <= 50; i += steps) {
      double movePercentage = (double) i / 100;
      int moveOffset = (int) (sliderWidth * movePercentage);
      actions.clickAndHold(slider).moveByOffset(-moveOffset, 0).perform();
      try {
        Thread.sleep(1);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    
    for (int i = 0; i <= 50; i += steps) {
      double movePercentage = (double) i / 100;
      int moveOffset = (int) (sliderWidth * movePercentage);
      actions.clickAndHold(slider).moveByOffset(moveOffset, -50).perform();
      try {
        Thread.sleep(1);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
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

    WebElement ProgressBar = Utils.chromeDriver.findElementByXPath("//li[@id='item-4' and span[@class='text' and text()='Progress Bar']]");
    JavascriptExecutor js = (JavascriptExecutor) Utils.chromeDriver;
    js.executeScript("arguments[0].scrollIntoView(true);", ProgressBar);
    Actions actions = new Actions(Utils.chromeDriver);
    actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
    // Thread.sleep(5000);

    Utils.chromeDriver.findElementByXPath("//li[@id='item-4' and span[@class='text' and text()='Progress Bar']]").click();
    // Thread.sleep(5000);

    //Condición
    if(Utils.chromeDriver.findElementsByXPath("//*[@id='progressBarContainer']/h1").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//*[@id='progressBar']").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//*[@id='startStopButton']").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//*[@id='progressBarContainer']/h1").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//li[@class='btn btn-light active' and @id='item-3']").contains("active"))
    {
    System.out.println("No hay fallos!!");
    }

    //Paso 2
    
    //Acción
    Utils.chromeDriver.findElementByXPath("//*[@id='startStopButton']").click();
    // Thread.sleep(5000);

    //Condición
    if(Utils.chromeDriver.findElementsByXPath("//*[@id='progressBar']/div").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//*[@id='startStopButton']").size() > 0)
    {
    System.out.println("No hay fallos!!");
    }

    //Paso 3
    
    //Acción
    Utils.chromeDriver.findElementByXPath("//*[@id='startStopButton']").click();
    // Thread.sleep(5000);

    //Condición
    if(Utils.chromeDriver.findElementsByXPath("//*[@id='startStopButton']").size() > 0)
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

    WebElement Tabs = Utils.chromeDriver.findElementByXPath("//li[@id='item-5' and span[@class='text' and text()='Tabs']]");
    JavascriptExecutor js = (JavascriptExecutor) Utils.chromeDriver;
    js.executeScript("arguments[0].scrollIntoView(true);", Tabs);
    Actions actions = new Actions(Utils.chromeDriver);
    actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
    // Thread.sleep(5000);

    Utils.chromeDriver.findElementByXPath("//li[@id='item-5' and span[@class='text' and text()='Tabs']]").click();
    // Thread.sleep(5000);

    //Condición
    if(Utils.chromeDriver.findElementsByXPath("//*[@id='tabsContainer']/h1").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//*[@id='demo-tab-more']").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//a[@id='demo-tab-origin' and @class='nav-item nav-link' and text()='Origin']").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//a[@id='demo-tab-use' and @class='nav-item nav-link' and text()='Use']").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//*[@id='tabsContainer']/h1").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//li[contains(@class, 'active')][last()]").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//*[@id='tabsContainer']/div[2]").size() > 0)
    {
    System.out.println("No hay fallos!!");
    }

    //Paso 2
    
    //Acción
    Utils.chromeDriver.findElementByXPath("//*[@id='demo-tab-origin']").click();
    // Thread.sleep(5000);

    //Condición
    if(Utils.chromeDriver.findElementsByXPath("//*[@id='tabsContainer']/div[2]").size() > 0)
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

    WebElement Tabs = Utils.chromeDriver.findElementByXPath("//li[@id='item-5' and span[@class='text' and text()='Tabs']]");
    JavascriptExecutor js = (JavascriptExecutor) Utils.chromeDriver;
    js.executeScript("arguments[0].scrollIntoView(true);", Tabs);
    Actions actions = new Actions(Utils.chromeDriver);
    actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
    // Thread.sleep(5000);

    Utils.chromeDriver.findElementByXPath("//li[@id='item-6' and span[@class='text' and text()='Tool Tips']]").click();
    // Thread.sleep(5000);

    //Condición
    if(Utils.chromeDriver.findElementsByXPath("//*[@id='toopTipContainer']/h1").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//*[@id='texToolTopContainer']").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//*[@id='toolTipTextField']").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//li[@id='item-6' and contains(@class, 'active')]").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//*[@id='texToolTopContainer']").size() > 0)
    {
    System.out.println("No hay fallos!!");
    }

    //Paso 2
    
    //Acción

    WebElement elmento = Utils.chromeDriver.findElement(By.xpath("//*[@id='toolTipButton']"));
    Actions actions2 = new Actions(Utils.chromeDriver);
    actions2.moveToElement(elmento).perform();

    
    //Condición
    if(Utils.chromeDriver.findElementsByXPath("//button[@id='toolTipButton' and @aria-describedby='buttonToolTip']").size() > 0)
    {
      System.out.println("No hay fallos!!");
    }

    //Acción
    
    WebElement elmento1 = Utils.chromeDriver.findElement(By.xpath("//*[@id='toolTipTextField']"));
    Actions actions3 = new Actions(Utils.chromeDriver);
    actions3.moveToElement(elmento1).perform();

    //Condición
    if(Utils.chromeDriver.findElementsByXPath("//input[@id='toolTipTextField' and @aria-describedby='textFieldToolTip']").size() > 0)
    {
      System.out.println("No hay fallos!!");
    }

    //Acción
    
    WebElement elmento2 = Utils.chromeDriver.findElement(By.xpath("//*[@id='texToolTopContainer']/a[1]"));
    Actions actions4 = new Actions(Utils.chromeDriver);
    actions4.moveToElement(elmento2).perform();

    //Condición
    if(Utils.chromeDriver.findElementsByXPath("//a[@aria-describedby='contraryTexToolTip']").size() > 0)
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

    WebElement Menu = Utils.chromeDriver.findElementByXPath("//li[@id='item-7' and span[@class='text' and text()='Menu']]");
    JavascriptExecutor js = (JavascriptExecutor) Utils.chromeDriver;
    js.executeScript("arguments[0].scrollIntoView(true);", Menu);
    Actions actions = new Actions(Utils.chromeDriver);
    actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
    // Thread.sleep(5000);

    Utils.chromeDriver.findElementByXPath("//li[@id='item-7' and span[@class='text' and text()='Menu']]").click();
    // Thread.sleep(5000);

    //Condición
    if(Utils.chromeDriver.findElementsByXPath("//h1[text()='Menu']").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//*[@id='nav']").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//li[@id='item-7' and contains(@class, 'active')]").size() > 0)
    {
    System.out.println("No hay fallos!!");
    }

    //Paso 2
    
    //Acción

    WebElement elmento3 = Utils.chromeDriver.findElement(By.xpath("//*[@id='nav']/li[1]/a"));
    Actions actions5 = new Actions(Utils.chromeDriver);
    actions5.moveToElement(elmento3).perform();
    // Thread.sleep(5000);

    //Condición
    if(Utils.chromeDriver.findElementsByXPath("//*[@id='nav']/li[1]/a").size() > 0)
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

    WebElement Menu = Utils.chromeDriver.findElementByXPath("//li[@id='item-7' and span[@class='text' and text()='Menu']]");
    JavascriptExecutor js = (JavascriptExecutor) Utils.chromeDriver;
    js.executeScript("arguments[0].scrollIntoView(true);", Menu);
    Actions actions = new Actions(Utils.chromeDriver);
    actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
    // Thread.sleep(5000);

    Utils.chromeDriver.findElementByXPath("//li[@class='btn btn-light ' and span/text()='Menu']").click();
    // Thread.sleep(5000);

    //Condición
    if(Utils.chromeDriver.findElementsByXPath("//h1[text()='Menu']").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//*[@id='nav']").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//li[@id='item-7' and contains(@class, 'active')]").size() > 0)
    {
    System.out.println("No hay fallos!!");
    }

    //Paso 2
    
    //Acción

    WebElement elmento3 = Utils.chromeDriver.findElement(By.xpath("//*[@id='nav']/li[1]/a"));
    Actions actions5 = new Actions(Utils.chromeDriver);
    actions5.moveToElement(elmento3).perform();
    // Thread.sleep(5000);


    //Condición
    if(Utils.chromeDriver.findElementsByXPath("//*[@id='nav']/li[2]/ul/li[1]/a").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//*[@id='nav']/li[2]/ul/li[2]/a").size() > 0)
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

    WebElement Menu = Utils.chromeDriver.findElementByXPath("//li[@id='item-7' and span[@class='text' and text()='Menu']]");
    JavascriptExecutor js = (JavascriptExecutor) Utils.chromeDriver;
    js.executeScript("arguments[0].scrollIntoView(true);", Menu);
    Actions actions = new Actions(Utils.chromeDriver);
    actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
    // Thread.sleep(5000);

    Utils.chromeDriver.findElementByXPath("//li[@class='btn btn-light ' and span/text()='Menu']").click();
    // Thread.sleep(5000);

    //Condición
    if(Utils.chromeDriver.findElementsByXPath("//h1[text()='Menu']").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//*[@id='nav']").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//li[@id='item-7' and contains(@class, 'active')]").size() > 0)
    {
    System.out.println("No hay fallos!!");
    }

    //Paso 2
    
    //Acción

    WebElement elmento3 = Utils.chromeDriver.findElement(By.xpath("//*[@id='nav']/li[3]"));
    Actions actions5 = new Actions(Utils.chromeDriver);
    actions5.moveToElement(elmento3).perform();
    // Thread.sleep(5000);

    //Condición
    if(Utils.chromeDriver.findElementsByXPath("//*[@id='nav']/li[3]").size() > 0)
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

    WebElement SelectMenu = Utils.chromeDriver.findElementByXPath("//li[@class='btn btn-light ' and span/text()='Select Menu']");
    JavascriptExecutor js = (JavascriptExecutor) Utils.chromeDriver;
    js.executeScript("arguments[0].scrollIntoView(true);", SelectMenu);
    Actions actions = new Actions(Utils.chromeDriver);
    actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
    // Thread.sleep(5000);

    Utils.chromeDriver.findElementByXPath("//li[@class='btn btn-light ' and span/text()='Select Menu']").click();
    // Thread.sleep(5000);

    //Condición
    if(Utils.chromeDriver.findElementsByXPath("//*[@id='selectMenuContainer']/h1").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//*[@id='withOptGroup']/div/div[1]").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//*[@id='selectOne']/div/div[1]").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//*[@id='oldSelectMenu']").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//*[@id='selectMenuContainer']/div[7]/div/div/div/div[1]").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//*[@id='cars']").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//li[@class='btn btn-light active' and span/text()='Select Menu']").size() > 0)
    {
    System.out.println("No hay fallos!!");
    }

    //Paso 2
    
    //Acción
    Utils.chromeDriver.findElementByXPath("//*[@id='withOptGroup']/div/div[1]").click();
    // Thread.sleep(5000);

    //Condición
    if(Utils.chromeDriver.findElementsByXPath("//*[@id='oldSelectMenu']").size() > 0)
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

    WebElement SelectMenu = Utils.chromeDriver.findElementByXPath("//li[@class='btn btn-light ' and span/text()='Select Menu']");
    JavascriptExecutor js = (JavascriptExecutor) Utils.chromeDriver;
    js.executeScript("arguments[0].scrollIntoView(true);", SelectMenu);
    Actions actions = new Actions(Utils.chromeDriver);
    actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
    // Thread.sleep(5000);

    Utils.chromeDriver.findElementByXPath("//li[@class='btn btn-light ' and span/text()='Select Menu']").click();
    // Thread.sleep(5000);

    //Condición
    if(Utils.chromeDriver.findElementsByXPath("//*[@id='selectMenuContainer']/h1").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//*[@id='withOptGroup']/div/div[1]").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//*[@id='selectOne']/div/div[1]").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//*[@id='oldSelectMenu']").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//*[@id='selectMenuContainer']/div[7]/div/div/div/div[1]").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//*[@id='cars']").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//li[@class='btn btn-light active' and span/text()='Select Menu']").size() > 0)
    {
    System.out.println("No hay fallos!!");
    }

    //Paso 2
    
    //Acción
    Utils.chromeDriver.findElementByXPath("//*[@id='selectOne']/div/div[1]").click();
    // Thread.sleep(5000);

    //Condición
    if(Utils.chromeDriver.findElementsByXPath("//*[@id='oldSelectMenu']").size() > 0)
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

    WebElement SelectMenu = Utils.chromeDriver.findElementByXPath("//li[@class='btn btn-light ' and span/text()='Select Menu']");
    JavascriptExecutor js = (JavascriptExecutor) Utils.chromeDriver;
    js.executeScript("arguments[0].scrollIntoView(true);", SelectMenu);
    Actions actions = new Actions(Utils.chromeDriver);
    actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
    // Thread.sleep(5000);

    Utils.chromeDriver.findElementByXPath("//li[@class='btn btn-light ' and span/text()='Select Menu']").click();
    // Thread.sleep(5000);

    //Condición
    if(Utils.chromeDriver.findElementsByXPath("//*[@id='selectMenuContainer']/h1").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//*[@id='withOptGroup']/div/div[1]").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//*[@id='selectOne']/div/div[1]").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//*[@id='oldSelectMenu']").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//*[@id='selectMenuContainer']/div[7]/div/div/div/div[1]").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//*[@id='cars']").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//li[@class='btn btn-light active' and span/text()='Select Menu']").size() > 0)
    {
    System.out.println("No hay fallos!!");
    }

    //Paso 2
    
    //Acción
    Utils.chromeDriver.findElementByXPath("//*[@id='oldSelectMenu']").click();
    // Thread.sleep(5000);

    //Condición
    if(Utils.chromeDriver.findElementsByXPath("//*[@id='oldSelectMenu']").size() > 0)
    {
    System.out.println("No hay fallos!!");
    }
  }
}