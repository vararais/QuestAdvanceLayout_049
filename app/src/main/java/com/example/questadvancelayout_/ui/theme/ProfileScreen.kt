package com.example.questadvancelayout_.ui.theme

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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.questadvancelayout_.R
import androidx.compose.material3.Icon
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material.icons.filled.KeyboardArrowRight


@Composable
fun ProfileScreen(modifier: Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.DarkGray)
            .padding(top = 40.dp)
            .padding(horizontal = 24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        val gambar = painterResource(id = R.drawable.mechanic)
        Image(
            painter = gambar,
            contentDescription = "Foto Profil",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(120.dp)
                .clip(CircleShape)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            horizontalArrangement = Arrangement.spacedBy(20.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.alfa),
                contentDescription = "Alfa Logo",
                modifier = Modifier.size(30.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.bentley),
                contentDescription = "Bentley Logo",
                modifier = Modifier.size(30.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.mercy),
                contentDescription = "Mercy Logo",
                modifier = Modifier.size(30.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.porsc),
                contentDescription = "Porsche Logo",
                modifier = Modifier.size(30.dp)
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = stringResource(id = R.string.namautama),
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = stringResource(id = R.string.namaalias),
            fontSize = 16.sp,
            color = Color.Yellow
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = stringResource(id = R.string.bio_profile),
            fontSize = 16.sp,
            color = Color.White
        )

        Spacer(modifier = Modifier.height(20.dp))

        Card(
            modifier= Modifier
                .height(56.dp)
                .fillMaxWidth(),
            colors = CardDefaults.cardColors(
                containerColor = Color.Yellow
            ),
            shape = RoundedCornerShape(16.dp)
        ){
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 16.dp)
            ){
                Image(
                    painter = painterResource(id = R.drawable.roda),
                    contentDescription = "Paket Bore Up",
                    modifier = Modifier.size(24.dp)
                )
                Spacer(modifier = Modifier.width(16.dp))
                Text(
                    stringResource(id = R.string.menu_1),
                    fontSize = 16.sp,
                    color = Color.Black,
                    modifier = Modifier.weight(1f)
                )
                Icon(Icons.Default.KeyboardArrowRight, null, tint = Color.Gray)
            }

        }

        Spacer(modifier = Modifier.height(16.dp))

        Card(
            modifier = Modifier
                .height(56.dp)
                .fillMaxWidth(),
            colors = CardDefaults.cardColors(
                containerColor = Color.Yellow
            ),
            shape = RoundedCornerShape(16.dp)
        ){
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 16.dp)
            ){
                Image(
                    painter = painterResource(id = R.drawable.thunder), // GANTI NAMA FILE
                    contentDescription = "Paket Flow dan ECU",
                    modifier = Modifier.size(24.dp)
                )
                Spacer(modifier= Modifier.width(16.dp))
                Text(
                    stringResource(id = R.string.menu_2),
                    fontSize = 16.sp,
                    color = Color.Black,
                    modifier = Modifier.weight(1f)
                )
                Icon(Icons.Default.KeyboardArrowRight, null, tint = Color.Gray)
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Card(
            modifier = Modifier
                .height(56.dp)
                .fillMaxWidth(),
            colors = CardDefaults.cardColors(
                containerColor = Color.Yellow
            ),
            shape = RoundedCornerShape(16.dp)
        ){
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 16.dp)
            ){
                Image(
                    painter = painterResource(id = R.drawable.flow),
                    contentDescription = "Paket CNC dan Piping",
                    modifier = Modifier.size(24.dp)
                )
                Spacer(modifier= Modifier.width(16.dp))
                Text(
                    stringResource(id = R.string.menu_3),
                    fontSize = 16.sp,
                    color = Color.Black,
                    modifier = Modifier.weight(1f)
                )
                Icon(Icons.Default.KeyboardArrowRight, null, tint = Color.Gray)
            }
        }

        Spacer(modifier = Modifier.height(150.dp))

        Card(
            modifier = Modifier
                .height(50.dp)
                .fillMaxWidth(0.8f),
            colors = CardDefaults.cardColors(
                containerColor = Color.Red
            ),
            shape = RoundedCornerShape(25.dp)
        ){
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxSize()
            ){
                Icon(
                    imageVector = Icons.Default.ExitToApp,
                    contentDescription = "LogOut",
                    tint = Color.White
                )
                Spacer(modifier= Modifier.width(8.dp))
                Text(
                    stringResource(id = R.string.keluar),
                    fontSize = 16.sp,
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                )
            }
        }

        Box(
            modifier = Modifier
                .fillMaxSize()
        ){
            Text(
                stringResource(id = R.string.legal),
                fontSize = 12.sp,
                color = Color.White,
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(bottom = 24.dp)
            )
        }

    }
}