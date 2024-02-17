package easy;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        int i = 0;
        for (int j = 0; j < tChars.length && i < sChars.length; j++) {
            if(sChars[i] == tChars[j]){
                i += 1;
            }
        }
        return i == s.length();
    }
}
