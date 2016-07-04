public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gasTotal = 0;
        int costTotal = 0;
        for (int g : gas) gasTotal+=g;
        for (int c : cost) costTotal +=c;
        if (gasTotal<costTotal) return -1;
        int cur = 0;
        int res = 0;
        for (int i=0; i<gas.length; i++){
            cur += gas[i]-cost[i];
            if (cur<0){
                res=i+1;
                cur = 0;
            }
        }
        return res;
    }
}