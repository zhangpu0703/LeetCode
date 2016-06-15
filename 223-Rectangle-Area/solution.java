public class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int res = (C-A)*(D-B)+(G-E)*(H-F);
        int left = Math.max(A,E);
        int right = Math.min(C,G);
        int top = Math.min(D,H);
        int bottom = Math.max(B,F);
        if (right <= left || top <= bottom) return res;
        else return res-(right-left)*(top-bottom);
    }
}