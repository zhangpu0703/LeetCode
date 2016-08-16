public class Solution {
    public int ladderLength(String beginWord, String endWord, Set<String> wordList) {
        wordList.add(endWord);
        Queue<String> queue = new LinkedList<String>();
        HashSet<String> visited = new HashSet<String>();
        queue.offer(beginWord);
        visited.add(beginWord);
        int res = 1;
        while (!queue.isEmpty()){
            int size = queue.size();
            res++;
            for (int i=0; i<size; i++){
                String cur = queue.poll();
                
                List<String> ladders = getLadders(cur,wordList);
                for (String ladder : ladders) {
                    if (ladder.equals(endWord)) return res;
                    if (visited.contains(ladder)) continue;
                    visited.add(ladder);
                    queue.offer(ladder);
                }
            }
            
        }
        return 0;
    }
    public List<String> getLadders (String word, Set<String> wordList){
        char[] c = word.toCharArray();
        List<String> res = new ArrayList<String>();
        for (int i=0; i<c.length; i++){
            char cur = c[i];
            for (char temp = 'a'; temp<='z'; temp++){
                if (temp==cur) continue;
                c[i]=temp;
                String ladder = String.valueOf(c);
                if (wordList.contains(ladder)) res.add(ladder); 
            }
            c[i]=cur;
        }
        return res;
    }
}