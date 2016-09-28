public class Solution {
    public List<String> findItinerary(String[][] tickets) {
        HashMap<String, PriorityQueue<String>> map = new HashMap<String, PriorityQueue<String>>();
        for (int i=0; i<tickets.length; i++){
            String start = tickets[i][0], end = tickets[i][1];
            PriorityQueue<String> queue = new PriorityQueue<String>();
            if (map.containsKey(start)) queue = map.get(start);
            queue.offer(end);
            map.put(start,queue);
        }
        List<String> res = new ArrayList<>();
        Stack<String> stack = new Stack<>();
        stack.push("JFK");
        while (!stack.isEmpty()){
            String cur = stack.peek();
            if (map.containsKey(cur) && map.get(cur).size() > 0){
                stack.push(map.get(cur).poll());
            }
            else res.add(0,stack.pop());
        }
        return res;
    }
}