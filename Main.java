import java.util.Scanner;
import java.util.regex.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in); 
		int numberOfPairs = Integer.parseInt(scanner.nextLine());
		for(int i = 0; i < numberOfPairs; i++){
			String s = scanner.nextLine();
			
			//extract integers and create new pair
			// check if the string matches the required pattern
			Pattern p = Pattern.compile("\\((\\d+),(\\d+)\\)");
			Matcher m = p.matcher(s);
			
			// if it didn't match or extracted less than two integers, then there's an error
			//    so move on to the next line
			if(!m.matches() || m.groupCount() < 2){
				System.err.println("Error extracting input from line: " + s);
				continue;
			}
			
			//create new pair
			Pair pair = new Pair(Integer.parseInt(m.group(1)), Integer.parseInt(m.group(2)));
			
			//print pair and whether it's valid or invalid
			System.out.print(pair);
			System.out.print(" ");
			if(pair.isRA()){
				System.out.print("VALID");
			}
			else{
				System.out.print("NOT VALID");
			}
			System.out.println();
		}
		scanner.close();
	}
	
}
