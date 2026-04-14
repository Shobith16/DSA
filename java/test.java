class test {
    public static int strStr(String haystack, String needle) {
        for(int i = 0;i <= haystack.length()-needle.length();i++){
            
            if(haystack.substring(i,i+needle.length()).equals(needle)){
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
    public static void main(String[] args) {
        //first-occurrence-in-a-string
        System.out.println("Res : " + strStr("sadbutsad", "sad"));
        System.out.println("Res : " + strStr("leetcode", "leeto"));
        //palindrome
        System.out.println("Res : " + isPalindrome("A man a plan a canal Panama"));
        System.out.println("Res : " + isPalindrome("race a car"));
    }
}