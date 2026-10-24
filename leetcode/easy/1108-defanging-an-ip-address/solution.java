 class Solution {
    public String defangIPaddr(String address) {
        
        // String[] arr = address.split("\\.");
        // return String.join("[.]", arr);

        char[] chArr = new char[(address.length() + (3 * 2))];
        int pointer = 0;
        
        for(int i=0; i<address.length(); i++){
            
            char ch = address.charAt(i);

            if(ch == '.'){

                chArr[pointer++] = '[';
                chArr[pointer++] = '.';
                chArr[pointer++] = ']';
            }
            else chArr[pointer++] = ch;
        }

        return new String(chArr);

    }
}