public class Solution {
    public int numDecodings(String s) {
        if (s.length() == 0) return 0;
        int[] res = new int[s.length()+1];
        res[0]=1;
        if(s.charAt(0) !='0') res[1]=1;
        for (int i=0; i<=s.length()-2; i++){
            int second = Integer.parseInt(s.substring(i,i+2));
            if (s.charAt(i+1)!='0') res[i+2]+=res[i+1];
            if (second>=10 && second<=26) res[i+2]+=res[i];
        }
        return res[s.length()];
    }
}