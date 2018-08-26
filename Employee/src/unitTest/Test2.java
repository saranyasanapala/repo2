package unitTest;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import code.EmpBusinessLogic;
import code.Employee_details;

public class Test2 {
Employee_details details=new Employee_details();
	
	

	EmpBusinessLogic ebl=new EmpBusinessLogic();	
@Test
public void testappraisalsSalMoreThanTen() {
details.setEmpName("chingi");
	
	
	details.setEmpAge(29);
	details.setEmpSalary(20000.0);
	double aApprisal = ebl.appraisals(details);
	 double eApprisal = 2000.0;
	 Assert.assertEquals(aApprisal, eApprisal);
	
}
@Test
public void testappraisalsSalLessThanTen() {
details.setEmpName("saru");
	
	
	details.setEmpAge(23);
	details.setEmpSalary(8000.0);
	double aApprisal = ebl.appraisals(details);
	 double eApprisal = 1500.0;
	 Assert.assertEquals(aApprisal, eApprisal);
		
}
}