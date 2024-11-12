class Solution {
    public int firstUniqChar(String s) {
       int n = s.length();
       Map<Character,Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i = 0; i< n;i++){
            int freq = map.get(s.charAt(i));
            if(freq == 1) return i;
        }
        return -1;
    }
}
