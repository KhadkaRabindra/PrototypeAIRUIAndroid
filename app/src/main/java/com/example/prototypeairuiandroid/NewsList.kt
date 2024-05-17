package com.example.prototypeairuiandroid

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import com.example.airui.ui.BaseTheme
import com.example.airui.ui.ThemeMode
import com.example.prototypeairuiandroid.components.NewsText
import com.example.prototypeairuiandroid.model.Article


@Composable
fun MainView(modifier: Modifier){

    val themes = listOf(ThemeMode.Light, ThemeMode.Dark, ThemeMode.Space)
    var currentThemeMode by remember { mutableStateOf<ThemeMode>(ThemeMode.Light) }
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(BaseTheme.colors.background)
            .padding(BaseTheme.dimensions.mediumPadding),
        verticalArrangement = Arrangement.spacedBy(BaseTheme.dimensions.mediumPadding),
    ) {
        NewsText(
            text = "Newsely",
            style = BaseTheme.typography.headline,
        )
        /*NewsText(text = "Pick Preferred Theme")
        LazyRow(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(BaseTheme.dimensions.smallPadding),
        ) {
            items(themes) { theme ->
                Box(
                    modifier = Modifier
                        .clip(CircleShape)
                        .background(
                            if (theme == currentThemeMode) BaseTheme.colors.onBackground
                            else Color.Transparent
                        )
                        .clickable {
                            if (theme != currentThemeMode) {
                                currentThemeMode = theme
                            }
                        }
                        .padding(
                            vertical = BaseTheme.dimensions.smallPadding,
                            horizontal = BaseTheme.dimensions.mediumPadding,
                        )
                ){
                    NewsText(
                        text = theme.title,
                        textColor = if (theme == currentThemeMode) BaseTheme.colors.background
                        else BaseTheme.colors.onBackground,
                        style = BaseTheme.typography.subtitle
                    )
                }
            }
        }*/
        NewsList(
            modifier = Modifier.weight(1f),
            articles = arrayListOf(
                Article(
                    headline = "Twitter, Again!",
                    title = "Twitter to remove inactive accounts",
                    body = "Social media platform Twitter Inc will remove accounts that have been inactive for several years, CEO Elon Musk said in a tweet on Monday."
                ), Article(
                    headline = "Cryptocurrency world, with BTC!",
                    title = "Binance lifts block on bitcoin withdrawals amid heavy volumes",
                    body = "Cryptocurrency exchange Binance halted bitcoin withdrawals for several hours on Monday, citing heavy volumes and a surge in processing fees, before clearing them at a higher cost."
                ), Article(
                    headline = "AI race, who will win?",
                    title = "Google plans to upgrade search with AI chat, video clips, Wall Street Journal reports",
                    body = "Google is planning to make its search engine more \"visual, snackable, personal, and human,\" with a focus on serving young people globally, the Wall Street Journal reported on Saturday, citing documents.\n" + "\n" + "The move comes as artificial intelligence (AI) applications such as ChatGPT are rapidly gaining in popularity, highlighting a technology that could upend the way businesses and society operate."
                )
            )
        )
    }
}


@Composable
fun NewsList(
    modifier: Modifier = Modifier,
    articles: ArrayList<Article>,
) {
    LazyColumn(
        modifier = modifier
            .fillMaxWidth()
            .background(BaseTheme.colors.background)
            .padding(top = BaseTheme.dimensions.mediumPadding),
        verticalArrangement = Arrangement
            .spacedBy(BaseTheme.dimensions.mediumPadding),
    ) {

        items(articles){article ->
            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                NewsText(
                    text = article.headline,
                    style = BaseTheme.typography.headline,
                )
                NewsText(
                    text = article.title,
                    style = BaseTheme.typography.title,
                )
                NewsText(
                    text = article.body,
                    style = BaseTheme.typography.body,
                    textAlign = TextAlign.Justify,
                )
                Spacer(modifier = Modifier.height(BaseTheme.dimensions.smallPadding))
                Row(
                    horizontalArrangement = Arrangement.spacedBy(BaseTheme.dimensions.largePadding),
                ) {
                    Icon(painter = painterResource(id = R.drawable.ic_comment),
                        contentDescription = "comment",
                        tint = BaseTheme.colors.primary,
                        modifier = Modifier
                            .clip(CircleShape)
                            .clickable { }
                            .padding(BaseTheme.dimensions.smallPadding))
                    Icon(painter = painterResource(id = R.drawable.ic_share),
                        contentDescription = "share",
                        tint = BaseTheme.colors.primary,
                        modifier = Modifier
                            .clip(CircleShape)
                            .clickable { }
                            .padding(BaseTheme.dimensions.smallPadding))
                }
            }
        }
    }
}