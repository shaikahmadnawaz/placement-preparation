# Binary Tree Data Structure

A **Binary Tree** is a tree data structure where each node has at most 2 children. In a binary tree, each element can have only 2 children, typically named the left and right child.

## Binary Tree Representation

A Binary tree is represented by a pointer to the topmost node, commonly known as the "root" of the tree. If the tree is empty, then the value of the root is NULL. Each node of a Binary Tree contains the following parts:

- Data
- Pointer to left child
- Pointer to right child

![Binary Tree Image](https://www.geeksforgeeks.org/wp-content/uploads/binary-tree-to-DLL.png)

## Basic Operations on Binary Tree

The basic operations that can be performed on a Binary Tree include:

1. **Inserting an element.**
2. **Removing an element.**
3. **Searching for an element.**
4. **Traversing the tree.**

```java
// Class containing left and right child
// of current node and key value
class Node {
	int key;
	Node left, right;

	public Node(int item)
	{
		key = item;
		left = right = null;
	}
}
```
