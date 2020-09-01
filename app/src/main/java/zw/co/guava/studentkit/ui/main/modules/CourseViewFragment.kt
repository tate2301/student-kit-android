package zw.co.guava.studentkit.ui.main.modules

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.ScrollableColumn
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.unit.dp
import androidx.navigation.findNavController
import zw.co.guava.studentkit.R
import zw.co.guava.studentkit.ui.composeTheme.StudentKitTheme
import zw.co.guava.studentkit.ui.main.MainActivity
import zw.co.guava.studentkit.ui.main.modules.components.CourseOptionsList
import zw.co.guava.studentkit.ui.main.modules.components.CourseWorkView

class CourseView : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        //requireActivity().actionBar!!.setDisplayHomeAsUpEnabled(true)
        //requireActivity().actionBar!!.setDisplayShowHomeEnabled(true)

        (activity as MainActivity).supportActionBar?.title = "Course View"
        (activity as MainActivity).supportActionBar?.setDisplayShowHomeEnabled(true)
        (activity as MainActivity).supportActionBar?.setDisplayHomeAsUpEnabled(true)


        return ComposeView(requireContext()).apply {
            setContent {
                StudentKitTheme() {
                    ScrollableColumn(modifier = Modifier.padding()) {
                        CourseOptionsList(findNavController())
                        Spacer(modifier = Modifier.padding(8.dp))
                        CourseWorkView()
                    }
                }
            }
        }
    }



}