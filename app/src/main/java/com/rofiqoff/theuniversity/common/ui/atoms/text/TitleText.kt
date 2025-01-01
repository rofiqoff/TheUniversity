package com.rofiqoff.theuniversity.common.ui.atoms.text

import android.content.res.Configuration
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rofiqoff.theuniversity.common.ui.theme.TheUniversityTheme

/**
 * [TitleText]
 *
 * Composable Text to show basic (14sp) text
 *
 * @param text text value
 * @param fontWeight text fontWeight Normal|Medium|Bold|Semibold
 * @param maxLines text maxLine with max value of integer line as default
 * @param overflow text overflow Visible|Clip|Ellipsis
 * @param textAlign text alignment
 * @param textDecoration text decoration None|LineThrough|Underline
 */
@Composable
fun TitleText(
    text: String,
    modifier: Modifier = Modifier,
    fontWeight: FontWeight = FontWeight.Normal,
    maxLines: Int = Int.MAX_VALUE,
    overflow: TextOverflow = TextOverflow.Visible,
    textAlign: TextAlign = TextAlign.Start,
    textDecoration: TextDecoration = TextDecoration.None,
) {
    Text(
        modifier = modifier,
        text = text,
        style = MaterialTheme.typography.titleLarge.copy(
            textDecoration = textDecoration,
            fontWeight = fontWeight,
        ),
        maxLines = maxLines,
        overflow = overflow,
        textAlign = textAlign,
    )
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun TitleTextDarkPreview() {
    TheUniversityTheme {
        Surface {
            TitleText(modifier = Modifier.padding(16.dp), text = "Hello Title Text")
        }
    }
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
private fun TitleTextLightPreview() {
    TheUniversityTheme {
        Surface {
            TitleText(modifier = Modifier.padding(16.dp), text = "Hello Title Text")
        }
    }
}
