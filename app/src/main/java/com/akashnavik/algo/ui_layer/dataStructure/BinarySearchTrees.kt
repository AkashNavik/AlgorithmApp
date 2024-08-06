package com.akashnavik.algo.ui_layer.dataStructure

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.akashnavik.algo.ui_layer.graphSearch.CodeBlock
import com.akashnavik.algo.ui_layer.graphSearch.Section

@Preview(showBackground = true)
@Composable
fun binarySearchTreesFinal() {
    Box(modifier = Modifier
        .background(color = Color.White)
        .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        BinarySearchTreeInfo()
    }
}

@Composable
fun BinarySearchTreeInfo() {
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .padding(4.dp)
            .verticalScroll(scrollState)
            .fillMaxSize()
    ) {
        Text(
            text = "Binary Search Trees",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(text = "A Binary Search Tree (BST) is a tree data structure in which each node has at most two children, referred to as the left child and the right child. For each node, all elements in the left subtree are less than the node, and all elements in the right subtree are greater than the node. Here's an in-depth look at what Binary Search Trees are and how they function in different programming languages.")
        Section(title = "Key Characteristics of Binary Search Trees"
            , content = "\nBinary Tree Structure: Each node has at most two children, left and right.\n" +
                    "\nBST Property: For any node, all values in its left subtree are less, and all values in its right subtree are greater.\n" +
                    "\nIn-Order Traversal: An in-order traversal of a BST produces a sorted list of values."
        )
        Section(title = "Example in Python"
            , content = "In Python, a BST can be implemented using classes."
        )
        CodeBlock(code = """
            class TreeNode:
                def __init__(self, key):
                    self.left = None
                    self.right = None
                    self.val = key

            def insert(root, key):
                if root is None:
                    return TreeNode(key)
                else:
                    if root.val < key:
                        root.right = insert(root.right, key)
                    else:
                        root.left = insert(root.left, key)
                return root

            def inorder_traversal(root):
                if root:
                    inorder_traversal(root.left)
                    print(root.val, end=" ")
                    inorder_traversal(root.right)

            # Example usage
            root = TreeNode(50)
            root = insert(root, 30)
            root = insert(root, 20)
            root = insert(root, 40)
            root = insert(root, 70)
            root = insert(root, 60)
            root = insert(root, 80)

            inorder_traversal(root)  # Output: 20 30 40 50 60 70 80
        """)
        Section(title = "Common Operations on Binary Search Trees"
            , content = "1. Insertion: Adding a new node to the tree while maintaining the BST property."
        )
        CodeBlock(code = """
            root = insert(root, key)
        """)
        Text(text = "2. Deletion: Removing a node from the tree while maintaining the BST property.")
        CodeBlock(code = """
            def delete_node(root, key):
                if root is None:
                    return root
                if key < root.val:
                    root.left = delete_node(root.left, key)
                elif key > root.val:
                    root.right = delete_node(root.right, key)
                else:
                    if root.left is None:
                        return root.right
                    elif root.right is None:
                        return root.left
                    temp_val = min_value_node(root.right)
                    root.val = temp_val.val
                    root.right = delete_node(root.right, temp_val.val)
                return root

            def min_value_node(node):
                current = node
                while current.left is not None:
                    current = current.left
                return current
        """)
        Text(text = "3. Search: Finding a node with a given value in the tree.")
        CodeBlock(code = """
            def search(root, key):
                if root is None or root.val == key:
                    return root
                if root.val < key:
                    return search(root.right, key)
                return search(root.left, key)
        """)
        Text(text = "4. Traversal: Visiting all nodes in the tree in a specific order (in-order, pre-order, post-order).")
        CodeBlock(code = """
            inorder_traversal(root)  # In-order traversal
        """)
        Section(title = "Advantages of Binary Search Trees"
            , content = "Efficient Search: Average time complexity of O(log n) for search operations.\n" +
                    "Dynamic: Can handle dynamic sets of data, with insertions and deletions.\n" +
                    "Sorted Order: Provides an in-order traversal that yields elements in a sorted order."
        )
        Section(title = "Conclusion"
            , content = "Binary Search Trees are a fundamental data structure in computer science, providing efficient search, insert, and delete operations. Understanding how to implement and use BSTs is essential for solving a wide range of problems that require ordered data management."
        )
    }
}
