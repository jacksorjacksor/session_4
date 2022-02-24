import java.util.Random;

public class Lab4Q1 {

    public static Random myGenerator = new Random();

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.println(myGenerator.nextDouble() * 4 + 4);
        }
    }
}