public class Tree {
    class Node {
        private float value;
        private Node LeftChild;
        private Node RightChild;

        public Node(float x){
            this.value = x;
        }

        @Override
        public String toString(){
            return "Node = "+value;
        }
    }

    private Node Root;

    public void insert(float value){
        if(Root == null){
            Root = new Node(value);
            return;
        }
        Node current = Root;
        while(true){
            if(value < current.value){
                if(current.LeftChild == null){
                    current.LeftChild = new Node(value);
                    break;
                }
                current = current.LeftChild;
            }else{
                if(current.RightChild == null){
                    current.RightChild = new Node(value);
                    break;
                }
                current = current.RightChild;

            }
        }
    }

    public boolean findFloat(float value){
        Node current = Root;
        while(current != null){
            if(value < current.value)
            {
                current = current.LeftChild;
            }else if( value > current.value){
                current = current.RightChild;
            }else{
                return true;
            }

        }


        return false;
    }

    public void traversePreOrder(){
        TraversePreOrder(Root);
    }
    public void traverseInOrder(){
        TraverseInOrder(Root);
    }
    public void traversePostOrder(){
        TraversePostOrder(Root);
    }

    private void TraversePreOrder(Node root){
        if(root == null){ return;}

        System.out.println(root.value);
        TraversePreOrder(root.LeftChild);
        TraversePreOrder(root.RightChild);
    }
    private void TraverseInOrder(Node root){
        if(root == null){ return;}

        TraverseInOrder(root.LeftChild);
        System.out.println(root.value);
        TraverseInOrder(root.RightChild);
    }
    private void TraversePostOrder(Node root){
        if(root == null){ return;}

        TraversePostOrder(root.LeftChild);
        TraversePostOrder(root.RightChild);
        System.out.println(root.value);
    }

    public int height(){
        return height(Root);
    }
    private int height(Node root){
        if(root == null)
            return -1;//return if empty
        else if(root.LeftChild == null && root.RightChild == null)
            return 0;//leaf node
        return  1+Math.max( height( root.LeftChild ),height( root.RightChild ) );
    }


    public float max(){  //
        return Max(Root);
    }
    private float Max(Node root){
        if(root == null){
            throw new IllegalStateException();
        }
        Node current = root;
        Node Last = current;
        while(current != null){
            Last = current;
            current = current.RightChild;
        }

        return Last.value;
    }



}