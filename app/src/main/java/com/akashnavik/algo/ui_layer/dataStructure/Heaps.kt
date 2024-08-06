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
fun heapsFinal() {
    Box(modifier = Modifier
        .background(color = Color.White)
        .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        HeapInfo()
    }
}

@Composable
fun HeapInfo() {
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .padding(4.dp)
            .verticalScroll(scrollState)
            .fillMaxSize()
    ) {
        Text(
            text = "Heaps",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(text = "A heap is a specialized tree-based data structure that satisfies the heap property. In a max heap, for any given node I, the value of I is greater than or equal to the values of its children, and the highest value is at the root. In a min heap, the value of I is less than or equal to the values of its children, and the lowest value is at the root. Here's an in-depth look at what heaps are and how they function in different programming languages.")
        Section(title = "Key Characteristics of Heaps"
            , content = "\nComplete Binary Tree: Heaps are typically implemented as complete binary trees, which means all levels of the tree are fully filled except possibly for the last level, which is filled from left to right.\n" +
                    "\nHeap Property: In a max heap, each parent node is greater than or equal to its children. In a min heap, each parent node is less than or equal to its children.\n" +
                    "\nRoot Node: The root node of a max heap is the maximum element, while the root node of a min heap is the minimum element."
        )
        Section(title = "Example in Python"
            , content = "In Python, heaps can be implemented using the `heapq` module."
        )
        CodeBlock(code = """
            import heapq

            # Creating a min heap
            heap = []
            heapq.heappush(heap, 10)
            heapq.heappush(heap, 20)
            heapq.heappush(heap, 5)

            # Extracting elements
            print(heapq.heappop(heap))  # Output: 5
            print(heapq.heappop(heap))  # Output: 10

            # Peek element
            print(heap[0])  # Output: 20

            # Creating a max heap using negative values
            max_heap = []
            heapq.heappush(max_heap, -10)
            heapq.heappush(max_heap, -20)
            heapq.heappush(max_heap, -5)

            # Extracting elements
            print(-heapq.heappop(max_heap))  # Output: 20
            print(-heapq.heappop(max_heap))  # Output: 10

            # Peek element
            print(-max_heap[0])  # Output: 5
        """)
        Section(title = "Common Operations on Heaps"
            , content = "1. Insertion: Adding an element to the heap while maintaining the heap property."
        )
        CodeBlock(code = """
            heapq.heappush(heap, item)
        """)
        Text(text = "2. Deletion: Removing the root element from the heap while maintaining the heap property.")
        CodeBlock(code = """
            heapq.heappop(heap)
        """)
        Text(text = "3. Peek: Retrieving the root element without removing it.")
        CodeBlock(code = """
            root_item = heap[0]
        """)
        Text(text = "4. Heapify: Transforming a list into a heap.")
        CodeBlock(code = """
            heapq.heapify(list)
        """)
        Section(title = "Advantages of Heaps"
            , content = "Efficient Priority Queue: Heaps provide an efficient way to implement priority queues, with insertion and deletion operations having a time complexity of O(log n).\n" +
                    "Dynamic: Can grow and shrink as needed.\n" +
                    "Ease of Use: Built-in methods for common operations."
        )
        Section(title = "Conclusion"
            , content = "Heaps are a fundamental data structure in computer science that provide an efficient way to manage a collection of elements with dynamic priorities. Understanding how to implement and use heaps is essential for solving problems related to priority queues, sorting, and graph algorithms."
        )
    }
}
