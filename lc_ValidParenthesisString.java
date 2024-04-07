class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> eo = new Stack<>();
        Stack<Integer> a = new Stack<>();
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '('){
                eo.push(i);
            }
            else if(ch == '*'){
…            if(oi>ci){
                return false;
            }
        }
        return eo.isEmpty();
    }
}
