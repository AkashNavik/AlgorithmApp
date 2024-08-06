package com.akashnavik.algo.ui_layer

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.akashnavik.algo.Navigation.Route
import com.akashnavik.algo.R
import com.akashnavik.algo.dataList.ListGraphSearchlist
import com.akashnavik.algo.dataList.ListSortinglist
import com.akashnavik.algo.dataList.chusteringlist
import com.akashnavik.algo.dataList.datastructurelist
import com.akashnavik.algo.dataList.mainTopic
import com.akashnavik.algo.dataList.otherlist
import com.akashnavik.algo.dataList.recursionlist
import com.akashnavik.algo.dataList.sortinglist
import com.akashnavik.algo.dataList.topicMainList


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScreenAFinal (navHostController: NavHostController){
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Algorithm")
                },
                navigationIcon = {
                    IconButton(onClick = { navHostController.navigate(Route.ScreenA) }) {
                        Icon(
                            Icons.Default.KeyboardArrowLeft,
                            contentDescription = null,
                            tint = Color.Black,
                        )
                    }
                },
                actions = {
                    IconButton(onClick = {  } , enabled = false) {
                        Icon(
                            Icons.Default.MoreVert,
                            contentDescription = null,
                            tint = Color.Black,
                            )
                    } },colors = TopAppBarDefaults.topAppBarColors(
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
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 50.dp)
            , horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Content(navHostController, topicMainList)
        }
    }
}



@Composable
fun Content(navHostController: NavHostController,topic: List<mainTopic>) {
    Column(modifier = Modifier.fillMaxSize()
        , horizontalAlignment = Alignment.CenterHorizontally
        , verticalArrangement = Arrangement.Top
    ) {
        Image(
            painter = painterResource(id = R.drawable.app),
            contentDescription = null, modifier = Modifier
                .weight(0.4f)
        )
        LazyColumn(modifier = Modifier
            .fillMaxWidth()
            .weight(0.6f)
        ) {
            items(topic.size) {
                item->
                ListWithColour(navHostController,topic[item].topicName,topic[item].id,topic[item].color)
            }
        }
    }
}


@Composable
fun ListWithColour(navHostController: NavHostController,topicName:String ,topicId : Int,color: Color) {
    var listOpen by remember {
        mutableStateOf(true) }
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(40.dp)
            .clickable { listOpen = !listOpen }
            .background(color = Color(color.value)),
        verticalAlignment = Alignment.CenterVertically
        , horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Icon(Icons.Default.KeyboardArrowDown, contentDescription = "")
        Text(
            text = topicName,
            modifier = Modifier.padding(start = 4.dp),
            style = TextStyle(
                fontSize = 22.sp,
                fontWeight = FontWeight.Medium,
                fontFamily = FontFamily.SansSerif
            )
        )
    }
    if (listOpen) {
        when(topicId){
            1 -> childList(sortinglist, id = 1, color = Color(87, 164, 255, 255), navHostController)
            2 -> childList(ListSortinglist, id = 2, color = Color(255,121,86),navHostController)
            3 -> childList(chusteringlist, id = 3, color = Color(255, 235, 153, 255), navHostController)
            4 -> childList(ListGraphSearchlist, id = 4, color = Color(103, 253, 115, 255), navHostController)
            5 -> childList(datastructurelist, id = 5, color = Color(255, 72, 107, 255), navHostController)
            6 -> childList(recursionlist, id = 6, color = Color(176, 86, 255, 255), navHostController)
            7 -> childList(otherlist, id = 7, color = Color(0, 219, 143, 255), navHostController)
        }
    }
}


@Composable
fun childList(childName:List<String> ,id:Int ,color: Color ,navHostController: NavHostController) {
    Column(modifier = Modifier.fillMaxWidth()) {
        for (i in 0..childName.size-1) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(30.dp)
                    .clickable { navHostController.navigate(Route.ScreenB + "/${childName[i]}") }
                    .padding(start = 10.dp, end = 10.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row {
                    Icon(
                        painter = painterResource(id = R.drawable.bookicon),
                        contentDescription = null
                    )
                    Spacer(modifier = Modifier.size(10.dp))
                    Text(
                        text = childName[i],
                        style = TextStyle(
                            fontSize = 20.sp,
                            fontWeight = FontWeight.SemiBold,
                            fontFamily = FontFamily.SansSerif
                        )
                    )
                }
                Icon(Icons.Default.PlayArrow, contentDescription = null , tint = color)

            }
        }
    }
}














