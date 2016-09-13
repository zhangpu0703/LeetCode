public class Solution {
    public boolean validUtf8(int[] data) {
        int n = data.length;
        int cur = 0;
        while (cur<n){
            String s = binary(data[cur]%256);
            //if (s.charAt(0) == '0') cur++;
            int m = count(s);
            if (m==1) return false;
            for (int i=0; i<m-1; i++){
                cur++;
                if (cur>=n) return false;
                String t = binary(data[cur]%256);
                System.out.println(t);
                if (!t.startsWith("10")) return false;
            }
            cur++;
        }
        return true;
    }
    public String binary(int num){
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<8; i++){
            sb.append(num%2);
            num/=2;
        }
        //System.out.println(sb.reverse().toString());
        return sb.reverse().toString();
    }
    public int count(String s){
        if (s.startsWith("0")) return 0;
        String one = "1";
        for (int i=0; i<8; i++){
            one=one+"1";
            if (!s.startsWith(one)) return one.length()-1;
        }
        return 8;
    }
}