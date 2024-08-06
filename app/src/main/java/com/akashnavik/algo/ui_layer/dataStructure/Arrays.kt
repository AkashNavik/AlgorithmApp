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

//@Preview(showBackground = true)
@Composable
fun arraysFinal() {
    Box(modifier = Modifier
        .background(color = Color.White)
        .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        ArrayInfo()
    }
}

@Composable
fun ArrayInfo() {
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .padding(4.dp)
            .verticalScroll(scrollState)
            .fillMaxSize()
    ) {
        Text(
            text = "Arrays",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(text = "An array is a data structure used to store a fixed-size sequence of elements of the same type. Arrays are useful for storing multiple values in a single variable and are a basic building block for more complex data structures.")
        Section(title = "Key Characteristics of Arrays"
            , content = "\nFixed Size: The size of an array is specified at the time of creation and cannot be changed.\n" +
                    "\nHomogeneous Elements: All elements in an array are of the same type.\n" +
                    "\nIndexed: Elements in an array are accessed using their index, with the index typically starting at 0.\n" +
                    "\nEfficient Access: Arrays allow for fast access to elements using their index."
        )
        Section(title = "Example in Python"
            , content = "In Python, arrays can be implemented using the list type or the array module for more restrictive arrays."
        )
        CodeBlock(code = """
            # Using lists
            my_array = [1, 2, 3, 4, 5]

            # Accessing elements
            print(my_array[0])  # Output: 1

            # Modifying elements
            my_array[1] = 20

            # Adding elements (lists can be resized in Python)
            my_array.append(6)

            # Removing elements
            my_array.remove(20)
            print(my_array)  # Output: [1, 3, 4, 5, 6]

            # Using array module
            import array as arr

            my_array = arr.array('i', [1, 2, 3, 4, 5])  # 'i' stands for integer
            print(my_array[0])  # Output: 1
        """)
        Section(title = "Common Operations on Arrays"
            , content = "1. Traversal: Iterating over all elements in the array."
        )
        CodeBlock(code = """
            for item in my_array:
                print(item)
        """)
        Text(text = "2. Searching: Finding an element in the array.")
        CodeBlock(code = """
            if 3 in my_array:
                print("Found")
        """)
        Text(text = "3. Sorting: Arranging elements in a specific order.")
        CodeBlock(code = """
            my_array.sort()
        """)
        Text(text = "4. Reversing: Reversing the order of elements.")
        CodeBlock(code = """
            my_array.reverse()
        """)
        Text(text = "5. Slicing: Extracting a part of the array (more common in languages like Python).")
        CodeBlock(code = """
            sub_array = my_array[1:3]  # Elements from index 1 to 2
        """)
        Section(title = "Advantages of Arrays"
            , content = "Efficiency: Fast access to elements using their index.\n" +
                    "Simplicity: Easy to use and understand.\n" +
                    "Memory Management: Continuous block of memory, which is efficient for cache performance."
        )
        Section(title = "Conclusion"
            , content = "Arrays are a crucial data structure in programming that provide an efficient way to store and access a fixed-size sequence of elements. Understanding how to use arrays effectively is essential for solving a wide range of programming problems and for implementing more complex data structures."
        )
    }
}
