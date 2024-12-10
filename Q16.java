
package first;



    public class Q16 {
    public static String removePunctuation(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }

        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) {
                continue; 
            }
            result.append(c);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String sentence = "Let’s try, Mike!";
        System.out.println("Original: " + sentence);
        System.out.println("Without punctuation: " + removePunctuation(sentence));
    }
}

}
