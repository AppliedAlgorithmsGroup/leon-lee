from python.linked_list_cycle import LinkedListCycle, ListNode

def determine_list_cycle_test():
    list_node = ListNode(3)
    list_node.next = ListNode(5)
    list_node.next.next = ListNode(5)
    list_node.next.next.next = list_node.next
    linked_list_cycle = LinkedListCycle()
    assert linked_list_cycle.has_cycle(list_node) == True

    another_list_node = ListNode(3)
    another_list_node.next = ListNode(5)
    another_list_node.next.next = ListNode(5)
    assert linked_list_cycle.has_cycle(another_list_node) == False

    list_node_three = ListNode(3)
    assert linked_list_cycle.has_cycle(list_node_three) == False
