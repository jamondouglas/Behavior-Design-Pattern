package ProgressiveTax;

public class StrategyExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double income = Double.parseDouble(args[0]);
		double remainingIncome=0;
		double taxToBePaid = 0;
		Context context;
		if(income>20000){
			context = new Context(new ThirtyPercent());
			taxToBePaid = context.executeStrategy(income);
			context = new Context(new TwentyPercent());
			taxToBePaid += context.executeStrategy(income); 
			context = new Context(new TenPercent());
			taxToBePaid += context.executeStrategy(income);
		}else if(income<=19999 && income>=10000){
			context = new Context(new TwentyPercent());
			taxToBePaid = context.executeStrategy(income);
			context = new Context(new TenPercent());
			taxToBePaid += context.executeStrategy(income);
		}else if(income <= 9999 && income >0){
			context = new Context(new TenPercent());
			taxToBePaid += context.executeStrategy(income);
		}
		System.out.println("Taxes on an income of "+income+" are "+taxToBePaid);
	}

}
