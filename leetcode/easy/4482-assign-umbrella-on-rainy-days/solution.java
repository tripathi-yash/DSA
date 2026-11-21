class Solution {
    public String[] assignUmbrella(int[] rain) {
        
        int countAl = 0, countB = 0;
        String[] ans = new String[rain.length];

        for(int i=0; i<rain.length-1; i++){

            if(rain[i] == 0){
                ans[i] = "None";
            }
            else if(rain[i] == 1 && rain[i+1] == 1){

                if(countAl <= countB){
                    ans[i] = "Alice";
                    countAl++;
                }
                else{
                    ans[i] = "Bob";
                    countB++;
                }
            }
            else {
                    ans[i] = "Bob";
                    countB++;
            }
        }
        
        if(rain[rain.length-1] == 1){
            ans[rain.length-1] = "Bob";
        }
        else{
            ans[rain.length-1] = "None";
        }

        return ans;
    }
}