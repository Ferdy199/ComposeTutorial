package com.gunder.market

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import com.gunder.market.component.MainBottomCategory
import com.gunder.market.component.MainCardCategory
import com.gunder.market.component.MainTopBar
import com.gunder.market.component.MainTopCategory
import com.gunder.market.component.TopMenu
import com.gunder.market.model.dummyListBanner
import com.gunder.market.model.dummyListBottomCategory
import com.gunder.market.model.dummyListTopCategory
import com.gunder.market.model.dummyListTopMenu
import com.gunder.market.ui.theme.MarketTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MarketTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MarketApp()
                }
            }
        }
    }
}

@Composable
fun MainTopMenu(modifier: Modifier = Modifier) {
    LazyRow{
       items(dummyListTopMenu){
            TopMenu(listTopMenu = it)
       }
    }
}

@Preview(showBackground = true)
@Composable
private fun MainTopMenuPreview() {
    MarketTheme {
        MainTopMenu()
    }
}

@Composable
fun MainCategoryTop(modifier: Modifier = Modifier) {
    LazyRow {
        items(dummyListTopCategory){
            MainTopCategory(listTopCategory = it)
        }
    }
}

@Preview (showBackground = true)
@Composable
private fun MainCategoryTopPreview() {
    MarketTheme {
        MainCategoryTop()
    }
}

@Composable
fun MainCategoryBottom(modifier: Modifier = Modifier) {
    LazyRow {
        items(dummyListBottomCategory){
            MainBottomCategory(listBottomCategory = it)
        }
    }
}

@Preview (showBackground = true)
@Composable
private fun MainCategoryBottomPreview() {
    MarketTheme {
        MainCategoryBottom()
    }
}

@Composable
fun MainListBanner(modifier: Modifier = Modifier) {
    LazyRow {
        items(dummyListBanner){
            MainCardCategory(listBanner = it)
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun MainListBannerPreview() {
    MarketTheme {
        MainListBanner()
    }
}

// all preview place here
@Composable
fun MarketApp(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .verticalScroll(rememberScrollState())
    ) {
//        your code compose here
        MainTopBar()
        MainTopMenu()
        MainCategoryTop()
        MainListBanner()
        MainCategoryBottom()
    }
}

@Preview(device = Devices.DEFAULT, showBackground = true)
@Composable
fun MarketAppPreview() {
    MarketTheme {
        MarketApp()
    }
}