package b3_longestSubString;

public class solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        for (int i= 0;i< s.length();i++){
            StringBuilder stringBuilder = new StringBuilder();
            for (int j=i; j<s.length(); j++){
                if ((stringBuilder.indexOf(String.valueOf(s.charAt(j)))) != -1){
                    break;
                }

                stringBuilder.append(s.charAt(j));
                max = Math.max(max, stringBuilder.length());
            }
        }
        return max;
    }
}
