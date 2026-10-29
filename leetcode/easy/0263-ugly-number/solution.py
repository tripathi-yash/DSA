class Solution:
    def isUgly(self, n: int) -> bool:
        
        if(n <= 0):
            return False

        i = 2

        while( i*i <= n):

            if((n%i) == 0 and ((n // i) % 2 != 0 )):
                if(i not in [2,3,5] or n // i not in [2,3,5]):
                   return False
            
            i += 1

        return True

  