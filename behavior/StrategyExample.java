
public class StrategyExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Context context;
		context = new Context(new Add());
		int resultAdd = context.executeStrategy(2, 0);
		
		context = new Context(new Subtract());
		int resultSubtract = context.executeStrategy(5, 9);
		
		context = new Context(new Multiply());
		int resultMultiply = context.executeStrategy(6, 5);
		
		System.out.println("Result A : " + resultAdd );
        System.out.println("Result B : " + resultSubtract );
        System.out.println("Result C : " + resultMultiply );
	}

}
