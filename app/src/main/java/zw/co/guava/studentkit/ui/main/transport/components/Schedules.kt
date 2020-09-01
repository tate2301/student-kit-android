package zw.co.guava.studentkit.ui.main.transport.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import zw.co.guava.studentkit.ui.composeTheme.gray

@Composable
fun BusSchedules() {
    Column(modifier = Modifier.padding(horizontal = 8.dp)) {
        DepartingBuses()
        
        Spacer(modifier = Modifier.padding(16.dp))
        ReturningBuses()
    }

}

@Composable
fun DepartingBuses() {
    Column() {
        Text(text = "Departing Buses", fontWeight = FontWeight(600), style = MaterialTheme.typography.h6)
        Spacer(modifier = Modifier.padding(8.dp))
        Card(border = BorderStroke(width = 1.dp, SolidColor(gray)), elevation = 0.dp) {
            Column {
                TripCard()

            }
        }
    }
}

@Composable
fun ReturningBuses() {
    Column() {
        Text(text = "Returning Buses", fontWeight = FontWeight(600), style = MaterialTheme.typography.h6)
        Spacer(modifier = Modifier.padding(8.dp))
        Card(border = BorderStroke(width = 1.dp, SolidColor(gray)), elevation = 0.dp) {
            Column {
                TripCard()

            }
        }
    }
}