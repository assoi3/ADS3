package src.example;


public class BST< Key extends Comparable<Key>,Value>{


    private Node root;

    private class Node{

        private Key key;
        private Value val;
        private Node left, right;
        private int N;


        public Node(Key key, Value val , int N){
            this.key = key;
            this.val =val;
            this.N = N;
        }


        public void put(Key key, Value val){
            root = put(root, key ,val);
        }



        public void put(Node x, Key key, Value val){
            if(x == null) return new Node(key, val, 1);
            int cmp = key.compareTo(x.key);
            if (cmp < 0) x.left = put(x.left, key,val);
            else if (cmp > 0 ) x.right = put(x.right, key, val);
            else x.val = val;
            x.N = size(x.left) + size(x.right) + 1;
            return x;
        }


        public int size(){
            return size(root);
        }


        private int size(Node x){
            if(x == null) return 0;
            else return x.N;
        }




        public Value get(Key key){

            Node x = root;
            while(x !=  null){
                int cmp = key.compareTo((Key) x.key);
                if ( cmp == 0) return (Value) x.val;
                else if(cmp < 0) x = x.left;
                else x = x.right;
            }

            return null;
        }








      /*  public void delete(Key key) {
            root = delete(root, key);
        } */



        public void deleteNode(Key key){
            root = deleteNode(key,root);
        }



        Node deleteNode(Key key, Node x) {
            if(x == null){
                return null;
            }
        
        
        
        // Implement a traverse function 
        if(key < x.data){
            x.left = delteNode(key, x.left);}
        else if (key> node.data){
            x.right = deletNode(key, x.right);
        }
        

       // If node has no children just delete it 
        else if (x.left == null && x.right == null) {
            node == null;
        }


        else if (x.left == null){
            node = node.right;
        } else if (x.right == null){
            node = x.left;}



        // If node has more than 1 children use different method ...

        return node;
        }


        public void deleteNode(Key key){
            Node node = root;
            Node parent = null;


            //Find the node to be deleted
            while (node != null && node.data != key){

                //Traverse the tree to the left or right depending on the key
                parent = node;
                if (key < node.data){
                  node = node.left;
            } else {
                node = node.right;
            }
            //Node not found?

            if(node == null){
                return;
            }

            //At this point, "node" is the node to be deleted 


            //If node lasts with one chid 


            if (node.left == null || node.right == null){
                // Implement func
            }



            /*else {
                deleteNodeWithTwoChildren(node);
            }*/



        public Iterable<Key> keys() {
            return keys(min(), max());
        }

//            return keys(min(), max());
        @Override
        public String toString(){
            String result = value + "";
            if(leftNode != null ) result = leftNode.toString() + "-" + result;

            if (rightNode != null) result = result + "-" + rightNode.toString();
            return result;
        }




        public void insertNode(int key){
            Node newNode = new Node(key);

            if(root == null){
                root = newNode;
                return;
            
        }
            Node node =root;
            while(true){

                if(key< node.data){
                    if(node.left != null){
                        node = node.left;
                    } else{
                        node.left = newNode;
                        return;
                    }
                } else if(key > node.data){
                    if(node.right != null) {
                        node = node.right;
                    } else{

                        node.right = newNode;
                        return;
                    }
                } else {

                    throw new IllegalArgumentExcemtionz("BST already contains a node with key " + key);
                }
                
            }



    }


}
}


public static void main(String[] args) {
    BST<Integer, Integer> bit = new BST<>();
    bit.put(100, 100);
    bit.put(45, 45);
    bit.put(20, 20);
    bit.put(95, 95);

    bit.entries().forEach(entry -> 
    
          System.out.println("Key is " + entry.getKey() + "and value is "  + entry.getValue())); 
}

    }