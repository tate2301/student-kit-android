package zw.co.guava.studentkit.ui.main.bursary.components

import androidx.compose.foundation.Icon
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview

@Composable
fun CanteenAccountTopbar() {
    Card(modifier = Modifier.padding(8.dp).fillMaxWidth()) {
        Column(modifier = Modifier.padding(16.dp)) {
            Column() {
                ProvideEmphasis(emphasis = EmphasisAmbient.current.medium) {
                    Text(text = "Canteen Balance", style = MaterialTheme.typography.h1)
                }
                Spacer(modifier = Modifier.padding(4.dp))
                Text(text = "ZWL8,317", style = MaterialTheme.typography.h4)
                Spacer(modifier = Modifier.padding(8.dp))

            }
        }
    }
}

