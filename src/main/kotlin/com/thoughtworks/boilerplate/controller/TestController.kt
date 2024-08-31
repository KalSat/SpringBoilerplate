package com.thoughtworks.boilerplate.controller

import com.thoughtworks.boilerplate.configuration.EnvironmentConfiguration
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
    val environment: EnvironmentConfiguration,
    val buildProperties: BuildProperties,
) {

    @GetMapping(path = ["get"])
    fun getTestObject(): TestObject = TestObject(
        buildProperties.name, buildProperties.version, 1, environment.profile == "local",
    )

    companion object {
        private val log: Logger = LoggerFactory.getLogger(this::class.java)
    }
}
