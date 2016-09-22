public class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int indA = a.length()-1, indB = b.length()-1;
        int carry = 0;
        while(indA >= 0 || indB >= 0){
            int sum = 0;
            if (indA<0) sum = b.charAt(indB)-'0'+carry;
            else if (indB<0) sum = a.charAt(indA)-'0'+carry;
            else sum = a.charAt(indA)-'0'+b.charAt(indB)-'0'+carry;
            sb.append(sum%2);
            carry = sum/2;
            indA--;
            indB--;
        }
        if (carry==1) sb.append(1);
        return sb.reverse().toString();
    }
}