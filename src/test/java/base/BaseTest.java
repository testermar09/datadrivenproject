package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	protected FileInputStream fis1;
	protected Properties configProp;
	@BeforeTest
	public void beforTest() throws IOException
	{
		fis1=new FileInputStream("src\\test\\resources\\properties\\config.properties");
		configProp=new Properties();
		configProp.load(fis1);
	}

}
