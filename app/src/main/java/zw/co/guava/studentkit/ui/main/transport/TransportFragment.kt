package zw.co.guava.studentkit.ui.main.transport

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.ScrollableColumn
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.unit.dp
import zw.co.guava.studentkit.R
import zw.co.guava.studentkit.ui.composeTheme.StudentKitTheme
import zw.co.guava.studentkit.ui.main.transport.components.BusSchedules
import zw.co.guava.studentkit.ui.main.transport.components.MyRoute
import zw.co.guava.studentkit.ui.main.transport.components.TrackRoutes

class TransportFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {



        return inflater.inflate(R.layout.fragment_transport, container, false).apply {
            findViewById<ComposeView>(R.id.transportComposeView).setContent {
                val (trackRoute, setTrackRoute) = remember { mutableStateOf(false) }


                StudentKitTheme() {
                    StudentKitTheme() {
                        ScrollableColumn(modifier = Modifier.padding()) {
                            Spacer(modifier = Modifier.padding(8.dp))
                            TrackRoutes(trackRoute = trackRoute, setTrackRoute = setTrackRoute)
                            MyRoute(routeId = "1")
                            BusSchedules()

                        }
                    }
                }
            }
        }
    }


}