package zw.co.guava.studentkit.ui.main.modules.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Icon
import androidx.compose.foundation.Text
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.KeyboardArrowDown
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.ui.tooling.preview.Preview
import zw.co.guava.studentkit.R
import zw.co.guava.studentkit.ui.composeTheme.gray
import zw.co.guava.studentkit.ui.composeTheme.purple700
import zw.co.guava.studentkit.ui.composeTheme.text
import zw.co.guava.studentkit.ui.composeTheme.white

@Composable
fun AssignmentCard(assignment: AssignmentStudentKit, navController: NavController) {
    Spacer(modifier = Modifier.padding(4.dp))

    Column(modifier = Modifier.padding(8.dp)) {
        Card(border = BorderStroke(width = 1.dp, SolidColor(gray)), elevation = 0.dp, modifier = Modifier.clickable(onClick = {
            navController.navigate(R.id.assignmentViewFragment)
        })) {
            Column() {

                Row(modifier = Modifier.padding(8.dp), horizontalArrangement = Arrangement.SpaceBetween) {
                    Column(modifier = Modifier.gravity(Alignment.CenterVertically)) {
                        ProvideEmphasis(emphasis = EmphasisAmbient.current.medium) {
                            Text(text = "DEADLINE", modifier = Modifier.padding(end = 8.dp), style = MaterialTheme.typography.body2)
                        }
                    }

                    Column(modifier = Modifier.gravity(Alignment.CenterVertically)) {
                        Text(text = "Today")
                    }

                    Row(modifier = Modifier.padding(horizontal = 8.dp)) {
                        if(assignment.isGroup) {
                            Surface(color = purple700, modifier = Modifier.clip(RoundedCornerShape(4.dp))) {
                                Text(
                                        text = "GROUP", color = white,
                                        style = MaterialTheme.typography.body2,
                                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                                )
                            }
                        }
                    }

                    Row(modifier = Modifier.padding(horizontal = 8.dp)) {
                        if(!assignment.submitted) {
                            Surface(color = text, modifier = Modifier.clip(RoundedCornerShape(4.dp))) {
                                Text(
                                        text = "MISSED", color = white,
                                        style = MaterialTheme.typography.body2,
                                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                                )
                            }
                        }
                    }
                }

                Divider(thickness = 1.dp, modifier = Modifier.padding(vertical = 4.dp).fillMaxWidth())

                Column(modifier = Modifier.padding(8.dp)) {
                    Row {
                        Text(text = assignment.title, modifier = Modifier.weight(1f))
                        Icon(asset = Icons.Rounded.KeyboardArrowDown, tint = gray)
                    }

                    ProvideEmphasis(emphasis = EmphasisAmbient.current.medium) {
                        Text(text = "Uploaded ${assignment.dateUploaded}", style = MaterialTheme.typography.body2)
                    }

                }

            }
        }
    }
    
    Spacer(modifier = Modifier.padding(4.dp))
}
