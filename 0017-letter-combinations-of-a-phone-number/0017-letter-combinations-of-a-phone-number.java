class Solution {
    public List<String> letterCombinations(String digits) {
        HashMap<Integer, String> map = new HashMap<>();
        
        String letters[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
      
        List<String> answer = new ArrayList<>();
        
        if(digits.equals("")){
            return answer;
        }

        answer.add("");
        for(int i=0; i<digits.length(); i++){
            answer = combi(letters[digits.charAt(i)-'0'], answer);
        }        

        return answer;        
    }
    
    public static List<String> combi(String letter, List<String> answer){
        List<String> result = new ArrayList<>();


        for(char x : letter.toCharArray()){
            for(String y : answer){
                StringBuffer sb = new StringBuffer();
                sb.append(y);
                sb.append(x);
                result.add(sb.toString());
            }
        }
        return result;
    }
}