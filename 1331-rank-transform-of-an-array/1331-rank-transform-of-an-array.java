class Solution {
    public int[] arrayRankTransform(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num:arr){
            pq.add(num);
        }
        int n = 1;
        HashMap<Integer,Integer> hm = new HashMap<>();
        while(!pq.isEmpty()){
            int val = pq.poll();
            if(!hm.containsKey(val)){
                hm.put(val,n++);
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i] = hm.get(arr[i]);
        }
        return arr;
    }
}