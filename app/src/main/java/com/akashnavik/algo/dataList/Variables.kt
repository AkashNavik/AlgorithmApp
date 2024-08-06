package com.akashnavik.algo.dataList

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import com.akashnavik.algo.R

var font1 = FontFamily(Font(R.font.northglamour))
var font2 = FontFamily(Font(R.font.kom))

var sortinglist =  mutableListOf(
    "Bubble Sort",
    "Selection Sort",
    "Insertion Sort",
    "Heap Sort",
    "Merge Sort",
    "Quick Sort",
)
var chusteringlist =  mutableListOf("k-means Algorithm",)
var ListSortinglist =  mutableListOf(
    "Linear Search",
    "Binary Search",
)
var ListGraphSearchlist =  mutableListOf(
    "Breadth First Search",
    "Depth First Search",
    "A* Algorithm"
)
//var mathlist =  mutableListOf(
//    "Euclidian Algorithm",
//    "Primality Number",
//)
//var securitylist =  mutableListOf(
//    "Security Basics",
//    "Encryption Basic",
//    "Hash Function",
//    "Shared-key Cryptography",
//    "Public-key Cryptography",
//    "Hybrid Cryptography","Diffie-Hellman Key Exchange",
//    "Message Authentication Code",
//    "Digital Signature",
//    "Digital Certificate",)
var datastructurelist =  mutableListOf(
    "Lists"
    ,"Arrays"
    ,"Stacks"
    ,"Queues"
    ,"Trees"
    ,"Heaps"
    ,"Hash Tables"
    ,"Binary Search Trees",
)
//var weblist =  mutableListOf("PageRank")
var recursionlist =  mutableListOf("Tower of Hanoi",)
var otherlist =  listOf<String>("AboutUs")


var topicMainList  = listOf<mainTopic>(
    mainTopic("Sorting", Color(87, 164, 255, 255), 1),
    mainTopic("List Search", Color(255, 235, 153, 255),2),
    mainTopic("Clustering", Color(255,121,86),3),
    mainTopic("Graph Search", Color(103, 253, 115, 255),4),
    mainTopic("Data Structure", Color(255, 72, 107, 255),5),
    mainTopic("Recursion", Color(176, 86, 255, 255),6),
    mainTopic("Other", Color(0, 219, 143, 255),7),
)