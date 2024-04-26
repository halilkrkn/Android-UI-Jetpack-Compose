package com.halilkrkn.lifegoalsapp_ui

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Healing
import androidx.compose.material.icons.filled.Lightbulb
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreHoriz
import androidx.compose.material.icons.filled.Timer
import androidx.compose.material.icons.outlined.Lightbulb
import androidx.compose.material.icons.outlined.PlayArrow
import androidx.compose.material.icons.outlined.WorkOutline
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.halilkrkn.lifegoalsapp_ui.ui.theme.Blue
import com.halilkrkn.lifegoalsapp_ui.ui.theme.Cyan
import com.halilkrkn.lifegoalsapp_ui.ui.theme.LifeGoalsApp_UITheme
import com.halilkrkn.lifegoalsapp_ui.ui.theme.Poppins
import java.util.Date

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LifeGoalsApp_UITheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    MainApp()
                }
            }
        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainApp() {
    Scaffold(
        topBar = {
            TopBar()
        },

        ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(paddingValues)
                .padding(horizontal = 16.dp),
//            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "2 Big Challenges",
                fontFamily = Poppins,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
            )
            Text(
                text = "Ambitious person aren't you",
                fontFamily = Poppins,
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color.Gray
            )

            Spacer(modifier = Modifier.height(16.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
            ) {
                BigButton(
                    icon = Icons.Default.Timer,
                    iconTint = Color(0xff45BAC5),
                    title = "Life Style",
                    subtitle = "Become a morning person",
                    reminder = "Every Day",
                    modifier = Modifier.weight(1f)
                )
                Spacer(modifier = Modifier.width(8.dp))
                BigButton(
                    icon = Icons.Default.Favorite,
                    iconTint = Color(0xffFA6569),
                    title = "Healthy Style",
                    subtitle = "Because your health is  the most important",
                    reminder = "Every Day",
                    modifier = Modifier.weight(1f)
                )
            }
            Spacer(modifier = Modifier.height(32.dp))
            Text(text = "Today's Planning", fontWeight = FontWeight.SemiBold, fontSize = 24.sp)
            Text(
                text = "You have 3 actions to do",
                fontWeight = FontWeight.SemiBold,
                fontSize = 16.sp,
                color = Color.Gray
            )
            Spacer(modifier = Modifier.height(16.dp))
            TaskItem(
                icon = Icons.Outlined.Lightbulb,
                title = "Learn New Skill",
                subtitle = "Wake up at 6:00 AM",
                modifier = Modifier.fillMaxWidth()
            )
            TaskItem(
                icon = Icons.Outlined.WorkOutline,
                title = "Create Tutorial",
                subtitle = "Eat a healthy breakfast",
                modifier = Modifier.fillMaxWidth()
            )
            TaskItem(
                icon = Icons.Outlined.PlayArrow,
                title = "Watch Video",
                subtitle = "Eat a healthy breakfast",
                modifier = Modifier.fillMaxWidth()
            )
        }

    }

}

@Composable
fun TopBar() {
    Row(
        Modifier
            .fillMaxWidth()
            .height(IntrinsicSize.Min)
            .padding(horizontal = 16.dp, vertical = 16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton(
            onClick = {}, modifier = Modifier.background(Cyan, RoundedCornerShape(8.dp))
        ) {
            Icon(imageVector = Icons.Default.Menu, contentDescription = "Menu")
        }
        Text(
            text = "Don't Give Up",
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.weight(1f)
        )
        AsyncImage(
            model = "https://avatars.githubusercontent.com/u/42476890?v=4",
            contentDescription = "Profile Picture",
            modifier = Modifier
                .fillMaxHeight()
                .aspectRatio(1f)
//                .size(40.dp)
                .clip(RoundedCornerShape(10.dp)),
            contentScale = ContentScale.Crop
        )
    }

}

@Composable
fun BigButton(
    icon: ImageVector,
    iconTint: Color,
    title: String,
    subtitle: String,
    reminder: String,
    modifier: Modifier = Modifier,
) {
    Card(
        colors = CardDefaults.cardColors(
            containerColor = Cyan,
            contentColor = Color.Black
        ),
        elevation = CardDefaults.cardElevation(2.dp),
        modifier = modifier
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Icon(
                imageVector = icon,
                contentDescription = "Icon",
                tint = iconTint,
                modifier = Modifier.size(52.dp)
            )
            Text(text = title, fontWeight = FontWeight.SemiBold, fontSize = 18.sp)
            Text(text = subtitle, fontWeight = FontWeight.Medium, fontSize = 12.sp)
            Spacer(modifier = Modifier.height(16.dp))
            Text(text = "Reminder", fontWeight = FontWeight.Light, fontSize = 10.sp)
            Text(text = reminder, fontWeight = FontWeight.SemiBold, fontSize = 10.sp)
        }
    }


}


@Composable
fun TaskItem(
    icon: ImageVector,
    title: String,
    subtitle: String,
    modifier: Modifier = Modifier,
) {
    Card(
        modifier = modifier.padding(vertical = 2.dp),
        colors = CardDefaults.cardColors(Cyan),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Row(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
                .height(IntrinsicSize.Min),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = icon,
                contentDescription = "Icon",
                tint = Blue,
                modifier = Modifier
                    .padding(end = 8.dp)
                    .background(Color.White, RoundedCornerShape(8.dp))
            )
            Column(modifier = Modifier.padding(horizontal = 4.dp).weight(1f)) {
                Text(text = title, color = Color.Black, fontWeight = FontWeight.SemiBold, fontSize = 16.sp)
                Text(text = subtitle, fontSize = 12.sp, color = Color.Gray)
            }
            IconButton(onClick = { /*TODO*/ }, modifier = Modifier.align(Alignment.Top)) {
                Icon(imageVector = Icons.Default.MoreHoriz, contentDescription = "More Horiz", tint = Color.Black)
            }
        }

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MainAppPreview() {
    LifeGoalsApp_UITheme {
        MainApp()
    }
}