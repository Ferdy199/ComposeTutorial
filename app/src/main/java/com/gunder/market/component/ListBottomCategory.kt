package com.gunder.market.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gunder.market.R.drawable.play
import com.gunder.market.R.string.txt_category_sport
import com.gunder.market.model.ListBottomCategory
import com.gunder.market.ui.theme.MarketTheme

@Composable
fun MainBottomCategory(modifier: Modifier = Modifier, listBottomCategory: ListBottomCategory) {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(start = 8.dp, end = 8.dp, top = 4.dp, bottom = 4.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Image(
            painter = painterResource(id = listBottomCategory.imgBottomCategory),
            contentDescription = null,
            modifier = modifier.size(40.dp)
        )

        Text(
            text = stringResource(id = listBottomCategory.txtBottomCategory),
            fontSize = 12.sp
        )
    }
}

@Preview (showBackground = true)
@Composable
private fun ListBottomCategoryPreview() {
    MarketTheme {
        MainBottomCategory(listBottomCategory = ListBottomCategory(play, txt_category_sport))
    }
}