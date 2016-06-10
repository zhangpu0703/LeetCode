public class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int lenA = a.length()-1;
        int lenB = b.length()-1;
        int flag = 0;
        while (lenA>=0 || lenB>=0){
            int curA=0;
            int curB=0;
            int sum = 0;
            if (lenA>=0) curA=a.charAt(lenA)-'0';
            if (lenB>=0) curB=b.charAt(lenB)-'0';
            sum=flag+curA+curB;
            if (sum==3){
                sb.append(1);
                flag=1;
            }
            else if (sum==2){
                sb.append(0);
                flag=1;
            }
            else if (sum==1){
                sb.append(1);
                flag=0;
            }
            else{
                sb.append(0);
                flag=0;
            }
            lenA--;
            lenB--;
        }
        if (flag==1) sb.append(1);
        return sb.reverse().toString();
    }
}