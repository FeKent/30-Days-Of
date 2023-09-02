package com.example.a30daysof.data


import androidx.annotation.StringRes
import com.example.a30daysof.R

enum class Tip(
    val number: Int,
    @StringRes val title: Int,
    @StringRes val info: Int,
){
    One(1, R.string.tip_1_info, R.string.tip_1_info),
    Two(2, R.string.tip_2_title, R.string.tip_2_info)
}