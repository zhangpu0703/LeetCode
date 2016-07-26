public class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        StringBuilder res = new StringBuilder();
        if ((numerator <0 && denominator >0) || (numerator >0 && denominator <0)) res.append('-');
        long num = Math.abs((long) numerator), den = Math.abs((long) denominator);
        res=res.append(num/den);
        num%=den;
        if (num==0) return res.toString();
        else res.append('.');
        HashMap<Long, Integer> map = new HashMap<>();
        while (num != 0){
            num*=10;
            if (map.containsKey(num)){
                int ind = map.get(num);
                res.insert(ind,'(');
                res.append(')');
                return res.toString();
            }
            else{
                map.put(num,res.length());
            }
            res.append(num/den);
            num%=den;
        }
        return res.toString();
    }
}