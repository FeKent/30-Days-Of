package com.example.a30daysof.data


import androidx.annotation.StringRes

data class Tip(
    val number: Int,
    @StringRes val title: Int,
    @StringRes val info: Int
    )