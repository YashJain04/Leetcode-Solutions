# Definition for singly-linked list.
class ListNode:
    def __init__(self, val = 0, next = None):
        self.val = val
        self.next = next

class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:

        if list1 is None: return list2
        if list2 is None: return list1
        if list1 is None and list2 is None: return None

        dummyNode = ListNode(0)
        currentNode = dummyNode

        while list1 and list2:
            if list1.val <= list2.val:
                currentNode.next = ListNode(list1.val)
                currentNode = currentNode.next

                if list1:
                    list1 = list1.next

            elif list2.val <= list1.val:
                currentNode.next = ListNode(list2.val)
                currentNode = currentNode.next

                if list2:
                    list2 = list2.next
        
        while list1:
            currentNode.next = ListNode(list1.val)
            currentNode = currentNode.next

            if list1:
                list1 = list1.next

        while list2:
            currentNode.next = ListNode(list2.val)
            currentNode = currentNode.next

            if list2:
                list2 = list2.next

        return dummyNode.next