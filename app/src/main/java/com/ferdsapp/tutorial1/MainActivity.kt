package com.ferdsapp.tutorial1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ferdsapp.tutorial1.ui.theme.Tutorial1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Tutorial1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android", modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun userProfile(modifier: Modifier = Modifier) {
    Box(modifier = Modifier) {
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = null,
            modifier = Modifier.size(32.dp)
        )
        Icon(imageVector = Icons.Default.Check, contentDescription = null,
            Modifier
                .size(8.dp)
                .align(Alignment.BottomEnd))
    }
}

@Preview(showBackground = true)
@Composable
private fun userProfilePreview() {
    Tutorial1Theme {
        userProfile()
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!", modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Tutorial1Theme {
        Greeting("Android")
    }
}

@Composable
fun newText(name: String) {
    Column(modifier = Modifier
        .padding(24.dp)
        .background(color = Color.Cyan)
        .fillMaxWidth()) {
        Text(text = "Hello!,")
        Text(text = name)
    }
}

@Preview(showBackground = true)
@Composable
private fun newTextPreview() {
    Tutorial1Theme {
        newText(name = "Gregory")
    }
}

@Composable
fun UserChat(name: String, msg: String) {
    Row(
        modifier = Modifier
            .padding(4.dp)
            .clickable(onClick = {})
    ) {
        Image(painter = painterResource(
            id = R.drawable.ic_launcher_foreground),
            contentDescription = null,
            modifier = Modifier
                .padding(4.dp)
                .size(60.dp)
                .border(2.dp, Color.Cyan, CircleShape)
                .clip(CircleShape)
        )
        Spacer(modifier = Modifier.width(4.dp))
        Column(modifier = Modifier
            .padding(4.dp)
            .fillMaxWidth()) {
            Text(text = name, fontWeight = FontWeight.Bold)
            Text(text = msg, modifier = Modifier.offset(x = 4.dp))
            Icon(imageVector = Icons.Default.CheckCircle, contentDescription = null, modifier =
            Modifier.align(Alignment.End))
        }
    }
}

@Preview (showBackground = true)
@Composable
private fun UserChatPreview() {
    Tutorial1Theme {
        UserChat(name = "Freds", msg = "Android Dev")
    }
}

@Composable
fun SlotBasedLayout() {
    Button(
        contentPadding = PaddingValues(start = 20.dp, end = 20.dp, bottom = 12.dp, top = 12.dp),
        onClick = {/*TODO*/ }
    ) {
        Icon(
            imageVector = Icons.Filled.Favorite ,
            contentDescription = null,
            modifier = Modifier.size(ButtonDefaults.IconSize)
        )
        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
        Text("Like")
    }
}

@Preview (showBackground = true)
@Composable
private fun SlotBasedLayoutPreview() {
    Tutorial1Theme {
        SlotBasedLayout()
    }
}