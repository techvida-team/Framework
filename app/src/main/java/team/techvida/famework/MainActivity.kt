package team.techvida.famework

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import team.techvida.famework.ui.theme.FameworkTheme
import team.techvida.uppercasetexview.UppercaseText

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FameworkTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    UppercaseText(text = "Hello $name!", color = Color.White, fontSize = 18.sp)
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    FameworkTheme {
        Greeting("Android")
    }
}