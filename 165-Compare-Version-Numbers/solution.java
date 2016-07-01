public class Solution {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int len = Math.max(v1.length,v2.length);
        
        for (int i = 0; i<len; i++){
            int cur1 = 0, cur2=0;
            if (i<v1.length) cur1 = Integer.parseInt(v1[i]);
            if (i<v2.length) cur2 = Integer.parseInt(v2[i]);
            if (cur1>cur2) return 1;
            else if (cur1<cur2) return -1;
        }
        return 0;
    }
}