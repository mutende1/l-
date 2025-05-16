
package com.example.bizeasy.ui.theme.screens.login


import android.content.Intent

import androidx.compose.foundation.Image

import androidx.compose.foundation.background

import androidx.compose.foundation.clickable

import androidx.compose.foundation.layout.Arrangement

import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Spacer

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize

import androidx.compose.foundation.layout.fillMaxWidth

import androidx.compose.foundation.layout.height

import androidx.compose.foundation.layout.padding

import androidx.compose.foundation.layout.wrapContentHeight

import androidx.compose.foundation.layout.wrapContentWidth

import androidx.compose.material3.Button

import androidx.compose.material3.ButtonDefaults

import androidx.compose.material3.OutlinedTextField

import androidx.compose.material3.Text

import androidx.compose.runtime.Composable

import androidx.compose.runtime.getValue

import androidx.compose.runtime.mutableStateOf

import androidx.compose.runtime.remember

import androidx.compose.runtime.setValue

import androidx.compose.ui.Alignment

import androidx.compose.ui.Modifier

import androidx.compose.ui.graphics.Color

import androidx.compose.ui.platform.LocalContext

import androidx.compose.ui.res.painterResource

import androidx.compose.ui.text.buildAnnotatedString

import androidx.compose.ui.text.font.FontFamily

import androidx.compose.ui.text.font.FontStyle

import androidx.compose.ui.text.style.TextAlign

import androidx.compose.ui.tooling.preview.Preview

import androidx.compose.ui.unit.dp

import androidx.compose.ui.unit.sp

import androidx.lifecycle.viewmodel.compose.viewModel

import androidx.navigation.NavController

import androidx.navigation.compose.rememberNavController

import com.example.bizeasy.R

import com.example.bizeasy.data.AuthViewModel

import com.example.bizeasy.navigation.ROUTE_REGISTER


@Composable

fun LoginScreen(navController: NavController){

    val authViewModel: AuthViewModel = viewModel()

    var email by remember { mutableStateOf(value = "") }

    var password by remember { mutableStateOf(value = "") }

    val context = LocalContext.current

    Column (modifier = Modifier.fillMaxHeight().background(Color.Black), verticalArrangement = Arrangement.Top){

        Text(text = "Login Here",

            fontSize = 40.sp,

            color = Color.Magenta,

            fontFamily = FontFamily.SansSerif,

            fontStyle = FontStyle.Normal,

            textAlign = TextAlign.Center,

            modifier = Modifier

                .background(Color.Magenta)

                .padding(20.dp)

                .fillMaxWidth()

        )


        Image(painter = painterResource(R.drawable.logo),

            contentDescription = "logo",

            modifier = Modifier

                .wrapContentHeight()

                .fillMaxWidth()

                .height(200.dp)
                .padding(10.dp)

        )

        Spacer(modifier = Modifier.height(10.dp))


        OutlinedTextField(value = email, onValueChange = {newEmail->email=newEmail}, label = { Text(text = "Enter Email") }, placeholder = { Text(text = "Please enter your email") }, modifier = Modifier.wrapContentWidth().align(

            Alignment.CenterHorizontally))

        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(value = password,

            onValueChange = {newPassword -> password = newPassword},

            label = { Text(text = "Enter Password") },

            placeholder = { Text(text = "Please enter password") },

            modifier = Modifier.wrapContentWidth().align(Alignment.CenterHorizontally))

        Spacer(modifier = Modifier.height(15.dp))

        Button(onClick = {

            authViewModel.login(email,password, navController, context)

        }, modifier = Modifier.fillMaxWidth().align(Alignment.CenterHorizontally), colors = ButtonDefaults.buttonColors(

            Color.Magenta)) {

            Text(text = "Login")

        }

        Spacer(modifier = Modifier.height(30.dp))

        Text(text = buildAnnotatedString { append("If already registered, Login here ") }, modifier = Modifier.wrapContentWidth().align(

            Alignment.CenterHorizontally).clickable{

            navController.navigate(ROUTE_REGISTER)

        } )

    }

}


@Preview(showBackground = true, showSystemUi = true)

@Composable

fun LoginScreenPreview(){

    LoginScreen(rememberNavController())

}