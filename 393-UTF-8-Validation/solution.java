public class Solution {
    public boolean validUtf8(int[] data) {
        if (data == null || data.length == 0) return false;
        int ind = 0;
        while(ind < data.length){
            String cur = toBinary(data[ind]);
            int count = nOnes(cur);
            if (count == 0){
                ind++;
                continue;
            }
            else if (count == 1 || ind+count > data.length) return false;
            else{
                ind++;
                for (int i=0; i<count-1; i++){
                    String s = toBinary(data[ind++]);
                    if (!s.startsWith("10")) return false;
                }
            }
        }
        return true;
    }
    public String toBinary(int value){
        StringBuilder sb = new StringBuilder();
        while(sb.length()<8){
            sb.append(value%2);
            value/=2;
        }
        return sb.reverse().toString();
    }
    public int nOnes(String s){
        int i=0;
        while(i<s.length() && s.charAt(i)=='1') i++;
        return i;
    }
}