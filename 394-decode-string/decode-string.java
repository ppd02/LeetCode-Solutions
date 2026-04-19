class Solution {
    public String decodeString(String s) {
        Stack<Integer> num = new Stack<>();
        Stack<StringBuffer> sequence = new Stack<>();
        StringBuffer result = new StringBuffer();
        int i = 0, number = 0;
        
        while(i < s.length()){
            if(Character.isDigit(s.charAt(i))){
                number = number*10 + (Character.getNumericValue(s.charAt(i)));
            }
            else if(s.charAt(i) == '['){
                num.push(number);
                number = 0;
                sequence.push(result);
                result = new StringBuffer();
            }
            else if(s.charAt(i) == ']'){
                int j = num.pop();
                StringBuffer temp = result;
                result = sequence.pop();
                while(j > 0){
                    result.append(temp);
                    j--;
                }
            }
            else{
                result.append(s.charAt(i));
            }
            i++;
        }
        
        return result.toString();
    }
}