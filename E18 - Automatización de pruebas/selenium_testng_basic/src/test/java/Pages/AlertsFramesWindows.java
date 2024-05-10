package Pages;

import Utilities.Utils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AlertsFramesWindows {

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
  @Test(description = "Widgets_TC01 - Acceder a la pantalla de widgets", enabled = false)
  public void AlertsFramesWindows_TC01() throws InterruptedException {
  }
}