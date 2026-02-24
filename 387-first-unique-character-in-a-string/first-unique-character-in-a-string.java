class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> freq = new HashMap<>();
    ArrayList<Character> arr = new ArrayList<>();
    
    for(char c:s.toCharArray()){
      freq.put(c, freq.getOrDefault(c, 0) + 1);
    }
    
    for(char c:freq.keySet()){
      if(freq.get(c) == 1){
        arr.add(c);    
      }
    }
    
    for(int i=0;i<s.length();i++){
      if(arr.contains(s.charAt(i))){
        return i;
      }
    }
    
    return -1;
    }
}