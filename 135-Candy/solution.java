public class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        if (n==0) return 0;
        int[] res = new int[n];
        res[0]=1;
        for (int i=1;i<n;i++) {
            if (ratings[i]>ratings[i-1]) res[i]=res[i-1]+1;
            else res[i]=1;
        }
        for (int i=n-2; i>=0; i--){
            if (ratings[i]>ratings[i+1]) res[i]=Math.max(res[i],res[i+1]+1);
        }
        int sum = 0;
        for (int num : res) sum+=num;
        return sum;
    }
}