# JAVA Algorithms and Data Structure course Assignment #3

Instructor: Khaimuldin Nursultan
---



## Menu of content
- [MyHashTable]  (#MyHashTable)
- [MyTestingClass] (#MyHashTableTest)
- [Object] (#Object)



# TASK:MyHashTable


## MyHashTable
```
Value get(Key key)  
``` 
- returns values by keys and ```null```, if the key is empty.


```
void put(Key key, Value value)
``` 
- saves the value by given key.


```
Value remove(Key key)
```
- deletes given key and related data.

```
void contains(Key key)

``` 
- checks if there any key.

```
int hash(Key key) 
``` 

- checks if the working node is empty, return the key.


```
Iterator<K> keySet()
```
-  sets the new key 
```
int hash(K key)
```

- ```hashCode()```operation .
---

## Test the hash table

User uses ```MyTestingClass``` to test the code working. 
In order to do that set the random variables with restricted size and get the hash value and key.

---

```    Random random = new Random();```




  ```int[] bucketSizes = new int[table.getM()];```

---

  ##  ```hashCode()``` implementation

In class 'MytestingClass' user has the code for hashCode().
