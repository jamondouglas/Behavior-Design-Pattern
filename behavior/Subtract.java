
public class Subtract implements Strategy {

	@Override
	public int execute(int a, int b) {
		int result=0
				;
		// TODO Auto-generated method stub
		if(a<b){
			result = b-a;
		}else if(b<a){
			result = b-a;
		}
		System.out.println("Called Subtract's execute()");
		return result;
	}

}
