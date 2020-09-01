package zw.co.guava.studentkit.ui.main.bursary

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.ScrollableColumn
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.unit.dp
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.google.android.material.tabs.TabLayout
import zw.co.guava.studentkit.R
import zw.co.guava.studentkit.ui.composeTheme.StudentKitTheme
import zw.co.guava.studentkit.ui.main.bursary.components.CanteenAccountTopbar
import zw.co.guava.studentkit.ui.main.bursary.components.MainAccountTopbar
import zw.co.guava.studentkit.ui.main.bursary.components.TransactionCard

class BursaryFragment : Fragment() {


    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        val v = layoutInflater.inflate(R.layout.fragment_bursary, container, false)
        val tabs = v.findViewById<TabLayout>(R.id.bursaryTabs)

        tabs.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {

            override fun onTabSelected(tab: TabLayout.Tab?) {
                when (tab!!.position) {
                    0 -> {
                        v.findViewById<ComposeView>(R.id.bursaryCompose).apply {
                            setContent {
                                StudentKitTheme() {
                                    ScrollableColumn(modifier = Modifier.padding()) {
                                        MainAccount(findNavController())
                                    }
                                }
                            }
                        }
                    }
                    1 -> {
                        v.findViewById<ComposeView>(R.id.bursaryCompose).apply {
                            setContent {
                                StudentKitTheme() {
                                    ScrollableColumn(modifier = Modifier.padding()) {
                                        CanteenAccount()
                                    }
                                }
                            }
                        }
                    }
                    else -> {
                        v.findViewById<ComposeView>(R.id.bursaryCompose).apply {
                            setContent {
                                StudentKitTheme() {
                                    ScrollableColumn(modifier = Modifier.padding()) {
                                        CanteenAccount()
                                    }
                                }
                            }
                        }
                    }
                }
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                if (tab!!.position == 0) {
                    v.findViewById<ComposeView>(R.id.bursaryCompose).apply {
                        setContent {
                            StudentKitTheme() {
                                ScrollableColumn(modifier = Modifier.padding()) {
                                    CanteenAccount()
                                }
                            }
                        }
                    }
                }
            }


        })

        v.findViewById<ComposeView>(R.id.bursaryCompose).apply {
            setContent {
                StudentKitTheme() {
                    ScrollableColumn(modifier = Modifier.padding()) {
                        MainAccount(findNavController())
                    }
                }
            }
        }

        return v
    }


}

@Composable
fun MainAccount(navController: NavController) {
    ScrollableColumn(modifier = Modifier.padding(vertical = 8.dp)) {
        MainAccountTopbar(navController = navController)
        Row(modifier = Modifier.padding(8.dp) ) {
            Text(text = "Transaction Summary", style = MaterialTheme.typography.h6)
        }
        TransactionCard()
    }

}

@Composable
fun CanteenAccount() {
    ScrollableColumn(modifier = Modifier.padding(vertical = 8.dp)) {
        CanteenAccountTopbar()
        Row(modifier = Modifier.padding(8.dp) ) {
            Text(text = "Transaction Summary", style = MaterialTheme.typography.h6)
        }
        TransactionCard()
    }

}