class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }   

        int temp = x, rev = 0;
        while(x > 0){
            int dig = x % 10;
            rev = rev*10 + dig;
            x = x / 10;
        }

        if(temp == rev){
            return true;
        }
        return false;
    }
}