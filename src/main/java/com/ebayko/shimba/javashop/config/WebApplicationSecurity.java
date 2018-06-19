package com.ebayko.shimba.javashop.config;

import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
public class WebApplicationSecurity extends WebSecurityConfigurerAdapter {

    // 인증처리를 아예 하지 않게 하고싶은경우
    // css, js 등
    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring()
                .requestMatchers(PathRequest.toStaticResources()
                        .atCommonLocations())
                .requestMatchers(
                        new AntPathRequestMatcher("/**.html"));
    }

    // 특정 ROLE을 가진 사용자가 접근할 수 있는 경로
    // logout 경로를 지정하는 등의 대부분의 인증처리설정
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .logout()
                .logoutRequestMatcher(
                        new AntPathRequestMatcher("/logout"))
                .logoutSuccessUrl("/").and()
                .authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers("/members/joinform").permitAll()
                .antMatchers("/members/join").permitAll()
                .antMatchers("/h2-console/**").permitAll()
                .antMatchers("/members/**").hasRole("USER")
                .antMatchers("/api/**").hasRole("USER")
                .and()
                .csrf().ignoringAntMatchers("/**")
                .and().headers().frameOptions().disable()
                .and()
                .formLogin();//Post방식으로 데이터 넘길때 검증등의 처리하는걸 무시함

    }
}
