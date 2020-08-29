package zw.co.guava.studentkit.ui.main.modules.components

import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun CourseWorkView() {
    Column(modifier = Modifier.padding(horizontal = 8.dp)) {
        Text("Course Work", fontWeight = FontWeight(600), style = MaterialTheme.typography.h1)
    }
}