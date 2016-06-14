public class Solution {
    public int maxProduct(String[] words) {
        Arrays.sort(words, new Comparator<String>(){
            public int compare(String s1, String s2){
                return s2.length()-s1.length();
            }
        }
        );
        int res=0;
        for (int i=0; i<words.length; i++){
            if (words[i].length()*words[i].length()<=res) break; 
            for (int j=i+1; j<words.length; j++){
               String s1 = words[i];
               String s2 = words[j];
               if (isvalid(s1,s2)) {
                   res = Math.max(s1.length()*s2.length(),res);
                   break;
               }
            }
        }
        return res;
    }
    public boolean isvalid(String s1, String s2){
        HashSet<Character> set = new HashSet<Character>();
        for (int i=0; i<s1.length(); i++){
            set.add(s1.charAt(i));
        }
        for (int j=0; j<s2.length(); j++){
            if (set.contains(s2.charAt(j))) return false;
        }
        return true;
    }
}