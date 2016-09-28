public class Solution {
    public List<String> readBinaryWatch(int num) {
        List<String> res = new ArrayList<String>();
        for (int h = 0; h<12; h++){
            for (int m = 0; m<60; m++){
                if (Integer.bitCount(h * 64 + m) == num){
                    String hr = String.valueOf(h);
                    String min = "";
                    if (m<10) min = "0"+String.valueOf(m);
                    else min = String.valueOf(m);
                    res.add(hr + ":" + min);
                }
            }
        }
        return res;
    }
}