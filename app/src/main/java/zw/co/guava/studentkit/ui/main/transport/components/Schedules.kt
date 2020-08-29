package zw.co.guava.studentkit.ui.main.transport.components

import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun BusSchedules() {
    Column(modifier = Modifier.padding(horizontal = 8.dp)) {
        Text(text = "Returning Buses", fontWeight = FontWeight(600), style = MaterialTheme.typography.body1)
        Spacer(modifier = Modifier.padding(8.dp))
        TripCard()
        TripCard()
        TripCard()
        TripCard()
        TripCard()
    }

}

