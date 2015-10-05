import java.util.ArrayList;

public class Pair {
	int x, y;
	
	public Pair (int myX, int myY){
		x = myX;
		y = myY;
	}
	
	public String toString(){
		return "(" + x + "," + y + ")";
	}
	
	public boolean isRA(){
		int xSum = 0;
		int ySum = 0;
		
		ArrayList<Integer> xFactors = primeFactors(x);
		ArrayList<Integer> yFactors = primeFactors(y);
		
		for(int i = 0; i < xFactors.size(); i++){
			Integer current = xFactors.get(i);
			if(!yFactors.contains(current)){
				xSum += current.intValue();
			}
		}
		
		for(int i = 0; i < yFactors.size(); i++){
			Integer current = yFactors.get(i);
			if(!xFactors.contains(current)){
				ySum += current.intValue();
			}
		}
		
		return (xSum == ySum);
	}
	
	public ArrayList<Integer> primeFactors (int n){
		ArrayList<Integer> factors = new ArrayList<Integer>();
		for (int i = 2; i <= n; i++) {
		      while (n % i == 0) {
		        factors.add(new Integer(i));
		        n /= i;
		      }
		    }
		return factors;
	}

}
