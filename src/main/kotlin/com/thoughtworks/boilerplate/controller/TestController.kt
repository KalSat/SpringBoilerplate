package com.thoughtworks.boilerplate.controller

import com.thoughtworks.boilerplate.model.TestObject
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.info.BuildProperties
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/test")
class TestController(
    private val buildProperties: BuildProperties,
) {

    @GetMapping(path = ["get"])
    fun getTestObject(): TestObject = TestObject(
        buildProperties.name, buildProperties.version, buildProperties["java.version"].toInt(), true
    )

    companion object {
        private val log: Logger = LoggerFactory.getLogger(this::class.java)
    }
}
