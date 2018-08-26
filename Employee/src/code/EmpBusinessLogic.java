package code;

public class EmpBusinessLogic {
   public double annualSalary(Employee_details details) {
	   double annualSalary=details.getEmpSalary()*12;
	   return annualSalary;
	   
   }
   public double appraisals(Employee_details details) {
	   double appraisal=0;
	   if (details.getEmpSalary()>10000) {
		   appraisal=1000.0;
		
	} else {
   appraisal=500.0;
	}
	return appraisal;
	   
   }
}
