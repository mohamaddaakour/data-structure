# You are given an integer n representing the number of steps to reach the top of a staircase.
# You can climb with either 1 or 2 steps at a time.
# Return the number of distinct ways to climb to the top of the staircase.

class Solution:
    def climbStairs(self, n: int) -> int:
        if n <= 2:
            return n

        first = 1   # ways to reach step 1
        second = 2  # ways to reach step 2

        for _ in range(3, n + 1):
            current = first + second
            first = second
            second = current

        return second