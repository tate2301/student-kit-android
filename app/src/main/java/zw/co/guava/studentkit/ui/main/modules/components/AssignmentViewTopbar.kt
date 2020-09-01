package zw.co.guava.studentkit.ui.main.modules.components

import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.EmphasisAmbient
import androidx.compose.material.MaterialTheme
import androidx.compose.material.ProvideEmphasis
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import zw.co.guava.studentkit.ui.composeTheme.purple700
import zw.co.guava.studentkit.ui.composeTheme.white

@Composable
fun AssignmentViewTopbar(assignmentStudentKit: AssignmentStudentKit) {
    Column(modifier = Modifier.padding(8.dp)) {
        Column() {
            Text(text = assignmentStudentKit.title, style= MaterialTheme.typography.h1)
            Text(text = assignmentStudentKit.question)
            ProvideEmphasis(emphasis = EmphasisAmbient.current.medium) {
                Text(text = "Uploaded ${assignmentStudentKit.dateUploaded}", style = MaterialTheme.typography.body2)
            }
        }
        Spacer(modifier = Modifier.padding(8.dp))
        Column() {
            if(assignmentStudentKit.isGroup) {
                Surface(color = purple700, modifier = Modifier.clip(RoundedCornerShape(4.dp))) {
                    Text(
                            text = "GROUP", color = white,
                            style = MaterialTheme.typography.body2,
                            modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                    )
                }
            }
        }
        Spacer(modifier = Modifier.padding(4.dp))
        Column() {
            Row() {
                ProvideEmphasis(emphasis = EmphasisAmbient.current.medium) {
                    Text(text = "DEADLINE", modifier = Modifier.padding(end = 16.dp))
                }
                
                Text(text = "${assignmentStudentKit.deadline}")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AssignmentTopPreview() {
    val assignment = remember { (AssignmentStudentKit(
            title = "Fidel's Rule",
            dateUploaded = 900000,
            deadline = 900000,
            isGroup = true,
            submitted = false,
            question = "Hello World"
    ))}
    
    AssignmentViewTopbar(assignmentStudentKit = assignment)
}