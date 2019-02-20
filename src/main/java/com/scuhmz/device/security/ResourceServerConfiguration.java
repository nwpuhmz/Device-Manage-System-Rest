package com.scuhmz.device.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

/**
 * Created by scuhmz on 2017/9/18.
 */
@Configuration
@EnableResourceServer
public class ResourceServerConfiguration extends ResourceServerConfigurerAdapter {

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
               // .antMatchers(HttpMethod.GET, "/api/v1/items/**").permitAll()
                //.antMatchers(HttpMethod.GET, "/api/v1/count/**").permitAll()
               // .antMatchers("/api/v1/users/**").authenticated()
               // antMatchers("/api/v1/users/logout").permitAll().
               // antMatchers("/api/v1/users/**").authenticated().
               // .antMatchers("/oauth/token").permitAll();
              //  .anyRequest().authenticated();
                .anyRequest().permitAll();
//        http
//                .authorizeRequests()
//                .antMatchers("/users/**").authenticated()
//                .antMatchers(HttpMethod.GET, "/books/**").permitAll()
               //.anyRequest().authenticated();

    }

}