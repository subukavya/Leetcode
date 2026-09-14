class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        int n=s.length();
        Map<String,Integer> map=new HashMap<>();
        List<String> array=new ArrayList<>();
        for(int i=0;i<=n-10;i++){
            
                String sub=s.substring(i,i+10);
                map.put(sub,map.getOrDefault(sub,0)+1);
            
        }
        for(String sub :map.keySet()){
            if(map.get(sub)>1)
            array.add(sub);
        }
        return array;
    }
}