package zw.co.guava.studentkit.ui.main.transport

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.Text
import androidx.compose.ui.platform.ComposeView
import zw.co.guava.studentkit.R
import zw.co.guava.studentkit.ui.composeTheme.StudentKitTheme

class TransportFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_transport, container, false).apply {
            findViewById<ComposeView>(R.id.transportComposeView).setContent {
                StudentKitTheme() {
                    Text(text = "TransportView in Compose")
                }
            }
        }
    }


}