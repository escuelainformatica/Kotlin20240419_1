package cl.eftec.app20240419

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

// modelo, servicio.
// logica.
class Calculadora {
    var valor1 by  mutableStateOf("");
    var valor2 by mutableStateOf("");
    var suma by mutableStateOf("");
    var listado = mutableListOf<String>()

    fun sumarValor1Valor2() {
        this.suma=(this.valor1.toInt()*this.valor2.toInt()).toString()
        listado.add("$valor1,$valor2")
        this.valor1=""
        this.valor2=""
    }
}