class Solution:
    def reverseList(self, head):
        prev = None
        curr = head

        while curr:
            # Save the next node
            next_node = curr.next

            # Reverse the pointer
            curr.next = prev

            # Move both pointers forward
            prev = curr
            curr = next_node

        return prev