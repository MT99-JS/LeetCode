class Solution {
    public boolean isValid(String s) {

        Stack<Character> ch = new Stack<>();

        for(char c:s.toCharArray()){
            if(c=='(' || c=='{' || c=='['){
                ch.push(c);
            }
            else{
                if(ch.isEmpty()){
                    return false;
                }

                char top = ch.pop();

                if(c==')' && top!='(') return false;
                if(c=='}' && top!='{') return false;
                if(c==']' && top!='[') return false;


            }
        }

        return ch.isEmpty();
        
    }
}