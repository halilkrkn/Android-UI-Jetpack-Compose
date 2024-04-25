package com.halilkrkn.libraryapp_ui

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ChevronRight
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.QrCode
import androidx.compose.material3.BottomSheetScaffold
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.rememberBottomSheetScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.halilkrkn.libraryapp_ui.ui.theme.LibraryApp_UITheme
import com.halilkrkn.libraryapp_ui.ui.theme.NewYorkFamily

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LibraryApp_UITheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainApp()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainApp() {
    val sheetState = rememberBottomSheetScaffoldState()
    BottomSheetScaffold(
        scaffoldState = sheetState,
        sheetPeekHeight = 150.dp,
        topBar = {
            TopBar()
        },
        // My Books Section
        sheetContent = {
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "My Books",
                modifier = Modifier.padding(28.dp),
                fontFamily = NewYorkFamily,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )

            LazyColumn(
                contentPadding = PaddingValues(vertical = 8.dp),
                modifier = Modifier.fillMaxHeight(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                items(myBookItems) { myBook ->
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 28.dp, vertical = 8.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(16.dp)
                    ) {
                        Image(
                            painter = painterResource(id = myBook.book.image),
                            contentScale = ContentScale.FillHeight,
                            contentDescription = "Cover",
                            modifier = Modifier
                                .clip(RoundedCornerShape(8.dp))
                                .height(120.dp)
                        )
                        Column(
                            modifier = Modifier.weight(1f)
                        ) {
                            Text(
                                text = myBook.book.title,
                                fontFamily = NewYorkFamily,
                                fontWeight = FontWeight.Bold,
                                fontSize = 16.sp
                            )
                            Text(text = myBook.book.author, fontSize = 13.sp, color = Color.Gray)
                            Spacer(modifier = Modifier.weight(1f))
                            Text(
                                text = "Return until ${myBook.returnDate}",
                                fontSize = 12.sp,
                                color = MaterialTheme.colorScheme.primary
                            )
                            LinearProgressIndicator(
                                myBook.timeLeftPercentage,
                                modifier = Modifier.fillMaxWidth()
                            )
                        }
                        IconButton(onClick = { /*TODO*/ }) {
                            Icon(
                                imageVector = Icons.Filled.MoreVert,
                                contentDescription = "More"
                            )

                        }

                    }

                }
            }

        }
    ) { paddingValues ->

        // New Arrivals and View ALl Section
        Column(modifier = Modifier.padding(paddingValues)) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 28.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "New Arrivals",
                    fontFamily = NewYorkFamily,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    modifier = Modifier.weight(1f)
                )
                TextButton(
                    onClick = { /*TODO*/ },
                    contentPadding = PaddingValues(horizontal = 0.dp)
                ) {
                    Text(text = "View All")
                    Spacer(modifier = Modifier.width(4.dp))
                    Icon(imageVector = Icons.Filled.ChevronRight, contentDescription = "View All")
                }
            }
            // Horizontal Scrollable Row Section
            Spacer(modifier = Modifier.height(16.dp))
            LazyRow(
                contentPadding = PaddingValues(horizontal = 16.dp),
                modifier = Modifier.fillMaxHeight(),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                items(items) { book ->
                    Column(
                        modifier = Modifier.width(130.dp),
                        verticalArrangement = Arrangement.SpaceBetween,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(
                            painter = painterResource(id = book.image),
                            contentDescription = "Book cover",
                            modifier = Modifier
                                .fillMaxWidth()
                                .clip(RoundedCornerShape(16.dp)),
                            contentScale = ContentScale.FillWidth
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(
                            text = book.title,
                            fontFamily = NewYorkFamily,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Text(text = book.author, color = Color.Gray, fontSize = 12.sp)
                    }
                }
            }
        }
    }
}

@Composable
fun TopBar() {
    Row(
        modifier = Modifier
            .padding(start = 28.dp, end = 28.dp, top = 36.dp, bottom = 32.dp)
            .fillMaxWidth()
            .height(IntrinsicSize.Min),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "20",
            fontWeight = FontWeight.Bold,
            fontFamily = NewYorkFamily,
            fontSize = 38.sp
        )
        Column(
            modifier = Modifier.weight(1f)
        ) {
            Text(text = "Thu", fontFamily = NewYorkFamily, fontSize = 14.sp, color = Color.Gray)
            Text(
                text = "June 2024",
                fontFamily = NewYorkFamily,
                fontSize = 14.sp,
                color = Color.Gray
            )
        }
        IconButton(onClick = { /*TODO*/ }) {
            Icon(imageVector = Icons.Filled.QrCode, contentDescription = "QR Code")
        }
        Image(
            painter = painterResource(id = R.drawable.img_profile),
            contentDescription = "Profile Picture",
            modifier = Modifier
                .clip(RoundedCornerShape(10.dp))
                .height(48.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LibraryApp_UITheme {
        MainApp()
    }
}