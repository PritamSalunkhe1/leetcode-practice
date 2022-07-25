class Solution {
    
    
    
     public static int numSquare(int n){
        int sq = 0;
        while(n!=0){
            sq += (n%10) * (n%10);
            n/=10;
        }
        return sq;
    }
    
    
    
    public boolean isHappy(int n) {
        
        
        HashSet<Integer> set = new HashSet<>();
        
        while(true){
            n = numSquare(n);
            if(n==1){
                return true;
            }
            if(set.contains(n)){
                return false;
            }
            set.add(n);
        }
        
        
        
        
        
        
    }
    
    
    
    
   
    
    
    
    
}