package com.example.compose_example

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose_example.ui.theme.Compose_exampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            previewitem()
        }
    }
}

@Preview(showBackground = true, showSystemUi = true, widthDp = 300, heightDp = 300)
@Composable
fun PreviewFunction() {
    Row(Modifier.padding(10.dp)) {
        Image(painter = painterResource(id = R.drawable.drone2),
            contentDescription = "",
            Modifier.size(40.dp))
        Column() {
            Text(text = "abcd",
                fontWeight = FontWeight.Bold
            )
            Text(text = "scvsujn",
                fontWeight = FontWeight.Thin)
        }
    }
}

@Composable
fun Example(name:String,address:String){
    Row(Modifier.padding(10.dp)) {
        Image(painter = painterResource(id = R.drawable.drone2),
            contentDescription = "",
            Modifier.size(40.dp))
        Column() {
            Text(text = name,
                fontWeight = FontWeight.Bold
            )
            Text(text = address,
                fontWeight = FontWeight.Thin)
        }
    }
}