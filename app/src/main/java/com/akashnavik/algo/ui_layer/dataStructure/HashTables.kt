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
fun hashTableFinal() {
    Box(modifier = Modifier
        .background(color = Color.White)
        .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        HashTableInfo()
    }
}

@Composable
fun HashTableInfo() {
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .padding(4.dp)
            .verticalScroll(scrollState)
            .fillMaxSize()
    ) {
        Text(
            text = "Hash Tables",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(text = "A hash table is a data structure that implements an associative array, a structure that can map keys to values. Hash tables use a hash function to compute an index into an array of buckets or slots, from which the desired value can be found. Here's an in-depth look at what hash tables are and how they function in different programming languages.")
        Section(title = "Key Characteristics of Hash Tables"
            , content = "\nKey-Value Pairs: Stores data in key-value pairs, where each key is unique.\n" +
                    "\nHash Function: A function that maps keys to specific indices in an array.\n" +
                    "\nCollision Handling: Method used to handle two keys that hash to the same index, commonly using chaining or open addressing.\n" +
                    "\nAverage Time Complexity: O(1) for search, insert, and delete operations under good hash function."
        )
        Section(title = "Example in Python"
            , content = "In Python, hash tables are implemented as dictionaries."
        )
        CodeBlock(code = """
            # Creating a hash table (dictionary)
            hash_table = {}

            # Adding key-value pairs
            hash_table["apple"] = 1
            hash_table["banana"] = 2
            hash_table["orange"] = 3

            # Accessing values
            print(hash_table["apple"])  # Output: 1

            # Removing key-value pairs
            del hash_table["banana"]

            # Checking for the existence of a key
            print("orange" in hash_table)  # Output: True
        """)
        Section(title = "Common Operations on Hash Tables"
            , content = "1. Insertion: Adding a key-value pair to the hash table."
        )
        CodeBlock(code = """
            hash_table[key] = value
        """)
        Text(text = "2. Deletion: Removing a key-value pair from the hash table.")
        CodeBlock(code = """
            del hash_table[key]
        """)
        Text(text = "3. Lookup: Retrieving the value associated with a given key.")
        CodeBlock(code = """
            value = hash_table[key]
        """)
        Text(text = "4. Checking Key Existence: Verifying if a key exists in the hash table.")
        CodeBlock(code = """
            exists = key in hash_table
        """)
        Section(title = "Advantages of Hash Tables"
            , content = "Fast Access: Average time complexity of O(1) for search, insert, and delete operations.\n" +
                    "Flexible: Can store a wide variety of data types as keys and values.\n" +
                    "Efficient Memory Usage: Efficiently handles large datasets."
        )
        Section(title = "Conclusion"
            , content = "Hash tables are a powerful data structure for managing associative arrays with fast access times. Understanding how to implement and use hash tables is crucial for solving problems that require efficient data retrieval and manipulation."
        )
    }
}
