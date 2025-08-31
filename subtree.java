public class subtree {
    public static class node{
        int data;
        node right;
        node left;
        public node(int data){
            this.data=data;
            this.right=null;
            this.left=null;

        }
    }
        public static boolean isIdentical(node node,node subRoot){
            if(node==null && subRoot==null){
                return true;
            }else if(node==null || subRoot==null || node.data!=subRoot.data){
                return false;
            }
            if(!isIdentical(node.left, subRoot.left)){
                return false;
            }
            if(!isIdentical(node.right, subRoot.right)){
                return false;
            }
            return true;
        }
        public static boolean isSubtree(node root,node subRoot){
            if(root==null){
                return false;
            }
            if(root.data==subRoot.data){
                if(isIdentical(root,subRoot)){
                    return true;
                }
            }
              return isSubtree(root.left, subRoot)|| isSubtree(root.right,subRoot);
        }
      
    
    public static void main(String[] args) {
        node root=new node(1);
         root.left=new node(2);
        root.right=new node(3);
        root.left.left=new node(9);
        root.left.right=new node(5);
        root.right.right=new node(7);
         root.right.left=new node(6);
         
         node subRoot=new node(2);
         subRoot.left=new node(4);
         subRoot.right=new node(5);
         System.out.print(isSubtree(root,subRoot));
        
    }
    
}
