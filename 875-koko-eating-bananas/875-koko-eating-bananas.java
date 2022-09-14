class Solution 
{
    public int minEatingSpeed(int[] piles, int h) 
    {
        int low = 1;
        int max = 0;
        
		//finding the upper limit O(n)
        for(int i: piles)
            max = Math.max(i, max);
        
        int high = max;
        int ans = -1;
        
		//O(log(max(piles))
        while(low <= high)
        {
            int mid = low + (high - low)/2;
            if(isPossible(piles, h ,mid)) //if ans with mid was possible, we should explore values < mid it as well.
            {
                ans = mid;
                high = mid-1;
            }
            else // ans with mid wasn't possible, so we only explore values > mid
            {
                low = mid+1;
            }
        }
        return ans;
    }
    
    public boolean isPossible(int[] arr, int h, int k)
    {
        int i = 0;
        while(h > 0 && i < arr.length)
        {
            int x = arr[i];
            h -= (int)Math.ceil((double)x/(double)k);
            if(h < 0)
                return false;
            i++;
        }
        if(i == arr.length)
            return true;
        return false;
    }
}