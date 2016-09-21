public class Solution {
     public int ladderLength(String beginWord, String endWord, Set<String> wordList) {
        HashSet<String> visited = new HashSet<String>();
        wordList.add(endWord);
        int res = 1;
        Queue<String> queue = new LinkedList<String>();
        queue.offer(beginWord);
        visited.add(beginWord);
        while (!queue.isEmpty()){
            res++;
            int size = queue.size();
            for (int i=0; i<size; i++){
                String cur = queue.poll();
                System.out.println(cur);
                List<String> list = ladders(cur,wordList);
                for (String s : list) {
                    System.out.println(s);
                    if (s.equals(endWord)) return res;
                    if (visited.contains(s)) continue;
                    visited.add(s);
                    queue.offer(s);
                }
            }
        }
        return 0;
    }
    public List<String> ladders(String word, Set<String> wordList){
        char[] arr = word.toCharArray();
        List<String> ladders = new ArrayList<String>();
        for (int i=0; i<arr.length; i++){
            char cur = arr[i];
            for (char c = 'a'; c<='z'; c++){
                if (c!=cur){
                    arr[i]=c;
                    String ladder = String.valueOf(arr);
                    if (wordList.contains(ladder)) ladders.add(ladder);
                }
            }
            arr[i]=cur;
        }
        return ladders;
    }
}