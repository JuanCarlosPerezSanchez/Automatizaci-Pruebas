package Pages;

import Utilities.Utils;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Forms {

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

  //*
  // Validar el contenido de la página Elements.
  // 
  // @throws InterruptedException
  //
   @Test(description = "TQA_Forms_001 - Elements page", enabled = false)
   public void TQA_Forms_001() throws InterruptedException {
   Home.TQA_Home_003();
   Utils.chromeDriver.findElementByXPath("//li//span[text()='PracticeForm']").click();
   if
   (Utils.chromeDriver.findElementsByXPath("//input[contains(@id,'firstName')]").size()
   == 0 ||
   Utils.chromeDriver.findElementsByXPath("//input[contains(@id,'lastName')]").size()
   == 0 ||
   Utils.chromeDriver.findElementsByXPath("//input[contains(@id,'userEmail')]").size()
   == 0 ||
   Utils.chromeDriver.findElementsByXPath("//div//input[contains(@value,'Male')]").size()
   == 0 ||
   Utils.chromeDriver.findElementsByXPath("//div//input[contains(@value,'Female')]").size()
   == 0 ||
   Utils.chromeDriver.findElementsByXPath("//div//input[contains(@value,'Other')]").size()
   == 0 ||
   Utils.chromeDriver.findElementsByXPath("//input[contains(@id,'userNumber')]").size()
   == 0 ||
   Utils.chromeDriver.findElementsByXPath("//input[contains(@id,'dateOfBirthInput')]").size()
   == 0 ||
   Utils.chromeDriver.findElementsByXPath("//input[contains(@id,'subjectsInput')]").size()
   == 0 ||
   Utils.chromeDriver.findElementsByXPath("//input/following-sibling::label[text()='Sports']").size()
   == 0 ||
   Utils.chromeDriver.findElementsByXPath("//input/following-sibling::label[text()='Reading']").size()
   == 0 ||
   Utils.chromeDriver.findElementsByXPath("//input/following-sibling::label[text()='Music']").size()
   == 0 ||
   Utils.chromeDriver.findElementsByXPath("//input[contains(@id,'uploadPicture')]").size()
   == 0 ||
   Utils.chromeDriver.findElementsByXPath("//textarea[contains(@id,'currentAddress')]").size()
   == 0 ||
   Utils.chromeDriver.findElementsByXPath("//input[contains(@id,'react-select-6-input')]").size()
   == 0 ||
   Utils.chromeDriver.findElementsByXPath("//input[contains(@id,'react-select-7-input')]").size()
   == 0) {
   System.out.println("Esta validación no bloqueante ha fallado!!");
   
   Utils.chromeDriver.findElementByXPath("//input[contains(@id,'firstName')]").click();
   Sleeper.SYSTEM_SLEEPER.sleep(Duration.ofSeconds(1));
   Utils.chromeDriver.findElementByXPath("//input[contains(@id,'firstName')]").sendKeys("Pepe");
   Sleeper.SYSTEM_SLEEPER.sleep(Duration.ofSeconds(1));
   Utils.chromeDriver.findElementByXPath("//input[contains(@id,'lastName')]").click();
   Sleeper.SYSTEM_SLEEPER.sleep(Duration.ofSeconds(1));
   Utils.chromeDriver.findElementByXPath("//input[contains(@id,'lastName')]").sendKeys("QualityAssurance");
   Sleeper.SYSTEM_SLEEPER.sleep(Duration.ofSeconds(1));
   Utils.chromeDriver.findElementByXPath("//input[contains(@id,'userEmail')]").click();
   Sleeper.SYSTEM_SLEEPER.sleep(Duration.ofSeconds(1));
   Utils.chromeDriver.findElementByXPath("//input[contains(@id,'userEmail')]").sendKeys("pepe@quality.assurance");
   Sleeper.SYSTEM_SLEEPER.sleep(Duration.ofSeconds(1));
   Utils.chromeDriver.findElementByXPath("//input[contains(@value,'Other')]/..").click();
   Sleeper.SYSTEM_SLEEPER.sleep(Duration.ofSeconds(1));
   Utils.chromeDriver.findElementByXPath("//input[contains(@id,'userNumber')]").click();
   Sleeper.SYSTEM_SLEEPER.sleep(Duration.ofSeconds(1));
   Utils.chromeDriver.findElementByXPath("//input[contains(@id,'userNumber')]").sendKeys("0123456789");
   Sleeper.SYSTEM_SLEEPER.sleep(Duration.ofSeconds(1));
   Utils.chromeDriver.findElementByXPath("//input[contains(@id,'subjectsInput')]").click();
   Sleeper.SYSTEM_SLEEPER.sleep(Duration.ofSeconds(1));
   Utils.chromeDriver.findElementByXPath("//input[contains(@id,'subjectsInput')]").sendKeys("ComputerScience");
   Sleeper.SYSTEM_SLEEPER.sleep(Duration.ofSeconds(1));
   Utils.chromeDriver.findElementByXPath("//input[contains(@id,'subjectsInput')]").sendKeys(Keys.ENTER);
   Sleeper.SYSTEM_SLEEPER.sleep(Duration.ofSeconds(1));
   Utils.chromeDriver.findElementByXPath("//input[contains(@id,'subjectsInput')]").sendKeys("Maths");
   Sleeper.SYSTEM_SLEEPER.sleep(Duration.ofSeconds(1));
   Utils.chromeDriver.findElementByXPath("//input[contains(@id,'subjectsInput')]").sendKeys(Keys.ENTER);
   Sleeper.SYSTEM_SLEEPER.sleep(Duration.ofSeconds(1));
   Utils.chromeDriver.findElementByXPath("//input/following-sibling::label[text()='Music']").click();
   Sleeper.SYSTEM_SLEEPER.sleep(Duration.ofSeconds(1));
   Utils.chromeDriver.findElementByXPath("//textarea[contains(@id,'currentAddress')]")
   .sendKeys("Assurance Quality");
   Sleeper.SYSTEM_SLEEPER.sleep(Duration.ofSeconds(1));
   Utils.chromeDriver.findElementsByXPath("//div[contains(@id,'stateCity-wrapper')]//div[contains(@id,'state')]")
   .get(0).click();
   Sleeper.SYSTEM_SLEEPER.sleep(Duration.ofSeconds(1));
   Utils.chromeDriver.findElementsByXPath("//div[contains(@id,'stateCity-wrapper')]//div[contains(@id,'state')]")
   .get(0).sendKeys("Haryana");
   Sleeper.SYSTEM_SLEEPER.sleep(Duration.ofSeconds(1));
   Utils.chromeDriver.findElementsByXPath("//div[contains(@id,'stateCity-wrapper')]//div[contains(@id,'state')]")
   .get(0).sendKeys(Keys.ENTER);
   Sleeper.SYSTEM_SLEEPER.sleep(Duration.ofSeconds(1));
   Utils.chromeDriver.findElementsByXPath("//div[contains(@id,'stateCity-wrapper')]//div[contains(@id,'city')]")
   .get(1).click();
   Sleeper.SYSTEM_SLEEPER.sleep(Duration.ofSeconds(1));
   Utils.chromeDriver.findElementsByXPath("//div[contains(@id,'stateCity-wrapper')]//div[contains(@id,'city')]")
   .get(1).sendKeys("Karnal");
   Sleeper.SYSTEM_SLEEPER.sleep(Duration.ofSeconds(1));
   Utils.chromeDriver.findElementsByXPath("//div[contains(@id,'stateCity-wrapper')]//div[contains(@id,'city')]")
   .get(1).sendKeys(Keys.ENTER);
   Sleeper.SYSTEM_SLEEPER.sleep(Duration.ofSeconds(1));
  }
}

  @Test(description = "Forms_TC01 - Acceder a la patalla de Forms", enabled = false)
  public void Forms_TC01() throws InterruptedException {
    // Paso 1
    // Acción
    Utils.chromeDriver.get("https://demoqa.com/");
    Thread.sleep(1000);
    // Condición
    if (Utils.chromeDriver.findElementsByXPath("//img[@src='/images/Toolsqa.jpg']").size() > 0 &&
        Utils.chromeDriver.findElementsByXPath("//img[@class='banner-image']").size() > 0 &&
        Utils.chromeDriver.findElementsByXPath("//h5[text()='Elements']").size() > 0 &&
        Utils.chromeDriver.findElementsByXPath("//h5[text()='Forms']").size() > 0 &&
        Utils.chromeDriver.findElementsByXPath("//h5[text()='Alerts, Frame & Windows']").size() > 0 &&
        Utils.chromeDriver.findElementsByXPath("//h5[text()='Widgets']").size() > 0 &&
        Utils.chromeDriver.findElementsByXPath("//h5[text()='Interactions']").size() > 0 &&
        Utils.chromeDriver.findElementsByXPath("//h5[text()='Book Store Application']").size() > 0) {
      System.out.println("[MIFRAMEWORK] Aparece el elemento //img[@src='/images/Toolsqa.jpg'] ");
      System.out.println("[MIFRAMEWORK] Aparece el elemento //img[@class='banner-image'] ");
      System.out.println("[MIFRAMEWORK] Aparece el elemento //h5[text()='Elements'] ");
      System.out.println("[MIFRAMEWORK] Aparece el elemento  //h5[text()='Forms']");
      System.out.println("[MIFRAMEWORK] Aparece el elemento  //h5[text()='Alerts, Frame & Windows']");
      System.out.println("[MIFRAMEWORK] Aparece el elemento  //h5[text()='Widgets']");
      System.out.println("[MIFRAMEWORK] Aparece el elemento  //h5[text()='Interactions']");
      System.out.println("[MIFRAMEWORK] Aparece el elemento  //h5[text()='Book Store Application']");
    }
    Thread.sleep(1000);

    // Paso 2

    // Acción
    Utils.chromeDriver.findElementByXPath("//h5[contains(text(),'Forms')]/parent::div").click();
    // Condición
    if (Utils.chromeDriver.findElementsByXPath("//div[@class='header-text' and text()='Elements']").size() > 0 &&
        Utils.chromeDriver.findElementsByXPath("//div[@class='header-text' and text()='Forms']").size() > 0 &&
        Utils.chromeDriver.findElementsByXPath("//div[@class='header-text' and text()='Alerts, Frame & Windows']")
            .size() > 0
        &&
        Utils.chromeDriver.findElementsByXPath("//div[@class='header-text' and text()='Widgets']").size() > 0 &&
        Utils.chromeDriver.findElementsByXPath("//div[@class='header-text' and text()='Interactions']").size() > 0 &&
        Utils.chromeDriver.findElementsByXPath("//div[@class='header-text' and text()='Book Store Application']")
            .size() > 0) {
      System.out.println("[MIFRAMEWORK] Aparece el elemento //div[@class='header-text' and text()='Elements'] ");
      System.out.println("[MIFRAMEWORK] Aparece el elemento //div[@class='header-text' and text()='Forms'] ");
      System.out.println(
          "[MIFRAMEWORK] Aparece el elemento //div[@class='header-text' and text()='Alerts, Frame & Windows'] ");
      System.out.println("[MIFRAMEWORK] Aparece el elemento //div[@class='header-text' and text()='Widgets']");
      System.out.println("[MIFRAMEWORK] Aparece el elemento //div[@class='header-text' and text()='Interactions']");
      System.out.println("[MIFRAMEWORK] Aparece el elemento //div[@class='header-text' and text()='Book Store Application']");
    }
    Thread.sleep(1000);

  }


  // -------------------------------------------------------2-----------------------------------------------------------------------------------------------------------------------------


  @Test(description = "Forms_TC02 - Verificar el funcionamiento de Practice Form - Correcta aparicion de elementos y click en Date of birth", enabled = false)
  public void Forms_TC02() throws InterruptedException {
    Forms_TC01();
    // PASO1
    // ACCION
    Utils.chromeDriver.findElementByXPath("//li[contains(@id,'item-')]/span[contains(text(),'Practice Form')]").click();
    // CONDICION
    if (Utils.chromeDriver.findElementsByXPath("//input[(@id='firstName')]").size() == 0 ||
        Utils.chromeDriver.findElementsByXPath("//input[contains(@id,'lastName')]").size() == 0 ||
        Utils.chromeDriver.findElementsByXPath("//input[contains(@id,'userEmail')]").size() == 0 ||
        Utils.chromeDriver.findElementsByXPath("//div//input[contains(@value,'Male')]").size() == 0 ||
        Utils.chromeDriver.findElementsByXPath("//div//input[contains(@value,'Female')]").size() == 0 ||
        Utils.chromeDriver.findElementsByXPath("//div//input[contains(@value,'Other')]").size() == 0 ||
        Utils.chromeDriver.findElementsByXPath("//input[contains(@id,'userNumber')]").size() == 0 ||
        Utils.chromeDriver.findElementsByXPath("//input[contains(@id,'dateOfBirthInput')]").size() == 0 ||
        Utils.chromeDriver.findElementsByXPath("//input[contains(@id,'subjectsInput')]").size() == 0 ||
        Utils.chromeDriver.findElementsByXPath("//input/following-sibling::label[text()='Sports']").size() == 0 ||
        Utils.chromeDriver.findElementsByXPath("//input/following-sibling::label[text()='Reading']").size() == 0 ||
        Utils.chromeDriver.findElementsByXPath("//input/following-sibling::label[text()='Music']").size() == 0 ||
        Utils.chromeDriver.findElementsByXPath("//input[contains(@id,'uploadPicture')]").size() == 0 ||
        Utils.chromeDriver.findElementsByXPath("//textarea[contains(@id,'currentAddress')]").size() == 0 ||
        Utils.chromeDriver.findElementsByXPath("//input[contains(@id,'react-select-6-input')]").size() == 0 ||
        Utils.chromeDriver.findElementsByXPath("//input[contains(@id,'react-select-7-input')]").size() == 0) {
      System.out.println("Han Aparecido todos los Elementos!");
    }
    Thread.sleep(1000);

    // PASO2
    // ACCION
    Utils.chromeDriver.findElementByXPath("//input[(@id='dateOfBirthInput')]").click();
    Thread.sleep(1500);
    Utils.chromeDriver.findElementByXPath("//select[(@class='react-datepicker__month-select')]").click();
    Utils.chromeDriver
        .findElementByXPath("//select[@class='react-datepicker__month-select']/option[contains(text(),'January')]")
        .click();
    Utils.chromeDriver.findElementByXPath("//select[(@class='react-datepicker__year-select')]").click();
    JavascriptExecutor js = (JavascriptExecutor) Utils.chromeDriver;
    js.executeScript("window.scrollBy(0,500)");
    Utils.chromeDriver.findElementByXPath("//select[(@class='react-datepicker__year-select')]/option[contains(text(),'1999')]").click();
    Thread.sleep(1000);
    
}



// -------------------------------------------------------3-----------------------------------------------------------------------------------------------------------------------------


  @Test(description = "Forms_TC03 - Verificar el funcionamiento de Practice Form - Correcta aparicion de elementos y checkeos", enabled = false)
  public void Forms_TC03() throws InterruptedException {
    Forms_TC01();
    // PASO1
    // ACCION
    Utils.chromeDriver.findElementByXPath("//li[contains(@id,'item-')]/span[contains(text(),'Practice Form')]").click();
    // CONDICION
    if (Utils.chromeDriver.findElementsByXPath("//input[(@id='firstName')]").size() == 0 ||
        Utils.chromeDriver.findElementsByXPath("//input[contains(@id,'lastName')]").size() == 0 ||
        Utils.chromeDriver.findElementsByXPath("//input[contains(@id,'userEmail')]").size() == 0 ||
        Utils.chromeDriver.findElementsByXPath("//div//input[contains(@value,'Male')]").size() == 0 ||
        Utils.chromeDriver.findElementsByXPath("//div//input[contains(@value,'Female')]").size() == 0 ||
        Utils.chromeDriver.findElementsByXPath("//div//input[contains(@value,'Other')]").size() == 0 ||
        Utils.chromeDriver.findElementsByXPath("//input[contains(@id,'userNumber')]").size() == 0 ||
        Utils.chromeDriver.findElementsByXPath("//input[contains(@id,'dateOfBirthInput')]").size() == 0 ||
        Utils.chromeDriver.findElementsByXPath("//input[contains(@id,'subjectsInput')]").size() == 0 ||
        Utils.chromeDriver.findElementsByXPath("//input/following-sibling::label[text()='Sports']").size() == 0 ||
        Utils.chromeDriver.findElementsByXPath("//input/following-sibling::label[text()='Reading']").size() == 0 ||
        Utils.chromeDriver.findElementsByXPath("//input/following-sibling::label[text()='Music']").size() == 0 ||
        Utils.chromeDriver.findElementsByXPath("//input[contains(@id,'uploadPicture')]").size() == 0 ||
        Utils.chromeDriver.findElementsByXPath("//textarea[contains(@id,'currentAddress')]").size() == 0 ||
        Utils.chromeDriver.findElementsByXPath("//input[contains(@id,'react-select-6-input')]").size() == 0 ||
        Utils.chromeDriver.findElementsByXPath("//input[contains(@id,'react-select-7-input')]").size() == 0) {
      System.out.println("Han Aparecido todos los Elementos!");
    }
    Thread.sleep(1000);

    // PASO2
    // ACCION
    Utils.chromeDriver.findElementByXPath("//label[contains(text(),'Male')]").click();
    JavascriptExecutor js = (JavascriptExecutor) Utils.chromeDriver;
    js.executeScript("window.scrollBy(0,500)");
    Utils.chromeDriver.findElementByXPath("//label[contains(text(),'Sports')]").click();

    // CONDICION
    Thread.sleep(1000);

  }


  // -------------------------------------------------------3-----------------------------------------------------------------------------------------------------------------------------


  @Test(description = "Forms_TC04 - Verificar el funcionamiento de Practice Form - Correcta aparicion de elementos y picture", enabled = false)
  public void Forms_TC04() throws InterruptedException {

    Forms_TC01();

    // PASO1

    // ACCION
    Utils.chromeDriver.findElementByXPath("//li[contains(@id,'item-')]/span[contains(text(),'Practice Form')]").click();

    // CONDICION
    if (Utils.chromeDriver.findElementsByXPath("//input[(@id='firstName')]").size() > 0 ||
        Utils.chromeDriver.findElementsByXPath("//input[contains(@id,'lastName')]").size() == 0 ||
        Utils.chromeDriver.findElementsByXPath("//input[contains(@id,'userEmail')]").size() == 0 ||
        Utils.chromeDriver.findElementsByXPath("//div//input[contains(@value,'Male')]").size() == 0 ||
        Utils.chromeDriver.findElementsByXPath("//div//input[contains(@value,'Female')]").size() == 0 ||
        Utils.chromeDriver.findElementsByXPath("//div//input[contains(@value,'Other')]").size() == 0 ||
        Utils.chromeDriver.findElementsByXPath("//input[contains(@id,'userNumber')]").size() == 0 ||
        Utils.chromeDriver.findElementsByXPath("//input[contains(@id,'dateOfBirthInput')]").size() == 0 ||
        Utils.chromeDriver.findElementsByXPath("//input[contains(@id,'subjectsInput')]").size() == 0 ||
        Utils.chromeDriver.findElementsByXPath("//input/following-sibling::label[text()='Sports']").size() == 0 ||
        Utils.chromeDriver.findElementsByXPath("//input/following-sibling::label[text()='Reading']").size() == 0 ||
        Utils.chromeDriver.findElementsByXPath("//input/following-sibling::label[text()='Music']").size() == 0 ||
        Utils.chromeDriver.findElementsByXPath("//input[contains(@id,'uploadPicture')]").size() == 0 ||
        Utils.chromeDriver.findElementsByXPath("//textarea[contains(@id,'currentAddress')]").size() == 0 ||
        Utils.chromeDriver.findElementsByXPath("//input[contains(@id,'react-select-6-input')]").size() == 0 ||
        Utils.chromeDriver.findElementsByXPath("//input[contains(@id,'react-select-7-input')]").size() == 0) {
      System.out.println("Han Aparecido todos los Elementos!");
    }
    Thread.sleep(1000);

    // PASO2
    // ACCION
    JavascriptExecutor js = (JavascriptExecutor) Utils.chromeDriver;
    js.executeScript("window.scrollBy(0,500)");
    Utils.chromeDriver.findElementByXPath("//input[@id='uploadPicture' and @type='file' and @lang='en']").click();

    // CONDICION
    Thread.sleep(1000);

  }


  @Test(description = "Forms_OK01 - Verificar el funcionamiento de Practice Form - Creacion de formulario", enabled = false)
  public void Forms_OK01() throws InterruptedException {

    Forms_TC02();
    // PASO1
    // ACCION
    Utils.chromeDriver.findElementByXPath("//input[(@id='firstName')]").sendKeys("Antonio");
    Utils.chromeDriver.findElementByXPath("//input[(@id='lastName')]").sendKeys("Pérez");
    Utils.chromeDriver.findElementByXPath("//label[contains(text(),'Male')]").click();
    Utils.chromeDriver.findElementByXPath("//input[(@placeholder='Mobile Number')]").sendKeys("6666666666");

    Thread.sleep(2000);
    // CONDICION

    // PASO2

    // ACCION
    Utils.chromeDriver.findElementByXPath("//button[(@id='submit')]").click();
    // CONDICION

    if (Utils.chromeDriver.findElementsByXPath("//div[(@class='modal-title h4')]").size() > 0 &&
        Utils.chromeDriver.findElementsByXPath("//th[text()='Label']").size() > 0 &&
        Utils.chromeDriver.findElementsByXPath("//th[text()='Values']").size() > 0 &&
        Utils.chromeDriver.findElementsByXPath("//button[@id='closeLargeModal']").size() > 0) {
      System.out.println();
    }

  }

  @Test(description = "Forms_KO01 - Verificar el funcionamiento de Practice Form - Fallo al redactar 1", enabled = false)
  public void Forms_KO01() throws InterruptedException {
    Forms_TC02();
    // PASO1
    // ACCION
    Utils.chromeDriver.findElementByXPath("//input[(@id='userEmail')]").sendKeys("antonio@ejemplo.com");
    // El día de cumpleaños se hace en la segunda prueba.
    //Forms_TC02();
    Thread.sleep(2000);

    Utils.chromeDriver.findElementByXPath("//label[contains(text(),'Sports')]").click();

    Utils.chromeDriver.findElementByXPath("//textarea[@placeholder='Current Address']").sendKeys("Calle Turia, 52");
    Thread.sleep(2000);
    // CONDICION

    // PASO2
    // ACCION
    Utils.chromeDriver.findElementByXPath("//button[(@id='submit')]").click();
    // CONDICION
  }
  @Test(description = "Forms_KO02 - Verificar el funcionamiento de Practice Form - Fallo al redactar 2", enabled = false)
  public void Forms_KO02() throws InterruptedException {
    Forms_TC02();
    // PASO1
    // ACCION
    Utils.chromeDriver.findElementByXPath("//input[(@id='userEmail')]").sendKeys("antonio@ejemplo.com");
    Thread.sleep(1500);
    Utils.chromeDriver.findElementByXPath("//label[contains(text(),'Sports')]").click();

    Utils.chromeDriver.findElementByXPath("//textarea[@placeholder='Current Address']").sendKeys("Calle Turia, 52");
    Utils.chromeDriver.findElementByXPath("//input[(@id='firstName')]").sendKeys("Antonio");
    // CONDICION

    // PASO2
    // ACCION
    Utils.chromeDriver.findElementByXPath("//button[(@id='submit')]").click();
    // CONDICION
  }

}
