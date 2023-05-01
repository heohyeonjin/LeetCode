class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int answer = Integer.MIN_VALUE;
        int startIdx = 0;
        
        for(int i=0;i<s.length();i++){
            char cur = s.charAt(i);
            if(!map.containsKey(cur)){
                map.put(cur,i);
            }
            else{
                if(startIdx<map.get(cur)+1){
                    startIdx = map.get(cur)+1;
                }
                map.put(cur,i);
            }
            
            if(answer<(i-startIdx+1)){
                answer = i-startIdx+1;
            }
        }
        if(answer == Integer.MIN_VALUE){
            return 0;
        }
        else return answer;
    }
}