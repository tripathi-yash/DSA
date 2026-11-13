class Solution:
    def selfDividingNumbers(self, left: int, right: int) -> list[int]:
        
        ans = []

        for i in range(left, right+1):
            temp = i

            isSelfDiv = True
            while(temp != 0):
                rem = temp % 10

                if((rem != 0) and ((i % rem) == 0) ):
                    temp //= 10
                    
                else:
                    isSelfDiv = False
                    break

            if(isSelfDiv):
                ans.append(i)

        return ans
