package com.akashnavik.algo.ui_layer


import android.net.Uri
import android.widget.VideoView
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.ui.res.painterResource
import com.akashnavik.algo.R
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import com.akashnavik.algo.ui_layer.graphSearch.CodeBlock
import com.akashnavik.algo.ui_layer.graphSearch.Section


@Preview(showBackground = true)
@Composable
fun towerOfRecurssionFinal() {
    Box(modifier = Modifier
        .background(color = Color.White)
        .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
            TowerOfHanoiInfo()
    }
}

@Composable
fun TowerOfHanoiInfo() {
    val scrollState = rememberScrollState()
    val context = LocalContext.current
    val videoUri = android.net.Uri.parse("android.resource://" + context.packageName + "/" + R.raw.toh2)
    val videoUri1 = android.net.Uri.parse("android.resource://" + context.packageName + "/" + R.raw.toh3)
    Column(
        modifier = Modifier
            .padding(4.dp)
            .verticalScroll(scrollState)
            .fillMaxSize()
    ) {
        Text(
            text = "Tower of Hanoi",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(text = "Tower of Hanoi, is a mathematical puzzle which consists of three towers (pegs) and more than one rings is as depicted −")
        Row(modifier = Modifier
            .fillMaxWidth()
            .height(200.dp),) {
            Image(
                painter = painterResource(id = R.drawable.toh1), contentDescription = null,
                modifier = Modifier
                    .fillMaxSize()
            )
        }
        Text(text = "These rings are of different sizes and stacked upon in an ascending order, i.e. the smaller one sits over the larger one. There are other variations of the puzzle where the number of disks increase, but the tower count remains the same.")
        Section(title = "Rules",
            content ="The mission is to move all the disks to some another tower without violating the sequence of arrangement. A few rules to be followed for Tower of Hanoi are −")
        CodeBlock(code ="\n1.\tOnly one disk can be moved among the towers at any given time.\n" +
                "\n2.\tOnly the \"top\" disk can be removed.\n" +
                "\n3.\tNo large disk can sit over a small disk.\n"
        )
        Text(text = "Following is an animated representation of solving a Tower of Hanoi puzzle with three disks.")
        Row(modifier = Modifier
            .fillMaxWidth()
            .height(200.dp),) {
            VideoView(video = videoUri)
        }
        Text(text = "Tower of Hanoi puzzle with n disks can be solved in minimum 2n−1 steps. This presentation shows that a puzzle with 3 disks has taken 23 - 1 = 7 steps.")
        Section(title ="Algorithm" , content ="o write an algorithm for Tower of Hanoi, first we need to learn how to solve this problem with lesser amount of disks, say → 1 or 2. We mark three towers with name, source, destination and aux (only to help moving the disks). If we have only one disk, then it can easily be moved from source to destination peg.\n" +
                "\n" +
                "If we have 2 disks −" 
        )
        CodeBlock(
            code = "\n\tFirst, we move the smaller (top) disk to aux peg.\n" +
                    "\n\tThen, we move the larger (bottom) disk to destination peg.\n" +
                    "\n\tAnd finally, we move the smaller disk from aux to destination peg.\n"
        )
        Row(modifier = Modifier
            .fillMaxWidth()
            .height(200.dp),) {
            VideoView(video = videoUri1)
        }
        Text(text = "So now, we are in a position to design an algorithm for Tower of Hanoi with more than two disks. We divide the stack of disks in two parts. The largest disk (nth disk) is in one part and all other (n-1) disks are in the second part.\n" +
                "\n" +
                "Our ultimate aim is to move disk n from source to destination and then put all other (n1) disks onto it. We can imagine to apply the same in a recursive way for all given set of disks.\n" +
                "\n" +
                "The steps to follow are −"
        )
        CodeBlock(code =
                "\nStep 1 − Move n-1 disks from source to aux\n" +
                "\nStep 2 − Move nth disk from source to dest\n" +
                "\nStep 3 − Move n-1 disks from aux to dest\n")
        Text(text = "A recursive algorithm for Tower of Hanoi can be driven as follows −")
        CodeBlock(code ="""
            START
            Procedure Hanoi(disk, source, dest, aux)

               IF disk == 1, THEN
                  move disk from source to dest             
               ELSE
                  Hanoi(disk - 1, source, aux, dest)     // Step 1
                  move disk from source to dest          // Step 2
                  Hanoi(disk - 1, aux, dest, source)     // Step 3
               END IF
               
            END Procedure
            STOP
        """)
    }
}


@Composable
fun VideoView(video: Uri) {
    val context = LocalContext.current
    val videoUri = video
    AndroidView(
        factory = {
            VideoView(context).apply {
                setVideoURI(videoUri)
                setOnPreparedListener { it.isLooping = true }
                start()
            }
        },
        update = { view ->
            view.setVideoURI(videoUri)
            view.start()
        }, modifier = Modifier.fillMaxSize()
    )
}
