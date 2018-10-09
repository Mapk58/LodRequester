package com.example.roman.lodaddplaction.models

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.roman.lodaddplaction.R
import kotlinx.android.synthetic.main.activity_request_details.*
import kotlinx.android.synthetic.main.item_request.*

class RequestDetailsActivity : AppCompatActivity() {
    var model : RequestModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_request_details)
        model = intent.getSerializableExtra("data") as RequestModel

    }

    override fun onResume() {
        super.onResume()

        tv_username.text = model?.user?.name
        tv_request_title.text = model?.title
        tv_tags.text = model?.tags?.joinToString(", ")
        Glide.with(this)
                .load(model?.user?.avaUrl)
                .into(iv_avatar)
    }
}
