public class Solution {
    public int[] plusOne(int[] digits) {
        int end = digits.length-1;
        while (end>=0){
            if (digits[end]<9){
                digits[end]++;
                return digits;
            }
            else{
                digits[end]=0;
                end--;
            }
        }
        if (digits[0] == 0){
            int[] res = new int[digits.length+1];
            res[0]=1;
            return res;
        }
        return digits;
    }
}