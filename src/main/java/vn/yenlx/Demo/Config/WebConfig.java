package vn.yenlx.Demo.Config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.accept.ContentNegotiationManager;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.ContentNegotiatingViewResolver;

import vn.yenlx.Demo.ViewResolver.CsvViewResolver;

@Configuration
public class WebConfig  {
//	@Override
//	public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
//        configurer
//        .defaultContentType(MediaType.APPLICATION_JSON)
//        .favorPathExtension(true);
//	}
//	@Bean
//	public ViewResolver contentNegotiatingViewResolver(ContentNegotiationManager manager) {
//		ContentNegotiatingViewResolver resolver = new ContentNegotiatingViewResolver();
//		resolver.setContentNegotiationManager(manager);
//		List<ViewResolver> resolvers =new ArrayList<>();
//		
//		resolvers.add(csvViewResolver());
//		resolver.setViewResolvers(resolvers);
//		return resolver;
//	}
//	@Bean
//	public ViewResolver csvViewResolver() {
//		return new CsvViewResolver();
//	}
}
