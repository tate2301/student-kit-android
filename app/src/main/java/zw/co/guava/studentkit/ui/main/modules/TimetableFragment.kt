package zw.co.guava.studentkit.ui.main.modules

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.RowScope.gravity
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowForward
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import zw.co.guava.studentkit.ui.composeTheme.*
import zw.co.guava.studentkit.ui.main.MainActivity


class TimetableFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        //requireActivity().actionBar!!.setDisplayHomeAsUpEnabled(true)
        //requireActivity().actionBar!!.setDisplayShowHomeEnabled(true)

        (activity as MainActivity).supportActionBar?.title = "Timetable"
        (activity as MainActivity).supportActionBar?.setDisplayShowHomeEnabled(true)
        (activity as MainActivity).supportActionBar?.setDisplayHomeAsUpEnabled(true)

        return ComposeView(requireContext()).apply {
            setContent {
                StudentKitTheme {
                    Column {
                        Surface(color = white, elevation = 2.dp) {
                            Column(modifier = Modifier.fillMaxWidth().padding(horizontal = 4.dp, vertical = 8.dp).gravity(Alignment.CenterHorizontally)) {
                                Row(horizontalArrangement = Arrangement.SpaceEvenly, modifier = Modifier.fillMaxWidth()) {
                                    TimetableDate(day = "Mon", date = 12, currentDate = false)
                                    Spacer(modifier = Modifier.padding(4.dp))
                                    TimetableDate(day = "Tue", date = 13, currentDate = false)
                                    Spacer(modifier = Modifier.padding(4.dp))
                                    TimetableDate(day = "Wed", date = 14, currentDate = true)
                                    Spacer(modifier = Modifier.padding(4.dp))
                                    TimetableDate(day = "Thu", date = 15, currentDate = false)
                                    Spacer(modifier = Modifier.padding(4.dp))
                                    TimetableDate(day = "Fri", date = 16, currentDate = false)
                                }
                            }
                        }
                        Divider(thickness = 1.dp)
                        ScrollableColumn() {
                            Spacer(modifier = Modifier.padding(4.dp))
                            Row {
                                Column() {
                                    TimetableTime("0700")
                                    TimetableTime("0800")
                                    TimetableTime("0900")
                                    TimetableTime("1000")
                                    TimetableTime("1100")
                                    TimetableTime("1200")
                                    TimetableTime("1300")
                                    TimetableTime("1400")
                                    TimetableTime("1500")
                                    TimetableTime("1600")
                                    TimetableTime("1700")
                                    TimetableTime("1800")
                                    TimetableTime("1900")
                                    TimetableTime("2000")
                                }
                                Column() {
                                    Spacer(modifier = Modifier.padding(4.dp))
                                }
                                Column(modifier = Modifier.weight(1f)) {
                                    TimetableElement(color = cardColorPurple)
                                    TimetableElement(color = cardColorBlue)
                                    TimetableElement(color = cardColorRed)
                                    TimetableElement(color = cardColorOrange)
                                    TimetableElement(color = cardColorGreen)
                                    TimetableElement(color = cardColorBlue)

                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun TimetableDate(day: String, date: Int, currentDate: Boolean) {
    var color: Color = if(currentDate) {
        cardColorOrange
    } else {
        white
    }

    var textColor = if(currentDate) {
        white
    } else {
        lightText
    }

    var dateColor = if(currentDate) {
        white
    } else {
        text
    }

    Surface(color = color ,modifier = Modifier.clip(RoundedCornerShape(4.dp)).clickable(onClick = {

    })) {
        Column(modifier = Modifier.gravity(Alignment.CenterVertically).padding(8.dp).width(40.dp)) {
            Row(modifier = Modifier.gravity(Alignment.CenterHorizontally)) {
                Column() {
                    Text(text = day, color = textColor)
                    Spacer(modifier = Modifier.padding(2.dp))
                    Text(text = date.toString(), style = MaterialTheme.typography.h6, color = dateColor)
                }
            }
        }
    }
}

@Composable
fun TimetableElement(color: Color) {
    val textColor = when(color) {
        cardColorBlue -> text
        cardColorGreen -> text
        cardColorBlueLight -> text
        cardColorGreenLight -> text
        cardColorOrangeLight -> text
        cardColorRedLight -> text
        cardColorPurpleLight -> text
        else -> white
    }

    Column() {
        Spacer(modifier = Modifier.padding(bottom = 8.75.dp))
        Surface(color = color, modifier = Modifier.fillMaxWidth().clip(RoundedCornerShape(4.dp)).height(140.dp).clickable(onClick = {})) {
            Column(modifier = Modifier.padding(16.dp).fillMaxWidth()) {

                Column() {
                    Row(horizontalArrangement = Arrangement.SpaceBetween) {
                        Column(modifier = Modifier.weight(1f)) {
                            Text(text = "CSIS201", color = textColor)
                        }

                        Column() {
                            Row() {
                                Text(text = "0700", color = textColor)
                                Spacer(modifier = Modifier.padding(8.dp))
                                Text(text = "0900", color = textColor)
                            }
                        }
                    }

                    Row() {
                        Text(text = "Introduction to OOP ", color = textColor)
                    }

                    Spacer(modifier = Modifier.padding(16.dp))

                    Row() {
                        OutlinedButton(onClick = {}, border = BorderStroke(width = 1.dp, color), backgroundColor = color) {
                            Text(text = "Great Hall", color = textColor)
                            Icon(asset = Icons.Rounded.ArrowForward, tint = textColor)
                        }
                    }

                }

            }
        }
        Spacer(modifier = Modifier.padding(bottom = 8.75.dp))
    }
}

@Composable
fun TimetableTime(time: String) {
    Column(modifier = Modifier.height(70.dp).gravity(Alignment.Top)) {
        //Divider(thickness = 1.dp)
        ProvideEmphasis(emphasis = EmphasisAmbient.current.medium) {
            Text(text = time, modifier = Modifier.padding(4.dp))
        }
    }
}






@Preview(showBackground = true)
@Composable
fun PreviewElement1() {
    Column() {
        TimetableDate(day = "Mon", date = 12, currentDate = true)
        TimetableDate(day = "Mon", date = 12, currentDate = false)

    }
}

@Preview(showBackground = true)
@Composable
fun PreviewElement2() {
    ScrollableColumn() {
        Row {
            Column() {
                TimetableTime("0700")
                TimetableTime("0800")
                TimetableTime("0900")
                TimetableTime("1000")
                TimetableTime("1100")
                TimetableTime("1200")
                TimetableTime("1300")
                TimetableTime("1400")
                TimetableTime("1500")
                TimetableTime("1600")
                TimetableTime("1700")
                TimetableTime("1800")
                TimetableTime("1900")
                TimetableTime("2000")
            }
            Column(modifier = Modifier.weight(1f)) {
                TimetableElement(color = cardColorPurple)
                TimetableElement(color = cardColorBlue)
                TimetableElement(color = cardColorRed)
                TimetableElement(color = cardColorOrange)
                TimetableElement(color = cardColorGreen)
                TimetableElement(color = cardColorBlueLight)


            }
        }
    }
}
