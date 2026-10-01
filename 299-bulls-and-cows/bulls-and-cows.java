class Solution {
    public String getHint(String secret, String guess) {
        int bull=0;
        int cow=0;
        int[] scount=new int[10];
        int[] gcount=new int[10];
        for(int i=0;i<secret.length();i++){
            if(secret.charAt(i)==guess.charAt(i)){
                bull++;
            }
            else{
                scount[secret.charAt(i)-'0']++;
                gcount[guess.charAt(i)-'0']++;
            }
        }    
        
        for(int i=0;i<10;i++){
            cow+=Math.min(scount[i],gcount[i]);
        }
        return bull+"A"+cow+"B";
       
        }
}