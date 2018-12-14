package ru.softbe.gecko.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories(basePackages = {"ru.softbe.gecko.service"})
@EnableTransactionManagement
public class ConfigJpa {

}
