package com.example.laboratorio2plataformas

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import com.example.laboratorio2plataformas.ui.theme.LABORATORIO2PlataformasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LABORATORIO2PlataformasTheme {
                PantallaInicial()
            }
        }
    }
}

@Composable
fun PantallaInicial() {
    val context = LocalContext.current

    Scaffold(
        modifier = Modifier.fillMaxSize()
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(24.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Laboratorio 2 - Daniel Sandoval",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(text = "¡Bienvenido a mi primera interacción con Jetpack Compose!")
            Spacer(modifier = Modifier.height(32.dp))
            Button(onClick = {
                Toast.makeText(context, "¡Lab 2 usando Jetpack Compose!", Toast.LENGTH_SHORT).show()
            }) {
                Text("Presióname")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PantallaInicialPreview() {
    LABORATORIO2PlataformasTheme {
        PantallaInicial()
    }
}
