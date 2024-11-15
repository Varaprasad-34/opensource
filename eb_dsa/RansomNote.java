class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        HashMap<Character, Integer> map1 = new HashMap<Character,Integer>();
        HashMap<Character, Integer> map2 = new HashMap<Character,Integer>();
        for(char ch : ransomNote.toCharArray()){
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }
        for(char ch : magazine.toCharArray()){
            map2.put(ch,map2.getOrDefault(ch,0)+1);
        }
        System.out.println(map2 + " " + map1);
        for(int i = 0; i<ransomNote.length(); i++){
            char ch = ransomNote.charAt(i);
            if(map2.containsKey(ch) && map1.containsKey(ch)){
                int g1 = map1.get(ch);
                int g2 = map2.get(ch);
                if(g1 > g2){
                    return false;
                }
            }else{
                return false;
            }
        }
        return true;
    }
}
