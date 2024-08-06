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
fun treesFinal() {
    Box(modifier = Modifier
        .background(color = Color.White)
        .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        TreeInfo()
    }
}

@Composable
fun TreeInfo() {
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .padding(4.dp)
            .verticalScroll(scrollState)
            .fillMaxSize()
    ) {
        Text(
            text = "Trees",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(text = "A tree is a hierarchical data structure that consists of nodes, with a single node as the root from which subnodes or child nodes branch out. Trees are widely used in computer science for various applications such as representing hierarchical data, databases, and more.")
        Section(title = "Key Characteristics of Trees"
            , content = "\nRoot: The topmost node of a tree, which does not have a parent.\n" +
                    "\nNode: The fundamental part of a tree which stores data and links to its children.\n" +
                    "\nEdge: The connection between two nodes.\n" +
                    "\nLeaf: A node that does not have any children.\n" +
                    "\nHeight: The length of the longest path from the root to a leaf.\n" +
                    "\nDepth: The length of the path from the root to the node."
        )
        Section(title = "Example in Python"
            , content = "In Python, a tree can be implemented using classes and objects."
        )
        CodeBlock(code = """
            class Node:
                def __init__(self, key):
                    self.left = None
                    self.right = None
                    self.val = key

            # Creating a tree
            root = Node(1)
            root.left = Node(2)
            root.right = Node(3)
            root.left.left = Node(4)
            root.left.right = Node(5)

            # Traversing a tree
            def print_inorder(root):
                if root:
                    # First recur on left child
                    print_inorder(root.left)
                    # Then print the data of node
                    print(root.val),
                    # Now recur on right child
                    print_inorder(root.right)

            print_inorder(root)  # Output: 4 2 5 1 3
        """)
        Section(title = "Common Operations on Trees"
            , content = "1. Insertion: Adding a node to the tree."
        )
        CodeBlock(code = """
            def insert(root, key):
                if root is None:
                    return Node(key)
                else:
                    if root.val < key:
                        root.right = insert(root.right, key)
                    else:
                        root.left = insert(root.left, key)
                return root
        """)
        Text(text = "2. Deletion: Removing a node from the tree.")
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
                    temp = min_value_node(root.right)
                    root.val = temp.val
                    root.right = delete_node(root.right, temp.val)
                return root
        """)
        Text(text = "3. Traversal: Visiting all nodes in the tree.")
        CodeBlock(code = """
            def print_inorder(root):
                if root:
                    print_inorder(root.left)
                    print(root.val, end=" ")
                    print_inorder(root.right)

            def print_preorder(root):
                if root:
                    print(root.val, end=" ")
                    print_preorder(root.left)
                    print_preorder(root.right)

            def print_postorder(root):
                if root:
                    print_postorder(root.left)
                    print_postorder(root.right)
                    print(root.val, end=" ")
        """)
        Section(title = "Advantages of Trees"
            , content = "Hierarchical Structure: Naturally represents hierarchical data.\n" +
                    "Efficient Searching: Trees like binary search trees allow for fast search operations.\n" +
                    "Flexibility: Can be used to represent various types of relationships."
        )
        Section(title = "Conclusion"
            , content = "Trees are a fundamental data structure in computer science that provide an efficient way to store and access hierarchical data. Understanding how to implement and use trees is essential for solving complex problems related to data representation and manipulation."
        )
    }
}
