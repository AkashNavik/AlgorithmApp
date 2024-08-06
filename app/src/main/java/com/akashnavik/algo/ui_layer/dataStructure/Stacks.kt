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
fun stacksFinal() {
    Box(modifier = Modifier
        .background(color = Color.White)
        .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        StackInfo()
    }
}

@Composable
fun StackInfo() {
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .padding(4.dp)
            .verticalScroll(scrollState)
            .fillMaxSize()
    ) {
        Text(
            text = "Stacks",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(text = "A stack is a linear data structure that follows a particular order in which the operations are performed. The order may be LIFO (Last In First Out) or FILO (First In Last Out). Here's an in-depth look at what stacks are and how they function in different programming languages.")
        Section(title = "Key Characteristics of Stacks"
            , content = "\nLIFO: The last element added to the stack is the first one to be removed.\n" +
                    "\nPush Operation: Adds an element to the top of the stack.\n" +
                    "\nPop Operation: Removes the top element from the stack.\n" +
                    "\nPeek Operation: Retrieves, but does not remove, the top element of the stack.\n" +
                    "\nIsEmpty Operation: Checks if the stack is empty."
        )
        Section(title = "Example in Python"
            , content = "In Python, stacks can be implemented using lists or the `collections.deque` module."
        )
        CodeBlock(code = """
            # Using lists
            stack = []

            # Push elements
            stack.append(1)
            stack.append(2)
            stack.append(3)

            # Pop elements
            print(stack.pop())  # Output: 3
            print(stack.pop())  # Output: 2

            # Peek element
            print(stack[-1])  # Output: 1

            # Check if empty
            print(len(stack) == 0)  # Output: False

            # Using deque
            from collections import deque
            stack = deque()

            # Push elements
            stack.append(1)
            stack.append(2)
            stack.append(3)

            # Pop elements
            print(stack.pop())  # Output: 3
            print(stack.pop())  # Output: 2

            # Peek element
            print(stack[-1])  # Output: 1

            # Check if empty
            print(len(stack) == 0)  # Output: False
        """)
        Section(title = "Common Operations on Stacks"
            , content = "1. Push: Adding an element to the top of the stack."
        )
        CodeBlock(code = """
            stack.append(item)
        """)
        Text(text = "2. Pop: Removing the top element from the stack.")
        CodeBlock(code = """
            stack.pop()
        """)
        Text(text = "3. Peek: Retrieving the top element without removing it.")
        CodeBlock(code = """
            top_item = stack[-1]
        """)
        Text(text = "4. IsEmpty: Checking if the stack is empty.")
        CodeBlock(code = """
            is_empty = len(stack) == 0
        """)
        Section(title = "Advantages of Stacks"
            , content = "Simplicity: Easy to implement and use.\n" +
                    "Memory Management: Helps manage function calls and recursion.\n" +
                    "Data Integrity: Provides controlled access to the last added element."
        )
        Section(title = "Conclusion"
            , content = "Stacks are a fundamental data structure in programming that provide a simple and effective way to store and access elements in a last-in, first-out manner. Understanding how to use stacks effectively is essential for solving problems related to recursion, backtracking, and parsing."
        )
    }
}
