package zw.co.guava.studentkit.ui.main.notifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.compose.foundation.ScrollableColumn
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Divider
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.unit.dp
import androidx.fragment.app.Fragment
import zw.co.guava.studentkit.R
import zw.co.guava.studentkit.ui.composeTheme.StudentKitTheme
import zw.co.guava.studentkit.ui.main.notifications.components.NotificationCard
import zw.co.guava.studentkit.ui.main.notifications.components.StudentKitNotification

class NotificationsFragment : Fragment() {


    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        return ComposeView(requireContext()).apply {
            setContent {
                StudentKitTheme() {
                    ScrollableColumn(modifier = Modifier.padding()) {
                        val notification = StudentKitNotification(text = "Some new notification for you", time = 1039939093)

                        NotificationCard(notification = notification)
                        NotificationCard(notification = notification)
                        NotificationCard(notification = notification)

                    }
                }
            }
        }
    }
}