package com.example.malyplus.ui.screens.home

import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun HomeScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text("الصفحة الرئيسية") })
        },
        content = {
            Column(modifier = Modifier.padding(it)) {
                Button(onClick = { navController.navigate("customers") }) {
                    Text("إدارة العملاء")
                }
                Button(onClick = { navController.navigate("debts") }) {
                    Text("إدارة القيود")
                }
                Button(onClick = { navController.navigate("reports") }) {
                    Text("التقارير")
                }
            }
        }
    )
}