package com.halilkrkn.a1_profileui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.halilkrkn.a1_profileui.ui.theme._1_ProfileUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            _1_ProfileUITheme {
                // A surface container using the 'background' color from the theme
                Profile()
            }
        }
    }
}

@Composable
fun Profile() {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .background(color = Color(android.graphics.Color.parseColor("#f2f1f6"))),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ConstraintLayout(
            modifier = Modifier
                .height(250.dp)
                .background(color = Color(android.graphics.Color.parseColor("#32357a")))
        ) {
            val (topImg, profile, title, back, pen) = createRefs()

            Image(painter = painterResource(id = R.drawable.arc_3),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .constrainAs(topImg) {
                        bottom.linkTo(parent.bottom)
                    })

            Image(painter = painterResource(id = R.drawable.user_2),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .constrainAs(profile) {
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                        bottom.linkTo(parent.bottom)
                    })

            Text(text = "Profile",
                style = TextStyle(color = Color.White, fontSize = 32.sp),
                modifier = Modifier.constrainAs(title) {
                    top.linkTo(parent.top, margin = 48.dp)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                })

            Image(painter = painterResource(id = R.drawable.back),
                contentDescription = null,
                modifier = Modifier
                    .clickable {  }
                    .size(42.dp)
                    .constrainAs(back) {
                        top.linkTo(parent.top, margin = 16.dp)
                        start.linkTo(parent.start, margin = 24.dp)
                    })

            Image(painter = painterResource(id = R.drawable.write),
                contentDescription = null,
                modifier = Modifier
                    .clickable {  }
                    .size(36.dp)
                    .clip(shape = CircleShape)
                    .constrainAs(pen) {
                        top.linkTo(parent.top, margin = 215.dp)
                        start.linkTo(parent.start, margin = 78.dp)
                        end.linkTo(parent.end)
                    })

        }
        Text(
            text = "Halil Karkın",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 16.dp),
            color = Color(android.graphics.Color.parseColor("#32357a"))
        )
        Text(
            text = "halilkrkn000@gmail.com",
            fontSize = 18.sp,
            fontWeight = FontWeight.Light,
            color = Color(android.graphics.Color.parseColor("#757679"))
        )

        Column(modifier = Modifier.fillMaxHeight().padding(top = 36.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
            Row(
                modifier = Modifier
                    .clickable {  }
                    .fillMaxWidth()
                    .padding(start = 24.dp, end = 24.dp)
                    .height(56.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Image(painter = painterResource(id = R.drawable.btn_1),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(end = 4.dp)
                        .clickable { })

                Text(text = "Notification", color = Color.Black, fontSize = 18.sp, fontWeight = FontWeight.SemiBold)
                Image(painter = painterResource(id = R.drawable.arrow),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(end = 4.dp)
                        .clickable { })
            }

            Row(
                modifier = Modifier
                    .clickable {  }
                    .fillMaxWidth()
                    .padding(start = 24.dp, end = 24.dp)
                    .height(56.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Image(painter = painterResource(id = R.drawable.btn_2),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(end = 4.dp)
                        .clickable { })

                Text(text = "Calendar", color = Color.Black, fontSize = 18.sp, fontWeight = FontWeight.SemiBold)
                Image(painter = painterResource(id = R.drawable.arrow),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(end = 4.dp)
                        .clickable { })
            }

            Row(
                modifier = Modifier
                    .clickable {  }
                    .fillMaxWidth()
                    .padding(start = 24.dp, end = 24.dp)
                    .height(56.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Image(painter = painterResource(id = R.drawable.btn_3),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(end = 4.dp)
                        .clickable { })

                Text(text = "Gallery", color = Color.Black, fontSize = 18.sp, fontWeight = FontWeight.SemiBold)
                Image(painter = painterResource(id = R.drawable.arrow),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(end = 4.dp)
                        .clickable { })
            }

            Row(
                modifier = Modifier
                    .clickable {  }
                    .fillMaxWidth()
                    .padding(start = 24.dp, end = 24.dp)
                    .height(56.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Image(painter = painterResource(id = R.drawable.btn_4),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(end = 4.dp)
                        .clickable { })

                Text(text = "My Playlist", color = Color.Black, fontSize = 18.sp, fontWeight = FontWeight.SemiBold)
                Image(painter = painterResource(id = R.drawable.arrow),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(end = 4.dp)
                        .clickable { })
            }

            Row(
                modifier = Modifier
                    .clickable {  }
                    .fillMaxWidth()
                    .padding(start = 24.dp, end = 24.dp)
                    .height(56.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Image(painter = painterResource(id = R.drawable.btn_5),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(end = 4.dp)
                        .clickable { })

                Text(text = "Share", color = Color.Black, fontSize = 18.sp, fontWeight = FontWeight.SemiBold)
                Image(painter = painterResource(id = R.drawable.arrow),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(end = 4.dp)
                        .clickable { })
            }

            Row(
                modifier = Modifier
                    .clickable {  }
                    .fillMaxWidth()
                    .padding(start = 24.dp, end = 24.dp)
                    .height(56.dp),
                verticalAlignment = Alignment.CenterVertically,
//                horizontalArrangement = Arrangement.Center,
            ) {
                Image(painter = painterResource(id = R.drawable.btn_6),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(end = 12.dp)
                        .clickable { })

                Text(text = "Logout", color = Color.Black, fontSize = 18.sp, fontWeight = FontWeight.SemiBold)
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    _1_ProfileUITheme {
        Profile()
    }
}