package zw.co.guava.studentkit.ui.main.modules.components

import androidx.compose.foundation.Icon
import androidx.compose.foundation.Text
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.ThumbUp
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import zw.co.guava.studentkit.ui.composeTheme.text

@Composable
fun LibraryNavList(navController: NavController) {
    Column {
        Column(modifier = Modifier.clickable(onClick = {

        })) {
            Spacer(modifier = Modifier.padding(8.dp))
            Row(horizontalArrangement = Arrangement.SpaceBetween) {
                Column (modifier = Modifier.padding(horizontal = 8.dp)) {
                    Icon(asset = Icons.Rounded.Email, tint = text, modifier = Modifier.width(20.dp).height(20.dp))
                }
                Column(modifier = Modifier.fillMaxWidth().padding(horizontal = 4.dp).gravity(Alignment.CenterVertically)) {
                    Text(text = "Catalog")
                }

                Column (modifier = Modifier.padding(horizontal = 4.dp)) {
                    Text(text = "2", color = MaterialTheme.colors.onSecondary)
                }
            }
            Spacer(modifier = Modifier.padding(8.dp))
            Divider()
        }

        Column {
            Column(modifier = Modifier.clickable(onClick = {

            })) {
                Spacer(modifier = Modifier.padding(8.dp))
                Row(horizontalArrangement = Arrangement.SpaceBetween) {
                    Column (modifier = Modifier.padding(horizontal = 8.dp)) {
                        Icon(asset = Icons.Rounded.ThumbUp, tint = text, modifier = Modifier.width(20.dp).height(20.dp))
                    }
                    Column(modifier = Modifier.fillMaxWidth().padding(horizontal = 4.dp).gravity(Alignment.CenterVertically)) {
                        Text(text = "Timetable")
                    }

                    Column (modifier = Modifier.padding(horizontal = 4.dp)) {
                        Text(text = "2", color = MaterialTheme.colors.onSecondary)
                    }
                }
                Spacer(modifier = Modifier.padding(8.dp))
                Divider()
            }
        }

    }
}