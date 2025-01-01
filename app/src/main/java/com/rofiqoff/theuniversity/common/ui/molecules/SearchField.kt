package com.rofiqoff.theuniversity.common.ui.molecules

import android.content.res.Configuration
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rofiqoff.theuniversity.R
import com.rofiqoff.theuniversity.common.ui.atoms.text.LabelText
import com.rofiqoff.theuniversity.common.ui.theme.TheUniversityTheme

@Composable
fun SearchField(
    modifier: Modifier = Modifier,
    onValueChanged: (String) -> Unit = {},
    onSearchAction: (String) -> Unit = {},
) {
    var value by remember { mutableStateOf(TextFieldValue()) }

    val setValue = { inputValue: TextFieldValue ->
        value = inputValue
        onValueChanged.invoke(inputValue.text)
    }

    OutlinedTextField(
        modifier = modifier,
        value = value,
        shape = RoundedCornerShape(20.dp),
        placeholder = { LabelText(text = "Search here") },
        leadingIcon = {
            Icon(painter = painterResource(R.drawable.ic_search), contentDescription = null)
        },
        trailingIcon = {
            if (value.text.isNotEmpty())
                Icon(
                    modifier = Modifier.clickable { setValue(TextFieldValue()) },
                    painter = painterResource(R.drawable.ic_clear), contentDescription = null
                )
        },
        onValueChange = { inputValue ->
            setValue(inputValue)
        },
        keyboardOptions = KeyboardOptions(
            imeAction = ImeAction.Search,
            keyboardType = KeyboardType.Text
        ),
        keyboardActions = KeyboardActions(
            onSearch = { onSearchAction.invoke(value.text) }
        ),
        singleLine = true,
    )

}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun SearchFieldDarkPreview() {
    TheUniversityTheme {
        Surface(modifier = Modifier.padding(8.dp)) {
            SearchField()
        }
    }
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
private fun SearchFieldLightPreview() {
    TheUniversityTheme {
        Surface(modifier = Modifier.padding(8.dp)) {
            SearchField()
        }
    }
}
