package kr.purred.test.server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.purred.test.model.MyService;
import lombok.RequiredArgsConstructor;

/**
 * Created by Thomas on 2016. 12. 22..
 */
@RestController
@RequiredArgsConstructor
public class MyController
{
	private final MyService myService;

	@GetMapping("/")
	public String index ()
	{
		return myService.getMyString ();
	}
}
