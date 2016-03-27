package solutions;

/**
 * Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.
 *
 * @see <a href="https://leetcode.com/problems/merge-k-sorted-lists/">23. Merge k Sorted Lists</a>
 */
public class Solution023 {
    public ListNode mergeKLists(ListNode[] lists) {
        Merge merge = new Merge(lists);
        ListNode merged = merge.next();
        ListNode result = merged;
        ListNode node;
        while ((node = merge.next()) != null) {
            merged.next = node;
            merged = merged.next;
        }
        return result;
    }

    private static class Merge {
        private final ListNode[] lists;
        private SortedNode sortedNode = null;

        private Merge(ListNode[] lists) {
            this.lists = lists;
            SortedNode prev = null;
            for (ListNode node : lists) {
                if (node != null) {
                    if (sortedNode == null) {
                        sortedNode = new SortedNode(node, null);
                        prev = sortedNode;
                    } else {
                        prev = new SortedNode(node, prev);
                    }
                }
            }
        }

        private ListNode next() {
            ListNode next = sortedNode == null ? null : sortedNode.next();
            if (sortedNode != null && sortedNode.node == null) {
                sortedNode = sortedNode.next;
            }
            return next;
        }
    }

    private static class SortedNode {
        private ListNode node;
        private SortedNode next;
        private SortedNode prev;

        private SortedNode(ListNode node, SortedNode sortedNode) {
            this.node = node;
            if (sortedNode != null) {
                while (sortedNode.next != null) {
                    sortedNode = sortedNode.next;
                }
                prev = sortedNode;
                sortedNode.next = this;
                sort();
            }
        }

        private ListNode next() {
            if (node != null) {
                ListNode next = node;
                node = node.next;
                next.next = null;
                sort();
                return next;
            } else {
                return null;
            }
        }

        private void sort() {
            if (node != null) {
                if (next != null && next.node != null && node.val > next.node.val) {
                    SortedNode n = next;
                    while (n != null && n.node != null && n.prev.node.val > n.node.val) {
                        ListNode hold = n.node;
                        n.node = n.prev.node;
                        n.prev.node = hold;
                        n = n.next;
                    }
                } else if (prev != null && prev.node != null && node.val < prev.node.val) {
                    SortedNode p = prev;
                    while (p != null && p.node != null && p.next.node.val < p.node.val) {
                        ListNode hold = p.node;
                        p.node = p.next.node;
                        p.next.node = hold;
                        p = p.prev;
                    }
                }
            }
        }

        @Override
        public String toString() {
            return String.format("%s[%s]", getClass().getSimpleName(), node);
        }
    }
}
//
//        private ListNode nextBruteForce() {
//            ListNode min = null;
//            int i = -1;
//            for (int l = 0; l < lists.length; l++) {
//                if (lists[l] != null) {
//                    if (min == null || lists[l].val < min.val) {
//                        min = lists[l];
//                        i = l;
//                    }
//                }
//            }
//            if (i >= 0 && min != null) {
//                lists[i] = lists[i].next;
//                min.next = null;
//            }
//            return min;
//        }
