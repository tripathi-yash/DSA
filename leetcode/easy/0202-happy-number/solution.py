class Solution:
    def isHappy(self, n: int) -> bool:
        
        track = set()

        while (n != 1):
            
            if n in track:
                return False 

            track.add(n)
            ans = 0

            while(n != 0):
                rem = n % 10
                ans += rem * rem
                n //= 10

            n = ans

        return True
