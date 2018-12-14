package com.ezimax.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({ "com.ezimax.service" })
public class ServiceConfig {
}
