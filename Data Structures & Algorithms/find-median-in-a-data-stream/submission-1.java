class MedianFinder {
    List<Integer> list;
    public MedianFinder() {
        list = new ArrayList<>();
    }
    
    public void addNum(int num) {
        list.add(num);
    }
    
    public double findMedian() {
        Collections.sort(list);
        int n = list.size();
        if((n & 1) == 0) {
            return (list.get(n / 2) + list.get(n/2 - 1)) / 2.0;
        } else {
            return list.get(n / 2);
        }
    }
}
