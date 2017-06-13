package kr.purred.test.model.imp;

import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import java.util.Locale;

import javax.sql.DataSource;

import kr.purred.test.model.MyService;
import lombok.RequiredArgsConstructor;

/**
 * Created by Thomas on 2016. 12. 22..
 */
@Service
@RequiredArgsConstructor
public class MyServiceImp implements MyService
{
	private final MessageSource messageSource;

	private final DataSource dataSource;

	@Override
	public String getMyString ()
	{
		System.out.println (dataSource);

		return messageSource.getMessage ("el.user.userID", null, Locale.getDefault ()) + "SpringBoot Good!!";
	}
}
