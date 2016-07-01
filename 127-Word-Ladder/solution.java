public class Solution {
    public int ladderLength(String beginWord, String endWord, Set<String> wordList) {
        Queue<String> queue = new LinkedList<String>();
        wordList.add(beginWord);
        wordList.add(endWord);
        HashSet<String> used = new HashSet<>();
        queue.offer(beginWord);
        used.add(beginWord);
        int res = 1;
        while (!queue.isEmpty()){
            res++;
            int size = queue.size();
            for (int i=0; i<size; i++){
                String cur = queue.poll();
                List<String> next = nextWords(cur,wordList);
                for(String nn : next){
                    if (nn.equals(endWord)) return res;
                    if (used.contains(nn)) continue;
                    used.add(nn);
                    queue.offer(nn);
                }
            }
        }
        return 0;
    }
    public List<String> nextWords(String word, Set<String> wordList){
        List<String> next = new ArrayList<String>();
        char[] wordArray = word.toCharArray();
        for (int i = 0; i<wordArray.length; i++){
            for (char cc = 'a'; cc<='z'; cc++){
                char temp = wordArray[i];
                wordArray[i]=cc;
                String cur = String.valueOf(wordArray);
                if (!cur.equals(word) && wordList.contains(cur)) next.add(cur);
                wordArray[i]=temp;
            }
        }
        return next;
    }
}