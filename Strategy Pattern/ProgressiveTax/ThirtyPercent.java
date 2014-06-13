package ProgressiveTax;

public class ThirtyPercent implements IStrategy {

	@Override
	public double execute(double income) {
		double taxPaid = 0;
		if(income>20000){
			taxPaid = 20000 * .30;
		}
		return taxPaid;
	}

}
