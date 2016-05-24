public class Solution {
    public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        HashMap<String, Integer> map = new HashMap<String,Integer>();
        for (int i=0; i<words.length; i++) map.put(words[i],i);
        for (int i=0; i<words.length; i++){
            String word = words[i];
            for (int j=0; j<=word.length();j++){
                String curA=word.substring(0,j);
                String curB=word.substring(j);
                if (isPalindrome(curA)){
                    String revB=new StringBuilder(curB).reverse().toString();
                    if (map.containsKey(revB) && map.get(revB)!=i){
                        List<Integer> list = new ArrayList<>();
                        list.add(map.get(revB));
                        list.add(i);
                        res.add(list);
                    }
                }
                if (isPalindrome(curB)){
                    String revA=new StringBuilder(curA).reverse().toString();
                    if (map.containsKey(revA) && map.get(revA)!=i && curB.length()!=0){
                        List<Integer> list = new ArrayList<>();
                        list.add(i);
                        list.add(map.get(revA));
                        res.add(list);
                    }
                }
            }
        }
        return res;
    }
    public boolean isPalindrome(String s){
        int left = 0;
        int right = s.length()-1;
        while (left<=right){
            if (s.charAt(left)!=s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}