package com.gunder.market.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
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
import com.gunder.market.model.ListDiscount
import com.gunder.market.ui.theme.MarketTheme

@Composable
fun MainImageCategory(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(8.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = modifier.padding(4.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            Card(
                modifier = modifier.width(172.dp).height(112.dp),
                shape = RoundedCornerShape(8.dp)
            ) {
                Image(
                    modifier = modifier.fillMaxSize(),
                    painter = painterResource(id = R.drawable.banner_horizontal_1),
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds
                )
            }
            Card(
                modifier = modifier.width(172.dp).height(112.dp),
                shape = RoundedCornerShape(8.dp)
            ) {
                Image(
                    modifier = modifier.fillMaxSize(),
                    painter = painterResource(id = R.drawable.banner_horizontal_4),
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds
                )
            }
        }
        Row(
            modifier = modifier.padding(4.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Card(
                modifier = modifier.width(172.dp).height(112.dp),
                shape = RoundedCornerShape(8.dp)
            ) {
                Image(
                    modifier = modifier.fillMaxSize(),
                    painter = painterResource(id = R.drawable.banner_horizontal_2),
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds
                )
            }
            Card(
                modifier = modifier.width(172.dp).height(112.dp),
                shape = RoundedCornerShape(8.dp)
            ) {
                Image(
                    modifier = modifier.fillMaxSize(),
                    painter = painterResource(id = R.drawable.banner_horizontal_3),
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds
                )
            }
        }
    }
}

@Preview (showBackground = true)
@Composable
private fun MainImageCategoryPreview() {
    MarketTheme {
        MainImageCategory()
    }
}