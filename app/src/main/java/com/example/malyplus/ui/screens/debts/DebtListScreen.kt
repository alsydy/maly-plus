package com.example.malyplus.ui.screens.debts

import androidx.compose.foundation.lazy.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier

@Composable
fun DebtListScreen() {
    val debts = listOf("دين 1", "دين 2", "دين 3")
    LazyColumn {
        items(debts) { debt ->
            ListItem(
                headlineText = { Text(debt) }
            )
            Divider()
        }
    }
}