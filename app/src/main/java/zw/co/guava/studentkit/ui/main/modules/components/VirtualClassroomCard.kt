package zw.co.guava.studentkit.ui.main.modules.components

import android.widget.Space
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Text
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Emphasis
import androidx.compose.material.EmphasisAmbient
import androidx.compose.material.ProvideEmphasis
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import zw.co.guava.studentkit.ui.composeTheme.black
import zw.co.guava.studentkit.ui.composeTheme.gray
import zw.co.guava.studentkit.ui.composeTheme.white

@Composable
fun VirtualClassroomCard(virtualClassRoomSnapShot: VirtualClassRoomSnapshot) {
    Column(modifier = Modifier.padding(8.dp)) {
        Surface(
                color = black,
                modifier = Modifier
                        .clip(RoundedCornerShape(8.dp))
                        .fillMaxWidth()
                        .background(color = black)
                        .clickable(onClick = {

                }),
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text(text = virtualClassRoomSnapShot.name, color = white)
                ProvideEmphasis(emphasis = EmphasisAmbient.current.medium) {
                    Text(text = virtualClassRoomSnapShot.title, color = white)
                }
                
                Spacer(modifier = Modifier.padding(16.dp))
                Text(text = virtualClassRoomSnapShot.author, color = white)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun VirtualClassPreview() {
    VirtualClassroomCard(virtualClassRoomSnapShot = VirtualClassRoomSnapshot(
            name = "Software Engineering",
            title = "1.2 2020",
            author = "Tatenda Chinyamakobvu"
    ))
}