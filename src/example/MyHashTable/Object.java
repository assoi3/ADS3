package src.example;

import java.util.Random;

public class TestMyHashTable extends MyTestingClass { 
    

    public static void main(String[] args){
        MyHashTable<MyTestingClass, Student> table = new MyHashTable<>();

        Random random = new Random();
        for(int i = 0; i< 10000;i++){
            MyTestingClass key = new MyTestingClass(random.nextInt(),"Name" + i);
            Student value = new Student("Student" + i);
            table.put(key, value);
        }




        int[] bucketSizes = new int[table.getM()];
        for(MyTestingClass key : table.keySet()) {
            int index = table.hash(key) % table.getM();
            bucketSizes[index]++;
        }


        for(int i = 0; i < bucketSizes.length; i++){
            System.out.println("Bucket" + i + ":"   + bucketSizes[i] + "elements");
        }

        table.put(key1, value1);
        table.put(key2, value2);
        table.put(key3, value3);


        System.out.println("Value for key1" + table.get(key1));
        System.out.println();

        }
      }
