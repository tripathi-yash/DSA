class Solution {
    public String interpret(String command) {
        
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<command.length(); i++){
            
            char ch = command.charAt(i);
            // char chNext = command.charAt(i+1);

            if(ch == '(' && command.charAt(i+1) == ')'){
                sb.append('o');
                i += 1;
            }  
            else if(ch == '(' && command.charAt(i+1) == 'a'){
                sb.append("al");
                i += 3;
            }
            else sb.append(ch);

        }

        return sb.toString();
    }
}