package IntCode;


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

	public class ListNodeCycleCheck {
		
		
	    public boolean hasCycle(List head) {
	        if (head == null || head.next == null) {
	            return false;
	        }

	        List slow = head;
	        List fast = head;

	        while (fast != null && fast.next != null) {
	            slow = slow.next;          // Move slow pointer by 1 step
	            fast = fast.next.next;     // Move fast pointer by 2 steps

	            if (slow == fast) {        // If slow and fast meet, there's a cycle
	                return true;
	            }
	        }

	        return false;  // No cycle found
	    }
	}