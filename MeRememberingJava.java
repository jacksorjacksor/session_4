import java.util.Random;

/**
 * MeRememberingJava
 */
public class MeRememberingJava {
    public static void main(String[] args) {
        Random myRandomGenerator = new Random();
        for (int i = 0; i < 16; i++) {
            System.out.println(Math.abs(myRandomGenerator.nextInt() % 4) + 3);
        }
    }
}