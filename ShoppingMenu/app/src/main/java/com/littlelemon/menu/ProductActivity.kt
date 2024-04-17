package com.littlelemon.menu

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

class ProductActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val productItem = ProductItem(
            intent.getStringExtra(KEY_TITLE) ?: "",
            intent.getDoubleExtra(KEY_PRICE, 0.0),
            intent.getStringExtra(KEY_CATEGORY) ?: "",
            intent.getIntExtra(KEY_IMAGE, -1))
        setContent { ProductDetails(productItem) }
    }

    companion object {
        const val KEY_TITLE = "title"
        const val KEY_PRICE = "price"
        const val KEY_IMAGE = "image"
        const val KEY_CATEGORY = "category"
    }
}