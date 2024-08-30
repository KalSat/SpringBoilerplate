package com.thoughtworks.boilerplate.configuration

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

@Component
@ConfigurationProperties(prefix = "environment")
data class EnvironmentConfiguration(
    var name: String = "",
    var version: String = "",
    var profile: String = "",
)
