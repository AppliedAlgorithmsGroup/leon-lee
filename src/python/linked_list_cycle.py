# -*- coding: utf-8 -*-
"""#141 Linked List Cycle (Easy).

(https://leetcode.com/problems/linked-list-cycle/#/description)

Given a linked list, determine if it has a cycle in it.

Follow up:
Can you solve it without using extra space?

"""


class ListNode(object):
    """Definition for singly-linked list."""

    def __init__(self, x):
        """Init list node."""
        self.val = x
        self.next = None


class LinkedListCycle:
    """Determine a linked list cycle status."""

    def has_cycle(self, head):
        """Determine a linked list cycle status.

        The algorithm below use tow pointers, with one pointer traversing the
        list with step two, while the other pointer traversing the list with
        step one. When there is a cycle in the list, the two pointers will be
        equal before reaching the end.

        Args:
            head (ListNode): a linked list.
        Returns:
            result (Boolean): cycle status of the list.
        """
        if head is None or head.next is None:
            return False
        pointer = head
        other_pointer = head
        while pointer and pointer.next:
            other_pointer = other_pointer.next
            pointer = pointer.next.next
            if pointer == other_pointer:
                return True
        return False
