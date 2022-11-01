public class AlienThinker implements IThinker
{
    @Override
    public void yourTurn()
    {
        System.out.println("lol this is cool");
    }

    @Override
    public String getName()
    {
        return null;
    }

    @Override
    public void newGame(int min, int max, String opponent, String type)
    {

    }

    @Override
    public Answer evaluateGuess(int guess, String opponent)
    {
        return null;
    }

    @Override
    public boolean endOfGame(int numberOfGuesses, String opponent)
    {
        return false;
    }
}
