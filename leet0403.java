
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class leet0403 {
    List<ListNode> ans = new ArrayList<>();
    public ListNode[] listOfDepth(TreeNode tree) {
        if (tree==null) {
            return new ListNode[0];
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(tree);
        while (!q.isEmpty()) {
            int length = q.size();
            ListNode curListNode = new ListNode(0);
            for (int i = 0; i < length; i++) {
                TreeNode curNode = q.poll();
                curListNode.val = curNode.val;
                if (i==length-1) {
                    curListNode.next = null;
                }else{
                    TreeNode nextNode = q.peek();
                    curListNode.next = new ListNode(nextNode.val);
                }
                if (i==0) {
                    ans.add(curListNode);
                }
                if (curNode.left!=null) {
                    q.add(curNode.left);
                }
                if (curNode.right!=null) {
                    q.add(curNode.right);
                }
                curListNode = curListNode.next;
            }
        }
        ListNode[] ansArr = new ListNode[ans.size()];
        for (int i = 0; i < ansArr.length; i++) {
            ansArr[i] = ans.get(i);
        }
        return ansArr;
    }
}
