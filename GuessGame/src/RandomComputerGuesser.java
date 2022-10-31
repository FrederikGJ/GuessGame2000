import java.util.Random;

public class RandomComputerGuesser implements IGuesser
{
    private int min;
    private int max;

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
        //RandomCOmputerGuesser stars wtih a random guess
        int range = max - min;
        Random rn = new Random();
        return rn.nextInt(range);


    }

    public void guessFeedback(Answer answer)
    {

        // vi skal bruge alle computerens svar

        
        switch(answer)
        {
            case TOO_LOW:
                min = ((min + max) / 2) + 1;
                break;
            case TOO_HIGH:
                max = ((min + max) / 2) -1;
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
