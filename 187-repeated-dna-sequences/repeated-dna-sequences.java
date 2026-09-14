class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        int n=s.length();
        Map<Integer,Integer> map=new HashMap<>();
        List<String> array=new ArrayList<>();
        int hash=0;
        if(n<10)
        return array;
        for(int i=0;i<10;i++)
        {
            int x;
            if(s.charAt(i)=='A')
            x=0;
            else if(s.charAt(i)=='C')
            x=1;
            else if(s.charAt(i)=='G')
            x=2;
            else
            x=3;
            hash=(hash<<2) | x;
        }
        map.put(hash,1);
        for(int i=10;i<n;i++){
            int x;
            if(s.charAt(i)=='A')
            x=0;
            else if(s.charAt(i)=='C')
            x=1;
            else if(s.charAt(i)=='G')
            x=2;
            else
            x=3;
            hash=hash&((1<<18)-1);
            hash=(hash<<2)|x;
            map.put(hash,map.getOrDefault(hash,0)+1);
            if(map.get(hash)==2)
            array.add(s.substring(i-9,i+1));
        }
        return array;
    }
}