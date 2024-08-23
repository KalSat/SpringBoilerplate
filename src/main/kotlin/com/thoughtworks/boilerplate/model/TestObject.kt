package com.thoughtworks.boilerplate.model

import kotlinx.serialization.Serializable

@Serializable
data class TestObject(
    val name: String,
    val versionName: String,
    val versionCode: Int,
    val debug: Boolean,
)
