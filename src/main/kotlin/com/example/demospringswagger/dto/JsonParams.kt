package com.example.demospringswagger.dto

import com.fasterxml.jackson.annotation.JsonProperty

data class JsonParams(
    @JsonProperty("param_string")
    val paramString: String,
    @JsonProperty("param_int")
    val paramInt: Int
)
