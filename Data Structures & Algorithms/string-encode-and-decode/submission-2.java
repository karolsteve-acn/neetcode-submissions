class Solution {

    public String encode(List<String> strs) {
        var sb = new StringBuilder();
        for(var str : strs) {
            sb.append(str.length()).append('@').append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList();
        int i = 0;
        while(i < str.length()) {
            int atIndex = str.indexOf('@', i);
            int length = Integer.parseInt(str.substring(i, atIndex));
            int beginPos = atIndex + 1;
            int endPos = beginPos + length;
            String chunk = str.substring(beginPos, endPos);
            result.add(chunk);
            i = endPos;
        }
        return result;
    }
}
