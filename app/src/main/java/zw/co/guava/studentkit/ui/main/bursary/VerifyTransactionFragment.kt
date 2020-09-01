package zw.co.guava.studentkit.ui.main.bursary

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.ScrollableColumn
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import zw.co.guava.studentkit.R
import zw.co.guava.studentkit.ui.composeTheme.StudentKitTheme
import zw.co.guava.studentkit.ui.main.MainActivity


class VerifyTransactionFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        //requireActivity().actionBar!!.setDisplayHomeAsUpEnabled(true)
        //requireActivity().actionBar!!.setDisplayShowHomeEnabled(true)

        (activity as MainActivity).supportActionBar?.title = "Confirm Transaction"
        (activity as MainActivity).supportActionBar?.setDisplayShowHomeEnabled(true)
        (activity as MainActivity).supportActionBar?.setDisplayHomeAsUpEnabled(true)

        return ComposeView(requireContext()).apply {
            setContent {
                StudentKitTheme() {
                    ScrollableColumn(modifier = Modifier.padding(8.dp)) {
                        Row() {

                            ProvideEmphasis(emphasis = EmphasisAmbient.current.medium) {
                                Text(
                                        text = "Enter the code you received on your phone"
                                )
                            }
                        }

                        Column(modifier = Modifier.padding(vertical = 16.dp)) {
                            TextField(value = "", onValueChange = {}, label = {}, modifier = Modifier.fillMaxWidth())
                        }
                        
                        Column(modifier = Modifier.padding(vertical = 16.dp)) {
                            Button(onClick = {}, modifier = Modifier.fillMaxWidth()) {
                                Text(text = "Confirm")
                            }
                        }
                        
                        Column() {
                            ProvideEmphasis(emphasis = EmphasisAmbient.current.medium) {
                                Text(text = "Resend code")
                            }
                        }
                        
                        Column(modifier = Modifier.padding(vertical = 16.dp)) {
                            Text(text = "If you do not have access to your phone number, you will have to visit the Cash Office to be able to perform this transaction.")
                        }
                    }
                }
            }
        }
    }
}