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
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.akashnavik.algo.R

@Composable
fun DFSfinalScreen() {
    Box(modifier = Modifier.fillMaxSize()
        .background(color = Color.White)
        , contentAlignment = Alignment.Center
    ){
        dfsScreen()
    }
}


@Composable
fun dfsScreen() {
    var scroll = rememberScrollState()
    Column(modifier = Modifier
        .fillMaxSize()
        .verticalScroll(scroll))
    {
        Text("Depth First Search",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Section(title ="What is Breadth First Search?",
            content = "In this article, we will discuss the DFS algorithm in the data structure. It is a recursive algorithm to search all the vertices of a tree data structure or a graph. The depth-first search (DFS) algorithm starts with the initial node of graph G and goes deeper until we find the goal node or the node with no children.\n" +
                    "\n" +
                    "Because of the recursive nature, stack data structure can be used to implement the DFS algorithm. The process of implementing the DFS is similar to the BFS algorithm."
        )
        Section(title = "Applications of DFS algorithm"
            , content ="The applications of using the DFS algorithm are given as follows -\n"+
                    "DFS algorithm can be used to implement the topological sorting.\n" +
                    "It can be used to find the paths between two vertices.\n" +
                    "It can also be used to detect cycles in the graph.\n" +
                    "DFS algorithm is also used for one solution puzzles.\n" +
                    "DFS is used to determine if a graph is bipartite or not."
        )
        Section(title ="Algorithm"
            , content ="Step 1: SET STATUS = 1 (ready state) for each node in G\n" +
                    "\n" +
                    "Step 2: Push the starting node A on the stack and set its STATUS = 2 (waiting state)\n" +
                    "\n" +
                    "Step 3: Repeat Steps 4 and 5 until STACK is empty\n" +
                    "\n" +
                    "Step 4: Pop the top node N. Process it and set its STATUS = 3 (processed state)\n" +
                    "\n" +
                    "Step 5: Push on the stack all the neighbors of N that are in the ready state (whose STATUS = 1) and set their STATUS = 2 (waiting state)\n" +
                    "[END OF LOOP]\n"+
                    "Step 6: EXIT"
        )
        Text(
            text = "Pseudocode",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        CodeBlock(code = """
            DFS(G,v)   ( v is the vertex where the search starts )    
            Stack S := {};   ( start with an empty stack )    
            for each vertex u, set visited[u] := false;    
            push S, v;    
            while (S is not empty) do    
                u := pop S;    
                if (not visited[u]) then    
                    visited[u] := true;    
                     for each unvisited neighbour w of uu    
                        push S, w;    
                    end if    
                   end while    
                  END DFS()
        """)
        Section(title = "Example of DFS Algorithm"
            , content ="Now, let's understand the working of the DFS algorithm by using an example. In the example given below, there is a directed graph having 7 vertices."
        )
        Row(modifier = Modifier
            .fillMaxWidth()
            .height(200.dp),) {
            Image(
                painter = painterResource(id = R.raw.dfs), contentDescription = null,
                modifier = Modifier
                    .fillMaxSize()
            )
        }
        Text(text = "Now, let's start examining the graph starting from Node H.\n" +
                "\nStep 1 - First, push H onto the Stack.")
        CodeBlock(code = """
            STACK = H
        """)
        Text(text = "Step 2 - POP the top element from the stack, i.e., H, and print it. Now, PUSH all the neighbors of H onto the stack that are in ready state.")
        CodeBlock(code = """
            Print:HJSTACK= A
        """)
        Text(text = "Step 3 - POP the top element from the stack, i.e., A, and print it. Now, PUSH all the neighbors of A onto the stack that are in ready state.")
        CodeBlock(code = """
            Print: A
            STACK: B, D
        """)
        Text(text = "Step 4 - POP the top element from the stack, i.e., D, and print it. Now, PUSH all the neighbors of D onto the stack that are in ready state.")
        CodeBlock(code = """
            Print: D  
            STACK: B, F
        """)
        Text(text ="Step 5 - POP the top element from the stack, i.e., F, and print it. Now, PUSH all the neighbors of F onto the stack that are in ready state.")
        CodeBlock(code = """
            Print: F
            STACK: B
        """)
        Text(text = "Step 6 - POP the top element from the stack, i.e., B, and print it. Now, PUSH all the neighbors of B onto the stack that are in ready state.")
        CodeBlock(code = """
            Print: B
            STACK: C
        """)
        Text(text = "Step 7 - POP the top element from the stack, i.e., C, and print it. Now, PUSH all the neighbors of C onto the stack that are in ready state")
        CodeBlock(code = """
            Print: C
            STACK:E, G
        """)
        Text(text = "Step 8 - POP the top element from the stack, i.e., G and PUSH all the neighbors of G onto the stack that are in ready state.")
        CodeBlock(code = """
            Print: G
            STACK: E
        """)
        Text(text = "Step 9 - POP the top element from the stack, i.e., E and PUSH all the neighbors of E onto the stack that are in ready state.")
        CodeBlock(code = """
           Print: E
            STACK:
        """)
        Text(text = "Now, all the graph nodes have been traversed, and the stack is empty.")
        Section(title ="Complexity of Depth-first search algorithm"
            , content ="The time complexity of the DFS algorithm is O(V+E), where V is the number of vertices and E is the number of edges in the graph.\n" +
                    "\n" +
                    "The space complexity of the DFS algorithm is O(V)." )
        Section(title = "Conclusion"
            , content ="In this article, we have discussed the depth-first search technique, its example, complexity, and implementation in the java programming language. Along with that, we have also seen the applications of the depth-first search algorithm.\n" +
                    "\n" +
                    "So, that's all about the article. Hope it will be helpful and informative to you.")
    }

}

