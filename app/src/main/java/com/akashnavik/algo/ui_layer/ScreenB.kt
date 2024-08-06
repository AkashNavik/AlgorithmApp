package com.akashnavik.algo.ui_layer



import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.akashnavik.algo.Navigation.Route
import com.akashnavik.algo.dataList.bImag
import com.akashnavik.algo.dataList.binSearch
import com.akashnavik.algo.dataList.binaryInfo
import com.akashnavik.algo.dataList.bubbleInfo
import com.akashnavik.algo.dataList.font2
import com.akashnavik.algo.dataList.hImag
import com.akashnavik.algo.dataList.heapInfo
import com.akashnavik.algo.dataList.inImag
import com.akashnavik.algo.dataList.insertionInfo
import com.akashnavik.algo.dataList.liSearch
import com.akashnavik.algo.dataList.linearInfo
import com.akashnavik.algo.dataList.mImag
import com.akashnavik.algo.dataList.mergeInfo
import com.akashnavik.algo.dataList.qImag
import com.akashnavik.algo.dataList.quickInfo
import com.akashnavik.algo.dataList.sImag
import com.akashnavik.algo.dataList.selectionInfo
import com.akashnavik.algo.ui_layer.dataStructure.arraysFinal
import com.akashnavik.algo.ui_layer.dataStructure.binarySearchTreesFinal
import com.akashnavik.algo.ui_layer.dataStructure.hashTableFinal
import com.akashnavik.algo.ui_layer.dataStructure.heapsFinal
import com.akashnavik.algo.ui_layer.dataStructure.listFinal
import com.akashnavik.algo.ui_layer.dataStructure.queuesFinal
import com.akashnavik.algo.ui_layer.dataStructure.stacksFinal
import com.akashnavik.algo.ui_layer.dataStructure.treesFinal
import com.akashnavik.algo.ui_layer.graphSearch.AfinalScreen
import com.akashnavik.algo.ui_layer.graphSearch.BFSfinalScreen
import com.akashnavik.algo.ui_layer.graphSearch.DFSfinalScreen
import com.akashnavik.algo.ui_layer.listSearch.BinaryCard
import com.akashnavik.algo.ui_layer.listSearch.LinearCard
import com.akashnavik.algo.ui_layer.sortingFun.BubbleCard
import com.akashnavik.algo.ui_layer.sortingFun.HeapCard
import com.akashnavik.algo.ui_layer.sortingFun.InsertionCard
import com.akashnavik.algo.ui_layer.sortingFun.MergeCard
import com.akashnavik.algo.ui_layer.sortingFun.QuickCard
import com.akashnavik.algo.ui_layer.sortingFun.SelectionCard


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScreenBFinal(name:String,navHostController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = name,
                    )
                },
                navigationIcon = {
                    IconButton(onClick = { navHostController.navigate(Route.ScreenA) }) {
                        Icon(
                            Icons.Default.KeyboardArrowLeft,
                            contentDescription = null,
                            tint = Color.Black
                        )
                    }
                },
                actions = {
                    // Add any additional actions or buttons here
                    IconButton(onClick = { /*TODO*/ } , enabled = false) {
                        Icon(Icons.Default.Person, contentDescription =""
                            , tint = Color.Black
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color(255, 121, 86, 255),
                    titleContentColor = Color.Black
                )
            )
        }, modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding()
            .navigationBarsPadding()

    ) { innerPadding ->
        innerPadding
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 80.dp, start = 16.dp, end = 16.dp, bottom = 10.dp),
            contentAlignment = Alignment.Center
        ) {
            when (name) {
                "Bubble Sort" -> BubbleCard(bubbleInfo, bImag)
                "Selection Sort" -> SelectionCard(selectionInfo, sImag)
                "Insertion Sort" -> InsertionCard(insertionInfo, inImag)
                "Heap Sort" -> HeapCard(heapInfo, hImag)
                "Merge Sort" -> MergeCard(mergeInfo , mImag)
                "Quick Sort" -> QuickCard(quickInfo, qImag)
                "Linear Search" -> LinearCard(linearInfo, liSearch)
                "Binary Search" -> BinaryCard(binaryInfo, binSearch)
                "k-means Algorithm" -> KmeansfinalScreen()
                "Breadth First Search" -> BFSfinalScreen()
                "Depth First Search" -> DFSfinalScreen()
                "A* Algorithm" -> AfinalScreen()
                "Lists" -> listFinal()
                "Arrays" -> arraysFinal()
                "Stacks" -> stacksFinal()
                "Binary Search Trees" -> binarySearchTreesFinal()
                "Queues" -> queuesFinal()
                "Hash Tables" -> hashTableFinal()
                "Heaps" -> heapsFinal()
                "Trees"-> treesFinal()
                "Tower of Hanoi" -> towerOfRecurssionFinal()
                "AboutUs" -> InfoScreen()
            }
        }
    }
}



