class Solution {
    static int maxLen;
    static String answer;
    public String longestPalindrome(String s) {
        int len = s.length();
        answer = "";
        maxLen = Integer.MIN_VALUE;
        for(int i=0; i<len; i++){
            extend(i,i,s);
            extend(i,i+1,s);
        }

        return answer;
    }

    public static void extend(int l, int r, String s){
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            l--;
            r++;
        }

        if(r-l+1>maxLen){
           maxLen = r-l+1;
           answer = s.substring(l+1,r);

        }
    }
}