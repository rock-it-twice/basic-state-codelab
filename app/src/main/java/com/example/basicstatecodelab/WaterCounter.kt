package com.example.basicstatecodelab

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp

@Composable
fun WaterCounter(modifier: Modifier = Modifier){
    var count by rememberSaveable { mutableStateOf(0) }
    Column(
        modifier = modifier.padding(16.dp)
    ) {
        Text(text = "Water received", style = MaterialTheme.typography.titleMedium)
        // Text is present, only when the count is > 0
        if (count > 0) {
            Text(
                text = "You've had $count glasses"
            )
        }
        Button(
            onClick = { count ++ },
            enabled = count < 10,
            modifier = modifier.padding(top = 8.dp)
        ) {
            Text(text = "drink another one")
        }
    }
}