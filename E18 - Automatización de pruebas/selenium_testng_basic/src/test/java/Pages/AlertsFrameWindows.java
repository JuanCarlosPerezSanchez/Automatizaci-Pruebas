package Pages;

import Utilities.Utils;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AlertsFrameWindows {

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
     * Verificar el funcionamiento de "Browser Windows" - Boton New Window
     * @throws InterruptedException 
     */

    @Test(description = "AlertsFrameWindows_TC04 - Verificar el funcionamiento de 'Browser Windows' - Boton New Window", enabled = false)
    public void AlertsFrameWindows_TC04() throws InterruptedException {

      //AlertsFrameWindows_TC01();

      // Paso 1
      // Acción
      Utils.chromeDriver.get("https://demoqa.com/");
      Utils.chromeDriver.findElementByXPath("//div[@class='card mt-4 top-card' and .//h5[text()='Alerts, Frame & Windows']]").click();
      Utils.chromeDriver.findElementByXPath("//li[@class='btn btn-light ' and @id='item-0'][span[@class='text' and text()='Browser Windows']]").click();
      // Thread.sleep(5000);
      // Condición
      if(Utils.chromeDriver.findElementsByXPath("//*[@id='tabButton']").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//*[@id='windowButton']").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//*[@id='messageWindowButton']").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//*[@id='browserWindows']/h1").size() > 0){
        System.out.println("No hay fallos!!");
      }

      // Paso 2
      // Acción
      Utils.chromeDriver.findElementByXPath("//*[@id='messageWindowButton']").click();
      // Thread.sleep(5000);
      // Condición
      if(Utils.chromeDriver.findElementsByXPath("/html/body/text()").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//*[@id='windowButton']").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//*[@id='messageWindowButton']").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//*[@id='browserWindows']/h1").size() > 0){
        System.out.println("No hay fallos!!");
      }
    }

      
    // -------------------------------------------------------5-----------------------------------------------------------------------------------------------------------------------------


    /**
     * Verificar el funcionamiento de "Alerts" - Alerta inmediata
     * @throws InterruptedException 
     */

    @Test(description = "AlertsFrameWindows_TC05 - Verificar el funcionamiento de 'Alerts' - Alerta inmediata", enabled = false)
    public void AlertsFrameWindows_TC05() throws InterruptedException {
  
      //AlertsFrameWindows_TC01();
  
      // Paso 1
      // Acción
      Utils.chromeDriver.get("https://demoqa.com/");
      Utils.chromeDriver.findElementByXPath("//div[@class='card mt-4 top-card' and .//h5[text()='Alerts, Frame & Windows']]").click();
      Utils.chromeDriver.findElementByXPath("//li[@class='btn btn-light ' and @id='item-1' and contains(span[@class='text'], 'Alerts')]").click();
      Thread.sleep(5000);
      
      // Condición
      if(Utils.chromeDriver.findElementsByXPath("//*[@id='javascriptAlertsWrapper']/div[1]/div[1]/span").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//*[@id='javascriptAlertsWrapper']/div[2]/div[1]").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//*[@id='javascriptAlertsWrapper']/div[3]/div[1]/span").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//*[@id='javascriptAlertsWrapper']/div[4]/div[1]/span").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//*[@id='alertButton']").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//*[@id='timerAlertButton']").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//[@id=//[@id='confirmButton']").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//[@id=//[@id='promtButton']").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//*[@id='javascriptAlertsWrapper']/h1").size() > 0){
        System.out.println("No hay fallos!!");
      }
    }


    // -------------------------------------------------------6-----------------------------------------------------------------------------------------------------------------------------


    /**
     * Verificar el funcionamiento de "Alerts" - Alerta tras 5 segundos
     * @throws InterruptedException 
     */

    @Test(description = "AlertsFrameWindows_TC06 - Verificar el funcionamiento de 'Alerts' - Alerta tras 5 segundos", enabled = false)
    public void AlertsFrameWindows_TC06() throws InterruptedException {
  
      //AlertsFrameWindows_TC01();
  
      // Paso 1
      // Acción
      Utils.chromeDriver.get("https://demoqa.com/");
      Utils.chromeDriver.findElementByXPath("//*[@id='app']/div/div/div[2]/div/div[3]").click();
      Utils.chromeDriver.findElementByXPath("//li[@class='btn btn-light ' and @id='item-1' and contains(span[@class='text'], 'Alerts')]").click();
      Thread.sleep(5000);
      
      // Condición
      if(Utils.chromeDriver.findElementsByXPath("//*[@id='javascriptAlertsWrapper']/div[1]/div[1]/span").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//*[@id='javascriptAlertsWrapper']/div[2]/div[1]").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//*[@id='javascriptAlertsWrapper']/div[3]/div[1]/span").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//*[@id='javascriptAlertsWrapper']/div[4]/div[1]/span").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//*[@id='alertButton']").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//*[@id='timerAlertButton']").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//[@id=//[@id='confirmButton']").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//[@id=//[@id='promtButton']").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//*[@id='javascriptAlertsWrapper']/h1").size() > 0){
        System.out.println("No hay fallos!!");
      }
    }

    
    // -------------------------------------------------------7-----------------------------------------------------------------------------------------------------------------------------


    /**
     * Verificar el funcionamiento de "Frames"
     * @throws InterruptedException 
     */
    
    @Test(description = "AlertsFrameWindows_TC07 - Verificar el funcionamiento de 'Frames'", enabled = false)
    public void AlertsFrameWindows_TC07() throws InterruptedException {

      //AlertsFrameWindows_TC01();

      // Paso 1
      // Acción
      Utils.chromeDriver.get("https://demoqa.com/");
      Utils.chromeDriver.findElementByXPath("//*[@id='app']/div/div/div[2]/div/div[3]").click();
      Utils.chromeDriver.findElementByXPath("//li[@id='item-2' and span[@class='text' and text()='Frames']]").click();
      //Thread.sleep(5000);
    
    // Condición
    if(Utils.chromeDriver.findElementsByXPath("//*[@id='framesWrapper']/div[1]").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//*[@id='frame1Wrapper']").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//*[@id='frame2Wrapper']").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//*[@id='framesWrapper']/h1").size() > 0){
      System.out.println("No hay fallos!!");
    }
  }


  // -------------------------------------------------------8-----------------------------------------------------------------------------------------------------------------------------


    /**
     * Verificar el funcionamiento de "Nested Frames"
     * @throws InterruptedException 
     */
    
  @Test(description = "AlertsFrameWindows_TC08 - Verificar el funcionamiento de 'Nested Frames'", enabled = false)
    public void AlertsFrameWindows_TC08() throws InterruptedException {

      //AlertsFrameWindows_TC01();

      // Paso 1
      // Acción
      Utils.chromeDriver.get("https://demoqa.com/");
      Utils.chromeDriver.findElementByXPath("//*[@id='app']/div/div/div[2]/div/div[3]").click();
      Utils.chromeDriver.findElementByXPath("//li[@id='item-3' and span[@class='text' and text()='Nested Frames']]").click();
      Thread.sleep(5000);
    
    // Condición
    if(Utils.chromeDriver.findElementsByXPath("/html/body/p").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//*[@id='framesWrapper']/div[1]").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//*[@id='frame1Wrapper']").size() > 0){
      System.out.println("No hay fallos!!");
    }

    // Paso 2
    // Acción
      Utils.chromeDriver.get("https://demoqa.com/");
      Utils.chromeDriver.findElementByXPath("//*[@id='app']/div/div/div[2]/div/div[3]").click();
      Utils.chromeDriver.findElementByXPath("//li[@id='item-3' and span[@class='text' and text()='Nested Frames']]").click();
      Thread.sleep(5000);

      // Condición
      if(Utils.chromeDriver.findElementsByXPath("/html/body/p").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//*[@id='framesWrapper']/div[1]").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//*[@id='frame1Wrapper']").size() > 0){
      System.out.println("No hay fallos!!");
    }
  }


  // -------------------------------------------------------9-----------------------------------------------------------------------------------------------------------------------------


  /**
    * Verificar el funcionamiento de "Modal Dialogs"
    * @throws InterruptedException 
    */

  @Test(description = "AlertsFrameWindows_TC09 - Verificar el funcionamiento de 'Modal Dialogs'", enabled = false)
    public void AlertsFrameWindows_TC09() throws InterruptedException {

      //AlertsFrameWindows_TC01();

      // Paso 1
      // Acción
      Utils.chromeDriver.get("https://demoqa.com/");
      Utils.chromeDriver.findElementByXPath("//*[@id='app']/div/div/div[2]/div/div[3]").click();
      Utils.chromeDriver.findElementByXPath("//li[contains(@class, 'btn') and contains(@class, 'btn-light') and span[text()='Modal Dialogs']]").click();
      Thread.sleep(5000);
    
    // Condición
    if(Utils.chromeDriver.findElementsByXPath("//*[@id='modalWrapper']/div/div").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//*[@id='showSmallModal']").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//*[@id='showLargeModal']").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//*[@id='modalWrapper']/h1").size() > 0){
      System.out.println("No hay fallos!!");
    }

    // Paso 2
    // Acción
    Utils.chromeDriver.findElementByXPath("//*[@id='showSmallModal']").click();
    Thread.sleep(5000);

    // Condición
    if(Utils.chromeDriver.findElementsByXPath("//*[@id='example-modal-sizes-title-sm']").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("/html/body/div[4]/div/div/div[2]").size() > 0){
      System.out.println("No hay fallos!!");
    }
  }


  // -------------------------------------------------------10-----------------------------------------------------------------------------------------------------------------------------


  /**
    * Verificar el funcionamiento de "Modal Dialogs"
    * @throws InterruptedException 
    */

  @Test(description = "AlertsFrameWindows_TC010 - Verificar el funcionamiento de 'Modal Dialogs'", enabled = false)
    public void AlertsFrameWindows_TC010() throws InterruptedException {

      //AlertsFrameWindows_TC01();

      // Paso 1
      // Acción
      Utils.chromeDriver.get("https://demoqa.com/");
      Utils.chromeDriver.findElementByXPath("//*[@id='app']/div/div/div[2]/div/div[3]").click();
      Utils.chromeDriver.findElementByXPath("//li[contains(@class, 'btn') and contains(@class, 'btn-light') and span[text()='Modal Dialogs']]").click();
      Thread.sleep(5000);
    
    // Condición
    if(Utils.chromeDriver.findElementsByXPath("//*[@id='modalWrapper']/div/div").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//*[@id='showSmallModal']").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//*[@id='showLargeModal']").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//*[@id='modalWrapper']/h1").size() > 0){
      System.out.println("No hay fallos!!");
    }

    // Paso 2
    // Acción
    Utils.chromeDriver.findElementByXPath("//Button[@id='showLargeModal']").click();
    Thread.sleep(5000);

    // Condición
    if(Utils.chromeDriver.findElementsByXPath("//*[@id='example-modal-sizes-title-lg']").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("/html/body/div[4]/div/div/div[2]/p").size() > 0){
      System.out.println("No hay fallos!!");
    }
  }
}