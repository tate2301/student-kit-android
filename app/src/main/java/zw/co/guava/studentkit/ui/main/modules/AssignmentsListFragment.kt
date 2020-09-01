package zw.co.guava.studentkit.ui.main.modules

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.ScrollableColumn
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.navigation.findNavController
import zw.co.guava.studentkit.ui.composeTheme.StudentKitTheme
import zw.co.guava.studentkit.ui.main.MainActivity
import zw.co.guava.studentkit.ui.main.modules.components.AssignmentCard
import zw.co.guava.studentkit.ui.main.modules.components.AssignmentStudentKit

class AssignmentsFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        //requireActivity().actionBar!!.setDisplayHomeAsUpEnabled(true)
        //requireActivity().actionBar!!.setDisplayShowHomeEnabled(true)

        (activity as MainActivity).supportActionBar?.title = "Assignments"
        (activity as MainActivity).supportActionBar?.setDisplayShowHomeEnabled(true)
        (activity as MainActivity).supportActionBar?.setDisplayHomeAsUpEnabled(true)

        return ComposeView(requireContext()).apply {
            setContent {
                StudentKitTheme() {
                    ScrollableColumn(modifier = Modifier.padding()) {
                        val assignment = remember { (AssignmentStudentKit(
                                title = "Fidel's Rule",
                                dateUploaded = 900000,
                                deadline = 900000,
                                isGroup = true,
                                submitted = false,
                                question = "Hello World"
                        ))}

                        AssignmentCard(assignment = assignment, navController = findNavController())
                        AssignmentCard(assignment = assignment, navController = findNavController())
                        AssignmentCard(assignment = assignment, navController = findNavController())
                    }
                }
            }
        }
    }
}