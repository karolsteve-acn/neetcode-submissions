class Solution {

    public String encode(List<String> strs) {
        var sb = new StringBuilder();
        for(var str : strs) {
            sb.append(String.format("%03d", str.length()));
            sb.append(str);
        }
        System.out.println(sb);
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList();
        while(str != "") {
            System.out.println(str);
            int length = Integer.parseInt(str.substring(0, 3));
            result.add(str.substring(3, length + 3));
            str = str.substring(length + 3);
        }
        return result;
    }
}
