package zw.co.guava.studentkit.ui.main.transport.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Icon
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.KeyboardArrowDown
import androidx.compose.material.icons.rounded.KeyboardArrowUp
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import zw.co.guava.studentkit.ui.composeTheme.gray
import zw.co.guava.studentkit.ui.composeTheme.lightText

@Composable
fun MyRoute(routeId: String) {
    Column(modifier = Modifier.padding(8.dp).fillMaxWidth()) {

        val (myRouteExpanded, setMyRouteExpanded) = remember { mutableStateOf(true) }

        MyRouteTopBar(myRouteExpanded = myRouteExpanded, setMyRouteExpanded = setMyRouteExpanded)
        when(myRouteExpanded) {
            true -> {
                Spacer(modifier = Modifier.padding(8.dp))
                Card(border = BorderStroke(width = 1.dp, SolidColor(gray)), elevation = 0.dp) {
                    Column {
                        TripCard()
                        TripCard()
                        TripCard()
                    }
                }

            }

            false -> {
                Text(text = "Your route has 3 trips", modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center, style = MaterialTheme.typography.body1)
            }
        }
        Spacer(modifier = Modifier.padding(16.dp))
    }
}

@Composable
fun MyRouteTopBar(myRouteExpanded: Boolean, setMyRouteExpanded: (Boolean) -> Unit) {
    Row(horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.fillMaxWidth()) {
        Column(modifier = Modifier.gravity(Alignment.CenterVertically)) {
            Text(text = "My Route", style = MaterialTheme.typography.h1)
        }
        when (myRouteExpanded) {
            false -> {
                IconButton(
                        onClick = {setMyRouteExpanded(!myRouteExpanded)}) {
                    Icon(asset = Icons.Rounded.KeyboardArrowDown, tint = lightText)
                }
            }

            true -> {
                IconButton(
                        onClick = {setMyRouteExpanded(!myRouteExpanded)}) {
                    Icon(asset = Icons.Rounded.KeyboardArrowUp, tint = lightText)
                }
            }
        }
    }

}


@Preview(showBackground = true)
@Composable
fun MyRoutePreview() {
    MyRoute(routeId = "1")
}
