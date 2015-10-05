import java.util.Scanner;
import java.util.regex.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in); 
		int numberOfPairs = Integer.parseInt(scanner.nextLine());
		for(int i = 0; i < numberOfPairs; i++){
			//TODO input validation
			String s = scanner.nextLine();
			//extract integers and create new pair
			Pattern p = Pattern.compile("\\(\\d+,\\d+\\)");
			Matcher m = p.matcher(s);
			if(m.matches()){
				System.out.println("Matched");
			}
			else{
				System.out.println("did not match");
			}
			//Pair pair = new Pair(Integer.parseInt(m.group(0)), Integer.parseInt(m.group(1)));
			//System.out.println(pair);
		}
		scanner.close();
	}
	
}
