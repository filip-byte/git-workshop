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
        System.out.println("First Three Words: " + Arrays.toString(firstThreeWords));

        /* Task 2 */

        String[] lastThreeWords = new String[3];
        int lastIndex = wordList.length -1;

        lastThreeWords[0] = wordList[lastIndex];
        lastThreeWords[1] = wordList[lastIndex-1];
        lastThreeWords[2] = wordList[lastIndex-2];
        System.out.println("Last three words: " + Arrays.toString(lastThreeWords));

        /* Task 3 - Create a variable called wordCount that
        lets us know how many words are in the list. Don't forget to commit. */

        int wordCount = wordList.length;
        System.out.println("There is " + wordCount + " words in the list.");










    }
}
