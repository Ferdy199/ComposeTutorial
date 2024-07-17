package com.gunder.market.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gunder.market.R
import com.gunder.market.model.ListCardForYou
import com.gunder.market.ui.theme.MarketTheme

@Composable
fun MainBannerVertical(modifier: Modifier = Modifier, listBannerVertical: ListCardForYou) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(start = 8.dp, end = 8.dp, top = 4.dp, bottom = 8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Card(
            shape = RoundedCornerShape(8.dp),
            colors = CardDefaults.cardColors(Color.Transparent)
        ) {
            Image(
                painter = painterResource(id = listBannerVertical.imgCard),
                contentDescription = stringResource(id = listBannerVertical.txtDesc)
            )
        }
    }

}

@Preview(showBackground = true)
@Composable
private fun MainBannerVerticalPreview() {
    MarketTheme {
        MainBannerVertical(
            listBannerVertical = ListCardForYou(R.drawable.banner_vertikal1, R.string.txt_desc_first_banner)
        )
    }
}