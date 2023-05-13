class Solution {
    static List<String> answer;
    public List<String> generateParenthesis(int n) {
        
    answer = new ArrayList<>();
    backtracking(n,0,0,"");
    return answer;

    }

    public static void  backtracking(int n, int open, int close, String str){
        
        if(str.length()==n*2){
            answer.add(str);
            return;
        }

        if(open<n){
            backtracking(n,open+1,close,str+"(");
        }
        if(open>close){
            backtracking(n,open,close+1,str+")");
        }

    }
}