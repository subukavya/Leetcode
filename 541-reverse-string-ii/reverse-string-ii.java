
class Solution {
    public String reverseStr(String s, int k) {
        String str = "";
        String ans = "";

        for (int i = 0; i < s.length(); i += 2 * k) {
            str = "";

            for (int j = i; j < Math.min(i + k, s.length()); j++) {
                str += s.charAt(j);
            }

            StringBuilder sb = new StringBuilder(str);
            ans += sb.reverse();

            for (int j = i + k; j < Math.min(i + 2 * k, s.length()); j++) {
                ans += s.charAt(j);
            }
        }

        return ans;
    }
}

