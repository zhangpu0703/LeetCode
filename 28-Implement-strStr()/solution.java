public class Solution {
    public int strStr(String haystack, String needle) {
        int nLen = needle.length();
        for (int i=0; i<=haystack.length()-nLen; i++){
            if (haystack.substring(i,i+nLen).equals(needle)) return i;
        }
        return -1;
    }
}