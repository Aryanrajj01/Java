/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> li1=new ArrayList<>();
        Queue<TreeNode> que = new LinkedList<>();
				if(root==null){
					return li1;
				}
		que.add(root);
		int ans=0;
        int a=Integer.MIN_VALUE;
		while (!que.isEmpty()) {
			if(ans==0){
				ans=que.size();
			}
			TreeNode nn = que.peek();
			if (nn.left!= null) {
				que.add(nn.left);
			}
			if (nn.right != null) {
				que.add(nn.right);
			}
           // li1.add(nn.val);
           a=Math.max(a,nn.val);
			que.poll();
			ans--;
			if(ans==0){
				li1.add(a);
				a=Integer.MIN_VALUE;
			}

		}
        return li1;
		}

    }
    
