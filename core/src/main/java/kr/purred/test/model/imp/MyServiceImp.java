package kr.purred.test.model.imp;

import org.springframework.stereotype.Service;

import kr.purred.test.model.MyService;
import lombok.RequiredArgsConstructor;

/**
 * Created by Thomas on 2016. 12. 22..
 */
@Service
@RequiredArgsConstructor
public class MyServiceImp implements MyService
{
	@Override
	public String getMyString ()
	{
		return "SpringBoot Good!!";
	}
}
