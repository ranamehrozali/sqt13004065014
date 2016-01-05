
package bstjava;


public class link {
    bstnode root;
    
    public link(){
       root=null;
    }
     public boolean isEmpty()
     {
         return root == null;
     }
    
  public void insert(int data)
     {
         root = insert(root, data);
     }
     
     private bstnode insert(bstnode node, int data)
     {
         if (node == null)
             node = new bstnode(data);
         else
         {
             if (data <= node.getData())
                 node.left = insert(node.left, data);
             else
                 node.right = insert(node.right, data);
         }
         return node;
     }
        public boolean search(int val)
     {
         return search(root, val);
     }
    
     private boolean search(bstnode r, int val)
     {
         boolean found = false;
         while ((r != null) && !found)
         {
             int rval = r.getData();
             if (val < rval)
                 r = r.getleft();
             else if (val > rval)
                 r = r.getright();
             else
             {
                 found = true;
                 break;
             }
             found = search(r, val);
         }
         return found;
     }
   
  public void delete(int k)
     {
         if (isEmpty())
             System.out.println("Tree Empty");
         else if (search(k) == false)
             System.out.println("Sorry "+ k +" is not present");
         else
         {
             root = delete(root, k);
             System.out.println(k+ " deleted from the tree");
         }
     }
   private bstnode delete(bstnode root, int k)
     {
         bstnode p, p2, n;
         if (root.getData() == k)
         {
             bstnode lt, rt;
             lt = root.getleft();
             rt = root.getright();
             if (lt == null && rt == null)
                 return null;
             else if (lt == null)
             {
                 p = rt;
                 return p;
             }
             else if (rt == null)
             {
                 p = lt;
                 return p;
             }
             else
             {
                 p2 = rt;
                 p = rt;
                 while (p.getleft() != null)
                     p = p.getleft();
                 p.setleft(lt);
                 return p2;
             }
         }
         if (k < root.getData())
         {
             n = delete(root.getleft(), k);
             root.setleft(n);
         }
         else
         {
             n = delete(root.getright(), k);
             root.setright(n);             
         }
         return root;
     }
      public int countNodes()
     {
         return countNodes(root);
     }
    
     private int countNodes(bstnode r)
     {
         if (r == null)
             return 0;
         else
         {
             int l = 1;
             l += countNodes(r.getleft());
             l += countNodes(r.getright());
             return l;
         }
     }
    public void inorder()
     {
         inorder(root);
     }
     private void inorder(bstnode r)
     {
         if (r != null)
         {
             inorder(r.getleft());
             System.out.print(r.getData() +" ");
             inorder(r.getright());
         }
     }
      public void preorder()
     {
         preorder(root);
     }
     private void preorder(bstnode r)
     {
         if (r != null)
         {
             System.out.print(r.getData() +" ");
             preorder(r.getleft());             
             preorder(r.getright());
         }
     }
     public void postorder()
     {
         postorder(root);
     }
     private void postorder(bstnode r)
     {
         if (r != null)
         {
             postorder(r.getleft());             
             postorder(r.getright());
             System.out.print(r.getData() +" ");
         }
     } 
}