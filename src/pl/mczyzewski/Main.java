package pl.mczyzewski;

public class Main
{

    public static void main(String[] args)
    {

        calculateScore("Michał", 200);


    }

    public static int calculateScore(String playername, int score)
    {
        System.out.println("Player " + playername + " score " + score + " points ");
        return score * 1000;
    }
}
