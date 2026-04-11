class Solution {
    public static int lengthOfLastWord(String s) {
        String[] str_arr = (s.trim()).split(" ");

        return (str_arr[str_arr.length-1]).length();
    }

    public static void main(String[] args) {

        System.out.println(Solution.lengthOfLastWord("IV length of last word"));
        System.out.println(Solution.lengthOfLastWord("LCIV"));
    }
} 