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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview

@Composable
fun MyRoute(routeId: String) {
    Column(modifier = Modifier.padding(8.dp)) {

        val (myRouteExpanded, setMyRouteExpanded) = remember { mutableStateOf(false) }



        Row(horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.fillMaxWidth()) {
            Text(text = "My Route", fontWeight = FontWeight(600), style = MaterialTheme.typography.body1)
            when (myRouteExpanded) {
                false -> {
                    IconButton(
                        modifier = Modifier.height(16.dp).width(16.dp),
                        onClick = {setMyRouteExpanded(!myRouteExpanded)}) {
                        Icon(asset = Icons.Rounded.KeyboardArrowDown)
                    }
                }

                true -> {
                    IconButton(
                        modifier = Modifier.height(16.dp).width(16.dp),
                        onClick = {setMyRouteExpanded(!myRouteExpanded)}) {
                        Icon(asset = Icons.Rounded.KeyboardArrowUp)
                    }
                }
            }
        }
        when(myRouteExpanded) {
            true -> {
                Spacer(modifier = Modifier.padding(8.dp))

                TripCard()
                TripCard()
                TripCard()

            }

            false -> {
                Text(text = "Your route has 3 trips", modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center, style = MaterialTheme.typography.body1)
            }
        }
        Spacer(modifier = Modifier.padding(16.dp))
    }
}




@Preview(showBackground = true)
@Composable
fun MyRoutePreview() {
    MyRoute(routeId = "1")
}
