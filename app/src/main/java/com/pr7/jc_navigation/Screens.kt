package com.pr7.jc_navigation


const val PASS_STRING="text"
const val PASS_INT="number"

sealed class Screens constructor(val route:String) {

    object Home:Screens(route = "home_route")
    object Detail:Screens(route = "detail_route/{$PASS_STRING}/{$PASS_INT}"){
        fun passDate(
            text:String,
            id:Int
        ):String{
            return "detail_route/$text/$id"
        }
    }

}