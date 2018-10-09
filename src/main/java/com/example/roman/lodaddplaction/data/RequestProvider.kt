package com.example.roman.lodaddplaction.data

import com.example.roman.lodaddplaction.models.RequestModel

interface RequestProvider {
    fun getRequests() : List<RequestModel>
}