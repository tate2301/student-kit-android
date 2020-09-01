package zw.co.guava.studentkit.ui.main.bursary.components

import androidx.compose.foundation.Icon
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import zw.co.guava.studentkit.R

@Composable
fun MainAccountTopbar(navController: NavController) {
    Card(modifier = Modifier.padding(8.dp).fillMaxWidth()) {
        Column(modifier = Modifier.padding(16.dp)) {
            Column() {
                ProvideEmphasis(emphasis = EmphasisAmbient.current.medium) {
                    Text(text = "Main Balance", style = MaterialTheme.typography.h1)
                }
                Spacer(modifier = Modifier.padding(4.dp))
                Text(text = "ZWL8,317", style = MaterialTheme.typography.h4)
                Spacer(modifier = Modifier.padding(8.dp))

            }

            Column {
                OutlinedButton(onClick = {
                    navController.navigate(R.id.internalTransferFragment)
                }) {
                    Icon(asset = Icons.Rounded.Add)
                    Text(text = "Transfer to Canteen")
                }
            }
        }
    }
}
