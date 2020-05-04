package com.github.leonardowiest.api.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(lazyInit = true, basePackages = { "com.github.leonardowiest.service" })
@Configuration
public class ComponentScanApiConfiguration {

}
