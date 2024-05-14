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

  /**
   * Acceder a la pantalla de elementos
   * @throws InterruptedException 
   */
  @Test(description = "Elements_TC01 - Acceder a la pantalla de elementos", enabled = false)
  public void Elements_TC01() throws InterruptedException {

    // Paso 1
    // Acción
    Utils.chromeDriver.get("https://demoqa.com/");
    Thread.sleep(3000);
    // Condición
    if(Utils.chromeDriver.findElementsByXPath("//img[@src='/images/Toolsqa.jpg']").size() > 0){
      System.out.println("[MIFRAMEWORK]        Aparece el elemento //img[@src='/images/Toolsqa.jpg']");
    }
    Thread.sleep(3000);

    // Paso 2

    // Acción
    Utils.chromeDriver.findElementByXPath("//h5[contains(text(),'Elements')]/parent::div").click();
    // Condición
    if(Utils.chromeDriver.findElementsByXPath("//li[contains(@id,'item-')]/span[contains(text(),'Text Box')]").size() > 0){
      System.out.println("Aparece el elemento //li[contains(@id,'item-')]/span[contains(text(),'Text Box')]']");
    }
  }

  /**
   * Verificar el Funcionamiento de la textBox.
   * @throws InterruptedException 
   */
  @Test(description = "Elements_TC02 - Verificar el Funcionamiento de la textBox.", enabled = false)
  public void Elements_TC02() throws InterruptedException {

    Elements_TC01();

    // Paso 1
    // Acción
    Utils.chromeDriver.findElementByXPath("//li[contains(@id,'item-')]/span[contains(text(),'Text Box')]").click();
    
    Thread.sleep(1000);
    // Condición
    if(Utils.chromeDriver.findElementsByXPath("//input[contains(@id,'userName')]").size() > 0){
      System.out.println("Aparece el elemento //input[contains(@id,'userName')]");
    }


    // Paso 2
    // Acción
    Utils.chromeDriver.findElementByXPath("//input[contains(@id,'userName')]").sendKeys("Antonio");

    WebElement botonSubmit = Utils.chromeDriver.findElementByXPath("//button[contains(@id,'submit')]");
    JavascriptExecutor js = (JavascriptExecutor) Utils.chromeDriver;
    js.executeScript("arguments[0].scrollIntoView(true);", botonSubmit);
    Actions actions = new Actions(Utils.chromeDriver);
    actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
    Thread.sleep(1000);

    Utils.chromeDriver.findElementByXPath("//button[contains(@id,'submit')]").click();
    Thread.sleep(5000);
    // Condición

    //p[contains(@id,'name')]
    if(Utils.chromeDriver.findElementByXPath("//p[contains(@id,'name')]").getText().contains("Antonio")){
      System.out.println("Aparece el texto 'Antonio' en el elemento //p[contains(@id,'name')]");
    }

  }

// ----------------------------










  /**
   * Verificar el Funcionamiento de Buttons.
   * @throws InterruptedException 
   */
  @Test(description = "Elements_TC14 - Verificar el Funcionamiento de Buttons.", enabled = false)
  public void Elements_TC14() throws InterruptedException {

    // Elements_TC01();

    // Paso 1
    // Acción
    Utils.chromeDriver.findElementByXPath("//li[@id='item-4' and span[@class='text' and text()='Buttons']]").click();
    
    Thread.sleep(1000);
    // Condición
    if(Utils.chromeDriver.findElementsByXPath("//*[@id='doubleClickBtn']").size() > 0){
      System.out.println("");
    }
    //*[@id="doubleClickBtn"]


    // Paso 2
    // Acción
    Utils.chromeDriver.findElementByXPath("").sendKeys("Antonio");

    WebElement botonSubmit = Utils.chromeDriver.findElementByXPath("");
    JavascriptExecutor js = (JavascriptExecutor) Utils.chromeDriver;
    js.executeScript("arguments[0].scrollIntoView(true);", botonSubmit);
    Actions actions = new Actions(Utils.chromeDriver);
    actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
    Thread.sleep(1000);

    Utils.chromeDriver.findElementByXPath("//button[contains(@id,'submit')]").click();
    Thread.sleep(5000);
    // Condición

    //p[contains(@id,'name')]
    if(Utils.chromeDriver.findElementByXPath("//p[contains(@id,'name')]").getText().contains("Antonio")){
      System.out.println("Aparece el texto 'Antonio' en el elemento //p[contains(@id,'name')]");
    }

  }

}
