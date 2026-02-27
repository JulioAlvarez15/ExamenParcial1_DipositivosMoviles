package com.example.examenparcial1.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.examenparcial1.R

@Composable
fun MathFirstPart(modifier: Modifier){
    Column(
        modifier = modifier.fillMaxSize().background(Color.White).padding(16.dp), // Ajustarse a la pantalla
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        // Texto del Onion Math
        Box(
            modifier = Modifier.weight(0.5f).fillMaxWidth(),
            contentAlignment = Alignment.Center
        ){
            Text(
                text = "Onion Math",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )
        }

        // Info básica de usuario
        Row(
            modifier = Modifier.weight(1f).fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ){
            Row(
                verticalAlignment = Alignment.CenterVertically
            ){
                Image(
                    painter = painterResource(id = R.drawable.gato11),
                    contentDescription = "Perfil del usuario",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.size(80.dp).clip(CircleShape)
                )

                Column(
                    modifier = Modifier.padding(start = 16.dp)
                ){
                    Text(
                        text = "Tilin",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Text(
                        text = "Grade 4",
                        fontSize = 16.sp,
                        color = Color.Gray
                    )
                }
            }

            Row(
                modifier = Modifier.padding(start = 16.dp)
            ){
                Icon(
                    imageVector = Icons.Default.AccountCircle,
                    contentDescription = "Grade",
                    tint = Color.Gray
                )

                Text(
                    text = " Grade",
                    fontSize = 20.sp
                )
            }
        }

        // Texto donde solo está "Start"
        Box(
            modifier = Modifier.weight(0.5f).fillMaxWidth(),
            contentAlignment = Alignment.CenterStart
        ){
            Text(
                text = "Start",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )
        }

        // Tarjeta verde grandota
        Box(
            modifier = Modifier
                .weight(2f)
                .fillMaxWidth(),

            contentAlignment = Alignment.CenterStart
        ){
            Image(
                painter = painterResource(id = R.drawable.tarjeta1),
                contentDescription = "Gato",
                contentScale = ContentScale.Fit,
                modifier = Modifier.fillMaxWidth().clip(RoundedCornerShape(16.dp))
            )

            Column(
                modifier = Modifier.padding(start = 16.dp)
            ){
                Text(
                    text = "Numbers",
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )

                Spacer(modifier = Modifier.height(6.dp))

                Text(
                    text = "Hello cuddly numbers!",
                    fontSize = 16.sp,
                    color = Color.White
                )

                Button({},
                    modifier = Modifier
                        .padding(top = 16.dp)
                        .shadow(elevation = 15.dp, shape = RoundedCornerShape(20.dp)),
                    colors = ButtonDefaults.buttonColors(Color.White),
                ){
                    Icon(
                        imageVector = Icons.Default.PlayArrow,
                        contentDescription = "Start",
                        tint = Color(0xFFAADC35)
                    )

                    Text(
                        text = " Start",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFFAADC35)
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Texto donde solo está "Courses"
        Box(
            modifier = Modifier.weight(0.5f).fillMaxWidth(),
            contentAlignment = Alignment.CenterStart
        ){
            Text(
                text = "Courses",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )
        }

        // Primera tarjeta de promos
        Row(
            modifier = Modifier.weight(1f).fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ){
            Row(
                verticalAlignment = Alignment.CenterVertically
            ){
                Image(
                    painter = painterResource(id = R.drawable.tarjeta2),
                    contentDescription = "Promoción 1",
                    contentScale = ContentScale.Crop,
                    alignment = Alignment.CenterEnd,
                    modifier = Modifier.size(100.dp).clip(RoundedCornerShape(16.dp))
                )

                Column(
                    modifier = Modifier.padding(start = 16.dp)
                ){
                    Text(
                        text = "Try for 7 days",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Text(
                        text = "Start on Aug. 1st",
                        fontSize = 16.sp,
                        color = Color.Gray
                    )
                }
            }

            Column(
                modifier = Modifier.padding(start = 16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text(
                    text = "¥9.9",
                    fontSize = 26.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFFE98986)
                )

                Text(
                    text = "¥98",
                    fontSize = 16.sp,
                    color = Color.Gray,
                    textDecoration = TextDecoration.LineThrough,
                    modifier = Modifier.background(Color.LightGray, RoundedCornerShape(4.dp))
                )
            }
        }

        // Segunda tarjeta de promos
        Row(
            modifier = Modifier.weight(1f).fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ){
            Row(
                verticalAlignment = Alignment.CenterVertically
            ){
                Image(
                    painter = painterResource(id = R.drawable.tarjeta3),
                    contentDescription = "Promoción 2",
                    contentScale = ContentScale.Crop,
                    alignment = Alignment.CenterEnd,
                    modifier = Modifier.size(100.dp).clip(RoundedCornerShape(16.dp))
                )

                Column(
                    modifier = Modifier.padding(start = 16.dp)
                ){
                    Text(
                        text = "Autumn Term",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Text(
                        text = "Start on Sep. 1st",
                        fontSize = 16.sp,
                        color = Color.Gray
                    )
                }
            }

            Column(
                modifier = Modifier.padding(start = 16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text(
                    text = "¥398",
                    fontSize = 26.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFFE98986)
                )

                Text(
                    text = "¥1288",
                    fontSize = 16.sp,
                    color = Color.Gray,
                    textDecoration = TextDecoration.LineThrough,
                    modifier = Modifier.background(Color.LightGray, RoundedCornerShape(4.dp))
                )
            }
        }

    }
}

@Preview
@Composable
fun MathFirstPartPreview(){
    MathFirstPart(modifier = Modifier)
}