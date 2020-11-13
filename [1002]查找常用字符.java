
class Solution {
    public List<String> commonChars(String[] A) {
        //判空
        if(A.length == 0 )return null;
        Map<Character,Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        //把第一组数据作为对照模板。key存字符，value存key出现次数。
        for(Character c : A[0].toCharArray()){
            map.put(c,map.getOrDefault(c, 0) + 1);
        }
        //从第二组开始遍历
        int i = 1;
        while (i < A.length) {
            //
            Map<Character,Integer> map2 = new HashMap<>();
            for (Character c : A[i].toCharArray()) {
                if (map.containsKey(c)) {
                    map2.put(c, Math.min(map2.getOrDefault(c, 0)+1,map.get(c)));
                }
            }
            i++;
            map = map2;
        }
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            int value = entry.getValue();
            for(int j = 0;j < value;j++) {
                list.add(String.valueOf(entry.getKey()));
            }
        }
        return list;
    }
}