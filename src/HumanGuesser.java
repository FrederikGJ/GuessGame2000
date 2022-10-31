import java.util.Scanner;

public class HumanGuesser
{
    private static final Scanner scanner = new Scanner(System.in);

    private String name;

    public HumanGuesser()
    {
       name = null;
    }

    public String getName()
    {
        if(name != null)
        {
            return name;
        }

        System.out.print("Guesser, please enter your name: ");
        name = scanner.nextLine();
        return name;
    }

    public void yourTurn()
    {
        //Clear the console
        for(int i = 0; i < 100; ++i)
        {
            System.out.println();
        }
        System.out.println(getName() + " it is now your turn.");
        System.out.println("Press ENTER when ready!");
        scanner.nextLine();
        //Clear the console
        for(int i = 0; i < 100; ++i)
        {
            System.out.println();
        }
    }

    public int guess()
    {
        try
        {
            System.out.println("Make your guess. Remember that your guess must be an integer");
            return scanner.nextInt();
        }
        catch (Exception e)
        {
            System.out.println("You did not write an integer...... ");
            guess();
        }
        return -1;
    }

    public void newGame(int min, int max, String opponent)
    {
        System.out.println("A new game is about to start. You are the guesser.");
        System.out.println("You are plaing against " + opponent + ".");
        System.out.println("The range is from " + min + " to " + max + ".");
        System.out.println("Press ENTER when ready.");
        scanner.nextLine();
    }

}
