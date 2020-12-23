package com.ikea.soia

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableScheduling

@EnableConfigurationProperties(ApplicationConfig::class)
@SpringBootApplication(scanBasePackageClasses = [CompSOServiceApp::class])
@EnableScheduling
class CompSOServiceApp {
    companion object{
        @Throws(Exception::class)
        @JvmStatic
        fun main(args: Array<String>)
        {
            runApplication<CompSOServiceApp>(*args)
        }
    }

}

