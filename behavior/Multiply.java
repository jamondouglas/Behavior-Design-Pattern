
public class Multiply implements Strategy {

	@Override
	public int execute(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Called Multiply's execute()");
		return a*b;
	}

}
