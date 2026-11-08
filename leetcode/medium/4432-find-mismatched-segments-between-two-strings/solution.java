class Solution {
    public List<List<String>> findMismatchedSegments(String s1, String s2) {

        List<List<String>> ans = new ArrayList<>();

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        
        for(int i=0; i<s1.length(); i++){

            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);


            if(ch1 != ch2) {

                sb1.append(ch1);
                sb2.append(ch2);
            }
            else{

                if(sb1.length() > 0){
                    
                    List<String> curr = new ArrayList<>(2);
    
                    curr.add(sb1.toString());
                    curr.add(sb2.toString());
                    ans.add(curr);

                    sb1.setLength(0);
                    sb2.setLength(0);
                } 
            }
        }

        if(sb1.length() > 0){        
            List<String> curr = new ArrayList<>(2);
    
            curr.add(sb1.toString());
            curr.add(sb2.toString());
            ans.add(curr);
    
            sb1.setLength(0);
            sb2.setLength(0);
        }
        
    return ans;
    }
}