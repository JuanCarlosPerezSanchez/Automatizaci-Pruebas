package Pages;

import Utilities.Utils;
import java.time.Duration;
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
    //Utils.Instanciador_Chrome();
  }

  @AfterMethod
  public void breakup_test() throws Exception {
    //Utils.CloseBrowser();
  }

  /**************************************************
   * 
   * 
   * Pruebas
   * 
   * 
   **************************************************/

  /**
   * Validar el contenido de la página Elements.
   * @throws InterruptedException
   */
  @Test(description = "TQA_Forms_001 - Elements page", enabled = false)
  public void TQA_Forms_001() throws InterruptedException {
    Home.TQA_Home_003();
    Utils.chromeDriver.findElementByXPath("//li//span[text()='Practice Form']").click();
    if(Utils.chromeDriver.findElementsByXPath("//input[contains(@id,\"firstName\")]").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("//input[contains(@id,\"lastName\")]").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("//input[contains(@id,\"userEmail\")]").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("//div//input[contains(@value,\"Male\")]").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("//div//input[contains(@value,\"Female\")]").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("//div//input[contains(@value,\"Other\")]").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("//input[contains(@id,\"userNumber\")]").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("//input[contains(@id,\"dateOfBirthInput\")]").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("//input[contains(@id,\"subjectsInput\")]").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("//input/following-sibling::label[text()=\"Sports\"]").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("//input/following-sibling::label[text()=\"Reading\"]").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("//input/following-sibling::label[text()=\"Music\"]").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("//input[contains(@id,\"uploadPicture\")]").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("//textarea[contains(@id, \"currentAddress\")]").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("//input[contains(@id,\"react-select-6-input\")]").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("//input[contains(@id,\"react-select-7-input\")]").size() == 0)
      {
      System.out.println("Esta validación no bloqueante ha fallado!!");
    }
    
    Utils.chromeDriver.findElementByXPath("//input[contains(@id,\"firstName\")]").click();
    Sleeper.SYSTEM_SLEEPER.sleep(Duration.ofSeconds(1));
    Utils.chromeDriver.findElementByXPath("//input[contains(@id,\"firstName\")]").sendKeys("Pepe");
    Sleeper.SYSTEM_SLEEPER.sleep(Duration.ofSeconds(1));
    Utils.chromeDriver.findElementByXPath("//input[contains(@id,\"lastName\")]").click();
    Sleeper.SYSTEM_SLEEPER.sleep(Duration.ofSeconds(1));
    Utils.chromeDriver.findElementByXPath("//input[contains(@id,\"lastName\")]").sendKeys("Quality Assurance");
    Sleeper.SYSTEM_SLEEPER.sleep(Duration.ofSeconds(1));
    Utils.chromeDriver.findElementByXPath("//input[contains(@id,\"userEmail\")]").click();
    Sleeper.SYSTEM_SLEEPER.sleep(Duration.ofSeconds(1));
    Utils.chromeDriver.findElementByXPath("//input[contains(@id,\"userEmail\")]").sendKeys("pepe@quality.assurance");
    Sleeper.SYSTEM_SLEEPER.sleep(Duration.ofSeconds(1));
    Utils.chromeDriver.findElementByXPath("//input[contains(@value,\"Other\")]/..").click();
    Sleeper.SYSTEM_SLEEPER.sleep(Duration.ofSeconds(1));
    Utils.chromeDriver.findElementByXPath("//input[contains(@id,\"userNumber\")]").click();
    Sleeper.SYSTEM_SLEEPER.sleep(Duration.ofSeconds(1));
    Utils.chromeDriver.findElementByXPath("//input[contains(@id,\"userNumber\")]").sendKeys("0123456789");
    Sleeper.SYSTEM_SLEEPER.sleep(Duration.ofSeconds(1));
    Utils.chromeDriver.findElementByXPath("//input[contains(@id,\"subjectsInput\")]").click();
    Sleeper.SYSTEM_SLEEPER.sleep(Duration.ofSeconds(1));
    Utils.chromeDriver.findElementByXPath("//input[contains(@id,\"subjectsInput\")]").sendKeys("Computer Science");
    Sleeper.SYSTEM_SLEEPER.sleep(Duration.ofSeconds(1));
    Utils.chromeDriver.findElementByXPath("//input[contains(@id,\"subjectsInput\")]").sendKeys(Keys.ENTER);
    Sleeper.SYSTEM_SLEEPER.sleep(Duration.ofSeconds(1));
    Utils.chromeDriver.findElementByXPath("//input[contains(@id,\"subjectsInput\")]").sendKeys("Maths");
    Sleeper.SYSTEM_SLEEPER.sleep(Duration.ofSeconds(1));
    Utils.chromeDriver.findElementByXPath("//input[contains(@id,\"subjectsInput\")]").sendKeys(Keys.ENTER);
    Sleeper.SYSTEM_SLEEPER.sleep(Duration.ofSeconds(1));
    Utils.chromeDriver.findElementByXPath("//input/following-sibling::label[text()=\"Music\"]").click();
    Sleeper.SYSTEM_SLEEPER.sleep(Duration.ofSeconds(1));
    Utils.chromeDriver.findElementByXPath("//textarea[contains(@id, \"currentAddress\")]").sendKeys("Assurance Quality");
    Sleeper.SYSTEM_SLEEPER.sleep(Duration.ofSeconds(1));
    Utils.chromeDriver.findElementsByXPath("//div[contains(@id,\"stateCity-wrapper\")]//div[contains(@id,\"state\")]").get(0).click();
    Sleeper.SYSTEM_SLEEPER.sleep(Duration.ofSeconds(1));
    Utils.chromeDriver.findElementsByXPath("//div[contains(@id,\"stateCity-wrapper\")]//div[contains(@id,\"state\")]").get(0).sendKeys("Haryana");
    Sleeper.SYSTEM_SLEEPER.sleep(Duration.ofSeconds(1));
    Utils.chromeDriver.findElementsByXPath("//div[contains(@id,\"stateCity-wrapper\")]//div[contains(@id,\"state\")]").get(0).sendKeys(Keys.ENTER);
    Sleeper.SYSTEM_SLEEPER.sleep(Duration.ofSeconds(1));
    Utils.chromeDriver.findElementsByXPath("//div[contains(@id,\"stateCity-wrapper\")]//div[contains(@id,\"city\")]").get(1).click();
    Sleeper.SYSTEM_SLEEPER.sleep(Duration.ofSeconds(1));
    Utils.chromeDriver.findElementsByXPath("//div[contains(@id,\"stateCity-wrapper\")]//div[contains(@id,\"city\")]").get(1).sendKeys("Karnal");
    Sleeper.SYSTEM_SLEEPER.sleep(Duration.ofSeconds(1));
    Utils.chromeDriver.findElementsByXPath("//div[contains(@id,\"stateCity-wrapper\")]//div[contains(@id,\"city\")]").get(1).sendKeys(Keys.ENTER);
    Sleeper.SYSTEM_SLEEPER.sleep(Duration.ofSeconds(1));

  }

}
