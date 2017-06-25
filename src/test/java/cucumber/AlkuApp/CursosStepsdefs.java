package cucumber.AlkuApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CursosStepsdefs {
	
	public WebDriver driver = LoginStepsdefs.driver;
	
	@Given("^User is on Cursos Screen$")
	public void user_is_on_Cursos_Screen() throws Throwable {
		driver.findElement(By.xpath("//span[.='Cursos']")).click();
		driver.findElement(By.xpath(".//*[@class='sidebar-toggle']")).click();
	     
	}

	@When("^User click to add a new Curso$")
	public void user_click_to_add_a_new_Curso() throws Throwable {
		driver.findElement(By.xpath(".//*[@class='btn btn-primary btn-xs']")).click();

	   
	}

	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and_and_and_and_and_and_and_and_and_and_and(String nombrecurso, String desccorta, String desclarga, String fechainicio, String fechafin, String horainicio, String horafin, String costo, String capacitador, String cupolimite, String categoria, String ubicacion) throws Throwable {
	    driver.findElement(By.id("nombreCurso")).sendKeys(nombrecurso);
	    driver.findElement(By.id("descripcionCorta")).sendKeys(desccorta);
	    driver.findElement(By.id("descripcion")).sendKeys(desclarga);
	    driver.findElement(By.id("fechaInicio")).sendKeys(fechainicio);
	    driver.findElement(By.id("fechaFin")).sendKeys(fechafin);
	    driver.findElement(By.id("horaInicio")).sendKeys(horainicio);
	    driver.findElement(By.id("horaFin")).sendKeys(horafin);
	    driver.findElement(By.id("costo")).sendKeys(costo);
	    driver.findElement(By.id("capacitador")).sendKeys(capacitador);
	    driver.findElement(By.id("cupoLimite")).sendKeys(cupolimite);
	    
	    String cat = categoria;
	    String ubic = ubicacion;
	    
	    Select dropdown = new Select(driver.findElement(By.name("interes")));
	    dropdown.selectByVisibleText(cat);
	    
	    Select dropdown1 = new Select(driver.findElement(By.name("ubicacion")));
	    dropdown1.selectByVisibleText(ubic);
	    
		driver.findElement(By.xpath(".//*[@type='submit']")).click();

	    
	}

	@Then("^Curso is added Successfully$")
	public void curso_is_added_Successfully() throws Throwable {
		driver.findElement(By.xpath(".//*[@class='alert alert-info']"));
		System.out.println("Curso added Successfully");
   
	}

	@When("^User click to view a Curso (\\d+)$")
	public void user_click_to_view_a_Curso(int cid) throws Throwable {
		driver.findElement(By.xpath("/html/body/div/div/section[2]/div/div/table/tbody/tr["+cid+"]/td[11]/a[1]")).click();

	}
	
	@Then("^Curso \"([^\"]*)\" should exist$")
	public void curso_should_exist(String cname) throws Throwable {
		driver.findElement(By.xpath( "//td[contains(text(), '"+cname+"')]" ));
		
	}
}
