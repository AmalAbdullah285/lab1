
package first;

import java.util.Scanner;


   public class Q15 {
    public static int countVowels(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }
        
        int count = 0;
        String vowels = "aeiouAEIOU";
        
        for (char c : input.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String input = "Hello, World!"; 
        System.out.println("Number of vowels: " + countVowels(input));
    }
}

}
