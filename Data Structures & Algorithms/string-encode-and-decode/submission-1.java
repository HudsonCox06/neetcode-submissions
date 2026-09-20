class Solution {

    public String encode(List<String> strs) {
        // what to use as buffer?
        // use length# as length of next substring
        StringBuilder encoded = new StringBuilder();
        for(String str : strs){
            encoded.append(str.length()+"#"+str);
        }
        return encoded.toString();
    }

    public List<String> decode(String str) {
        List<String> decoded = new ArrayList<>();
        // if encountered .#. stop previous string and begin new one

        char[] arr = str.toCharArray();
        StringBuilder len;
        for(int i = 0; i < str.length(); i++){
            len = new StringBuilder();
            while(arr[i] != '#'){
                len.append(arr[i]);
                i++;
            }
            int length = Integer.valueOf(len.toString());
            decoded.add(str.substring(i+1, i+length+1));
            i += length;
        }

        return decoded;

    }
}
