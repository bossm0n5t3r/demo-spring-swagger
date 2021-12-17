package com.example.demospringswagger.controller

import com.example.demospringswagger.dto.JsonParams
import com.example.demospringswagger.dto.PostParams
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class BasicController {
    @GetMapping("/getWithoutParameters")
    fun getWithoutParameters(): String {
        return "RETURN getWithoutParameters"
    }

    @GetMapping("/getWithParameters")
    fun getWithParameters(@RequestParam paramString: String, @RequestParam paramInt: Int): String {
        return "RETURN getWithParameters - string parameter : $paramString, int parameter : $paramInt"
    }

    @PostMapping("/postWithoutParameters")
    fun postWithoutParameters(): String {
        return "RETURN postWithoutParameters"
    }

    @PostMapping("/postWithParameters")
    fun postWithParameters(@RequestBody postParams: PostParams): String {
        return "RETURN postWithParameters - string parameter in postParams : ${postParams.paramString}, int parameter in postParams : ${postParams.paramInt}"
    }

    // post with json
    @PostMapping("/postWithJson")
    fun postWithJson(@RequestBody jsonParams: JsonParams): String {
        return "RETURN postWithJson - string parameter in jsonParams : ${jsonParams.paramString}, int parameter in jsonParams : ${jsonParams.paramInt}"
    }

    // post with protobuf
//    @PostMapping("/postWithProtobuf")
//    fun postWithProtobuf(@RequestBody protobufParams: ProtobufParams): String {
//        return "RETURN postWithProtobuf - string parameter in protobufParams : ${protobufParams.paramString}, int parameter in protobufParams : ${protobufParams.paramInt}"
//    }
}
