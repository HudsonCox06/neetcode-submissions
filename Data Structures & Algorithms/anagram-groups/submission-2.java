class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // check anagram using 26 length list
        // use signature of list as key into seperate list?

        List<Integer> ana;
        List<List<String>> groups = new ArrayList<>();
        // first use hashmap to group strings by key
        HashMap<List<Integer>, List<String>> map = new HashMap<>();  

        for(String str : strs){
            ana = new ArrayList<>();
            for(int i = 0; i < 26; i++){
                ana.add(0);
            }
            for(int i = 0; i < str.length(); i++){
                int index = str.charAt(i) - 'a';
                ana.set(index, ana.get(index)+1);
            }
            // get signature of list
            if(map.containsKey(ana)){
                List<String> newList = map.get(ana);
                newList.add(str);
                map.put(ana, newList);
            } else{
                List<String> newList = new ArrayList<String>();
                newList.add(str);
                map.put(ana, newList);
            }
            
        }

        return new ArrayList<>(map.values());
    }
}
