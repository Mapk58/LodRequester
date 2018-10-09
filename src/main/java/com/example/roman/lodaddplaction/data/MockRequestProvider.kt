package com.example.roman.lodaddplaction.data

import com.example.roman.lodaddplaction.models.RequestModel
import com.example.roman.lodaddplaction.models.UserModel

class MockRequestProvider : RequestProvider {
    override fun getRequests(): List<RequestModel> {
        return listOf(
                RequestModel("Help me with printer",
                        listOf("IT", "Принтеры"),
                        "Ничего не рОБОТОЕТ",
                        UserModel("Макаров",
                        "http://old.misis.ru/portals/0/Kaf_matem/Макаров%20П.В.jpg")
                ), RequestModel("Подайте на сигареты", listOf("Подать"), "Просто нужно курнутб",null)
        )
    }
}