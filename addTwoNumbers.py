# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        dummyNode = ListNode(0)
        currentNode = dummyNode
        carry = 0

        while l1 != None or l2 != None or carry != 0:
            if l1 != None:
                valueOne = l1.val
            
            else:
                valueOne = 0

            if l2 != None:
                valueTwo = l2.val
            
            else:
                valueTwo = 0

            totalSum = valueOne + valueTwo + carry
            digit = totalSum % 10
            carry = totalSum // 10

            currentNode.next = ListNode(digit)
            currentNode = currentNode.next

            if l1 is not None:
                l1 = l1.next
            
            if l2 is not None:
                l2 = l2.next

        return dummyNode.next