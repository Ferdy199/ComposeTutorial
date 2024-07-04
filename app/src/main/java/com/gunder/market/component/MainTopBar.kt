package com.gunder.market.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gunder.market.ui.theme.MarketTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainTopBar(modifier: Modifier = Modifier) {
    Column {
        Row(
            modifier = Modifier.width(IntrinsicSize.Max),
            verticalAlignment = Alignment.CenterVertically
        ) {
            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = modifier,
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Outlined.Search,
                        contentDescription = null,
                    )
                },
                placeholder = {
                    Text(text = "Search here")
                }
            )
            Icon(
                imageVector = Icons.Outlined.Email,
                contentDescription = null,
                modifier = modifier.size(24.dp)
            )
            Icon(
                imageVector = Icons.Outlined.ShoppingCart,
                contentDescription = null,
                modifier = modifier.size(24.dp)
            )
            Icon(
                imageVector = Icons.Outlined.Notifications,
                contentDescription = null,
                modifier = modifier.size(24.dp)
            )
            Icon(
                imageVector = Icons.Outlined.Menu,
                contentDescription = null,
                modifier = modifier.size(24.dp)
            )
        }
    }
}

@Preview (showBackground = true)
@Composable
private fun MainTopBarPreview() {
    MarketTheme {
        MainTopBar()
    }
}