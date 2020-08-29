package zw.co.guava.studentkit.ui.main.bursary

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.ScrollableColumn
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment
import zw.co.guava.studentkit.R
import zw.co.guava.studentkit.ui.composeTheme.StudentKitTheme

class BursaryFragment : Fragment() {


    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {


        return inflater.inflate(R.layout.fragment_bursary, container, false).apply { 
            findViewById<ComposeView>(R.id.bursaryComposeView).setContent { 
                StudentKitTheme() {
                    StudentKitTheme() {
                        ScrollableColumn(modifier = Modifier.padding()) {

                        }
                    }
                }
            }
        }
    }
}