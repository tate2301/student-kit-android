
package zw.co.guava.studentkit.ui.main.bursary

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.ScrollableColumn
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.navigation.findNavController
import zw.co.guava.studentkit.ui.composeTheme.StudentKitTheme
import zw.co.guava.studentkit.ui.main.MainActivity
import zw.co.guava.studentkit.ui.main.bursary.components.InternalTransferCard


class InternalTransferFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        //requireActivity().actionBar!!.setDisplayHomeAsUpEnabled(true)
        //requireActivity().actionBar!!.setDisplayShowHomeEnabled(true)

        (activity as MainActivity).supportActionBar?.title = "Internal Transfer"
        (activity as MainActivity).supportActionBar?.setDisplayShowHomeEnabled(true)
        (activity as MainActivity).supportActionBar?.setDisplayHomeAsUpEnabled(true)

        return ComposeView(requireContext()).apply {
            setContent {
                StudentKitTheme() {
                    ScrollableColumn(modifier = Modifier.padding()) {
                        InternalTransferCard(findNavController())
                    }
                }
            }
        }
    }
}