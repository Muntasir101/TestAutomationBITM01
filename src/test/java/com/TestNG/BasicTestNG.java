package com.TestNG;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicTestNG {
	
	/*
	 * Priority Rules
	 * 1. Priority could be negative,zero and positive
	 * 2. Small priority gets most important
	 * 3. By default TestNG provides zero priority to all @Test
	 * 4. When two @Test share same priority then execution in alphabetical order among them
	 * 5. Method name start with Capital letter will get priority
	 */
  @Test(priority =0)
  public void function1() {  
	  Assert.fail("forcefully failed");
	  System.out.println("TestNG function 1");
  }
  
  @Test(priority =0)
  public void Function2() {
	  
	  System.out.println("TestNG function 2");
  }
  
  @Test(priority =-1)
  public void function3() {
	  
	  System.out.println("TestNG function 3");
  }
  
  @Test(priority =-3)
  public void function4() {
	  
	  System.out.println("TestNG function 4");
  }
  
  @Test(description="This is demo description")
  public void Content() {
	  
	  System.out.println("TestNG function 4");
  }
  
}
