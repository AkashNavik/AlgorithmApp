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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.akashnavik.algo.R

@Composable
fun AfinalScreen() {
    Box(modifier = Modifier.fillMaxSize()
        .background(Color.White)
        , contentAlignment = Alignment.Center
    ){
        aStarAlgorithm()
    }
}

@Composable
fun aStarAlgorithm() {
    var scroll = rememberScrollState()
    Column(modifier = Modifier
        .fillMaxSize()
        .verticalScroll(scroll))
    {
        Text(
            "A * Algorithm",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text ="A* Search is an informed best-first search algorithm that efficiently determines the lowest cost path between any two nodes in a directed weighted graph with non-negative edge weights. This algorithm is a variant of Dijkstra’s algorithm. A slight difference arises from the fact that an evaluation function is used to determine which node to explore next."
        )
        
        Section(title = "Evaluation Function"
            , content ="The evaluation function, f(x), for the A* search algorithm is the following:"
        )
        CodeBlock(code = """
            f(x) = g(x) + h(x)
        """)
        Text(text = "Where g(x) represents the cost to get to node x and h(x) represents the estimated cost to arrive at the goal node from node x.\n" +
                "\n" +
                "For the algorithm to generate the correct result, the evaluation function must be admissible, meaning that it never overestimates the cost to arrive at the goal node.")
        Section(title = "The Algorithm"
            , content = "The A* algorithm is implemented in a similar way to Dijkstra’s algorithm. Given a weighted graph with non-negative edge weights, to find the lowest-cost path from a start node S to a goal node G, two lists are used:\n" +
                    "\n" +
                    "An open list, implemented as a priority queue, which stores the next nodes to be explored. Because this is a priority queue, the most promising candidate node (the one with the lowest value from the evaluation function) is always at the top. Initially, the only node in this list is the start node S.\n" +
                    "A closed list which stores the nodes that have already been evaluated. When a node is in the closed list, it means that the lowest-cost path to that node has been found.\n" +
                    "To find the lowest cost path, a search tree is constructed in the following way:\n" +
                    "\n" +
                    "Initialize a tree with the root node being the start node S.\n" +
                    "Remove the top node from the open list for exploration.\n" +
                    "Add the current node to the closed list.\n" +
                    "Add all nodes that have an incoming edge from the current node as child nodes in the tree.\n" +
                    "Update the lowest cost to reach the child node.\n" +
                    "Compute the evaluation function for every child node and add them to the open list.\n" +
                    "Just like in Dijkstra’s algorithm, the lowest cost is updated as the algorithm progresses in the following way:"
        )
        CodeBlock(code = """
           current_lowest_cost = min(
           current_lowest_cost,parent_node_cost + 
           edge_weight)
        """
        )
        Text(text = "All nodes except for the start node start with a lowest cost of infinity. The start node has an initial lowest cost of 0.\n" +
                "\n" +
                "The algorithm concludes when the goal node G is removed from the open list and explored, indicating that a shortest path has been found. The shortest path is the path from the start node S to the goal node G in the tree.")
        Section(title ="Example"
            , content ="Consider the following example of trying to find the shortest path from S to G in the following graph:"
        )
        Row(modifier = Modifier
            .fillMaxWidth()
            .height(200.dp),) {
            Image(
                painter = painterResource(id = R.raw.as1), contentDescription = null,
                modifier = Modifier
                    .fillMaxSize()
            )
        }
        Text(text = "Each edge has an associated weight, and each node has a heuristic cost (in parentheses).\n" +
                "\n" +
                "An open list is maintained in which the node S is the only node in the list. The search tree can now be constructed.\n" +
                "\n" +
                "Exploring S:")
        Row(modifier = Modifier
            .fillMaxWidth()
            .height(200.dp),) {
            Image(
                painter = painterResource(id = R.raw.as2), contentDescription = null,
                modifier = Modifier
                    .fillMaxSize()
            )
        }
        Text(text = "A is the current most promising path, so it is explored next:")
        Row(modifier = Modifier
            .fillMaxWidth()
            .height(200.dp),) {
            Image(
                painter = painterResource(id = R.raw.as3), contentDescription = null,
                modifier = Modifier
                    .fillMaxSize()
            )
        }
        Text(text = "Exploring D:")
        Row(modifier = Modifier
            .fillMaxWidth()
            .height(200.dp),) {
            Image(
                painter = painterResource(id = R.raw.as4), contentDescription = null,
                modifier = Modifier
                    .fillMaxSize()
            )
        }
        Text(text = "Exploring F:")
        Row(modifier = Modifier
            .fillMaxWidth()
            .height(200.dp),) {
            Image(
                painter = painterResource(id = R.raw.as5), contentDescription = null,
                modifier = Modifier
                    .fillMaxSize()
            )
        }
        Text(text = "Notice that the goal node G has been found. However, it hasn’t been explored, so the algorithm continues because there may be a shorter path to G. The node B has two entries in the open list: one at a cost of 16 (child of S) and one at a cost of 18 (child of A). The one with the lowest cost is explored next:")
        Row(modifier = Modifier
            .fillMaxWidth()
            .height(200.dp),) {
            Image(
                painter = painterResource(id = R.raw.as6), contentDescription = null,
                modifier = Modifier
                    .fillMaxSize()
            )
        }
        Text(text = "Exploring C:")
        Row(modifier = Modifier
            .fillMaxWidth()
            .height(200.dp),) {
            Image(
                painter = painterResource(id = R.raw.as7), contentDescription = null,
                modifier = Modifier
                    .fillMaxSize()
            )
        }
        Text(text = "The next node in the open list is again B. However, because B has already been explored, meaning a shortest path to B has been found, it is not explored again and the algorithm continues to the next candidate.")
        Row(modifier = Modifier
            .fillMaxWidth()
            .height(200.dp),) {
            Image(
                painter = painterResource(id = R.raw.as8), contentDescription = null,
                modifier = Modifier
                    .fillMaxSize()
            )
        }
        Text(text = "The next node to be explored is the goal node G, meaning the shortest path to G has been found! The path is constructed by tracing the graph backward from G to S:")
        Row(modifier = Modifier
            .fillMaxWidth()
            .height(200.dp),) {
            Image(
                painter = painterResource(id = R.raw.as9), contentDescription = null,
                modifier = Modifier
                    .fillMaxSize()
            )
        }
        Section(title ="Conclusion",
            content ="A* is efficient because it uses both actual path cost (g(n)) and estimated cost (h(n)), balancing between exploring the shortest path and guiding towards the goal. This makes it faster and more accurate compared to other algorithms like Dijkstra's algorithm, especially in complex maps."
        )
    }
}