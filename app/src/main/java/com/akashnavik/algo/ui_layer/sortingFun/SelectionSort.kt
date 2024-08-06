package com.akashnavik.algo.ui_layer.sortingFun

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.akashnavik.algo.R
import com.akashnavik.algo.dataList.sImag
import com.akashnavik.algo.dataList.selectionInfo

@Composable
fun SelectionCard(finalname: List<String> , img :List<Int> ){
    var btn by remember { mutableStateOf(true) }
    var btnforward by remember { mutableStateOf(false) }
    var btnStart by remember { mutableStateOf(false) }
    var forward by remember { mutableStateOf(0) }
    var imgForward by remember { mutableStateOf(0) }

    Column(
        modifier = Modifier.fillMaxSize()
        , horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Column(modifier = Modifier.fillMaxWidth()
            .border(2.dp, Color.Black)
            .weight(0.5f)
        ) {
            Image(
                modifier = Modifier.fillMaxSize(),
                painter = painterResource(img[imgForward]),
                contentDescription = "",
//                modifier = Modifier.border(2.dp, Color.Black)
            )
        }
        Text(
            text = "${finalname[forward]}",
            modifier = Modifier.weight(0.3f)
                .padding(top = 10.dp)
            ,
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold,
                fontFamily = FontFamily.Default
            )
        )
        Row(
            modifier = Modifier.fillMaxWidth()
                .weight(0.2f)
                .padding(bottom = 4.dp),
            verticalAlignment = Alignment.Bottom,
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            ElevatedButton(
                onClick = {
                    forward = 0
                    imgForward = 0
                    if (forward == 0) {
                        btnStart = false
                        btnforward = false
                        btn = true
                    }

                },
                enabled = btnStart,
                elevation = ButtonDefaults.buttonElevation(2.dp),
                shape = RoundedCornerShape(2.dp),
                colors = ButtonDefaults.buttonColors(
                    Color(213, 45, 29, 255)
                )
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.stepbackward),
                    contentDescription = ""
                )

            }

            ElevatedButton(
                onClick = {
                    forward = forward - 1
                    when (forward) {
                        3, 18 -> imgForward
                        else -> imgForward--
                    }
                    if (forward == 0) {
                        btnStart = false
                        btnforward = false
                        btn = true
                    } else {
                        btn = true
                    }
                },
                enabled = btnforward,
                shape = RoundedCornerShape(2.dp),
                elevation = ButtonDefaults.buttonElevation(2.dp),
                colors = ButtonDefaults.buttonColors(
                    Color(140, 180, 41, 255)
                )
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.play),
                    contentDescription = "",
                    modifier = Modifier.size(20.dp)
                )
            }
            ElevatedButton(
                onClick = {
                    forward++
                    when (forward) {
                        3, 18 -> imgForward
                        else -> imgForward++
                    }
                    if (forward < 19 && imgForward < 19) {
                        btn
                        btnStart = true
                        btnforward = true
                    } else {
                        btn = false
                        btnStart
                        btnforward
                    }
                },
                enabled = btn,
                modifier = Modifier.width(180.dp),
                shape = RoundedCornerShape(2.dp),
                colors = ButtonDefaults.buttonColors(
                    Color(255, 101, 65, 255)
                )
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(text = "Step", style = TextStyle(fontWeight = FontWeight.Bold))
                    Icon(
                        Icons.Default.KeyboardArrowRight,
                        contentDescription = ""
                    )
                }
            }
        }
    }

}