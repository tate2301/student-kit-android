package zw.co.guava.studentkit.ui.main.modules.components

import androidx.compose.foundation.Text
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.RowScope.gravity
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun RoundedCourseCard(course: CourseStudentKit) {
    Column(modifier = Modifier.clip(RoundedCornerShape(4.dp))
        .background(MaterialTheme.colors.surface)
        .clickable(onClick = { /* Ignoring onClick */ })
        .padding(16.dp)){
        Surface(
            modifier = Modifier.preferredSize(80.dp),
            shape = CircleShape,
            color = MaterialTheme.colors.onSurface.copy(alpha = 0.2f)
        ) {
            // Image goes here
        }
        Spacer(modifier = Modifier.padding(4.dp))
        Row(horizontalArrangement = Arrangement.Center, modifier = Modifier.gravity(Alignment.CenterHorizontally)) {
            Text(text = course.code, modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center)
        }

    }
}