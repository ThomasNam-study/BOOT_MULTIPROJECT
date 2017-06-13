package kr.purred.test;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.filter.CharacterEncodingFilter;

import java.nio.charset.Charset;

import javax.servlet.Filter;

/**
 * Created by Thomas on 2016. 12. 22..
 */
@SpringBootApplication
@EnableScheduling
public class PurredApplication extends SpringBootServletInitializer
{
	public static void main (String[] args)
	{
		new SpringApplicationBuilder (PurredApplication.class)
			.run (args);
	}

	@Override
	protected SpringApplicationBuilder configure (SpringApplicationBuilder application)
	{
		return application.sources (PurredApplication.class);
	}

	@Bean
	public HttpMessageConverter<String> responseBodyConverter ()
	{
		return new StringHttpMessageConverter (Charset.forName ("UTF-8"));
	}

	@Bean
	public Filter characterEncodingFilter ()
	{
		CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter ();
		characterEncodingFilter.setEncoding ("UTF-8");
		characterEncodingFilter.setForceEncoding (true);
		return characterEncodingFilter;
	}

	@Bean
	public FilterRegistrationBean filterRegistrationBean()
	{
		FilterRegistrationBean registrationBean = new FilterRegistrationBean ();

		CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter ();
		registrationBean.setFilter (characterEncodingFilter);
		characterEncodingFilter.setEncoding ("UTF-8");
		characterEncodingFilter.setForceEncoding (true);
		registrationBean.setOrder (Integer.MIN_VALUE);
		registrationBean.addUrlPatterns ("/*");
		return registrationBean;
	}
}
