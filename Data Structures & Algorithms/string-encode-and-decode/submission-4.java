class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(var s : strs) sb.append(s.length()).append('#').append(s);
        return sb.toString();
    }

    public List<String> decode(String str) {
        var r = new ArrayList<String>();
        int l = 0;
        while(l < str.length()) {
            int idx = str.indexOf("#", l);
            int size = Integer.parseInt(str.substring(l, idx));
            r.add(str.substring(idx + 1, idx + 1 + size));
            l = idx + size + 1;
        }
        return r;
    }
}
