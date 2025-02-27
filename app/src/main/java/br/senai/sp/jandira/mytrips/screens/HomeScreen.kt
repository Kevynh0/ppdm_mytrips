package br.senai.sp.jandira.mytrips.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.mytrips.R

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                color = Color.White
            )
    ){
        Card(
            modifier = Modifier
                .height(50.dp)
                .width(150.dp)
                .align(Alignment.TopEnd),

            shape = RoundedCornerShape(
                bottomStart = 30.dp
            ),

            colors = CardDefaults.cardColors(
                containerColor = Color.Blue
            )

        ){}
        Card(
            modifier = Modifier
                .height(50.dp)
                .width(150.dp)
                .align(Alignment.BottomStart),

            shape = RoundedCornerShape(
                topEnd = 30.dp
            ),

            colors = CardDefaults.cardColors(
                containerColor = Color.Blue
            )
        ) {}
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp),
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = stringResource(
                    R.string.login
                ),
                fontSize = 40.sp,
                fontWeight = FontWeight.ExtraBold
            )
            Text(
                text = stringResource(
                    R.string.please
                ),
                fontSize = 20.sp,
            )
            OutlinedTextField(
                value = "user@email.com",
                onValueChange = {},
                leadingIcon = {

                    Icon(
                        imageVector = Icons.Default.Email,
                        contentDescription = "",
                        tint = Color.Black
                    )
                },
                label = {
                    Text(
                        text = stringResource(
                            R.string.email
                        )
                    )
                }
            )
            OutlinedTextField(
                value = "********",
                onValueChange = {},
                leadingIcon = {

                    Icon(
                        imageVector = Icons.Default.Lock,
                        contentDescription = "",
                        tint = Color.Black
                    )
                },
            )
            Button(onClick = {},
                modifier = Modifier

                    .align(Alignment.End)
            ){
                Text(
                    text = stringResource(
                        R.string.sign_in

                    )
                )
            }
            Row (
                modifier = Modifier
                    .align(Alignment.End)
            ){
                Text(
                    text = stringResource(
                        R.string.no_account
                    )
                )
                Text(
                    text = stringResource(
                        R.string.sign_up
                    )
                )
            }

        }
    }
}

@Preview
@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}