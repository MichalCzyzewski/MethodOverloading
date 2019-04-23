package pl.mczyzewski;

public class Main
{

    public static void main(String[] args)
    {

        System.out.println(calculateScore("Michał", 234));

    }

    public static int calculateScore(String playername, int score)
    {
        System.out.println("Player " + playername + " score " + score + " score points ");
        return score * 1000;
    }
}
