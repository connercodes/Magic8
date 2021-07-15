import java.util.*;
public class Magic8Ball
{
public static void main(String[]args)
{
    int random = 0;
    boolean playAgain = true;

    while (playAgain)
    {
        anotherQuestion(random);
    }
}
public static void anotherQuestion(int answer)
{
    Scanner in = new Scanner(System.in);
    System.out.print("Enter your question for the magic 8 ball...");
    String question = in.nextLine();

    boolean playAgain = true;
    String yesOrNo;
    String anotherQuestion;
    randomAnswer(answer);


        while (playAgain)
        {
        System. out.println("Would you like to play again?");
        yesOrNo = in.nextLine();

        if (yesOrNo.equalsIgnoreCase("yes"))
        {
            System.out.println("Ask the incredible magic 8 ball another question...");
            anotherQuestion = in.nextLine();
            randomAnswer(answer);
            break;
        }else if (yesOrNo.equalsIgnoreCase("no"))
        { playAgain = false;
            System.out.println("GOODBYE");
            System.exit(0);
        }
        else
        {
            System.out.println("Invalid Input");

        }

    }
}
public static int randomAnswer(int answer)
{
    answer = (int)(Math.random()*9);
    switch (answer)
    {
            case 1: System.out.println("Server error. Please try again later.");break; //positive statements
            case 2: System.out.println("My predictions point to affirmitive");break;
            case 3: System.out.println("Forbidden 403");break;
            case 4: System.out.println("Who do you think I am...Bill Gates?");break;//neutral statements
            case 5: System.out.println("This question is too dull for my intelligent database!");break;
            case 6: System.out.println("According to my calculations it is positively accurate!");break;
            case 7: System.out.println("umm...1.3485792^-845");break;//negative statements
            case 8: System.out.println("if (yes()==true{\t be().happy();} ");break;
            case 9: System.out.println("Cannot compute! ERROR!!");break;
    }
    return answer;
}
}
