public class Solution {
    public int strStr(String haystack, String needle) {
        int hlen = haystack.length();
        int nlen = needle.length();
        //if (nlen>hlen) return -1;
        for (int i=0; i<=hlen-nlen; i++){
            String sub = haystack.substring(i,i+nlen);
            if (sub.equals(needle)) return i;
        }
        return -1;
    }
}