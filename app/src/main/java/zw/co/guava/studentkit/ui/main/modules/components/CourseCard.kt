package zw.co.guava.studentkit.ui.main.modules.components

import androidx.compose.foundation.Text
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import zw.co.guava.studentkit.R
import zw.co.guava.studentkit.ui.utils.randomColor

@Composable
fun RoundedCourseCard(course: CourseStudentKit, navController: NavController) {

    val backgroundColor = remember { randomColor() }
    Column(modifier = Modifier.clip(RoundedCornerShape(4.dp))
        .clickable(onClick = {
            navController.navigate(R.id.courseView)
        })
        .padding(16.dp)){
        Surface(
            modifier = Modifier.preferredSize(80.dp),
            shape = CircleShape,
            color = backgroundColor
        ) {
            // Image goes here
        }
        Spacer(modifier = Modifier.padding(4.dp))
        Row(horizontalArrangement = Arrangement.Center, modifier = Modifier.gravity(Alignment.CenterHorizontally)) {
            Text(text = course.code, modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center)
        }

    }
}