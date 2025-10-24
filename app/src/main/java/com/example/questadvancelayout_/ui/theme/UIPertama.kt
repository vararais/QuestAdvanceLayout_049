package com.example.questadvancelayout_.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.AlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.questadvancelayout_.R

@Composable
fun AktivitasPertama(modifier: Modifier){
    Column(modifier= Modifier
        .padding(top = 100.dp)
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = stringResource(id = R.string.prodi),
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = stringResource(id = R.string.univ),
            fontSize = 18.sp
        )

        Spacer(modifier = Modifier.height(height = 25.dp))

        Card(
            modifier = Modifier
                .height(height = 160.dp)
                .fillMaxWidth(fraction = 1f)
                .padding(all = 12.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.DarkGray
            )
        ){
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(all = 10.dp)
            ){
                val gambar = painterResource(id = R.drawable.logo_umy)
                Image(
                    painter = gambar,
                    contentDescription = null,
                    modifier = Modifier
                        .size(size = 100.dp)
                        .padding(all = 5.dp)
                )

                Spacer(modifier = Modifier.width(width = 30.dp))
                Column() {
                    Text(
                        stringResource(R.string.nama),
                        fontSize = 30.sp,
                        fontFamily = FontFamily.Cursive,
                        color = Color.White,
                        modifier= Modifier.padding(top = 15.dp)
                    )

                    Text(
                        stringResource(R.string.alamat),
                        fontSize = 20.sp,
                        color = Color.Yellow,
                        modifier = Modifier.padding(top = 10.dp)
                    )
                }
            }
        }
    }
}