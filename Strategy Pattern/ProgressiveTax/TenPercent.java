package ProgressiveTax;

public class TenPercent implements IStrategy {

	@Override
	public double execute(double income) {
		double taxPaid = 0;
		if(income<10000){
			taxPaid = income * .10;
		}else{
			taxPaid = 9999 *.10;
		}
		return taxPaid;
	}

}
