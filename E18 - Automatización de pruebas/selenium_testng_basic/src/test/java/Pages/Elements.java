package Pages;

import Utilities.Utils;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Elements {

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
   * Acceder a la pantalla de elementos
   * @throws InterruptedException 
   */
  @Test(description = "Elements_TC01 - Acceder a la pantalla de elementos", enabled = false)
  public void Elements_TC01() throws InterruptedException {

    // Paso 1

    // Acción
    Utils.chromeDriver.get("https://demoqa.com/");
    
    // Condición
    if(Utils.chromeDriver.findElementsByXPath("//img[@src='/images/Toolsqa.jpg']").size() > 0){
      System.out.println("No hay fallos!!");
    }
    

    // Paso 2

    // Acción
    Utils.chromeDriver.findElementByXPath("//h5[contains(text(),'Elements')]/parent::div").click();
    Thread.sleep(3000);
    // Condición
    if(Utils.chromeDriver.findElementsByXPath("//*[@id='app']/div/div/div/div[1]/div/div/div[1]/span/div/div[1]").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//*[@id='app']/div/div/div/div[1]/div/div/div[2]/span/div/div[1]").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//*[@id='app']/div/div/div/div[1]/div/div/div[3]/span/div/div[1]").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//*[@id='app']/div/div/div/div[1]/div/div/div[4]/span/div").size() > 0)
    {
      System.out.println("No hay fallos!!");
    }
  }


// -------------------------------------------------------2-----------------------------------------------------------------------------------------------------------------------------


  /**
   * Elements_TC02 - Verificar el Funcionamiento de la textBox.
   * @throws InterruptedException 
   */
  @Test(description = "Elements_TC02 - Verificar el Funcionamiento de la textBox.", enabled = false) 
  public void Elements_TC02() throws InterruptedException {

    Elements_TC01();

    // Paso 1

    // Acción
    Utils.chromeDriver.findElementByXPath("//li[contains(span/text(), 'Text Box')]").click();
    Thread.sleep(3000);


    // Condición
    if(Utils.chromeDriver.findElementsByXPath("//*[@id='userName']").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//*[@id='userEmail']").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//*[@id='currentAddress']").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//*[@id='permanentAddress']").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//*[@id='submit']").size() > 0){
    Thread.sleep(1000);
    System.out.println("No hay fallos!!");
    }

    // Paso 2

    // Acción

    Utils.chromeDriver.findElementByXPath("//input[contains(@id,'userName')]").sendKeys("Antonio");
    Utils.chromeDriver.findElementByXPath("//*[@id='userEmail']").sendKeys("antonio@pepephone.com");
    Utils.chromeDriver.findElementByXPath("//*[@id='currentAddress']").sendKeys("calle agustina 85");
    Utils.chromeDriver.findElementByXPath("//*[@id='permanentAddress']").sendKeys("Av de las letras 42");
    Thread.sleep(3000);

    WebElement botonSubmit = Utils.chromeDriver.findElementByXPath("//button[contains(@id,'submit')]");
    JavascriptExecutor js = (JavascriptExecutor) Utils.chromeDriver;
    js.executeScript("arguments[0].scrollIntoView(true);", botonSubmit);
    Actions actions = new Actions(Utils.chromeDriver);
    actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
    Thread.sleep(1000);

    Utils.chromeDriver.findElementByXPath("//button[contains(@id,'submit')]").click();
    Thread.sleep(3000);
    
    // Condición
    if(Utils.chromeDriver.findElementByXPath("//p[contains(@id,'name')]").getText().contains("Antonio") ||
    Utils.chromeDriver.findElementByXPath("//*[@id='userEmail']").getText().contains("antonio@pepephone.com")||
    Utils.chromeDriver.findElementByXPath("//*[@id='currentAddress']").getText().contains("calle agustina 85")||
    Utils.chromeDriver.findElementByXPath("//*[@id='permanentAddress']").getText().contains("Av de las letras 42")){
      System.out.println("No hay fallos!!");
    }
  }


// -------------------------------------------------------3-----------------------------------------------------------------------------------------------------------------------------


  /**
   * Elements_TC03 -Verificar el funcionamiento de Check Box-Home
   * @throws InterruptedException 
   */
  @Test(description = "Elements_TC03 -Verificar el funcionamiento de Check Box-Home", enabled = false)
  public void Elements_TC03() throws InterruptedException {
    
    Elements_TC01();

    // Paso 1

    // Acción
    Utils.chromeDriver.findElementByXPath("//li[@id='item-1']/span[@class='text' and text()='Check Box']").click();
    Thread.sleep(3000);

    // Condición
    if(Utils.chromeDriver.findElementsByXPath("//h1").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//li[@id='item-1' and contains(@class, 'active')]").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//*[@id='tree-node']/ol/li/span/label/span[1]").size() > 0||
    Utils.chromeDriver.findElementsByXPath("//button[@class='rct-option rct-option-expand-all']").size() > 0||
    Utils.chromeDriver.findElementsByXPath("//*[@id='tree-node']/div/button[2]").size() > 0){
      System.out.println("No hay fallos!!");
    }
   
    // Paso 2

    // Acción
    Utils.chromeDriver.findElementByXPath("//*[@id='tree-node']/ol/li/span/label/span[1]").click();
    Thread.sleep(3000);

    // Condición
    if (Utils.chromeDriver.findElementsByXPath("//*[@id='result']").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//span[@class='rct-checkbox']").size() > 0) {
      System.out.println("No hay fallos!!");
    }
  }


// -------------------------------------------------------4-----------------------------------------------------------------------------------------------------------------------------


  /**
   * Elements_TC04 -Verificar el funcionamiento de 'Check Box' - Desktop
   * @throws InterruptedException 
   */
  @Test(description = "Elements_TC04 -Verificar el funcionamiento de 'Check Box' - Desktop", enabled = false)
  public void Elements_TC04() throws InterruptedException {
    
    Elements_TC01();

    // Paso 1

    // Acción
    Utils.chromeDriver.findElementByXPath("//li[@id='item-1']/span[@class='text' and text()='Check Box']").click();
    Thread.sleep(3000);
    
    // Condición
    if(Utils.chromeDriver.findElementsByXPath("//h1").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//li[@id='item-1' and contains(@class, 'active')]").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//*[@id='tree-node']/ol/li/span/label/span[1]").size() > 0||
    Utils.chromeDriver.findElementsByXPath("//button[@class='rct-option rct-option-expand-all']").size() > 0||
    Utils.chromeDriver.findElementsByXPath("//*[@id='tree-node']/div/button[2]").size() > 0){
      System.out.println("No hay fallos!!");
    }
    
  
    // Paso 2

    // Acción
    Utils.chromeDriver.findElementByXPath("//button[@class='rct-option rct-option-expand-all']").click();
    Thread.sleep(3000);

    // Condición
    if(Utils.chromeDriver.findElementsByXPath("//h1").size() > 0){
      System.out.println("No hay fallos!!");
    }
    

    // Paso 3

    // Accion
    Utils.chromeDriver.findElementByXPath("//*[@id='tree-node']/ol/li/ol/li[1]/span/label/span[1]").click();
    Thread.sleep(2000);

    // Condicion
    
  }


// -------------------------------------------------------5-----------------------------------------------------------------------------------------------------------------------------


   /**
   * Elements_TC05 -Verificar el funcionamiento de Check Box - Documents
   * @throws InterruptedException 
   */
  @Test(description = "Elements_TC05 -Verificar el funcionamiento de Check Box - Office", enabled = false)
  public void Elements_TC05() throws InterruptedException {
    
    Elements_TC01();

    // Paso 1

    // Acción
    Utils.chromeDriver.findElementByXPath("//*[@id='app']/div/div/div/div[1]/div/div/div[1]/span/div").click();
    Utils.chromeDriver.findElementByXPath("//li[@id='item-1']/span[@class='text' and text()='Check Box']").click();
    Thread.sleep(3000);
    
    // Condición
    if(Utils.chromeDriver.findElementsByXPath("//h1").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//li[@id='item-1' and contains(@class, 'active')]").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//*[@id='tree-node']/ol/li/span/label/span[1]").size() > 0||
    Utils.chromeDriver.findElementsByXPath("//button[@class='rct-option rct-option-expand-all']").size() > 0||
    Utils.chromeDriver.findElementsByXPath("//*[@id='tree-node']/div/button[2]").size() > 0){
      System.out.println("No hay fallos!!");
    }
    
  
    // Paso 2

    // Acción
    Utils.chromeDriver.findElementByXPath("//button[@class='rct-option rct-option-expand-all']").click();
    Thread.sleep(3000);

    // Condición
    if(Utils.chromeDriver.findElementsByXPath("//h1").size() > 0){
      System.out.println("No hay fallos!!");
    }
    // Paso 3

    // Accion
    Utils.chromeDriver.findElementByXPath("//*[@id='tree-node']/ol/li/ol/li[2]/span/label/span[1]").click();
    Thread.sleep(3000);

    // Condicion
    if ((Utils.chromeDriver.findElementsByXPath("//*[@id='tree-node']/ol/li/span").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//*[@id='tree-node']/ol/li/ol/li[2]/span").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//*[@id='tree-node']/ol/li/ol/li[2]/ol/li[1]/span").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//*[@id='tree-node']/ol/li/ol/li[2]/ol/li[1]/ol/li[1]/span").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//*[@id='tree-node']/ol/li/ol/li[2]/ol/li[1]/ol/li[2]/span").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//*[@id='tree-node']/ol/li/ol/li[2]/ol/li[1]/ol/li[3]/span").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//*[@id='tree-node']/ol/li/ol/li[2]/ol/li[2]/span").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//*[@id='tree-node']/ol/li/ol/li[2]/ol/li[2]/span").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//*[@id='tree-node']/ol/li/ol/li[2]/ol/li[2]/ol/li[1]/span").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//*[@id='tree-node']/ol/li/ol/li[2]/ol/li[2]/ol/li[2]/span").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//*[@id='tree-node']/ol/li/ol/li[2]/ol/li[2]/ol/li[3]/span").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//*[@id='result']").size() > 0)) {
      System.out.println("No hay fallos");
    }
  }


// -------------------------------------------------------6-----------------------------------------------------------------------------------------------------------------------------

  
  /**
   * Elements_TC06 -Verificar el funcionamiento de \"Check Box\" - Office
   * @throws InterruptedException 
   */
  @Test(description = "Elements_TC06 -Verificar el funcionamiento de Check Box - Office", enabled = false)
  public void Elements_TC06() throws InterruptedException {
    
    Elements_TC01();

    // Paso 1

    // Acción
    Utils.chromeDriver.findElementByXPath("//*[@id='app']/div/div/div/div[1]/div/div/div[1]/span/div").click();
    Utils.chromeDriver.findElementByXPath("//li[@id='item-1']/span[@class='text' and text()='Check Box']").click();
    Thread.sleep(3000);
    
    // Condición
    if(Utils.chromeDriver.findElementsByXPath("//h1").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//li[@id='item-1' and contains(@class, 'active')]").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//*[@id='tree-node']/ol/li/span/label/span[1]").size() > 0||
    Utils.chromeDriver.findElementsByXPath("//button[@class='rct-option rct-option-expand-all']").size() > 0||
    Utils.chromeDriver.findElementsByXPath("//*[@id='tree-node']/div/button[2]").size() > 0){
      System.out.println("No hay fallos");
    }
    
  
    // Paso 2

    // Acción
    Utils.chromeDriver.findElementByXPath("//button[@class='rct-option rct-option-expand-all']").click();
    Thread.sleep(3000);

    // Condición
    if(Utils.chromeDriver.findElementsByXPath("//h1").size() > 0){
      System.out.println("No hay fallos");
    }
    
    // Paso 3

    // Accion
    WebElement botonSubmit = Utils.chromeDriver.findElementByXPath("//*[@id='tree-node']/ol/li/ol/li[2]/ol/li[2]/span/label/span[1]");
    JavascriptExecutor js = (JavascriptExecutor) Utils.chromeDriver;
    js.executeScript("arguments[0].scrollIntoView(true);", botonSubmit);
    Actions actions = new Actions(Utils.chromeDriver);
    actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
    Thread.sleep(1000);

    Utils.chromeDriver.findElementByXPath("//*[@id='tree-node']/ol/li/ol/li[2]/ol/li[2]/span/label/span[1]").click();
    Thread.sleep(1000);

    // Condición
  }


// -------------------------------------------------------7-----------------------------------------------------------------------------------------------------------------------------


  /**
   * Elements_TC07 -Verificar el funcionamiento de \"Check Box\" - Downloads
   * @throws InterruptedException 
   */
  @Test(description = "Elements_TC07 -Verificar el funcionamiento de 'Check Box' - Downloads ", enabled = false)
  public void Elements_TC07() throws InterruptedException {

    Elements_TC01();

    // Paso 1

    // Acción
    Utils.chromeDriver.findElementByXPath("//*[@id='app']/div/div/div/div[1]/div/div/div[1]/span/div").click();
    Utils.chromeDriver.findElementByXPath("//li[@id='item-1']/span[@class='text' and text()='Check Box']").click();
    Thread.sleep(3000);
    
    // Condición
    if(Utils.chromeDriver.findElementsByXPath("//h1").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//li[@id='item-1' and contains(@class, 'active')]").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//*[@id='tree-node']/ol/li/span/label/span[1]").size() > 0||
    Utils.chromeDriver.findElementsByXPath("//button[@class='rct-option rct-option-expand-all']").size() > 0||
    Utils.chromeDriver.findElementsByXPath("//*[@id='tree-node']/div/button[2]").size() > 0){
      System.out.println("No hay fallos");
    }
    
  
    // Paso 2

    // Acción
    Utils.chromeDriver.findElementByXPath("//button[@class='rct-option rct-option-expand-all']").click();
    Thread.sleep(3000);

    // Condición
    if(Utils.chromeDriver.findElementsByXPath("//h1").size() > 0){
      System.out.println("No hay fallos");
    }
    
    // Paso 3

    // Accion    
    WebElement botonSubmit = Utils.chromeDriver.findElementByXPath("//*[@id='tree-node']/ol/li/ol/li[3]/span/label/span[1]");
    JavascriptExecutor js = (JavascriptExecutor) Utils.chromeDriver;
    js.executeScript("arguments[0].scrollIntoView(true);", botonSubmit);
    Actions actions = new Actions(Utils.chromeDriver);
    actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
    Thread.sleep(1000);

    Utils.chromeDriver.findElementByXPath("//*[@id='tree-node']/ol/li/ol/li[3]/span/label/span[1]").click();
    Thread.sleep(1000);

    // Condición
    
  }


// -------------------------------------------------------8-----------------------------------------------------------------------------------------------------------------------------


  /**
   *  Elements_TC08 Verificar el funcionamiento de Radio Button
   * @throws InterruptedException 
   */
  @Test(description = "Elements_TC08 Verificar el funcionamiento de Radio Button", enabled = false)
  public void Elements_TC08() throws InterruptedException {
    
    Elements_TC01();

    // Paso 1

    // Acción
    Utils.chromeDriver.findElementByXPath("//span[@class='text' and text()='Radio Button']").click();
    Thread.sleep(3000);

    // Condición
    if (Utils.chromeDriver.findElementsByXPath("//*[@id='app']/div/div/div/div[2]/h1").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//li[contains(@class, 'btn') and contains(@class, 'btn-light') and contains(@class, 'active')]").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//*[@id='app']/div/div/div/div[2]/div[2]/div[1]").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//*[@id='yesRadio']").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//*[@id='impressiveRadio']").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//*[@id='app']/div/div/div/div[2]/div[3]").size() > 0 ) {
      System.out.println("No hay fallos");
    }

    // Paso 2

    // Acción
    Utils.chromeDriver.findElementByXPath("//*[@id='app']/div/div/div/div[2]/div[2]/div[2]").click();
    Thread.sleep(3000);

    // Condición
    if (Utils.chromeDriver.findElementsByXPath("//*[@id='app']/div/div/div/div[2]/h1").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//*[@id='app']/div/div/div/div[2]/div[2]/div[2]/label").size() > 0 ){
    }
  }
  

// -------------------------------------------------------9-----------------------------------------------------------------------------------------------------------------------------


  /**
   *  Elements_TC09 Verificar el funcionamiento de Web Tables - Edicion 1
   * @throws InterruptedException 
   */
  @Test(description = "Elements_TC09 Verificar el funcionamiento de Web Tables - Edicion 1", enabled = false)
  public void Elements_TC09() throws InterruptedException {
    
    Elements_TC01();
    
    // Paso 1

    // Acción
    Utils.chromeDriver.findElementByXPath("//li[@class='btn btn-light ' and @id='item-3']/span[text()='Web Tables']").click();
    Thread.sleep(3000);

    // Condición
    if (Utils.chromeDriver.findElementsByXPath("//*[@id='addNewRecordButton']").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//li[@class='btn btn-light active' and @id='item-3']").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//h1").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//*[@id='searchBox']").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//div[@class='rt-tr' and @role='row']").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//div[@class='-pagination']/div[@class='-previous']/button").size() > 0|| 
    Utils.chromeDriver.findElementsByXPath("//select[@aria-label='rows per page']").size() > 0) {
      System.out.println("No hay fallos");
    }
    
    // Paso 2

    // Acción
    Utils.chromeDriver.findElementByXPath("//*[@id='edit-record-1']").click();
    Utils.chromeDriver.findElementByXPath("//*[@id='firstName']").clear();
    Utils.chromeDriver.findElementByXPath("//*[@id='firstName']").sendKeys("Anotnio");
    Utils.chromeDriver.findElementByXPath("//*[@id='lastName']").clear();
    Utils.chromeDriver.findElementByXPath("//*[@id='lastName']").sendKeys("Vergara");
    Utils.chromeDriver.findElementByXPath("//*[@id='userEmail']").clear();
    Utils.chromeDriver.findElementByXPath("//*[@id='userEmail']").sendKeys("antonio@example.com");
    Utils.chromeDriver.findElementByXPath("//*[@id='age']").clear();
    Utils.chromeDriver.findElementByXPath("//*[@id='age']").sendKeys("30");
    Utils.chromeDriver.findElementByXPath("//*[@id='salary']").clear();
    Utils.chromeDriver.findElementByXPath("//*[@id='salary']").sendKeys("15000");
    Utils.chromeDriver.findElementByXPath("//*[@id='department']").clear();
    Utils.chromeDriver.findElementByXPath("//*[@id='department']").sendKeys("Gaming");
    Thread.sleep(3000);

    // Condición

    if(Utils.chromeDriver.findElementByXPath("//input[@value='Anotnio']").getText().contains("Anotnio")  ||
    Utils.chromeDriver.findElementByXPath("//input[@value='Vergara']").getText().contains("Vergara")||
    Utils.chromeDriver.findElementByXPath("//input[@value='antonio@example.com']").getText().contains("antonio@example.com")||
    Utils.chromeDriver.findElementByXPath("//input[@value='30']").getText().contains("30")||
    Utils.chromeDriver.findElementByXPath("//input[@value='15000']").getText().contains("15000")||
    Utils.chromeDriver.findElementByXPath("//input[@value='Gaming']").getText().contains("Gaming")){
      System.out.println("Aperecen los campos rellenados");
    }
    
    // Paso 3

    // Acción
    Utils.chromeDriver.findElementByXPath("//*[@id='submit']").click();
    Thread.sleep(3000);

    // Condición
    if (Utils.chromeDriver.findElementsByXPath("//div[@class='rt-td' and text()='Manuel']").size() > 0 ){
      System.out.println("No hay fallos");
    }
  }


  // -------------------------------------------------------10-----------------------------------------------------------------------------------------------------------------------------


  /**
   * Elements_TC10  Verificar el funcionamiento de Web Tables - Edicion 2 
   * @throws InterruptedException 
   */
  @Test(description = "Elements_TC10 Verificar el funcionamiento de Web Tables - Edicion 2", enabled = false)
  public void Elements_TC10() throws InterruptedException {
    
    Elements_TC01();
    
    // Paso 1

    // Acción
    Utils.chromeDriver.findElementByXPath("//li[@class='btn btn-light ' and @id='item-3']/span[text()='Web Tables']").click();
    Thread.sleep(3000);

    // Condición
    if (Utils.chromeDriver.findElementsByXPath("//*[@id='addNewRecordButton']").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//li[@class='btn btn-light active' and @id='item-3']").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//h1").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//*[@id='searchBox']").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//div[@class='rt-tr' and @role='row']").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//div[@class='-pagination']/div[@class='-previous']/button").size() > 0|| 
    Utils.chromeDriver.findElementsByXPath("//select[@aria-label='rows per page']").size() > 0) {
      System.out.println("No hay fallos");
    }
    
    // Paso 2

    // Acción
    Utils.chromeDriver.findElementByXPath("//*[@id='edit-record-1']").click();
    Utils.chromeDriver.findElementByXPath("//*[@id='firstName']").clear();
    Utils.chromeDriver.findElementByXPath("//*[@id='firstName']").sendKeys("Jesus");
    Utils.chromeDriver.findElementByXPath("//*[@id='lastName']").clear();
    Utils.chromeDriver.findElementByXPath("//*[@id='lastName']").sendKeys("Vazquez");
    Utils.chromeDriver.findElementByXPath("//*[@id='userEmail']").clear();
    Utils.chromeDriver.findElementByXPath("//*[@id='userEmail']").sendKeys("jesus@example.com");
    Utils.chromeDriver.findElementByXPath("//*[@id='age']").clear();
    Utils.chromeDriver.findElementByXPath("//*[@id='age']").sendKeys("25");
    Utils.chromeDriver.findElementByXPath("//*[@id='salary']").clear();
    Utils.chromeDriver.findElementByXPath("//*[@id='salary']").sendKeys("1500");
    Utils.chromeDriver.findElementByXPath("//*[@id='department']").clear();
    Utils.chromeDriver.findElementByXPath("//*[@id='department']").sendKeys("Programing");
    Thread.sleep(3000);

    

    // Condición

    if(Utils.chromeDriver.findElementByXPath("//input[@value='Jesus']").getText().contains("Jesus")  ||
    Utils.chromeDriver.findElementByXPath("//input[@value='Vazquez']").getText().contains("Vazquez")||
    Utils.chromeDriver.findElementByXPath("//input[@value='jesus@example.com']").getText().contains("jesus@example.com")||
    Utils.chromeDriver.findElementByXPath("//input[@value='25']").getText().contains("25")||
    Utils.chromeDriver.findElementByXPath("//input[@value='1500']").getText().contains("1500")||
    Utils.chromeDriver.findElementByXPath("//input[@value='Programing']").getText().contains("Programing")){
      System.out.println("Aperecen los campos rellenados");
    }
    
    // Paso 3

    // Acción
    Utils.chromeDriver.findElementByXPath("//*[@id='submit']").click();
    Thread.sleep(3000);

    // Condición
    if (Utils.chromeDriver.findElementsByXPath("//div[@class='rt-tr' and @role='row']").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//div[@class='rt-td' and @role]").size() > 0){
      System.out.println("No hay fallos");
    }
  }


// -------------------------------------------------------11-----------------------------------------------------------------------------------------------------------------------------

  
  /**
   * Elements_TC11 Verificar el funcionamiento de Web Tables - Edicion 3
   * @throws InterruptedException 
   */
  @Test(description = "Elements_TC11 Verificar el funcionamiento de Web Tables - Edicion 3", enabled = false)
  public void Elements_TC11() throws InterruptedException {
    
    Elements_TC01();

    // Paso 1

    // Acción
    Utils.chromeDriver.findElementByXPath("//li[@class='btn btn-light ' and @id='item-3']/span[text()='Web Tables']").click();
    Thread.sleep(3000);

    // Condición
    if (Utils.chromeDriver.findElementsByXPath("//*[@id='addNewRecordButton']").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//li[@class='btn btn-light active' and @id='item-3']").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//h1").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//*[@id='searchBox']").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//div[@class='rt-tr' and @role='row']").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//div[@class='-pagination']").size() > 0|| 
    Utils.chromeDriver.findElementsByXPath("//select[@aria-label='rows per page']").size() > 0) {
      System.out.println("No hay fallos");
    }
    
    // Paso 2

    // Acción
    Utils.chromeDriver.findElementByXPath("//*[@id='edit-record-1']").click();
    Utils.chromeDriver.findElementByXPath("//*[@id='firstName']").clear();
    Utils.chromeDriver.findElementByXPath("//*[@id='firstName']").sendKeys("Alden");
    Utils.chromeDriver.findElementByXPath("//*[@id='lastName']").clear();
    Utils.chromeDriver.findElementByXPath("//*[@id='lastName']").sendKeys("Cantrell");
    Utils.chromeDriver.findElementByXPath("//*[@id='userEmail']").clear();
    Utils.chromeDriver.findElementByXPath("//*[@id='userEmail']").sendKeys("alden@example.com");
    Utils.chromeDriver.findElementByXPath("//*[@id='age']").clear();
    Utils.chromeDriver.findElementByXPath("//*[@id='age']").sendKeys("45");
    Utils.chromeDriver.findElementByXPath("//*[@id='salary']").clear();
    Utils.chromeDriver.findElementByXPath("//*[@id='salary']").sendKeys("12000");
    Utils.chromeDriver.findElementByXPath("//*[@id='department']").clear();
    Utils.chromeDriver.findElementByXPath("//*[@id='department']").sendKeys("Compilace");
    Thread.sleep(3000);

    // Condición
    if(Utils.chromeDriver.findElementByXPath("//input[@value='Alden']").getText().contains("Alden")  ||
    Utils.chromeDriver.findElementByXPath("//input[@value='Cantrell']").getText().contains("Cantrell")||
    Utils.chromeDriver.findElementByXPath("//input[@value='alden@example.com']").getText().contains("alden@example.com")||
    Utils.chromeDriver.findElementByXPath("//input[@value='45']").getText().contains("45")||
    Utils.chromeDriver.findElementByXPath("//input[@value='12000']").getText().contains("12000")||
    Utils.chromeDriver.findElementByXPath("//input[@value='Compilace']").getText().contains("Compilace")){
      System.out.println("Aperecen los campos rellenados");
    }
    
    // Paso 3

    // Acción
    Utils.chromeDriver.findElementByXPath("//*[@id='submit']").click();
    Thread.sleep(3000);

    // Condición
    if (Utils.chromeDriver.findElementsByXPath("//div[@class='ReactTable -striped -highlight']").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//div[@class='rt-td']/span").size() > 0){
      System.out.println("No hay fallos");
    }
  }


// -------------------------------------------------------12-----------------------------------------------------------------------------------------------------------------------------


  /**
   * Elements_TC12 Verificar el funcionamiento de Web Tables - Edicion 4
   * @throws InterruptedException 
   */
  @Test(description = "Elements_TC12 Verificar el funcionamiento de Web Tables - Edicion 4", enabled = false)
  public void Elements_TC12() throws InterruptedException {
    
    Elements_TC01();

    // Paso 1

    // Acción
    Utils.chromeDriver.findElementByXPath("//li[@class='btn btn-light ' and @id='item-3']/span[text()='Web Tables']").click();
    Thread.sleep(3000);

    // Condición
    if (Utils.chromeDriver.findElementsByXPath("//*[@id='addNewRecordButton']").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//li[@class='btn btn-light active' and @id='item-3']").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//h1").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//*[@id='searchBox']").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//div[@class='rt-tr' and @role='row']").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//div[@class='-pagination']").size() > 0|| 
    Utils.chromeDriver.findElementsByXPath("//select[@aria-label='rows per page']").size() > 0) {
      System.out.println("No hay fallos");
    }
    
    // Paso 2

    // Acción
    Utils.chromeDriver.findElementByXPath("//*[@id='edit-record-1']").click();
    Utils.chromeDriver.findElementByXPath("//*[@id='firstName']").clear();
    Utils.chromeDriver.findElementByXPath("//*[@id='firstName']").sendKeys("Kierra");
    Utils.chromeDriver.findElementByXPath("//*[@id='lastName']").clear();
    Utils.chromeDriver.findElementByXPath("//*[@id='lastName']").sendKeys("Gentry");
    Utils.chromeDriver.findElementByXPath("//*[@id='userEmail']").clear();
    Utils.chromeDriver.findElementByXPath("//*[@id='userEmail']").sendKeys("kierra@example.com");
    Utils.chromeDriver.findElementByXPath("//*[@id='age']").clear();
    Utils.chromeDriver.findElementByXPath("//*[@id='age']").sendKeys("29");
    Utils.chromeDriver.findElementByXPath("//*[@id='salary']").clear();
    Utils.chromeDriver.findElementByXPath("//*[@id='salary']").sendKeys("2000");
    Utils.chromeDriver.findElementByXPath("//*[@id='department']").clear();
    Utils.chromeDriver.findElementByXPath("//*[@id='department']").sendKeys("Legal");
    Thread.sleep(3000);

    // Condición
    if(Utils.chromeDriver.findElementByXPath("//input[@value='Kierra']").getText().contains("Kierra")  ||
    Utils.chromeDriver.findElementByXPath("//input[@value='Gentry']").getText().contains("Gentry")||
    Utils.chromeDriver.findElementByXPath("//input[@value='kierra@example.com']").getText().contains("kierra@example.com")||
    Utils.chromeDriver.findElementByXPath("//input[@value='29']").getText().contains("29")||
    Utils.chromeDriver.findElementByXPath("//input[@value='2000']").getText().contains("2000")||
    Utils.chromeDriver.findElementByXPath("//input[@value='Legal']").getText().contains("Legal")){
      System.out.println("Aperecen los campos rellenados");
    }
    
    // Paso 3

    // Acción
    Utils.chromeDriver.findElementByXPath("//*[@id='submit']").click();
    Thread.sleep(3000);

    // Condición
    if (Utils.chromeDriver.findElementsByXPath("//div[@class='ReactTable -striped -highlight']").size() > 0 ||
    Utils.chromeDriver.findElementsByXPath("//div[@class='rt-td']/span").size() > 0){
      System.out.println("No hay fallos");
      }
    }


// -------------------------------------------------------13-----------------------------------------------------------------------------------------------------------------------------


  /**
   * Elements_TC13 Verificar el funcionamiento de Web Tables - Filtrado de busqeda
   * @throws InterruptedException 
   */
  @Test(description = "Elements_TC13 Verificar el funcionamiento de Web Tables - Filtrado de busqeda", enabled = false)
  public void Elements_TC13() throws InterruptedException {

    Elements_TC01();
    Elements_TC10();

    // Paso 1

    // Acción
    Utils.chromeDriver.findElementByXPath("//*[@id='searchBox']").click();
    Thread.sleep(3000);

    // Condición
    if (Utils.chromeDriver.findElementsByXPath("//*[@id='searchBox']").size() > 0){
      System.out.println("Se pone el cursor");
    }

    // Paso 2

    // Acción
    Utils.chromeDriver.findElementByXPath("//*[@id='searchBox']").sendKeys("Jose");
    Utils.chromeDriver.findElementByXPath("//*[@id='basic-addon2']").click();
    Thread.sleep(3000);

    // Condición
    if (Utils.chromeDriver.findElementsByXPath("//div[@class='rt-td' and text()='Jose']").size() > 0){
      System.out.println("no hay fallos");
    }
  }


// -------------------------------------------------------14-----------------------------------------------------------------------------------------------------------------------------


  /**
   * Elements_TC14 -Verificar el funcionamiento de 'Check Box' - 
   * @throws InterruptedException 
   */
  @Test(description = "Elements_TC14 -Verificar el funcionamiento de 'Check Box' - ", enabled = false)
  public void Elements_TC14() throws InterruptedException {

    Elements_TC01();

    // Paso 1

    // Acción
    Utils.chromeDriver.findElementByXPath("//li[contains(@id,'item-')]/span[contains(text(),'Text Box')]").click();
    Thread.sleep(3000);

    // Condición
    if(Utils.chromeDriver.findElementsByXPath("//input[contains(@id,'userName')]").size() > 0){
      System.out.println("no hay fallos");
    }


    // Paso 2

    // Acción
    Utils.chromeDriver.findElementByXPath("//li[@class='btn btn-light ' and @id='item-4']/span[text()='Buttons']").click();
    Thread.sleep(3000);

    // Condición
    if(Utils.chromeDriver.findElementByXPath("//button[@id='doubleClickBtn']").getText().contains("Antonio")){
      System.out.println("no hay fallos");
    }
  }
}