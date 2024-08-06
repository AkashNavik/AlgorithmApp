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
fun listFinal() {
    Box(modifier = Modifier
        .background(color = Color.White)
        .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        ListInfo()
    }
}

@Composable
fun ListInfo() {
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .padding(4.dp)
            .verticalScroll(scrollState)
            .fillMaxSize()
    ) {
        Text(
            text = "Lists",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(text = "A list is a data structure that is used to store multiple items in a single variable. Lists are one of the most commonly used data structures because they are simple to understand and flexible to use. Here's an in-depth look at what lists are and how they function in different programming languages.")
        Section(title ="Key Characteristics of Lists"
            , content ="\nOrdered: The elements in a list are stored in a specific sequence. The order in which elements are added to the list is preserved.\n" +
                    "\nIndexable: Elements in a list can be accessed using their index, which is their position in the list. Indexing typically starts at 0.\n" +
                    "\nMutable: Lists can be modified after creation. You can add, remove, or change elements in a list.\n" +
                    "\nDynamic Size: Lists can grow or shrink as needed, allowing them to hold a variable number of elements."
        )
        Section(title ="Example in Python" ,
            content ="In Python, lists are a built-in data type and can hold elements of different data types."
        )
        CodeBlock(code = """
            # Accessing elements
            print(my_list[0])  # Output: 1
            
            # Modifying elements
            my_list[1] = 20
            
            # Adding elements
            my_list.append(6)
            
            # Removing elements
            my_list.remove(20)
            print(my_list)  # Output: [1, 3, 4, 5, 6]
        """)
        Section(title ="Common Operations on Lists" ,
            content ="1.\tTraversal: Iterating over all elements in the list."
        )
        CodeBlock(code = """
            for item in my_list:
             print(item)
        """)
        Text(text = "2.\tSearching: Finding an element in the list.")
        CodeBlock(code = """
            if 3 in my_list:
            print("Found")
        """)
        Text(text = "3.\tSorting: Arranging elements in a specific order.")
        CodeBlock(code = """
            my_list.sort()
        """)
        Text(text = "4.\tReversing: Reversing the order of elements.")
        CodeBlock(code = """
            my_list.reverse()
        """)
        Text(text = "5.\tSlicing: Extracting a part of the list.")
        CodeBlock(code = """
            sub_list = my_list[1:3]  # Elements from index 1 to 2
        """)
        Section(title ="Advantages of Lists"
            , content ="Flexibility: Can hold heterogeneous data types.\n" +
                    "Dynamic: Can grow and shrink as needed.\n" +
                    "Ease of Use: Built-in methods for common operations."
        )
        Section(title ="Conclusion"
            , content ="Lists are versatile and fundamental data structures in programming. They allow for efficient storage and manipulation of ordered collections of elements. Understanding how to use lists effectively is crucial for solving a wide range of programming problems."
        )


    }
}