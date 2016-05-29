class MedianFinder {
    private PriorityQueue<Integer> min = new PriorityQueue<>();
    private PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
    // Adds a number into the data structure.
    public void addNum(int num) {
        
        min.offer(num);
        max.offer(min.poll());
        if (min.size()<max.size()) min.offer(max.poll());
    }

    // Returns the median of current data stream
    public double findMedian() {
        if (max.size() == min.size()) return max.peek()*0.5+min.peek()*0.5;
        else return min.peek();
    }
};

// Your MedianFinder object will be instantiated and called as such:
// MedianFinder mf = new MedianFinder();
// mf.addNum(1);
// mf.findMedian();