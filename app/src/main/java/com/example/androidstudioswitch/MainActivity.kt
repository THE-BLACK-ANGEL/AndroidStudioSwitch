package com.example.androidstudioswitch

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SwitchClase()
        }
    }
}



@Preview(showBackground = true)
@Composable
fun Preview() {
    SwitchClase()
}

@Composable
fun SwitchClase(modifier: Modifier = Modifier){

    var marcado by rememberSaveable { mutableStateOf(false) }
    var marcado2 by rememberSaveable { mutableStateOf(false) }
    val texto = if (marcado) "Marcado" else "No Marcado"
    val texto2 = if (marcado2) "Marcado" else "No Marcado"
    val color1 = if (marcado) Color.Green else Color.Red
    val color2 = if (marcado2) Color.Green else Color.Magenta

    Column ( modifier.fillMaxSize() ){

        Row ( modifier.padding(top = 200.dp, start = 20.dp).fillMaxWidth(), horizontalArrangement = Arrangement.Center ){
            Column { Image(painter = painterResource(R.drawable.shrek), contentDescription = null) }
        }
        Row( modifier.padding(top = 20.dp, start = 20.dp) ){
            Column{ Icon(imageVector = Icons.Default.Star , contentDescription = null, modifier.padding(10.dp), tint = color1) }
            Spacer( modifier.width(10.dp) )
            Column{ Switch(checked = marcado, onCheckedChange = { marcado = it }, colors = SwitchDefaults.colors(checkedThumbColor = color1, uncheckedThumbColor = color1, checkedTrackColor = Color.Black, uncheckedTrackColor = Color.Black )) }
            Column( modifier.padding(15.dp)){ Text(text = texto , color = color1) }
        }
        Row ( modifier.padding(top = 20.dp, start = 20.dp) ){
            Column{ Icon(imageVector = Icons.Default.Done , contentDescription = null, modifier.padding(10.dp), tint = color2) }
            Spacer( modifier.width(10.dp) )
            Column{ Switch(checked = marcado2, onCheckedChange = { marcado2 = it }, colors = SwitchDefaults.colors(checkedThumbColor = color2, uncheckedThumbColor = color2, checkedTrackColor = Color.Black, uncheckedTrackColor = Color.Black )) }
            Column( modifier.padding(15.dp)){ Text(text = texto2 , color = color2) }
        }
        Row( modifier.padding(top = 20.dp, start = 20.dp).fillMaxWidth(), horizontalArrangement = Arrangement.Center ){
            Column { Text(text = "Trabajo realizdo por Angel Miguel Muñoz Castaño") }
        }

    }



}