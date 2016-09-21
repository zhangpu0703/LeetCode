public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gasTotal = 0, costTotal = 0;
        for (int i=0; i<gas.length; i++) {
            gasTotal += gas[i];
            costTotal += cost[i];
        }
        if (gasTotal<costTotal) return -1;
        int res = 0, cur = 0;
        for (int i=0; i<gas.length; i++){
            cur = cur+gas[i]-cost[i];
            if (cur<0){
                cur = 0;
                res = i+1;
            }
        }
        return res;
    }
}