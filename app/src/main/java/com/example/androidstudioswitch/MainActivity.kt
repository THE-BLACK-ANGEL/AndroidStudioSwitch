package com.example.androidstudioswitch

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Switch
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

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
    Switch(
        checked = marcado,
        onCheckedChange = { marcado = it },
        modifier.fillMaxSize()
    )

}