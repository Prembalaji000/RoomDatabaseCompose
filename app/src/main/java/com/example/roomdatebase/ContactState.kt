package com.example.roomdatebase

import com.example.roomdatebase.db.Contact
import com.example.roomdatebase.db.SortType

data class ContactState(
    val contacts: List<Contact> = emptyList(),
    val firstName: String = "",
    val lastName: String = "",
    val phoneNumber: String = "",
    val isAddingContact: Boolean = false,
    val sortType: SortType = SortType.FIRST_NAME
)
