package com.gunder.market.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gunder.market.R
import com.gunder.market.model.ListBanner
import com.gunder.market.ui.theme.MarketTheme

@Composable
fun MainCardCategory(modifier: Modifier = Modifier, listBanner: ListBanner) {
    Card(
        modifier = Modifier
            .width(220.dp)
            .height(88.dp)
            .padding(8.dp),
        shape = RoundedCornerShape(8.dp),

        ) {
        Image(
            modifier = modifier.fillMaxSize(),
            painter = painterResource(id = listBanner.imgBanner),
            contentDescription = null,
            contentScale = ContentScale.FillBounds
        )
    }
}

@Preview (showBackground = true)
@Composable
private fun MainCardCategoryPreview() {
    MarketTheme {
        MainCardCategory(listBanner = ListBanner(imgBanner = R.drawable.banner1))
    }
}