class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int a = 0;
        int b = 0;
        for(int i = 0;i<moves.length();i++){
            if(moves.charAt(i)=='L'){
                a--;
            }
            if(moves.charAt(i) == 'R'){
                a++;
            }
            if(moves.charAt(i) == '_'){
                b++;
            }
        }
        int c = Math.abs(a) + b;
        return c;
    }
}
