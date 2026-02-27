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
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Warning
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.examenparcial1.R

@Composable
fun MathSecondPart(modifier: Modifier){
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

        // Foto del usuario
        Box(
            modifier = Modifier.weight(1f).fillMaxWidth(),
            contentAlignment = Alignment.Center
        ){
            Image(
                painter = painterResource(id = R.drawable.gato11),
                contentDescription = "Perfil del usuario",
                contentScale = ContentScale.Crop,
                modifier = Modifier.size(110.dp).clip(CircleShape)
            )
        }

        // Info básica de usuario
        Column(
            modifier = Modifier.weight(0.5f).fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
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

        // Botón
        Box(
            modifier = Modifier.weight(0.5f).fillMaxWidth(),
            contentAlignment = Alignment.Center
        ){
            Button({},
                modifier = Modifier
                    .fillMaxWidth()
                    .height(65.dp)
                    .padding(top = 16.dp)
                    .shadow(elevation = 15.dp, shape = RoundedCornerShape(20.dp)),
                colors = ButtonDefaults.buttonColors(Color.White),

                ){
                Row(
                    modifier = Modifier.weight(1f).fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                ){
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            imageVector = Icons.Default.Warning,
                            contentDescription = "Alerta",
                            tint = Color.Black
                        )

                        Text(
                            text = " Deadline is coming!",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black
                        )
                    }

                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                        contentDescription = "Alerta",
                        tint = Color.LightGray
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        // Texto donde solo está "Learning"
        Box(
            modifier = Modifier.weight(0.5f).fillMaxWidth(),
            contentAlignment = Alignment.CenterStart
        ){
            Text(
                text = "Learning",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )
        }

        // Primera tarjeta de cursos
        Box(
            modifier = Modifier
                .weight(1.5f)
                .fillMaxWidth(),

            contentAlignment = Alignment.CenterStart
        ){
            Image(
                painter = painterResource(id = R.drawable.tarjeta3),
                contentDescription = "Gato",
                contentScale = ContentScale.Fit,
                modifier = Modifier.fillMaxWidth().clip(RoundedCornerShape(16.dp))
            )

            Column(
                modifier = Modifier.padding(start = 16.dp)
            ){
                Text(
                    text = "Autumn Term",
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )

                Spacer(modifier = Modifier.height(6.dp))

                Text(
                    text = "Week 1",
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
                        tint = Color(0xFF9292FF)
                    )

                    Text(
                        text = " Start",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF9292FF)
                    )
                }
            }
        }

        // Segunda tarjeta de cursos
        Box(
            modifier = Modifier
                .weight(1.5f)
                .fillMaxWidth(),

            contentAlignment = Alignment.CenterStart
        ){
            Image(
                painter = painterResource(id = R.drawable.tarjeta2),
                contentDescription = "Gato",
                contentScale = ContentScale.Fit,
                modifier = Modifier.fillMaxWidth().clip(RoundedCornerShape(16.dp))
            )

            Column(
                modifier = Modifier.padding(start = 16.dp)
            ){
                Text(
                    text = "Try for 7 days",
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )

                Spacer(modifier = Modifier.height(6.dp))

                Text(
                    text = "Day 2",
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
                        tint = Color(0xFF64D3FF)
                    )

                    Text(
                        text = " Start",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF64D3FF)
                    )
                }
            }
        }

    }
}

@Preview
@Composable
fun MathSecondPartPreview(){
    MathSecondPart(modifier = Modifier)
}