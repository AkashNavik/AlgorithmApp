package com.akashnavik.algo.ui_layer.graphSearch

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.akashnavik.algo.R

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BFSfinalScreen() {
    Box(modifier = Modifier.fillMaxSize()
        .background(color = Color.White)
        , contentAlignment = Alignment.Center
    ){
        bfsScreen()
    }
}

@Composable
fun bfsScreen() {
    var scroll = rememberScrollState()
    Column(modifier = Modifier
        .fillMaxSize()
        .verticalScroll(scroll))
    {
        Text("Breadth First Algorithm",
        fontSize = 28.sp,
        fontWeight = FontWeight.Bold,
        modifier = Modifier.padding(bottom = 16.dp)
        )
        Section(title ="What is Breadth First Search?"
            , content = "In this article, we will discuss the BFS algorithm in the data structure. Breadth-first search is a graph traversal algorithm that starts traversing the graph from the root node and explores all the neighboring nodes. Then, it selects the nearest node and explores all the unexplored nodes. While using BFS for traversal, any node in the graph can be considered as the root node.\n" +
                    "There are many ways to traverse the graph, but among them, BFS is the most commonly used approach. It is a recursive algorithm to search all the vertices of a tree or graph data structure. BFS puts every vertex of the graph into two categories - visited and non-visited. It selects a single node in a graph and, after that, visits all the nodes adjacent to the selected node.\n"
        )
        Section(title ="Applications of BFS algorithm"
            , content ="The applications of breadth-first-algorithm are given as follows -\n" +
                    "1.\tBFS can be used to find the neighboring locations from a given source location.\n" +
                    "2.\tIn a peer-to-peer network, BFS algorithm can be used as a traversal method to find all the neighboring nodes. Most torrent clients, such as BitTorrent, uTorrent, etc. employ this process to find \"seeds\" and \"peers\" in the network.\n" +
                    "3.\tBFS can be used in web crawlers to create web page indexes. It is one of the main algorithms that can be used to index web pages. It starts traversing from the source page and follows the links associated with the page. Here, every web page is considered as a node in the graph.\n" +
                    "4.\tBFS is used to determine the shortest path and minimum spanning tree.\n" +
                    "5.\tBFS is also used in Cheney's technique to duplicate the garbage collection.\n" +
                    "6.\tIt can be used in ford-Fulkerson method to compute the maximum flow in a flow network.\n"
        )
        Section(title = "Algorithm"
            ,content = "The steps involved in the BFS algorithm to explore a graph are given as follows -\n" +
                    "Step 1:\t SET STATUS = 1 (ready state) for each node in G\n" +
                    "Step 2:\t Enqueue the starting node A and set its STATUS = 2 (waiting state)\n" +
                    "Step 3:\t Repeat Steps 4 and 5 until QUEUE is empty\n" +
                    "Step 4:\t Dequeue a node N. Process it and set its STATUS = 3 (processed state).\n" +
                    "Step 5:\t Enqueue all the neighbours of N that are in the ready state (whose STATUS = 1) and set their STATUS = 2\n" +
                    "(waiting state)\n" +
                    "[END OF LOOP]\n" +
                    "Step 6:\t EXIT"
        )
        Section(title = "Example of BFS algorithm",
            content = "Now, let's understand the working of BFS algorithm by using an example. In the example given below, there is a directed graph having 7 vertices."
        )
        Row(modifier = Modifier
            .fillMaxWidth()
            .height(200.dp),) {
            Image(
                painter = painterResource(id = R.raw.bfs), contentDescription = null,
                modifier = Modifier
                    .fillMaxSize()
            )
        }
        Text(text = "In the above graph, minimum path 'P' can be found by using the BFS that will start from Node A and end at Node E. The algorithm uses two queues, namely QUEUE1 and QUEUE2. QUEUE1 holds all the nodes that are to be processed, while QUEUE2 holds all the nodes that are processed and deleted from QUEUE1.\n" +
                "\n" +
                "Now, let's start examining the graph starting from Node A.\n" +
                "\n" +
                "Step 1 - First, add A to queue1 and NULL to queue2.")
        
        CodeBlock(code = """
            QUEUE1 = {A}    
            QUEUE2 = {NULL}   
        """)
        Text(text = "Step 2 - Now, delete node A from queue1 and add it into queue2. Insert all neighbors of node A to queue1.")
        CodeBlock(code = """
            QUEUE1 = {B, D}    
            QUEUE2 = {A}
            """)
        Text(text = "Step 3 - Now, delete node B from queue1 and add it into queue2. Insert all neighbors of node B to queue1.")
        CodeBlock(code = """
            QUEUE1 = {D, C, F}
            QUEUE2 = {A, B} 
            """)
        Text(text = "Step 4 - Now, delete node D from queue1 and add it into queue2. Insert all neighbors of node D to queue1. The only neighbor of Node D is F since it is already inserted, so it will not be inserted again.")
        CodeBlock(code = """
            QUEUE1 = {C, F}    
            QUEUE2 = {A, B, D}  
        """)
        Text(text = "Step 5 - Delete node C from queue1 and add it into queue2. Insert all neighbors of node C to queue1.")
        CodeBlock(code = """
            QUEUE1 = {F, E, G}    
            QUEUE2 = {A, B, D, C}  
        """)
        Text(text = "Step 6 - Delete node E from queue1. Since all of its neighbors have already been added, so we will not insert them again. Now, all the nodes are visited, and the target node E is encountered into queue2.")
        CodeBlock(code = """
            QUEUE1 = {G}    
            QUEUE2 = {A, B, D, C, F, E}    
        """)
        Section(title = "Complexity of BFS algorithm"
            , content ="Time complexity of BFS depends upon the data structure used to represent the graph. The time complexity of BFS algorithm is O(V+E), since in the worst case, BFS algorithm explores every node and edge. In a graph, the number of vertices is O(V), whereas the number of edges is O(E).\n" +
                    "\n" +
                    "The space complexity of BFS can be expressed as O(V), where V is the number of vertices.")
        Section(title = "Conclusion"
            , content ="In this article, we have discussed the Breadth-first search technique along with its example, complexity, and implementation in java programming language. Here, we have also seen the real-life applications of BFS that show it the important data structure algorithm.\n" +
                    "\n" +
                    "So, that's all about the article. Hope, it will be helpful and informative to you.")
    }

}

