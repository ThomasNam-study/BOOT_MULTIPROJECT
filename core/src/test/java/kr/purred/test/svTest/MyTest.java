package kr.purred.test.svTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import kr.purred.test.model.MyService;

/**
 * Created by Thomas on 2017. 6. 13..
 */
@RunWith (SpringRunner.class)
@SpringBootTest
@ActiveProfiles ({"dev"})
public class MyTest
{
	@Autowired MyService myService;

	@Test
	public void test ()
	{
		System.out.println ("TEST");

		System.out.println (myService.getMyString ());
	}
}
