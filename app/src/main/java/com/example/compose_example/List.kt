package com.example.compose_example

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.fontResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun previewitem(){
    LazyColumn(content = {
        items(getCatagoryList()){item ->
            singlerow(img = item.img, title = item.title, subtitle = item.subtitle)

        }
    })
}

@Composable
fun singlerow(img:Int,title:String,subtitle:String){
    Card(
        modifier = Modifier
            .padding(8.dp)
    ){
        Row(verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.
            padding(8.dp).
            background(Color.Green)) {
            Image(
                painter = painterResource(id = img),
                contentDescription = "",
                Modifier
                    .size(50.dp)
                    .padding(8.dp)
                    .weight(.2f)
            )
            itemDescription(title, subtitle, Modifier.weight(.8f))
        }
    }
}

@Composable
private fun itemDescription(title: String, subtitle: String, modifier:Modifier) {
    Column(modifier) {
        Text(
            text = title,
            style = MaterialTheme.typography.titleMedium
        )
        Text(
            text = subtitle,
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Thin
        )
    }
}

data class Catagory(val img: Int,val title: String,val subtitle: String)

fun getCatagoryList(): MutableList<Catagory> {
    val list= mutableListOf<Catagory>()

    list.add(Catagory(R.drawable.ic_launcher_foreground,"Android","Kotlin"))
    list.add(Catagory(R.drawable.ic_launcher_foreground,"Android","Java"))
    list.add(Catagory(R.drawable.ic_launcher_foreground,"Android","Compose"))
    list.add(Catagory(R.drawable.ic_launcher_foreground,"Web","ReactJS"))
    list.add(Catagory(R.drawable.ic_launcher_foreground,"Android","Angular"))
    list.add(Catagory(R.drawable.ic_launcher_foreground,"Android","Kotlin"))
    list.add(Catagory(R.drawable.ic_launcher_foreground,"Android","Kotlin"))
    list.add(Catagory(R.drawable.ic_launcher_foreground,"Android","Kotlin"))
    list.add(Catagory(R.drawable.ic_launcher_foreground,"Android","Kotlin"))
    list.add(Catagory(R.drawable.ic_launcher_foreground,"Android","Java"))
    list.add(Catagory(R.drawable.ic_launcher_foreground,"Android","Compose"))
    list.add(Catagory(R.drawable.ic_launcher_foreground,"Web","ReactJS"))
    list.add(Catagory(R.drawable.ic_launcher_foreground,"Android","Angular"))
    list.add(Catagory(R.drawable.ic_launcher_foreground,"Android","Kotlin"))
    list.add(Catagory(R.drawable.ic_launcher_foreground,"Android","Kotlin"))
    list.add(Catagory(R.drawable.ic_launcher_foreground,"Android","Kotlin"))

    return list
}