package com.mhcc.notice.config;

import com.mhcc.notice.strategy.BarkNotificationStrategy;
import com.mhcc.notice.strategy.EmailNotificationStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NotificationStrategyConfig {

    private static final Logger LOG =  LoggerFactory.getLogger(NotificationStrategyConfig.class);

    @Bean
    @ConditionalOnProperty(value = "mhcc.notice.strategy.bark.enabled")
    BarkNotificationStrategy getBarkStrategy() {
        LOG.info("start init bark notification strategy.");
        return new BarkNotificationStrategy();
    }

    @Bean
    @ConditionalOnProperty(value = "mhcc.notice.strategy.email.enabled")
    EmailNotificationStrategy getEmailStrategy() {
        LOG.info("start init email notification strategy.");
        return new EmailNotificationStrategy();
    }
}
