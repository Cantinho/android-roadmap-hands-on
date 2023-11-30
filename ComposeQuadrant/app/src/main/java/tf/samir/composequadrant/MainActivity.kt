package tf.samir.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import tf.samir.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    QuadrantGrid()
                }
            }
        }
    }
}

/**
 * Color(0xFFEADDFF)
 * Color(0xFFD0BCFF)
 * Color(0xFFB69DF8)
 * Color(0xFFF6EDFF)
 *
 * Text composable
 * Displays text and follows the recommended Material Design guidelines.
 * Image composable
 * Creates a composable that lays out and draws a given Painter class object.
 * Row composable
 * A layout composable that places its children in a horizontal sequence.
 * Column composable
 * A layout composable that places its children in a vertical sequence.
 */

@Composable
fun QuadrantGrid() {
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.weight(1F)) {
            Quadrant(
                backgroundColor = Color(0xFFEADDFF),
                title = "Text composable",
                description = "Displays text and follows the recommended Material Design guidelines.",
                modifier = Modifier.weight(1F)
            )
            Quadrant(
                backgroundColor = Color(0xFFD0BCFF),
                title = "Text composable",
                description = "Displays text and follows the recommended Material Design guidelines.",
                modifier = Modifier.weight(1F)
            )
        }
        Row(Modifier.weight(1F)) {
            Quadrant(
                backgroundColor = Color(0xFFB69DF8),
                title = "Text composable",
                description = "Displays text and follows the recommended Material Design guidelines.",
                modifier = Modifier.weight(1F)
            )
            Quadrant(
                backgroundColor = Color(0xFFF6EDFF),
                title = "Text composable",
                description = "Displays text and follows the recommended Material Design guidelines.",
                modifier = Modifier.weight(1F)
            )
        }
    }
}

@Composable
fun Quadrant(backgroundColor: Color, title: String, description: String, modifier: Modifier = Modifier) {

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            modifier = Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = description,
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun QuadrantPreview() {
    ComposeQuadrantTheme {
        val color = Color(0xFFEADDFF)
        Quadrant(backgroundColor = color, title = "Text composable", description = "Displays text and follows the recommended Material Design guidelines.")
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeQuadrantTheme {
        QuadrantGrid()
    }
}

