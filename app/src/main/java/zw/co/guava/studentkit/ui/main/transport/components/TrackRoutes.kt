package zw.co.guava.studentkit.ui.main.transport.components

import android.widget.Space
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Switch
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview

@Composable
fun TrackRoutes(trackRoute: Boolean, setTrackRoute: (Boolean) -> Unit) {
    Column(modifier = Modifier.padding(8.dp)) {
        Text(
           text="TRACK ROUTES",
            fontWeight = FontWeight(500),
            style = MaterialTheme.typography.body1
        )

        Row {
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = "Get notifications when buses going along your route are about to leave campus or are about to get to your bus stop.",
                    style = MaterialTheme.typography.body1
                )
            }
            Spacer(modifier = Modifier.padding(8.dp))
            Switch(checked = trackRoute, onCheckedChange = setTrackRoute)

        }
        Spacer(modifier = Modifier.padding(8.dp))
        Text(text = "Your Bus Stop can be configured in preferences under Utilities", style = MaterialTheme.typography.body2)
        Spacer(modifier = Modifier.padding(8.dp))

    }
}

@Preview(showBackground = true)
@Composable
fun TrackRoutesPreview() {

    val (trackRoute, setTrackRoute) = remember { mutableStateOf(false) }

    TrackRoutes(trackRoute = trackRoute, setTrackRoute = setTrackRoute)
}