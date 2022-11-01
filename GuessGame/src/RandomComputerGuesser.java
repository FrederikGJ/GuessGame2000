import java.util.Random;

public class RandomComputerGuesser implements IGuesser
{
    private int min;
    private int max;

    private int guess;


    public void yourTurn() {}

    public String getName()
    {
        return "Computer guesser";
    }

    public void newGame(int min, int max, String opponent, String type)
    {
        this.min = min;
        this.max = max;
    }

    public int makeGuess()
    {
        Random rn = new Random();
       guess = rn.nextInt(min,max);
       return guess;
    }

    public void guessFeedback(Answer answer)
    {

            switch (answer)
            {
                case TOO_LOW:
                    min = guess + 1;
                    break;
                case TOO_HIGH:
                    max = guess - 1;
                    break;
                case CORRECT:
                    break;
                default:
                    throw new RuntimeException("This should never happen!");
            }
        

    }

    public boolean endOfGame(int numberOfGuesses, String opponent)
    {
        return true;
    }

}
