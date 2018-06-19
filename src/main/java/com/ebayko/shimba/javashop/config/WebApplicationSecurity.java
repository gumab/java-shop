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
                    .antMatchers(HttpMethod.POST,
                            "/members/join").permitAll()
                    .antMatchers("/members/welcome").permitAll()
                    .antMatchers("/members/login").permitAll()
                    .antMatchers("/members/**").hasRole("USER")
                    .antMatchers(HttpMethod.GET,"/boards").permitAll()
                    .antMatchers(HttpMethod.POST,"/boards").hasRole("USER")
                    .antMatchers("/boards/**").hasRole("USER")
                    .antMatchers("/api/**").hasRole("USER")
                    .antMatchers("/h2-console/**").permitAll()
                    .anyRequest().fullyAuthenticated()
                .and().headers().frameOptions().disable()
                .and()
                    .csrf().ignoringAntMatchers("/**")// post방식으로 값을 전달할 때 csrf를 무시
                .and()
                .formLogin()
                    .loginProcessingUrl("/members/login")
                    .loginPage("/members/login")
                    .usernameParameter("id")
                    .passwordParameter("password");
    }
}
