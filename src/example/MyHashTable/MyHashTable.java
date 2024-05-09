package src.example;

public class MyHashTable<K,V>  extends TestMyHashTable{

    private class HashNode<K,V> {
        private K key;
        private V value;
        private HashNode<K,V> next;
        


        public HashNode(K key, V value){

            this.key = key;
            this.value = value;
        }



        @Override
        public String to String(){

            return "{" + key + " " + value + "}";
        }
    }



    public static void main(String[] args){

        //1. Create Hashtable
        Hashtable<Integer,String> hashtable = new HashTable<>();


        //2.Adding mapping to hashtable


        hashtable.put(1, "A");
        hashtable.put(2,"B");
        hashtable.put(3, "C");


        System.out.println(hashtable);


        //3.Get a mapping by key

        String value = hashtable.get(1);
        System.out.println(value);

        //4.Remove a mapping
        hashtable.remove(3);

        //5.Iterator over mappings
        Iterator<Integer> itr = hashtable.keySet().iterator();


        while(itr.hasNext()){
            Integer key = itr.next();
            String mappedValue = hashtable.get(key);


            System.out.println("Key:"  + key + ", Value:" + mappedValue);

        }
    }
    


    public class HashCode(){

    private MyHashTable<MyTestingClass, Student> table = new MyHashTable<>();


        private HashNode<K, V>[] chainArray;
        private int M = 11;
        private int size;



        public MyHashTable() {
            
        }




        public MyHashTable(int capacity) {
            this.M = capacity;
            this.chainArray = new HashNode[M];
            this.size = 0;
        }

        public void put(K key, V value){
            int index = hash(key);
            HashNode<K, V> newNode = new HashNode<>(key , value);


            if(chainArray[index] == null){
                chainArray[index] = newNode;
            } else{
                HashNode<K, V> currentNode = chainArray[index];
                while (currentNNode.next != null){

                    if(currentNode.key.equals(key)){
                        currentNode.value =value;
                        return;
                    }

                    currentNode = currentNode.next;

                    }
                    currentNode.next = newNode;
                }
                size++;
            }
        


       // public MyHashTable(int M){}




        public void put(K key, V value) {
            int index = hash(key);
            HashNode<K, V> newNode = new HashNode<>(key, value);
    
            if (chainArray[index] == null) {
                chainArray[index] = newNode;
            } else {
                HashNode<K, V> currentNode = chainArray[index];
                while (currentNode.next != null) {
                    if (currentNode.key.equals(key)) {
                        currentNode.value = value;
                        return;
                    }
                    currentNode = currentNode.next;
                }
                currentNode.next = newNode;
            }
            size++;
        }

        public V get(K key) {
            int index = hash(key);
            HashNode<K, V> currentNode = chainArray[index];
            while (currentNode != null) {
                if (currentNode.key.equals(key)) {
                    return currentNode.value;
                }
                currentNode = currentNode.next;
            }
            return null;
        }
    
        public V remove(K key) {
            int index = hash(key);
            HashNode<K, V> prev = null;
            HashNode<K, V> currentNode = chainArray[index];
            while (currentNode != null) {
                if (currentNode.key.equals(key)) {
                    if (prev == null) {
                        chainArray[index] = currentNode.next;
                    } else {
                        prev.next = currentNode.next;
                    }
                    size--;
                    return currentNode.value;
                }
                prev = currentNode;
                currentNode = currentNode.next;
            }
            return null;
        }
    
        public boolean contains(V value) {
            for (int i = 0; i < M; i++) {
                HashNode<K, V> currentNode = chainArray[i];
                while (currentNode != null) {
                    if (currentNode.value.equals(value)) {
                        return true;
                    }
                    currentNode = currentNode.next;
                }
            }
            return false;
        }

        public K getKey(V value) {
            for (int i = 0; i < M; i++) {
                HashNode<K, V> currentNode = chainArray[i];
                while (currentNode != null) {
                    if (currentNode.value.equals(value)) {
                        return currentNode.key;
                    }
                    currentNode = currentNode.next;
                }
            }
            return null;
        }


        public Iterator<K> keySet() {
            return new Iterator<K>() {
                private int currentIndex = 0;
                private HashNode<K, V> currentNode = null;
    
                @Override
                public boolean hasNext() {
                    if (currentNode != null && currentNode.next != null) {
                        return true;
                    }
                    for (int i = currentIndex; i < M; i++) {
                        if (chainArray[i] != null) {
                            return true;
                        }
                    }
                    return false;
                }


                @Override
                public K next() {
                    if (currentNode != null && currentNode.next != null) {
                        currentNode = currentNode.next;
                        return currentNode.key;
                    }
                    for (int i = currentIndex; i < M; i++) {
                        if (chainArray[i] != null) {
                            currentIndex = i;
                            currentNode = chainArray[i];
                            return currentNode.key;
                        }
                    }
                    return null;
                }


                public int hash(K key) {
                    return Math.abs(key.hashCode() % M);
                }

                public int getM(){
                    return M;
                }

            }
        }


    
