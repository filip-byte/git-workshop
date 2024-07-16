import java.util.Arrays;
import java.util.List;

public class Advanced {

    public static void main(String[] args) {

        String[] wordList = WordList.wordList;

        // DO NOT CHANGE ANY CODE ABOVE THIS LINE

        System.out.println(Arrays.toString(wordList));

        /* Task 1 */

        String[] firstThreeWords = new String[3];
        System.arraycopy(wordList,0, firstThreeWords, 0, 3);
        for (String i : firstThreeWords) {
            System.out.println(i);
        }









    }
}
