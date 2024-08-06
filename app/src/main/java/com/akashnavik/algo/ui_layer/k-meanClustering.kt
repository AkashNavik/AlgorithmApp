package com.akashnavik.algo.ui_layer

import android.icu.text.CaseMap.Title
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.akashnavik.algo.R
import com.akashnavik.algo.dataList.font2


@Composable
fun KmeansfinalScreen() {
    Box(modifier = Modifier
        .background(color = Color.White)
        .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
       StructureScreen()
    }
}
@Composable
fun StructureScreen() {
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .padding(4.dp)
            .verticalScroll(scrollState)
            .fillMaxSize()
    ) {
        Text(
            text = "K-Means Algorithm",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Section(title = "What is a K-Means Algorithm?"
            ,content = "K-Means Clustering is an Unsupervised Learning algorithm, which groups the unlabeled dataset into different clusters. Here K defines the number of pre-defined clusters that need to be created in the process, as if K=2, there will be two clusters, and for K=3, there will be three clusters, and so on.\n"+"\n"+
                    "It allows us to cluster the data into different groups and a convenient way to discover the categories of groups in the unlabeled dataset on its own without the need for any training.\n" +"\n"+
                    "It is a centroid-based algorithm, where each cluster is associated with a centroid. The main aim of this algorithm is to minimize the sum of distances between the data point and their corresponding clusters.\n"+ "\n"+
                    "The algorithm takes the unlabeled dataset as input, divides the dataset into k-number of clusters, and repeats the process until it does not find the best clusters. The value of k should be predetermined in this algorithm.\n" +
                    "\n" +
                    "\nThe k-means clustering algorithm mainly performs two tasks:\n"+
                    "1.\tDetermines the best value for K center points or centroids by an iterative process.\n" +
                    "2.\tAssigns each data point to its closest k-center. Those data points which are near to the particular k-center, create a cluster.\n" +
                    "Hence each cluster has datapoints with some commonalities, and it is away from other clusters.\n" +
                    "The below diagram explains the working of the K-means Clustering Algorithm:\n"
            ,img = R.raw.kmeans1
        )

        Section(title = "How does the K-Means Algorithm Work?"
            , content = "The working of the K-Means algorithm is explained in the below steps:\n" +
                    "Step-1:\tSelect the number K to decide the number of clusters.\n" +
                    "Step-2:\tSelect random K points or centroids. (It can be other from the input dataset).\n" +
                    "Step-3:\tAssign each data point to their closest centroid, which will form the predefined K clusters.\n" +
                    "Step-4:\tCalculate the variance and place a new centroid of each cluster.\n" +
                    "Step-5:\tRepeat the third steps, which means reassign each datapoint to the new closest centroid of each cluster.\n" +
                    "Step-6:\tIf any reassignment occurs, then go to step-4 else go to FINISH.\n" +
                    "Step-7:\tThe model is ready.\n" +
                    "Let's understand the above steps by considering the visual plots:\n"+
                    "Suppose we have two variables M1 and M2. The x-y axis scatter plot of these two variables is given below:",
            img = R.raw.kmeans2
        )
        Text(
            text = "Let's take number k of clusters, i.e., K=2, to identify the dataset and to put them into different clusters. It means here we will try to group these datasets into two different clusters.\n" +
                    "\n"+"We need to choose some random k points or centroid to form the cluster. These points can be either the points from the dataset or any other pont. So, here we are selecting the below two points as k points, which are not the part of our dataset. Consider the below image:\n",
            fontSize = 16.sp
        )
        Row(modifier = Modifier
            .fillMaxWidth()
            .height(200.dp),) {
            Image(
                painter = painterResource(id =R.raw.kmeans3), contentDescription = null,
                modifier = Modifier
                    .fillMaxSize()
            )
        }
        Text(text = "Now we will assign each data point of the scatter plot to its closest K-point or centroid.We will compute it by applying some mathematics that we have studied to calculate the distance between two points. So, we will draw a median between both the centroids. Consider the below image:")
        Row(modifier = Modifier
            .fillMaxWidth()
            .height(200.dp),) {
            Image(
                painter = painterResource(id =R.raw.kmeans4), contentDescription = null,
                modifier = Modifier
                    .fillMaxSize()
            )
        }
        Text(text = "From the above image, it is clear that points left side of the line is near to the K1 or blue centroid, and points to the right of the line are close to the yellow centroid. Let's color them as blue and yellow for clear visualization.")
        Row(modifier = Modifier
            .fillMaxWidth()
            .height(200.dp),) {
            Image(
                painter = painterResource(id =R.raw.kmeans5), contentDescription = null,
                modifier = Modifier
                    .fillMaxSize()
            )
        }
        Text(text = "As we need to find the closest cluster, so we will repeat the process by choosing a new centroid. To choose the new centroids, we will compute the center of gravity of these centroids, and will find new centroids as below:")
        Row(modifier = Modifier
            .fillMaxWidth()
            .height(200.dp),) {
            Image(
                painter = painterResource(id =R.raw.kmeans6), contentDescription = null,
                modifier = Modifier
                    .fillMaxSize()
            )
        }
        Text(text = "Next, we will reassign each datapoint to the new centroid. For this, we will repeat the same process of finding a median line. The median will be like below image:\n")
        Row(modifier = Modifier
            .fillMaxWidth()
            .height(200.dp),) {
            Image(
                painter = painterResource(id =R.raw.kmeans7), contentDescription = null,
                modifier = Modifier
                    .fillMaxSize()
            )
        }
        Text(text = "From the above image, we can see, one yellow point is on the left side of the line, and two blue points are right to the line. So, these three points will be assigned to new centroids.")
        Row(modifier = Modifier
            .fillMaxWidth()
            .height(200.dp),) {
            Image(
                painter = painterResource(id =R.raw.kmeans8), contentDescription = null,
                modifier = Modifier
                    .fillMaxSize()
            )
        }
        Text(text = "As reassignment has taken place, so we will again go to the step-4, which is finding new centroids or K-points.\n" +
                "\n" +
                "We will repeat the process by finding the center of gravity of centroids, so the new centroids will be as shown in the below image:")
        Row(modifier = Modifier
            .fillMaxWidth()
            .height(200.dp),) {
            Image(
                painter = painterResource(id =R.raw.kmeans9), contentDescription = null,
                modifier = Modifier
                    .fillMaxSize()
            )
        }
        Text(text = "As we got the new centroids so again will draw the median line and reassign the data points. So, the image will be:")
        Row(modifier = Modifier
            .fillMaxWidth()
            .height(200.dp),) {
            Image(
                painter = painterResource(id =R.raw.kmeans10), contentDescription = null,
                modifier = Modifier
                    .fillMaxSize()
            )
        }
        Text(text = "We can see in the above image; there are no dissimilar data points on either side of the line, which means our model is formed. Consider the below image:")
        Row(modifier = Modifier
            .fillMaxWidth()
            .height(200.dp),) {
            Image(
                painter = painterResource(id =R.raw.kmeans11), contentDescription = null,
                modifier = Modifier
                    .fillMaxSize()
            )
        }
        Text(text = "As our model is ready, so we can now remove the assumed centroids, and the two final clusters will be as shown in the below image:")
        Row(modifier = Modifier
            .fillMaxWidth()
            .height(200.dp),) {
            Image(
                painter = painterResource(id =R.raw.kmeans12), contentDescription = null,
                modifier = Modifier
                    .fillMaxSize()
            )
        }

    }
}

@Composable
fun Section(title: String, content: String ,img: Int) {
    Column(
        modifier = Modifier.padding(bottom = 16.dp)
    ) {
        Text(
            text = title,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = content,
            fontSize = 16.sp
        )
        Row(modifier = Modifier
            .fillMaxWidth()
            .height(200.dp),) {
            Image(
                painter = painterResource(img), contentDescription = null,
                modifier = Modifier
                    .fillMaxSize()
            )
        }
    }
}

@Composable
fun CodeBlock(code: String) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .padding(vertical = 8.dp)
    ) {
        Text(
            text = code,
            fontSize = 16.sp,
            color = Color.White
        )
    }
}