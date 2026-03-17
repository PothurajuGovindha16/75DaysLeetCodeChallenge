class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }

        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[1]-b[1]);
        for(int key:hm.keySet()){
            int[] temp={key,hm.get(key)};
            pq.add(temp);
            if(pq.size()>k){
                pq.poll();
            }
        }
        int[] res=new int[pq.size()];
        int j=0;
        while(!pq.isEmpty()){
            int[] temp=pq.poll();
            res[j++]=temp[0];
        }
        return res;
    }
}