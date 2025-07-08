package com.example.malyplus.ui.screens.reports

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ReportsScreen() {
    Column(modifier = Modifier.padding(16.dp)) {
        Text("التقارير", style = MaterialTheme.typography.headlineSmall)
        Spacer(modifier = Modifier.height(16.dp))
        Text("عدد العملاء: 10")
        Text("إجمالي الديون: 15000 ريال")
    }
}