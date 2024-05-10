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



  /**
   * Verificar el funcionamiento de "Date Picker 
   * @throws InterruptedException 
   */
  @Test(description = "Widgets_TC04 - Verificar el funcionamiento de \"Date Picker", enabled = true)
  public void Widgets_TC04() throws InterruptedException {

    Widgets_TC01();

    //Paso 4
    //Acción
    Utils.chromeDriver.findElementByXPath("//span[@class='text' and text()='Accordian']").click();
    // Thread.sleep(5000);
    //Condición
    if(Utils.chromeDriver.findElementsByXPath("//div[@class='react-datepicker__input-container']/input[@id='datePickerMonthYearInput']").contains(class) &&
      Utils.chromeDriver.findElementsByXPath("").size() == 0 &&
      Utils.chromeDriver.findElementsByXPath("").size() == 0)
    {
    System.out.println("Esta validación no bloqueante ha fallado!!");
    }
  }
}