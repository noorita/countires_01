import java.io.Console;
public class Game {
	
   public static void main(String[] args){
     System.out.println("Welcome to capital game");
    Console console=System.console();
    String answer = console.readLine("what is the capital of Australia ?");
    String capital="Canberra";
    if(capital.equals(answer)){
      System.out.println("Correct answer");
   }else{
    System.out.println("No the answer is "+capital);
}

}
}