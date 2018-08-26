package unitTest;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import javax.swing.RepaintManager;
import javax.xml.ws.handler.LogicalHandler;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import code.EmpBusinessLogic;
import code.Employee_details;

public class Test1 {
	Employee_details details=new Employee_details();
	
	
	EmpBusinessLogic ebl=new EmpBusinessLogic();
@Test
public void testAnnualSalary() {
	details.setEmpName("Tinku");
	
	
	details.setEmpAge(21);
	details.setEmpSalary(10000.0);
	double aAnualSalary = ebl.annualSalary(details);
	System.out.println(aAnualSalary);
	double eAnualSalary=120000.0;
	AssertJUnit.assertEquals(aAnualSalary, eAnualSalary);
	
	
	
}
}
