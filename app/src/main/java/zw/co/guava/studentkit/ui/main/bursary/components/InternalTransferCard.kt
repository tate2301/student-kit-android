package zw.co.guava.studentkit.ui.main.bursary.components

import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.ui.tooling.preview.Preview
import zw.co.guava.studentkit.R

@Composable
fun InternalTransferCard(navController: NavController) {
    Surface(modifier = Modifier.padding(8.dp).fillMaxWidth()) {
        Column(modifier = Modifier.padding(8.dp).fillMaxWidth()) {
            Column(modifier = Modifier.padding(4.dp)) {
                Text(text = "Amount to transfer")
            }

            Column() {
                OutlinedTextField(value = "2068.00", onValueChange = {}, label = {

                }, textStyle = MaterialTheme.typography.h3, modifier = Modifier.fillMaxWidth())
            }

            Column(modifier = Modifier.padding(4.dp)) {
                Text(text = "AVAILABLE $9000")
                Spacer(modifier = Modifier.padding(8.dp))
                Text(text = "We will send a verification code to your mobile number to confirm this action")
            }

            Column(modifier = Modifier.padding(4.dp)) {
                Button(onClick = {
                    navController.navigate(R.id.verifyTransactionFragment)
                }, modifier = Modifier.fillMaxWidth()) {
                    Text(text = "Perform transaction")
                }
            }
        }
    }
}
