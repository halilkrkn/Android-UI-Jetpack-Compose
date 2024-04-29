package com.halilkrkn.dashboard_ui

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.BottomAppBar
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.FabPosition
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.rememberScaffoldState
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.halilkrkn.dashboard_ui.ui.theme.DashboardBackgroundColor
import com.halilkrkn.dashboard_ui.ui.theme.Dashboard_UITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Dashboard_UITheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val scaffoldState = rememberScaffoldState()
                    val contextForToast = LocalContext.current.applicationContext

                    Scaffold(
                        bottomBar = { MyBottomBar() },
                        floatingActionButton = {
                            FloatingActionButton(
                                onClick = {  Toast.makeText(
                                    contextForToast,
                                    "Selected: Shopping Cart",
                                    Toast.LENGTH_SHORT
                                ).show() },
                                contentColor = White,
                                backgroundColor = Color(android.graphics.Color.parseColor("#Fe5b52"))
                            ) {
                                Icon(
                                    painter = painterResource(id = R.drawable.shopping_cart),
                                    contentDescription = "Add",
                                    modifier = Modifier.size(30.dp)
                                )
                            }
                        },
                        scaffoldState = scaffoldState,
                        isFloatingActionButtonDocked = true,
                        floatingActionButtonPosition = FabPosition.Center,

                        ) {
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(it),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Dashboard()
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Dashboard() {

    var text by rememberSaveable {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .background(color = DashboardBackgroundColor),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Image(
                painter = painterResource(id = R.drawable.profile),
                contentDescription = "Profile",
                modifier = Modifier
                    .padding(8.dp)
                    .width(100.dp)
                    .height(100.dp)
                    .clickable { }
            )

            Column(
                modifier = Modifier
                    .height(100.dp)
                    .padding(start = 16.dp)
                    .weight(0.7f),
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Abby Sandet",
                    color = Color.Black,
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold
                )

                Text(
                    text = "abbysandet@gmail.com",
                    color = Color.Black,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Light,
                    modifier = Modifier.padding(top = 8.dp)
                )

            }

        }

        TextField(
            value = text,
            onValueChange = { text = it },
            label = { Text("Searching for...") },
            trailingIcon = {
                Box(
                    modifier = Modifier
                        .padding(end = 6.dp)
                        .height(45.dp)
                        .width(45.dp)
                        .background(
                            color = Color(android.graphics.Color.parseColor("#Fe5b52")),
                            shape = RoundedCornerShape(10.dp)
                        )
                )
                {
                    Image(
                        painter = painterResource(id = R.drawable.search),
                        contentDescription = "Search",
                        modifier = Modifier
                            .padding(8.dp)
                            .size(35.dp)
                    )
                }
            },
            shape = RoundedCornerShape(12.dp),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                backgroundColor = Color.White,
                focusedBorderColor = Color.Transparent,
                unfocusedBorderColor = Color.Transparent,
                textColor = Color(android.graphics.Color.parseColor("#5e5e5e")),
                unfocusedLabelColor = Color(android.graphics.Color.parseColor("#5e5e5e")),
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 24.dp, start = 8.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Column(
                modifier = Modifier
                    .weight(0.5f)
                    .padding(end = 12.dp)
                    .background(
                        color = White,
                        shape = RoundedCornerShape(20.dp)
                    )
                    .padding(top = 16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box(
                    modifier = Modifier
                        .height(65.dp)
                        .width(75.dp)
                        .background(
                            color = Color(android.graphics.Color.parseColor("#6650a4")),
                            shape = RoundedCornerShape(20.dp)
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_1),
                        contentDescription = null
                    )
                }
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp)
                        .height(50.dp)
                        .background(
                            color = Color(android.graphics.Color.parseColor("#Dad8ff")),
                            shape = RoundedCornerShape(bottomEnd = 20.dp, bottomStart = 20.dp)
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    Text(text = "Messenger", fontSize = 14.sp, fontWeight = FontWeight.Bold)
                }

            }

            Column(
                modifier = Modifier
                    .weight(0.5f)
                    .padding(end = 12.dp)
                    .background(
                        color = White,
                        shape = RoundedCornerShape(20.dp)
                    )
                    .padding(top = 16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box(
                    modifier = Modifier
                        .height(65.dp)
                        .width(75.dp)
                        .background(
                            color = Color(android.graphics.Color.parseColor("#6650a4")),
                            shape = RoundedCornerShape(20.dp)
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_2),
                        contentDescription = null
                    )
                }
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp)
                        .height(50.dp)
                        .background(
                            color = Color(android.graphics.Color.parseColor("#Dad8ff")),
                            shape = RoundedCornerShape(bottomEnd = 20.dp, bottomStart = 20.dp)
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    Text(text = "Routing", fontSize = 14.sp, fontWeight = FontWeight.Bold)
                }

            }

        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 24.dp, start = 8.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Column(
                modifier = Modifier
                    .weight(0.5f)
                    .padding(end = 12.dp)
                    .background(
                        color = White,
                        shape = RoundedCornerShape(20.dp)
                    )
                    .padding(top = 16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box(
                    modifier = Modifier
                        .height(65.dp)
                        .width(75.dp)
                        .background(
                            color = Color(android.graphics.Color.parseColor("#6650a4")),
                            shape = RoundedCornerShape(20.dp)
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_3),
                        contentDescription = null
                    )
                }
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp)
                        .height(50.dp)
                        .background(
                            color = Color(android.graphics.Color.parseColor("#Dad8ff")),
                            shape = RoundedCornerShape(bottomEnd = 20.dp, bottomStart = 20.dp)
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    Text(text = "Report", fontSize = 14.sp, fontWeight = FontWeight.Bold)
                }

            }

            Column(
                modifier = Modifier
                    .weight(0.5f)
                    .padding(end = 12.dp)
                    .background(
                        color = White,
                        shape = RoundedCornerShape(20.dp)
                    )
                    .padding(top = 16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box(
                    modifier = Modifier
                        .height(65.dp)
                        .width(75.dp)
                        .background(
                            color = Color(android.graphics.Color.parseColor("#6650a4")),
                            shape = RoundedCornerShape(20.dp)
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_4),
                        contentDescription = null
                    )
                }
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp)
                        .height(50.dp)
                        .background(
                            color = Color(android.graphics.Color.parseColor("#Dad8ff")),
                            shape = RoundedCornerShape(bottomEnd = 20.dp, bottomStart = 20.dp)
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    Text(text = "Inbox", fontSize = 14.sp, fontWeight = FontWeight.Bold)
                }

            }

        }

        ConstraintLayout(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp, start = 8.dp, end = 8.dp, bottom = 8.dp)
                .height(120.dp)
                .background(
                    brush = Brush.horizontalGradient(
                        colors = listOf(
                            Color(android.graphics.Color.parseColor("#BFA3EF")),
                            Color(android.graphics.Color.parseColor("#7E57C2"))
                        )
                    ),
                    shape = RoundedCornerShape(20.dp)
                )
        ) {
            val (img, text1, text2) = createRefs()
            Image(
                painter = painterResource(id = R.drawable.arc),
                contentDescription = null,
                modifier = Modifier
                    .constrainAs(img) {
                        start.linkTo(parent.start)
                        top.linkTo(parent.top)
                    }
            )

            Text(
                text = "To Get Unlimited",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = White,
                modifier = Modifier
                    .constrainAs(text1) {
                        start.linkTo(img.end, margin = 16.dp)
                        top.linkTo(parent.top, margin = 16.dp)
                        end.linkTo(parent.end, margin = 16.dp)
                    }
            )

            Text(
                text = "Upgrade Your Account",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = White,
                modifier = Modifier
                    .constrainAs(text2) {
                        start.linkTo(img.end)
                        top.linkTo(text1.bottom)
                        end.linkTo(parent.end)
                        bottom.linkTo(parent.bottom)
                    }
            )

        }
    }
}

