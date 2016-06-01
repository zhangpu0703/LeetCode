public class Solution {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) return "0";
        StringBuilder a = new StringBuilder(num1);
        StringBuilder b = new StringBuilder(num2);
        num1 = a.reverse().toString();
        num2 = b.reverse().toString();
        int m = num1.length();
        int n = num2.length();
        int[] res= new int[m+n];
        for (int j = 0; j<n; j++){
            int flag=0;
            int[] cur = new int[m+n]; 
            for (int i=0; i<m ; i++){
                int num = ((num1.charAt(i)-'0')*(num2.charAt(j)-'0'))%10+flag;
                
                if (num>=10){
                    cur[i+j]=(num%10);
                    flag=1;
                }
                else{
                    cur[i+j]=num;
                    flag=0;
                }
                
                flag+=((num1.charAt(i)-'0')*(num2.charAt(j)-'0'))/10;
                cur[i+j+1]+=flag;
               
            }
            
            int ten = 0;
            for (int ind = 0; ind<m+n; ind++){
                if (res[ind]+cur[ind]+ten>=10){
                    res[ind]=(res[ind]+cur[ind]+ten)%10;
                    ten=1;
                }
                else{
                    res[ind]=res[ind]+cur[ind]+ten;
                    ten=0;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int c : res){
            sb.append(c);
        }
        String out = sb.reverse().toString();
        if(out.length()>0 && out.charAt(0)=='0') out= out.substring(1);
        return out;
    }
}