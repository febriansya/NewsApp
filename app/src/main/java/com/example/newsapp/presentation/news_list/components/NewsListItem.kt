package com.example.newsapp.presentation.news_list.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter
import com.example.newsapp.domain.model.News


@Composable
fun NewsListItem(
    news: News, onItemClick: (News) -> Unit
) {
    Column(
        Modifier
            .fillMaxSize()
            .padding(top = 23.dp, start = 30.dp)
            .clickable { onItemClick(news) }
    ) {
        Row(
        ) {
            Card(
                elevation = 4.dp, backgroundColor = Color.Yellow
            ) {
                Image(
                    painter = rememberAsyncImagePainter(news?.urlToImage),
                    contentDescription = "test",
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .size(100.dp)
                        .clip(RoundedCornerShape(16.dp))
                )
            }
//            kanan gambar
            Column(Modifier.padding(start = 12.dp)) {
                Text(
                    text = "${news?.title}",
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 25.sp
                )
                Text(text = "${news?.description}")
            }
        }
    }
}


//@Preview
//@Composable
//fun gasReview() {
//    NewsListItem() {
//        it.name
//    }
//}