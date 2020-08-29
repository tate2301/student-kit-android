package zw.co.guava.studentkit.ui.main.notifications.components

import androidx.compose.foundation.Box
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun NotificationCard(notification: StudentKitNotification) {
    Box(padding = 16.dp) {
        Column {
            Text(
                text=notification.text,
            )

            Spacer(Modifier.padding())

            Text(text = notification.time.toString(), style = MaterialTheme.typography.body2)
        }

    }
    Spacer(modifier = Modifier.padding())
    Divider(thickness = 1.dp)

}