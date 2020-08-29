package zw.co.guava.studentkit.ui.main.modules

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.ScrollableColumn
import androidx.compose.foundation.ScrollableRow
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.LazyRowFor
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import zw.co.guava.studentkit.R
import zw.co.guava.studentkit.ui.composeTheme.StudentKitTheme
import zw.co.guava.studentkit.ui.main.modules.components.CourseStudentKit
import zw.co.guava.studentkit.ui.main.modules.components.RoundedCourseCard

class ModulesFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {



        return inflater.inflate(R.layout.fragment_modules, container, false).apply {
            findViewById<ComposeView>(R.id.modulesComposeView).setContent {
                val courses = listOf<CourseStudentKit>(
                    CourseStudentKit(name = "Software Engineering", code = "CUIT123"),
                    CourseStudentKit(name = "Software Engineering", code = "CUIT123"),
                    CourseStudentKit(name = "Software Engineering", code = "CUIT123"),
                    CourseStudentKit(name = "Software Engineering", code = "CUIT123"),
                    CourseStudentKit(name = "Software Engineering", code = "CUIT123"),
                )
                
                
                StudentKitTheme() {
                    ScrollableColumn {
                        Spacer(modifier = Modifier.padding(8.dp))
                        ScrollableRow {
                            LazyRowFor(items = courses) {
                                RoundedCourseCard(course = it)
                            }
                        }

                        Row(modifier = Modifier.padding(8.dp).fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                            Text(text = "Timetable", style = MaterialTheme.typography.h1)

                            Text(text = "View All")

                        }

                        Row {
                           // Timetable Row
                        }

                        Spacer(modifier = Modifier.padding(16.dp))

                        Row(modifier = Modifier.padding(8.dp).fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                            Text(text = "Library", style = MaterialTheme.typography.h1)

                        }

                        Row {
                           // Library NavList
                        }

                        Spacer(modifier = Modifier.padding(16.dp))

                        Row(modifier = Modifier.padding(8.dp).fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                            Text(text = "Virtual Classrooms", style = MaterialTheme.typography.h1)

                        }

                        Row {
                            // Virtual ClassRoom NavList
                        }


                    }
                }
            }
        }
    }
}