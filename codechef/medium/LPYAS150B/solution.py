def check_palindrome(s):
    # Complete the function
    
    start = 0
    end = len(s)-1
    
    while(start < end):
        
        if(s[start] != s[end]):
            return False
            
        start += 1
        end -= 1
    
    return True

def main():
    test_cases = int(input())
    # Complete the function
    
    while(test_cases > 0):
        
        s = input()
        
        if check_palindrome(s):
            print("Yes")
        else:
            print("No")
        
        test_cases -= 1

if __name__ == "__main__":
    main()