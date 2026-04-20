import java.util.Arrays;
import java.util.Collections;

class codes {
    public static int strStr(String haystack, String needle) {
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {

            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }

        }
        return -1;
    }

    public static boolean isPalindrome(String s) {
        // Remove all spaces
        s = s.replaceAll("\\s", "");

        // Remove special characters (keep only alphanumeric)
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        return s.equals(new StringBuilder(s).reverse().toString().toLowerCase());

    }

    // h-index
    public int hIndex(int[] citations) {
        Integer[] result = Arrays.stream(citations)
                .boxed()
                .toArray(Integer[]::new);
        Arrays.sort(result, Collections.reverseOrder());

        int h = 0;
        for (int i = 0; i < result.length; i++) {
            if (result[i] >= i + 1) { // ✅ rank is i+1 (1-based)
                h = i + 1;
            } else {
                break; // sorted desc, no point continuing
            }
        }
        return h;
    }
    public static String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        // String[] reversedWords = new String[words.length];
        String reversedWords="";

        for(int i=words.length-1;i>=0;i--){
            reversedWords += words[i] + " ";
        }

        return reversedWords.trim();

        
    }
    public static void main(String[] args) {
        // first-occurrence-in-a-string
        System.out.println("Res : " + strStr("sadbutsad", "sad"));
        System.out.println("Res : " + strStr("leetcode", "leeto"));
        // palindrome
        System.out.println("Res : " + isPalindrome("A man a plan a canal Panama"));
        System.out.println("Res : " + isPalindrome("race a car"));
        // h-index
        System.out.println("Res : " + new test().hIndex(new int[]{3, 0, 6, 1, 5}));
        // reverse-words-in-a-string
        System.out.println("Res : " + reverseWords("  hello world!  "));
    }
}