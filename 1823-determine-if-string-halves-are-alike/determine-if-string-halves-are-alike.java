class Solution {
    public boolean halvesAreAlike(String s) {
        StringBuffer a = new StringBuffer();
        StringBuffer b = new StringBuffer();
        int i, countA = 0, countB = 0;
        for(i=0; i<s.length()/2; i++){
            a.append(s.charAt(i));
        }
        for(i=s.length()/2; i<s.length(); i++){
            b.append(s.charAt(i));
        }

        for(int j=0;j<a.length();j++){
            if(isVowel(a.charAt(j))){
                countA++;
            }
        }

        for(int j=0;j<b.length();j++){
            if(isVowel(b.charAt(j))){
                countB++;
            }
        }

        if(countA == countB){
            return true;
        }
        return false;
    }
    
    private boolean isVowel(Character c){
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
            c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U');
    }
}
