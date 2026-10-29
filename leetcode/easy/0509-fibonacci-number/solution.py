class Solution:
    def fib(self, n: int) -> int:
        
        first = i = 0
        sec = 1
        nectTerm = 0

        while(i < n):
           
           nextTerm = first + sec
           first = sec
           sec = nextTerm

           i += 1

        return first

