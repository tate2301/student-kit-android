package zw.co.guava.studentkit.ui.main.transport.components

import androidx.compose.foundation.Text
import androidx.compose.material.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.ui.tooling.preview.Preview

@Composable
fun DestinationSearchBox(searchText: String, setSearchText: (String) -> Unit) {
    OutlinedTextField(
        value = searchText,
        onValueChange = setSearchText,
        placeholder = {
            Text(text = "Destination")
        },
        label = {})
}

@Preview(showBackground = true)
@Composable
fun DestinationSearchPreview() {
    val (searchText, setSearchText) = remember { mutableStateOf("")}
    DestinationSearchBox(searchText = searchText, setSearchText = setSearchText)
}