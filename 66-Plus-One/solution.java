public class Solution {
    public int[] plusOne(int[] digits) {
        int last=digits.length;
        if (digits[last-1]!=9){
            digits[last-1]++;
            return digits;
        }
        else{
            while (last>0 && digits[last-1]==9){
                digits[last-1]=0;
                last--;
            }
            if (last!=0){
                digits[last-1]+=1;
                return digits;
            }
            else{
                int[] aa = new int [digits.length+1];
                aa[0]=1;
                for (int i=0;i<digits.length;i++){
                    aa[i+1]=digits[i];
                }
                return aa;
            }
        }
    }
}