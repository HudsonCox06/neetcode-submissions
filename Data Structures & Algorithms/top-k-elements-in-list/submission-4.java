class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // bucket sort?
        // sort each letter into bucket 0, upon encountering that letter
        // move the letter into the next bucket

        // how to find current bucket? use hashmap

        // index 0 in buckets represents bucket of length 1
        List<List<Integer>> buckets = new ArrayList<>();
        List<Integer> first = new ArrayList<>();
        buckets.add(first);
        HashMap<Integer, Integer> map = new HashMap<>();

        // one pass to fill map first, or do both as we go?
        // do as we go, so that we can order buckets correctly

        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            if(!map.containsKey(num)){
                map.put(num, 1);
                // add to 1 bucket  
                List<Integer> newBucket = buckets.get(0);
                newBucket.add(num);
                buckets.set(0, newBucket);
            } else{
                map.put(num, map.get(num)+1);
                // get index of current bucket (map value - 1)
                // remove from current bucket
                // add to new bucket
                int oldIndex = map.get(num)-2;
                List<Integer> newBucket = buckets.get(oldIndex);
                newBucket.remove(newBucket.indexOf(num));
                buckets.set(oldIndex, newBucket);

                // check that new bucket exists
                if(buckets.size()>oldIndex+1){
                    newBucket = buckets.get(oldIndex+1);
                    newBucket.add(num);
                    buckets.set(oldIndex+1, newBucket);
                } else{
                    newBucket = new ArrayList<>();
                    newBucket.add(num);
                    buckets.add(newBucket);
                }
                
                
            } 
        }

        // take largest bucket and start filling array of length k
        int[] arr = new int[k];
        int currentInd = 0;
        for(int i = buckets.size()-1; i>=0; i--){
            // get current biggest bucket
            List<Integer> biggest = buckets.get(i);
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
