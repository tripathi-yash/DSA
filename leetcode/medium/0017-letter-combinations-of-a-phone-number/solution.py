class Solution:

    phone = ["", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"]

    def solve(self,idx,digits,ans,curr):

        if not digits:
            return []

        if idx == len(digits):
            ans.append(curr)
            return

        j = ord(digits[idx]) - ord('0')

        temp = self.phone[j]

        for i in range(len(temp)):

            curr += temp[i]
            self.solve(idx+1,digits,ans,curr)
            curr = curr[:len(curr)-1]

    def letterCombinations(self, digits: str) -> list[str]:
        
        ans = []
        curr = ""

        self.solve(0,digits,ans,curr)

        return ans