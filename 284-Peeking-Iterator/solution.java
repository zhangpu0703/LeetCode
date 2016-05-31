// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
class PeekingIterator implements Iterator<Integer> {
    
    private Integer peek;
    private Iterator<Integer> nian;

	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	    nian = iterator;
	    if (nian.hasNext()) peek=nian.next();
	    else peek = null;
	    
	}

    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return peek;
	}

	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    int next = peek;
	    if (nian.hasNext()) peek=nian.next();
	    else peek = null;
	    return next;
	}

	@Override
	public boolean hasNext() {
	    return peek!=null;
	}
}