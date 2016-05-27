public class Solution {
    public String getHint(String secret, String guess) {
        int[] smap = new int[10];
        int[] gmap = new int[10];
        int bull=0;
        int cow = 0;
        for (int i=0; i<secret.length(); i++){
            if (secret.charAt(i)==guess.charAt(i)) bull++;
            else {
                smap[secret.charAt(i)-'0'] ++;
                gmap[guess.charAt(i)-'0'] ++;
            }
        }
        for (int j=0; j<10; j++){
            cow+=Math.min(smap[j],gmap[j]);
        }
        return bull+"A"+cow+"B";
    }
}