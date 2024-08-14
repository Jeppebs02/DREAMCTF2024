import java.util.Random;

public class CrackSeedChallenge {
    public static void main(String[] args) {
        long seed = 987654321L; // Secret seed
        Random rand = new Random(seed);
        // Generate and print 15 random numbers, 10 of which are given as a clue
        for (int i = 0; i < 15; i++) {
            System.out.println(i+1+". "+ rand.nextInt(1000)); // number between 0 and 999
        }
        
    }
}
