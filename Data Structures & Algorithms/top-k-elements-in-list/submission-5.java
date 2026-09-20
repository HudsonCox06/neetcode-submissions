class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // bucket sort?
        // sort each letter into bucket 0, upon encountering that letter
        // move the letter into the next bucket

        // how to find current bucket? use hashmap

        // index 0 in buckets represents bucket of length 1
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        // use array for buckets for easy access by index, then convert at the end
        // max of n buckets
        List<Integer>[] buckets = new ArrayList[n];

        for(int i = 0; i < n; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            } else{
                map.put(nums[i], 1);
            }
        }

        // loop through key set
        Set<Integer> set = map.keySet();
        for(Integer num : set){
            int val = map.get(num);
            // place in corresponsing bucket
            // how to get bucket by index?
            // if bucket doesn't exist yet, make it
            if(buckets[val-1] == null){
                List<Integer> newBucket = new ArrayList<>();
                newBucket.add(num);
                buckets[val-1] = newBucket;
            } else{
                // get bucket, add number, add back into buckets
                List<Integer> newBucket = buckets[val-1];
                newBucket.add(num);
                buckets[val-1] = newBucket;
            }
        }

        // take largest bucket and start filling array of length k
        int[] arr = new int[k];
        int currentInd = 0;
        for(int i = n-1; i>=0; i--){
            // get current biggest bucket
            List<Integer> biggest = buckets[i];
            if(biggest == null){
                continue;
            }
            for(Integer j : biggest){
                arr[currentInd] = j;
                currentInd++;
                if(currentInd>=k){
                    return arr;
                }
            }
        }



        return arr;


        
    }
}
