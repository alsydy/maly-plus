package com.example.malyplus.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.malyplus.data.models.Customer
import com.example.malyplus.data.models.Debt

@Database(entities = [Customer::class, Debt::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun debtDao(): DebtDao
}