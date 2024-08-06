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
fun queuesFinal() {
    Box(modifier = Modifier
        .background(color = Color.White)
        .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        QueueInfo()
    }
}

@Composable
fun QueueInfo() {
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .padding(4.dp)
            .verticalScroll(scrollState)
            .fillMaxSize()
    ) {
        Text(
            text = "Queues",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(text = "A queue is a linear data structure that follows the First In First Out (FIFO) order in which the operations are performed. The element that is added first is the one that is removed first. Here's an in-depth look at what queues are and how they function in different programming languages.")
        Section(title = "Key Characteristics of Queues"
            , content = "\nFIFO: The first element added to the queue is the first one to be removed.\n" +
                    "\nEnqueue Operation: Adds an element to the end of the queue.\n" +
                    "\nDequeue Operation: Removes the element from the front of the queue.\n" +
                    "\nFront: The first element of the queue.\n" +
                    "\nRear: The last element of the queue."
        )
        Section(title = "Example in Python"
            , content = "In Python, queues can be implemented using lists or the `collections.deque` module."
        )
        CodeBlock(code = """
            # Using lists
            queue = []

            # Enqueue elements
            queue.append(1)
            queue.append(2)
            queue.append(3)

            # Dequeue elements
            print(queue.pop(0))  # Output: 1
            print(queue.pop(0))  # Output: 2

            # Check if empty
            print(len(queue) == 0)  # Output: False

            # Using deque
            from collections import deque
            queue = deque()

            # Enqueue elements
            queue.append(1)
            queue.append(2)
            queue.append(3)

            # Dequeue elements
            print(queue.popleft())  # Output: 1
            print(queue.popleft())  # Output: 2

            # Check if empty
            print(len(queue) == 0)  # Output: False
        """)
        Section(title = "Common Operations on Queues"
            , content = "1. Enqueue: Adding an element to the end of the queue."
        )
        CodeBlock(code = """
            queue.append(item)
        """)
        Text(text = "2. Dequeue: Removing the front element from the queue.")
        CodeBlock(code = """
            queue.pop(0)  # or queue.popleft() if using deque
        """)
        Text(text = "3. Peek: Retrieving the front element without removing it.")
        CodeBlock(code = """
            front_item = queue[0]
        """)
        Text(text = "4. IsEmpty: Checking if the queue is empty.")
        CodeBlock(code = """
            is_empty = len(queue) == 0
        """)
        Section(title = "Advantages of Queues"
            , content = "Order Preservation: Maintains the order of elements as they are added.\n" +
                    "Efficiency: Provides fast operations for enqueuing and dequeuing.\n" +
                    "Simplicity: Easy to implement and use."
        )
        Section(title = "Conclusion"
            , content = "Queues are a fundamental data structure in programming that provide an efficient way to store and access elements in a first-in, first-out manner. Understanding how to use queues effectively is essential for solving problems related to scheduling, buffering, and managing tasks in a sequential order."
        )
    }
}
