class Solution {

    public String encode(List<String> strs) {
        // use length as identifier, store #{length} before each word
        StringBuilder encodedStr = new StringBuilder();
        for(String str : strs){
            int len = str.length();
            encodedStr.append(len+"#"+str);
        }

        return encodedStr.toString();
    }

    public List<String> decode(String str) {
        List<String> decodedStr = new ArrayList<>();
        StringBuilder decoded = new StringBuilder();

        // # = 35, 0 = 48, 9 = 57
        for(int i = 0; i<str.length(); i++){
            char c = str.charAt(i);
            if(c >= 48 && c <= 57){
                decoded.append(c);
            } else if(decoded.length() != 0 && c == 35){
                int len = Integer.valueOf(decoded.toString());
                if(len>0){
                    decodedStr.add(str.substring(i+1,i+len+1));
                } else{
                    decodedStr.add("");
                }
                
                i += len;
                decoded.setLength(0);
                len = 0;
            }
        }

        return decodedStr;
    }
}
