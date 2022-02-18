package practise;

import org.testng.annotations.Test;

public class Testcase {
@Test(priority=1)
public void createCustomerTest() {
	System.out.println("execute test");
	int[]arr= {1,2,3};
	System.out.println(arr[5]);
	
}
@Test(dependsOnMethods="createCustomerTest")
public void modifyCustomer() {
	System.out.println("execute modify customer");
	
}
@Test
public void deleteCustomerTestcase()
{
	System.out.println("execute delete customertestcas");
}
}
