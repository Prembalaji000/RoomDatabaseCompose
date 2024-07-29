package com.example.roomdatebase.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert

@Dao
interface ContactDao {

    @Upsert
    suspend fun upsertContact(contacts: Contact)

    @Delete
    suspend fun deleteContact(contacts: Contact)

    @Query("SELECT * FROM Contact ORDER BY FirstName ASC")
    fun getContactsOrderedByFirstName(): kotlinx.coroutines.flow.Flow<List<Contact>>

    @Query("SELECT * FROM Contact ORDER BY LastName ASC")
    fun getContactsOrderedByLastName(): kotlinx.coroutines.flow.Flow<List<Contact>>

    @Query("SELECT * FROM Contact ORDER BY PhoneNumber ASC")
    fun getContactsOrderedByPhoneNumber(): kotlinx.coroutines.flow.Flow<List<Contact>>
}