package zw.co.guava.studentkit.ui.main.bursary.components

import androidx.compose.foundation.Icon
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import zw.co.guava.studentkit.ui.composeTheme.purple700

@Composable
fun TransactionCard() {
    Column(modifier = Modifier.padding(8.dp)) {
        Row() {
            Column(modifier = Modifier.gravity(Alignment.CenterVertically).padding(4.dp)) {
                Surface(modifier = Modifier.clip(CircleShape)) {
                    Icon(asset = Icons.Rounded.Person)
                }
            }

            Column(modifier = Modifier.weight(1f).padding(start = 8.dp)) {
                Text(text = "Fees Payment", style = MaterialTheme.typography.h1)
                ProvideEmphasis(emphasis = EmphasisAmbient.current.medium) {
                    Text(text = "3 days ago", style = MaterialTheme.typography.body2)
                }
            }

            Column() {
                Text(text = "+ 5720", color = purple700, style = MaterialTheme.typography.h1)
            }
        }

        Spacer(modifier = Modifier.padding(4.dp))
        Divider(thickness = 1.dp)
    }
}
