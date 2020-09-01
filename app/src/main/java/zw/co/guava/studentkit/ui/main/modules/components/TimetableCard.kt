package zw.co.guava.studentkit.ui.main.modules.components

import androidx.compose.foundation.Text
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Card
import androidx.compose.material.EmphasisAmbient
import androidx.compose.material.MaterialTheme
import androidx.compose.material.ProvideEmphasis
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import zw.co.guava.studentkit.ui.composeTheme.purple700

@Composable
fun TimetableCard(onGoingLecture: Boolean?) {
    Card(modifier = Modifier.padding(8.dp).clickable(onClick = {

    })) {
        Column(modifier = Modifier.padding(16.dp).width(200.dp)) {
            Text(text = "UP NEXT", color = purple700)
            Spacer(modifier = Modifier.padding(4.dp))
            Text(text = "CISS201", style = MaterialTheme.typography.h6)
            ProvideEmphasis(emphasis = EmphasisAmbient.current.medium) {
                Text(text = "13:45 - 15:45")
            }

            Spacer(modifier = Modifier.padding(16.dp))
            Text(text = "Lecture Theatre")


        }
    }
}