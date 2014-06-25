package ProgressiveTax;

public class TwentyPercent implements IStrategy {

	@Override
	public double execute(double income) {
		double taxPaid = 0;
		// TODO Auto-generated method stub
		if(income<=20000 && income>=10000){
			taxPaid = income * .20;
		}else{
			taxPaid = 19999 *.20;
		}
		return taxPaid;
	}

}
