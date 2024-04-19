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
                    var valor1 by remember { mutableStateOf("") }
                    var valor2 by remember { mutableStateOf("") }
                    var suma by remember { mutableStateOf("") }
                    Column {
                        TextField(value = valor1, onValueChange = {valor1=it })
                        TextField(value = valor2, onValueChange = {valor2=it})
                        ElevatedButton(onClick = {
                            suma=(valor1.toInt()+valor2.toInt()).toString()
                            valor1=""
                            valor2=""

                        }) {
                            Text("Sumar valores")
                        }
                        Text(suma)
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