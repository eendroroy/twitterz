package com.github.eendroroy.twitterz.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author indrajit
 */

@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {

  @Bean(name = "bCryptPasswordEncoder")
  public BCryptPasswordEncoder bCryptPasswordEncoder() {
    return new BCryptPasswordEncoder();
  }
}