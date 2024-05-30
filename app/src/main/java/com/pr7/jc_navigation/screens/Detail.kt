package com.pr7.jc_navigation.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.pr7.jc_navigation.Screens


@Composable
fun DetailScreen(navHostController: NavHostController,name:String="",id:Int=0) {
    
    
    Column(
        modifier=Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        
        Text(
            text = "Detail Screen $name id:$id",
            modifier = Modifier.clickable {
                //navHostController.popBackStack()
                navHostController.navigate(Screens.Home.route){
                    popUpTo(route = Screens.Home.route){inclusive=true}
                }
            }
        )
    }
    
}