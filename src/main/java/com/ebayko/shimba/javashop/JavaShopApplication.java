package com.ebayko.shimba.javashop;

import com.ebayko.shimba.javashop.utils.MyHeaderArgumentResolver;
import com.ebayko.shimba.javashop.utils.MyInterceptor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

/*

1. MyHeaderArgumentResolver 클래스 잓성
2. WebMvcConfigurer를 구현한 java config클래스 작성
3. addArgumentresolvers 메소드 오버라이딩 후 1에서 작성한 클래스 등록
 */

@SpringBootApplication
public class JavaShopApplication implements WebMvcConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(JavaShopApplication.class, args);
	}

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MyInterceptor());
    }

    @Override
	public void addArgumentResolvers(List<HandlerMethodArgumentResolver> resolvers) {
		resolvers.add(new MyHeaderArgumentResolver());
	}
}
