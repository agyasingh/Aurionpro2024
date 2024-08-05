package com.aurionpro.solution.model;

import com.aurionpro.violation.model.DBLogger;

public class TaxCalculation {
	

		DBLogger dblogger;
		public int calculateTax(int amount,int rate){
			int tax=0;
			try {
			tax=amount/rate;
			System.out.println(tax);
			}
			catch(Exception exception) {
				new DBLogger().log("Divide by zero");
			}
			catch(Exception exception) {
				new NetworkLogger().log("Divide by zero");
			}
			return tax;
					
		}
}
