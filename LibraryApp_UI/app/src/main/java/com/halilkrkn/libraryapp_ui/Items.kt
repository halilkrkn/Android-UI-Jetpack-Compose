package com.halilkrkn.libraryapp_ui

 val items = listOf(
     Book(title = "Muscle", image = R.drawable.book_muscle, author = "Alan Trotter"),
     Book(title = "Dominicana", image = R.drawable.book_dominicana, author = "Angie Cruz"),
     Book(title = "A New Program for Graphic Design", image = R.drawable.book_just_my_type, author = "David Reinfurt"),
 )

data class Book(
    val title: String,
    val image: Int,
    val author: String,
)


val myBookItems = listOf(
    MyBook(book = Book(title = "Just My Type", R.drawable.book_just_my_type, author = "Simon Garfield"), returnDate = "25.03.2022", timeLeftPercentage =  10f),
    MyBook(book = items[0], returnDate = "25.02.2022", timeLeftPercentage =  80f),
    MyBook(book = items[1], returnDate = "21.01.2022", timeLeftPercentage =  95f),
    MyBook(book = Book(title = "Just My Type", R.drawable.book_just_my_type, author = "Simon Garfield"), returnDate = "25.03.2022", timeLeftPercentage =  10f),
    MyBook(book = items[0], returnDate = "25.02.2022", timeLeftPercentage =  80f),
    MyBook(book = items[1], returnDate = "21.01.2022", timeLeftPercentage =  95f),
    MyBook(book = Book(title = "Just My Type", R.drawable.book_just_my_type, author = "Simon Garfield"), returnDate = "25.03.2022", timeLeftPercentage =  10f),
    MyBook(book = items[0], returnDate = "25.02.2022", timeLeftPercentage =  80f),
    MyBook(book = items[1], returnDate = "21.01.2022", timeLeftPercentage =  95f),
    MyBook(book = Book(title = "Just My Type", R.drawable.book_just_my_type, author = "Simon Garfield"), returnDate = "25.03.2022", timeLeftPercentage =  10f),
    MyBook(book = items[0], returnDate = "25.02.2022", timeLeftPercentage =  80f),
    MyBook(book = items[1], returnDate = "21.01.2022", timeLeftPercentage =  95f)

)

data class MyBook(
    val book: Book,
    val returnDate: String,
    val timeLeftPercentage: Float
)