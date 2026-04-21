class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // bucket sort by frequency
        // buckets sorted by frequency
        // store numbers as a key:value mapping, num:freq
        // frequency equal to bucket index

        // bucket 0 has numbers with freq of 1


        int n = nums.length;
        List<List<Integer>> buckets = new ArrayList<>();

        buckets.add(new ArrayList<Integer>());

        HashMap<Integer, Integer> numFreq = new HashMap<>();

        for(int i = 0; i<n; i++){
            Integer num = nums[i];
            if(!numFreq.containsKey(num)){
                numFreq.put(num,1);
                buckets.get(0).add(num);
            } else{
                int prevFreq = numFreq.get(num);
                numFreq.put(num, prevFreq+1);
                
                // Remove num from old bucket and insert into new one
                buckets.get(prevFreq-1).remove(num);
                if(buckets.size() <= prevFreq){
                    buckets.add(new ArrayList<Integer>());
                }

                buckets.get(prevFreq).add(num);

            }
        }

        int[] output = new int[k];
        int rem = 0;
        while(rem < k){
            for(int i = buckets.size()-1; i>=0; i--){
                List<Integer> list = buckets.get(i);
                System.out.println(list);
                for(int g : list){
                    if(rem >= k) return output;
                    output[rem] = g;
                    rem++;
                }
            }
        }

        return output;
    }
}
