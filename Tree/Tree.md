# Tree Traversal

Accessing elements of a tree one by one is called **tree traversal**.

**It is of two types:**

### 1. Depth First Search (DFS)

- **Inorder (Left → Root → Right)**

![alt text](Images/image.png)

- **Preorder (Root → Left → Right)**
 
![alt text](<Images/image copy.png>)

- **Postorder (Left → Right → Root)**

![alt text](<Images/image copy 2.png>)
  
### 2. Breadth First Search (BFS)

- **Level Order**
  
  Access nodes level by level. Implemented using a **queue**.

![alt text](<Images/image copy 3.png>)

---

## Special Types of Trees

### 1. Balanced Binary Tree

A binary tree where the height difference between the left subtree and right subtree of any node is at most 1.

### 2. Non-Balanced Binary Tree

A binary tree where the height difference between the left subtree and right subtree of any node is more than 1.

![alt text](<Images/image copy 5.png>)

### 3. Binary Search Tree (BST)

A tree where:
- Left child value < Root value
- Right child value > Root value

BST is very useful for achieving fast search, insertion, and deletion operations.

![alt text](<Images/image copy 6.png>)

### 4. Self-Balancing Binary Search Tree
   
A binary search tree that automatically restructures itself whenever an insertion or deletion operation is performed.

**Examples:** AVL Tree, Red-Black Tree

![alt text](<Images/image copy 7.png>)

### 5. AVL Tree

**AVL** (Adelson-Velsky-Landis) is the first self-balancing binary search tree where the balance factor is strictly maintained as `0`, `-1`, or `1`.

![alt text](<Images/image copy 8.png>)

### 6. Red-Black Tree

A self-balancing tree that maintains strict color-coding rules.

**Rules:**
- Root must be **black**
- Two consecutive nodes must not be **red**
- Leaf or null nodes should be **black**
- Each path from root to leaf must have the same number of black nodes

It is highly efficient in searching, insertion, and deletion, so it is widely used in built-in tree implementations such as **TreeSet**, **TreeMap**, **HashMap**, etc.

![alt text](<Images/image copy 9.png>) 

### 7. Heap 

A heap is a structured representation of data that follows certain rules.

**Types:**

- **Max Heap**
  - A heap where the root is always greater than its children.
  
- **Min Heap**
  - A heap where the root is always smaller than its children.

![alt text](<Images/image copy 10.png>)

---

## Tree Representation of Array
```java
int[] a = {10, 20, 12, 40, 22, 55, 48, 30};
```

### Heapify

The process of converting an array or tree into a **min heap** or **max heap** is called **Heapify**.

**Starting point for Heapify:**
```java
int n = a.length;
// i (the point from where Heapify process will start) = (n/2) - 1
```

![alt text](<Images/image copy 12.png>)

**Array Index to Tree Node Mapping:**

| Array Index | Tree Node    |
| ----------- | ------------ |
| i           | Current Node |
| 2i + 1      | Left Child   |
| 2i + 2      | Right Child  |

![alt text](<Images/image copy 11.png>)

---