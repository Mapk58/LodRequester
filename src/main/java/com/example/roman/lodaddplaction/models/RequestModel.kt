package com.example.roman.lodaddplaction.models

import java.io.Serializable

data class RequestModel (
        val title: String,
        val tags: List<String>,
        val description: String,
        val user: UserModel?
) : Serializable