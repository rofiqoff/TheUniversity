package com.rofiqoff.theuniversity.common.ui.atoms.button

import android.content.res.Configuration
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rofiqoff.theuniversity.common.ui.atoms.text.LabelText
import com.rofiqoff.theuniversity.common.ui.theme.TheUniversityTheme

@Composable
fun GeneralButton(
    text: String,
    onClick: () -> Unit = {},
    modifier: Modifier = Modifier,
) {
    Button(
        modifier = modifier,
        shape = RoundedCornerShape(8.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colorScheme.primary,
        ),
        onClick = onClick,
    ) {
        LabelText(text = text, fontWeight = FontWeight.Bold)
    }
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun GeneralButtonDarkPreview() {
    TheUniversityTheme {
        Surface(modifier = Modifier.padding(16.dp)) {
            GeneralButton("General Button")
        }
    }
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
private fun GeneralButtonLightPreview() {
    TheUniversityTheme {
        Surface(modifier = Modifier.padding(16.dp)) {
            GeneralButton("General Button")
        }
    }
}
