package zw.co.guava.studentkit.ui.main.modules.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Icon
import androidx.compose.foundation.Text
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.KeyboardArrowDown
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import zw.co.guava.studentkit.ui.composeTheme.gray
import zw.co.guava.studentkit.ui.composeTheme.text

@Composable
fun AssignmentCard(assignment: AssignmentStudentKit) {
    Spacer(modifier = Modifier.padding(4.dp))

    Column(modifier = Modifier.padding(8.dp)) {
        Card(border = BorderStroke(width = 1.dp, SolidColor(gray)), elevation = 0.dp) {
            Column() {

                Row(modifier = Modifier.padding(8.dp), horizontalArrangement = Arrangement.SpaceBetween) {
                    Column(modifier = Modifier.gravity(Alignment.CenterVertically)) {
                        ProvideEmphasis(emphasis = EmphasisAmbient.current.medium) {
                            Text(text = "DEADLINE", modifier = Modifier.padding(end = 8.dp), style = MaterialTheme.typography.body2)
                        }
                    }
                    Text(text = "Today")

                    Row() {

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

@Preview(showBackground = true)
@Composable
fun AssignmentPreview() {
    val assignment = remember { (AssignmentStudentKit(
            title = "Some willy weird question",
            dateUploaded = 900000,
            deadline = 900000,
            isGroup = true,
            submitted = false,
            question = "Hello World"
    ))}

    AssignmentCard(assignment = assignment)
}