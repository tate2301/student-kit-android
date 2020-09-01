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
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.unit.dp
import zw.co.guava.studentkit.R
import zw.co.guava.studentkit.ui.composeTheme.StudentKitTheme
import zw.co.guava.studentkit.ui.main.MainActivity
import zw.co.guava.studentkit.ui.main.modules.components.*


class AssignmentViewFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        //requireActivity().actionBar!!.setDisplayHomeAsUpEnabled(true)
        //requireActivity().actionBar!!.setDisplayShowHomeEnabled(true)

        (activity as MainActivity).supportActionBar?.title = "Assignment"
        (activity as MainActivity).supportActionBar?.setDisplayShowHomeEnabled(true)
        (activity as MainActivity).supportActionBar?.setDisplayHomeAsUpEnabled(true)

        return ComposeView(requireContext()).apply {
            setContent {
                StudentKitTheme() {
                    val (assignment, setAssignment) = remember { mutableStateOf((AssignmentStudentKit(
                            title = "Fidel's Rule",
                            dateUploaded = 900000,
                            deadline = 900000,
                            isGroup = true,
                            submitted = false,
                            question = "Hello World"
                    )))}

                    ScrollableColumn(modifier = Modifier.padding()) {
                        AssignmentViewTopbar(assignmentStudentKit = assignment)
                        Spacer(modifier = Modifier.padding(8.dp))
                        Text(text = "Attachments", style = MaterialTheme.typography.h1, modifier = Modifier.padding(start = 8.dp))
                        AssignmentViewMaterials(assignmentStudentKit = assignment)
                        Spacer(modifier = Modifier.padding(8.dp))
                        AssignmentsUpload(assignmentStudentKit = assignment)
                    }
                }
            }
        }
    }
}