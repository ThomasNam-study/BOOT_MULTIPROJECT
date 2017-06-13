package kr.purred.test.server;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Thomas on 2017. 6. 13..
 */
@Controller
public class TestController
{
	@GetMapping("/test")
	public ModelAndView testIndex ()
	{
		ModelAndView mv = new ModelAndView ("index");

		return mv;
	}
}
