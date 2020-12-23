package com.ikea.soia

import lombok.Data
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.validation.annotation.Validated
import javax.validation.constraints.NotNull

/**
 * This is a basic example of how Spring Boot handles Application Configuration.
 *
 * When running the code locally it will pull the data from the application.yml
 * included. However we can override that via environment variables in the
 * deployment configuration. These variables can come from a number of sources,
 * including config maps. We do that with the 'name' in this example.
 */
@Data
@Validated
@ConfigurationProperties(prefix = "application")
class ApplicationConfig {
    var name: @NotNull String = ""
}