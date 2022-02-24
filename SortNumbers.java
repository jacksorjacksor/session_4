import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) throws IOException {
        File absIsGreat = new File("mark");
        Scanner myReader = new Scanner(absIsGreat);
        ArrayList<Integer> sortedList = new ArrayList<Integer>();
        while (myReader.hasNextLine()) {
            int MyValue = Integer.parseInt(myReader.nextLine());
            sortedList.add(MyValue);
        }
        Collections.sort(sortedList, Collections.reverseOrder());
        System.out.println(sortedList);
        myReader.close();
    }
}
