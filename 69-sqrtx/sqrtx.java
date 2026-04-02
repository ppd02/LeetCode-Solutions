class Solution {
    public int mySqrt(int x) {      
        if(x==1 || x==0){
            return x;
        }

        long low = 0, high = x, res = -1;

        while(low <= high){
            long mid = (low + high) / 2;
            long midsq = mid*mid;

            if(midsq == x)
                return (int)mid;
            else if(midsq > x)
                high = mid-1;
            else{
                res = mid;
                low = mid+1;
            }
        }
                
        return (int)res;
    }
}