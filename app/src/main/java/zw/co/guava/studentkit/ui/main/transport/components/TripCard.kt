package zw.co.guava.studentkit.ui.main.transport.components

import androidx.compose.foundation.Icon
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.KeyboardArrowDown
import androidx.compose.material.icons.rounded.KeyboardArrowUp
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp


@Composable
fun TripCard() {

    val (cardExpanded, setCardExpanded) = remember { mutableStateOf(false) }

    Card(
        shape = MaterialTheme.shapes.medium,
        elevation = 2.dp
    ) {
        Column {
            Row (modifier = Modifier.padding(16.dp).fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween){
                Row {
                    Text(text = "DEPARTING BUS", modifier = Modifier.padding(start=4.dp, end=4.dp), fontWeight = FontWeight(600))
                    Text(text = "・", fontWeight = FontWeight(600))
                    Text(text = "14:15", modifier = Modifier.padding(start=4.dp, end=4.dp), fontWeight = FontWeight(600))
                }

                Column {
                    when (cardExpanded) {
                        false -> {
                            IconButton(
                                modifier = Modifier.height(16.dp).width(16.dp),
                                onClick = {setCardExpanded(!cardExpanded)}) {
                                Icon(asset = Icons.Rounded.KeyboardArrowDown)
                            }
                        }

                        true -> {
                            IconButton(
                                modifier = Modifier.height(16.dp).width(16.dp),
                                onClick = {setCardExpanded(!cardExpanded)}) {
                                Icon(asset = Icons.Rounded.KeyboardArrowUp)
                            }
                        }
                    }
                }
            }
            Divider(thickness = 0.5.dp)

            when(cardExpanded) {
                false -> {
                    TripCardDefault()
                }

                true -> {
                    TripCardExpanded()
                }
            }
        }
    }
    Spacer(modifier = Modifier.padding(8.dp))
}

@Composable
fun TripCardDefault() {
    Row (modifier = Modifier.padding(16.dp).fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween){
        Column {
            Text(text = "14:15", modifier = Modifier.padding(start=4.dp, end=4.dp), fontWeight = FontWeight(600))
            Text(text = "Departs", style = MaterialTheme.typography.body2)
        }

        Column {
            Text(text = "15:00", modifier = Modifier.padding(start=4.dp, end=4.dp), fontWeight = FontWeight(600))
            Text(text = "Returns", style = MaterialTheme.typography.body2)
        }
    }
    Row(modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)) {
        Text(text = "4 stops along the way", style = MaterialTheme.typography.body2)
        Text(text = "・", style = MaterialTheme.typography.body2)
        Text(text = "0 h 45 m ", style = MaterialTheme.typography.body2)

    }
}

@Composable
fun TripCardExpanded() {
    Row (modifier = Modifier.padding(16.dp).fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween){
        Column {
            Text(text = "14:15", modifier = Modifier.padding(start=4.dp, end=4.dp), fontWeight = FontWeight(600))
            Text(text = "Departs", style = MaterialTheme.typography.body2)
        }

        Column {
            Text(text = "15:00", modifier = Modifier.padding(start=4.dp, end=4.dp), fontWeight = FontWeight(600))
            Text(text = "Returns", style = MaterialTheme.typography.body2)
        }
    }
    Row(modifier = Modifier.padding(16.dp)) {
        Text(text = "4 stops along the way", style = MaterialTheme.typography.body2)
        Text(text = "・", style = MaterialTheme.typography.body2)
        Text(text = "0 h 45 m ", style = MaterialTheme.typography.body2)

    }
}