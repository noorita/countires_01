import java.io.Console;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Game {
	public static void main(String[] args) {
		System.out.println("Guess the capital city");
                System.out.println("type exit are 0 to stop the game at any point");
		Console console = System.console();
                int total=0;
                int correctCount=0;
		try(BufferedReader br = new BufferedReader(new FileReader("capitals.csv"))) {
			String line;
			while ((line = br.readLine()) != null) {
                        total++;
				String[] cols = line.split(",");
				String country = cols[0];
				String capital = cols[1];
				String answer = console.readLine("What is the capital of " + country + "? ");
                                if(answer.equalsIgnoreCase("exit") || answer.equalsIgnoreCase("0")){
                                break;
                                }
				if (answer.equalsIgnoreCase(capital)) {
					System.out.println("Correct!");
                                    correctCount++;
				}
				else {
					System.out.println("No, the answer is " + capital);	
				}
			}
		}
	catch (FileNotFoundException e) {
		e.printStackTrace();
		} catch (IOException e) {
		e.printStackTrace();
		}
         System.out.println("you have answer " + "  " + (total-correctCount) + " incorect ");
	}
}