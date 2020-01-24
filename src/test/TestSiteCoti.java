package test;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSiteCoti {

	WebDriver driver;                        
	static Logger logger = Logger.getLogger(TestSiteCoti.class);
	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
	}

	@Test
	public void testarSiteCoti() throws Throwable{
	this.driver.get("https://www.cotiinformatica.com.br/cursos");
List<WebElement> listaLink= driver.findElements(By.xpath("//*[@id=\"tab-1\"]/ul/li"));
     logger.info("---");
     logger.info("Inicio da Listagem :");	
	 logger.info("Autor: Aluno");
	 logger.info("Site: https://www.cotiinformatica.com.br/cursos");
	 logger.info("Listagem :");
     for(WebElement element: listaLink) {
    	 String listaString = element.getText();
    	 System.out.println(listaString);
    	 logger.info("Elementos :" + listaString);
     }
     logger.info("*** FIM DO TESTE");
	}
	
	@After
	public void close() {
		this.driver.quit();
	}
	
}
