package kr.purred.test;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * Created by Thomas on 2016. 12. 22..
 */
@SpringBootApplication
public class PurredApplication
{
	public static void main (String[] args)
	{
		new SpringApplicationBuilder (PurredApplication.class)
			.run (args);
	}
}
