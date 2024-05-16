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

   
  // -------------------------------------------------------1-----------------------------------------------------------------------------------------------------------------------------


  /**
  * Acceder a la pantalla de alerts, Frame & Windows
  * @throws InterruptedException 
  */
  @Test(description = "AlertsFrameWindows_TC01 - Acceder a la pantalla de Alerts, Frame & Windows", enabled = false)
  public void AlertsFrameWindows_TC01() throws InterruptedException {

    
    // Paso 1

    // Acción
    Utils.chromeDriver.get("https://demoqa.com/");
    // Thread.sleep(3000);
    

    // Condición
    if(Utils.chromeDriver.findElementsByXPath("//*[@id='app']/header/a/img").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//img[@class='banner-image' and @src=\"/images/WB.svg\"]").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//*[@id='app']/div/div/div[2]/div/div[1]").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//*[@id='app']/div/div/div[2]/div/div[2]").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//*[@id='app']/div/div/div[2]/div/div[3]").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//*[@id='app']/div/div/div[2]/div/div[4]").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//*[@id='app']/div/div/div[2]/div/div[5]").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//*[@id='app']/div/div/div[2]/div/div[6]").size() > 0);
    {
      System.out.println("Aparece el elemento");
    }


    // Paso 2

    // Acción
    Utils.chromeDriver.findElementByXPath("//*[@id='app']/div/div/div[2]/div/div[3]").click();
    // Thread.sleep(1000);


    // Condición
    if(Utils.chromeDriver.findElementsByXPath("//span[@class='text' and text()='Browser Windows']").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//span[@class='text' and text()='Alerts']").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//span[@class='text' and text()='Frames']").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//li[@id='item-3' and contains(span[@class='text'], 'Nested Frames')]").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//span[@class='text' and text()='Modal Dialogs']").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//*[@id='app']/div/div/div/div[2]/text()").size() > 0){
      System.out.println("Aparece el elemento");
    }
  }

  
// -------------------------------------------------------2-----------------------------------------------------------------------------------------------------------------------------


  /**
   * Verificar el funcionamiento de "Browser Windows" - Boton New Tab
   * @throws InterruptedException 
   */
  @Test(description = "AlertsFrameWindows_TC02 - Verificar el funcionamiento de 'Browser Windows' - Boton New Tab", enabled = false)
  public void AlertsFrameWindows_TC02() throws InterruptedException {

    AlertsFrameWindows_TC01();

    // Paso 1

    // Acción
    Utils.chromeDriver.findElementByXPath("//span[@class='text' and text()='Browser Windows']").click();
    // Thread.sleep(1000);

    // Condición
    if(Utils.chromeDriver.findElementsByXPath("//*[@id='tabButton']").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//*[@id='windowButton']").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//*[@id='messageWindowButton']").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//*[@id='browserWindows']/h1").size() > 0);
    {
      System.out.println("Aparecen todos los elementos");
    }


    // Paso 2

    // Acción
    Utils.chromeDriver.findElementByXPath("//*[@id='tabButton']").click();
    // Thread.sleep(1000);

    // Condición
    if(Utils.chromeDriver.findElementsByXPath("//*[@id='sampleHeading']").size() > 0){
      System.out.println("Aparece el elemento");
    }
  }


// -------------------------------------------------------3-----------------------------------------------------------------------------------------------------------------------------


  /**
   * Verificar el Funcionamiento de 'Bowser Windows'- Boton New Windows.
   * @throws InterruptedException 
   */
  @Test(description = "AlertsFrameWindows_TC03 - Verificar el funcionamiento de 'Browser Windows' - Boton New Window", enabled = false)
  public void AlertsFrameWindows_TC03() throws InterruptedException {

    AlertsFrameWindows_TC01();

    // Paso 1

    // Acción
    Utils.chromeDriver.findElementByXPath("//span[@class='text' and text()='Browser Windows']").click();
    
    Thread.sleep(1000);
    // Condición
    if(Utils.chromeDriver.findElementsByXPath("//*[@id='tabButton']").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//*[@id='windowButton']").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//*[@id='messageWindowButton']").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//*[@id='browserWindows']/h1").size() > 0);
    {
      System.out.println("Aparecen todos los elementos");
    }
    

    // Paso 2

    // Acción
    Utils.chromeDriver.findElementByXPath("//*[@id='windowButton']").click();

    Thread.sleep(1000);

    // Condición
    if(Utils.chromeDriver.findElementsByXPath("//*[@id='sampleHeading']").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//html/body").size() > 0);
    {
      System.out.println("Aparecen todos los elementos");
    }
  } 

  // -------------------------------------------------------4-----------------------------------------------------------------------------------------------------------------------------


    /**
     * Verificar el funcionamiento de "Browser Windows" - Boton New Window
     * @throws InterruptedException 
     */

    @Test(description = "AlertsFrameWindows_TC04 - Verificar el funcionamiento de 'Browser Windows' - Boton New Window", enabled = false)
    public void AlertsFrameWindows_TC04() throws InterruptedException {

      AlertsFrameWindows_TC01();

      // Paso 1

      // Acción
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
  
      AlertsFrameWindows_TC01();
  
      // Paso 1

      // Acción
      Utils.chromeDriver.findElementByXPath("//li[@class='btn btn-light ' and @id='item-1' and contains(span[@class='text'], 'Alerts')]").click();
      // Thread.sleep(5000);
      
      // Condición
      if(Utils.chromeDriver.findElementsByXPath("//span[@class='mr-3' and normalize-space(text())='Click Button to see alert']").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//div[@class='col-md-6']/span[contains(@class, 'mr-3') and text()='On button click, alert will appear after 5 seconds']").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//span[@class='mr-3' and normalize-space(text())='On button click, confirm box will appear']").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//span[@class='mr-3' and normalize-space(text())='On button click, prompt box will appear']").size() > 0 ||
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
  
      AlertsFrameWindows_TC01();
  
      // Paso 1

      // Acción
      Utils.chromeDriver.findElementByXPath("//li[@class='btn btn-light ' and @id='item-1' and contains(span[@class='text'], 'Alerts')]").click();
      // Thread.sleep(5000);
      
      // Condición
      if(Utils.chromeDriver.findElementsByXPath("//span[@class='mr-3' and normalize-space(text())='Click Button to see alert']").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//div[@class='col-md-6']/span[contains(@class, 'mr-3') and text()='On button click, alert will appear after 5 seconds ']").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//span[@class='mr-3' and normalize-space(text())='On button click, confirm box will appear']").size() > 0 ||
      Utils.chromeDriver.findElementsByXPath("//span[@class='mr-3' and normalize-space(text())='On button click, prompt box will appear']").size() > 0 ||
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

      AlertsFrameWindows_TC01();

      // Paso 1

      // Acción
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

      AlertsFrameWindows_TC01();

      // Paso 1

      // Acción
      Utils.chromeDriver.findElementByXPath("//li[@id='item-3' and span[@class='text' and text()='Nested Frames']]").click();
      // Thread.sleep(5000);
    
    // Condición
    if(Utils.chromeDriver.findElementsByXPath("/html/body/p").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//*[@id='framesWrapper']/div[1]").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//*[@id='frame1Wrapper']").size() > 0){
      System.out.println("No hay fallos!!");
    }

    // Paso 2

    // Acción
      Utils.chromeDriver.findElementByXPath("//li[@id='item-3' and span[@class='text' and text()='Nested Frames']]").click();
      // Thread.sleep(5000);

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

      AlertsFrameWindows_TC01();

      // Paso 1

      // Acción
      Utils.chromeDriver.findElementByXPath("//li[contains(@class, 'btn') and contains(@class, 'btn-light') and span[text()='Modal Dialogs']]").click();
      // Thread.sleep(5000);
    
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
    // Thread.sleep(5000);

    // Condición
    if(Utils.chromeDriver.findElementsByXPath("//div[normalize-space(text())='Click on button to see modal']").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//*[@id='example-modal-sizes-title-sm']").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//div[@class='modal-body' and normalize-space(text())='This is a small modal. It has very less content']").size() > 0){
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

      AlertsFrameWindows_TC01();

      // Paso 1

      // Acción
      Utils.chromeDriver.findElementByXPath("//li[contains(@class, 'btn') and contains(@class, 'btn-light') and span[text()='Modal Dialogs']]").click();
      // Thread.sleep(5000);
    
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
    // Thread.sleep(5000);

    // Condición
    if(Utils.chromeDriver.findElementsByXPath("//*[@id='example-modal-sizes-title-lg']").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//div[normalize-space(text())='Click on button to see modal']").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//p[@class='']").size() > 0){
      System.out.println("No hay fallos!!");
    }
  }
}