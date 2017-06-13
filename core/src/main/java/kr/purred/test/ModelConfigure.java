package kr.purred.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Thomas on 2017. 6. 13..
 */
@Configuration
public class ModelConfigure
{
	@Autowired MessageSource messageSource;
}
