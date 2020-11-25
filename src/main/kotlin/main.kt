import androidx.compose.desktop.Window
import androidx.compose.material.Text
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*
import kotlinx.coroutines.FlowPreview

fun main() = Window {
    val text by remember { mutableStateOf("Hello, World!") }
    MaterialTheme {
        home(text)
    }
}

@Composable
fun home(text: String) {
    Button(onClick = {
        println(text)
    }) {
        Text(text)
    }
}