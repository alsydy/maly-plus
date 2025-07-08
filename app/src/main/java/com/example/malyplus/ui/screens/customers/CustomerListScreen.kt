package com.example.malyplus.ui.screens.customers

import androidx.compose.foundation.lazy.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier

@Composable
fun CustomerListScreen() {
    val customers = listOf("عميل 1", "عميل 2", "عميل 3")
    LazyColumn {
        items(customers) { customer ->
            ListItem(
                headlineText = { Text(customer) }
            )
            Divider()
        }
    }
}