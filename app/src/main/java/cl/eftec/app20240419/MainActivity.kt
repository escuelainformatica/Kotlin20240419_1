package cl.eftec.app20240419

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import cl.eftec.app20240419.ui.theme.APp20240419Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            APp20240419Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val modelo by remember {mutableStateOf(Calculadora())}
                    Column {
                        TextField(value = modelo.valor1, onValueChange = {modelo.valor1=it })
                        TextField(value = modelo.valor2, onValueChange = {modelo.valor2=it})
                        ElevatedButton(onClick = {
                            modelo.sumarValor1Valor2();
                        }) {
                            Text("Sumar valores")
                        }
                        Text(modelo.suma)
                        for (texto in modelo.listado) {
                            Text(texto)
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    APp20240419Theme {
        Greeting("Android")
    }
}