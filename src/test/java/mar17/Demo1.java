package mar17;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Demo1 {
  @Test
  public void test() {
	  System.out.println("i M from test1");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("i am from before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("i am from after method");
  }

}