data class BottomMenuItem(val label: String, val icon: Painter)

@Composable
private fun prepareBottomMenu(): List<BottomMenuItem> {
    val bottomMenuItemList = arrayListOf<BottomMenuItem>()

    bottomMenuItemList.add(
        BottomMenuItem(
            label = "Home",
            icon = painterResource(id = R.drawable.bottom_btn1)
        )
    )
    bottomMenuItemList.add(
        BottomMenuItem(
            label = "Profile",
            icon = painterResource(id = R.drawable.bottom_btn2)
        )
    )
    bottomMenuItemList.add(
        BottomMenuItem(
            label = "Support",
            icon = painterResource(id = R.drawable.bottom_btn3)
        )
    )
    bottomMenuItemList.add(
        BottomMenuItem(
            label = "Settings",
            icon = painterResource(id = R.drawable.bottom_btn4)
        )
    )

    return bottomMenuItemList

}

@Composable
fun MyBottomBar() {
    val bottomMenuItemsList = prepareBottomMenu()
    val contextForToast = LocalContext.current.applicationContext
    var selectedItem by remember {
        mutableStateOf("Profile")
    }

    BottomAppBar(
        cutoutShape = CircleShape,
        backgroundColor = White,
        elevation = 3.dp
    ) {
        bottomMenuItemsList.forEachIndexed { index, bottomMenuItem ->
            if (index == 2) {
                BottomNavigationItem(
                    selected = false,
                    onClick = { /*TODO*/ },
                    icon = { /*TODO*/ },
                    enabled = false
                )
            }

            BottomNavigationItem(
                selected = (selectedItem == bottomMenuItem.label),
                onClick = {
                    selectedItem = bottomMenuItem.label
                    Toast.makeText(
                        contextForToast,
                        "Selected: ${bottomMenuItem.label}",
                        Toast.LENGTH_SHORT
                    ).show()
                },
                icon = {
                    Icon(
                        painter = bottomMenuItem.icon,
                        contentDescription = bottomMenuItem.label,
                        modifier = Modifier
                            .size(20.dp)
                    )
                },
                label = {
                    Text(
                        text = bottomMenuItem.label,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(top = 14.dp)
                    )
                },
                alwaysShowLabel = true,
                enabled = true
            )
        }

    }
}


@Preview(showBackground = true)
@Composable
fun DashboardPreview() {
    val scaffoldState = rememberScaffoldState()
    val contextForToast = LocalContext.current.applicationContext

    Dashboard_UITheme {
        Scaffold(
            bottomBar = { MyBottomBar() },
            floatingActionButton = {
                FloatingActionButton(
                    onClick = {  Toast.makeText(
                        contextForToast,
                        "Selected: Shopping Cart",
                        Toast.LENGTH_SHORT
                    ).show()},
                    contentColor = White,
                    backgroundColor = Color(android.graphics.Color.parseColor("#6650a4"))
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.shopping_cart),
                        contentDescription = "Add",
                        modifier = Modifier.size(30.dp)
                    )
                }
            },
            scaffoldState = scaffoldState,
            isFloatingActionButtonDocked = true,
            floatingActionButtonPosition = FabPosition.Center,

            ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Dashboard()
            }
        }
    }
}