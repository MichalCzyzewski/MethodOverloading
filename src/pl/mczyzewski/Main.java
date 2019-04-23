package pl.mczyzewski;

public class Main
{

    public static void main(String[] args)
    {

       int totalScore = calculateScore("Michał", 200);
        System.out.println("Your total score is " + totalScore);

    }

    public static int calculateScore(String playername, int score)
    {
        System.out.println("Player " + playername + " score " + score + " points ");
        return score * 1000;
    }
}
