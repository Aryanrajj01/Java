class Solution{
public TreeNode InsertIntoBST(TreeNode root,TreeNode val){
 if(root==null){
return null;
}
  if(root.val>val){
root.left = InsertIntoBST(root.left,val);
}
  else{
root.right = InsertIntoBST(root.right,val);
}
return root;
}
}
