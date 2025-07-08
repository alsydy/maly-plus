package com.example.malyplus.data

import androidx.room.*
import com.example.malyplus.data.models.Customer
import com.example.malyplus.data.models.Debt

@Dao
interface DebtDao {
    @Insert suspend fun insertCustomer(customer: Customer)
    @Insert suspend fun insertDebt(debt: Debt)
    @Query("SELECT * FROM customers") suspend fun getAllCustomers(): List<Customer>
    @Query("SELECT * FROM debts WHERE customerId = :customerId") suspend fun getDebtsForCustomer(customerId: Int): List<Debt>
    @Delete suspend fun deleteDebt(debt: Debt)
    @Update suspend fun updateCustomer(customer: Customer)
}