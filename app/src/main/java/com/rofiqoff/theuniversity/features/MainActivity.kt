package com.rofiqoff.theuniversity.features

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.rofiqoff.theuniversity.common.ui.atoms.button.GeneralButton
import com.rofiqoff.theuniversity.common.ui.atoms.text.LabelText
import com.rofiqoff.theuniversity.common.ui.atoms.text.NormalText
import com.rofiqoff.theuniversity.common.ui.atoms.text.TitleText
import com.rofiqoff.theuniversity.common.ui.molecules.SearchField
import com.rofiqoff.theuniversity.common.ui.theme.TheUniversityTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TheUniversityTheme {
                Scaffold { innerPadding ->
                    Column(
                        modifier = Modifier
                            .padding(innerPadding)
                            .padding(16.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.spacedBy(16.dp)
                    ) {
                        val context = LocalContext.current

                        var searchValue by remember { mutableStateOf("") }

                        SearchField(
                            modifier = Modifier.fillMaxWidth(),
                            onValueChanged = { value ->
                                searchValue = value
                            },
                            onSearchAction = { value ->
                                Toast.makeText(context, value, Toast.LENGTH_SHORT).show()
                            }
                        )

                        TitleText(text = "Title Text")

                        NormalText(text = "Normal Text")

                        LabelText(text = "Label text")

                        GeneralButton(modifier = Modifier.fillMaxWidth(), text = "General Button")
                    }
                }
            }
        }
    }
}
