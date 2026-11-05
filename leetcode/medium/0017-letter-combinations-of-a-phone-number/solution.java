class Solution {
    
    String[] phone = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public void solve(int index, String digits, List<String> ans, StringBuilder curr){
        
        if(index == digits.length()){
            String temp = curr.toString();
            ans.add(temp);
            return;
        }
        
        int j = digits.charAt(index) - '0';

        String sc = phone[j];

        for(int i=0; i<sc.length(); i++){
            curr.append(sc.charAt(i));
            solve(index+1, digits, ans, curr);

            curr.deleteCharAt(curr.length()-1);
        }
    }
    public List<String> letterCombinations(String digits) {
        
        List<String> ans = new ArrayList<>();
        StringBuilder curr = new StringBuilder();

        solve(0,  digits, ans, curr);

        return ans;
    }
}