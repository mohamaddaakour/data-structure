# this algorithm is called two pointers because we have two pointer
# here start and end
def is_palindrome(text: str) -> bool:
    start: int = 0
    end: int = len(text) - 1

    while start < end:
        if text[start] != text[end]:
            return False

        start +=1
        end -= 1
    
    return True

print(is_palindrome("level"))
print(is_palindrome("hello"))
print(is_palindrome(""))
print(is_palindrome("x"))