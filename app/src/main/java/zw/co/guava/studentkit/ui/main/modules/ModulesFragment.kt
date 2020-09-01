package zw.co.guava.studentkit.ui.main.modules

import zw.co.guava.studentkit.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.ScrollableColumn
import androidx.compose.foundation.ScrollableRow
import androidx.compose.foundation.Text
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRowFor
import androidx.compose.material.MaterialTheme
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.unit.dp
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import zw.co.guava.studentkit.ui.composeTheme.StudentKitTheme
import zw.co.guava.studentkit.ui.main.modules.components.*

class ModulesFragment : Fragment() {

    lateinit var view: ComposeView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        view = ComposeView(requireContext()).apply {
            setContent {
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
                                RoundedCourseCard(course = it, navController = findNavController())
                            }
                        }

                        Row(modifier = Modifier.padding(8.dp).fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                            Text(text = "Timetable", style = MaterialTheme.typography.h6)

                            Column(modifier = Modifier.fillMaxHeight().gravity(Alignment.CenterVertically)) {
                                Text(text = "View All", modifier = Modifier.clickable(onClick = {
                                    findNavController().navigate(R.id.timetableFragment)
                                }).padding(8.dp))
                            }

                        }

                        Row {
                            ScrollableRow() {
                                TimetableCard(onGoingLecture = false)
                                Spacer(modifier = Modifier.padding(8.dp))
                                TimetableCard(onGoingLecture = false)
                                Spacer(modifier = Modifier.padding(8.dp))
                                TimetableCard(onGoingLecture = false)
                                Spacer(modifier = Modifier.padding(8.dp))
                                TimetableCard(onGoingLecture = false)
                                Spacer(modifier = Modifier.padding(8.dp))

                            }
                        }

                        Spacer(modifier = Modifier.padding(16.dp))

                        Column() {
                            Row(modifier = Modifier.padding(horizontal = 8.dp)) {
                                Text(text = "Library", style = MaterialTheme.typography.h6)
                            }
                            Row {
                                LibraryNavList(findNavController())
                            }
                        }

                        Spacer(modifier = Modifier.padding(16.dp))

                        Column() {
                            Row(modifier = Modifier.padding(horizontal = 8.dp)) {
                                Text(text = "Virtual Classrooms", style = MaterialTheme.typography.h6)

                            }

                            Row {
                                Column() {
                                    VirtualClassroomCard(virtualClassRoomSnapShot = VirtualClassRoomSnapshot(
                                            name = "Software Engineering",
                                            title = "1.2 2020",
                                            author = "Tatenda Chinyamakobvu"
                                    ))

                                    VirtualClassroomCard(virtualClassRoomSnapShot = VirtualClassRoomSnapshot(
                                            name = "Software Engineering",
                                            title = "1.2 2020",
                                            author = "Tatenda Chinyamakobvu"
                                    ))
                                }
                            }
                        }

                        Spacer(modifier = Modifier.padding(32.dp))


                    }
                }
            }
        }
        return view

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
}