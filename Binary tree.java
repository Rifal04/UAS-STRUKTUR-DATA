class BinaryTree { 
   
    
    class Node { 
        int key; 
        Node left, right; 
   
        public Node(int item) { 
            key = item; 
            left = right = null; 
        } 
    } 
   
    Node root; 
   
    BinaryTree() {  
        root = null;  
    } 
   
    void insert(int key) { 
       root = insertRec(root, key); 
    } 
       
    Node insertRec(Node root, int key) { 
   
        if (root == null) { 
            root = new Node(key); 
            return root; 
        } 
   
        if (key < root.key) 
            root.left = insertRec(root.left, key); 
        else if (key > root.key) 
            root.right = insertRec(root.right, key); 
   
        return root; 
    } 
   
    void inorder()  { 
       inorderRec(root); 
    } 
   
    void inorderRec(Node root) { 
        if (root != null) { 
            inorderRec(root.left); 
            System.out.println(root.key); 
            inorderRec(root.right); 
        } 
    } 
   
    public static void main(String[] args) { 
        BinaryTree tree = new BinaryTree(); 
   
        tree.insert(900); 
        tree.insert(100); 
        tree.insert(250); 
        tree.insert(450); 
        tree.insert(700); 
        tree.insert(200); 
        tree.insert(350); 
   
        tree.inorder(); 
    } 
} 