import java.util.Scanner;

public class Tshirt {

    public int calculate(int score)
   {
      score = score * 2;
      return score + 5;
   }
 
   public void displayResult(int finalValue)
   {
      System.out.println("Result: " + finalValue);
   }
 
   public int process(int points)
   {
      points = calculate(points);
      return points;
   }

    public static void main(String[] args) {
        // int cost=22;
        // Scanner input = new Scanner(System.in);
        // int count = input.nextInt();
        // System.out.println("The t-shirt costs $"+count*cost+".");
        // System.out.println("A personalized t-shirt costs $"+(cost+1)+".");
        // System.out.println("Without personalization, the t-shirt costs $"+cost+".");
        // input.close();


        int a = 5;
        int b = 2;
        double outcome = a / b;
        System.out.println(outcome);        // Line 1: 2.0
 
        double precise = (double) a / b;
        System.out.println(precise);        // Line 2: 2.5
 
        int mystery = 'A' + 3;
        System.out.println(mystery);        // Line 3: 68
 
        char letter = (char)('A' + 3);    // Line 4: D
        System.out.println(letter);     
        
        final int offset =3;
        char result = 'A' + offset;
        System.out.println(result);

        char lettr = 'B';
        int step = 2;
        lettr += step;
        System.out.println(lettr);

        char low = 'a'-7;
        int distance = 100-low;
        System.out.println(distance);

        final int multiplier = 2;
        char result2 = 'A' * multiplier + 1;
        System.out.println(result2);

        Scanner keyboard = new Scanner(System.in);
 
        System.out.print("Enter your ID number: ");
        int id = keyboard.nextInt();

        keyboard.nextLine();
 
        System.out.print("Enter your full team name: ");
        String teamName = keyboard.nextLine();
 
        System.out.println("ID: " + id + " | Team: " + teamName);
        keyboard.close();

    }

    private int globalBonus = 50;
    int localModifier = 10;
    
    public void setupStage(int base)
    {
        globalBonus += localModifier;
    }
 
    public void executeStage()
    {
        int totalScore = globalBonus + localModifier;
        System.out.println(totalScore);
    }
}
