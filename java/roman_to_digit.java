import java.util.HashMap;

class Solution {
    public static int romanToInt(String s) {
        int sum = 0;
    HashMap<String, Integer> map = new HashMap<>();
    map.put("I", 1);
    map.put("V", 5);
    map.put("X", 10);
    map.put("L", 50);    // ✅ fixed
    map.put("C", 100);   // ✅ fixed
    map.put("D", 500);   // ✅ fixed
    map.put("M", 1000);

    for (int i = 0; i < s.length(); i++) {
        int curr = map.get(String.valueOf(s.charAt(i)));   // ✅ fixed

        if (i + 1 < s.length()) {
            int next = map.get(String.valueOf(s.charAt(i + 1))); // ✅ fixed
            if (curr < next) {
                sum += next - curr;  // e.g. IV = 5 - 1 = 4
                i++;                 // skip next char
            } else {
                sum += curr;
            }
        } else {
            sum += curr;  // ✅ fixed — handles last character
        }
    }

    return sum;
    }

    public static void main(String[] args) {

        System.out.println(Solution.romanToInt("IV"));
        System.out.println(Solution.romanToInt("LCIV"));
    }
}