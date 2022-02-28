package com.baekjoon.test;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	String apiKey = "c86179b1-3051-4e29-9f99-7f65f52365b4";
	String SecretKey = "MIICdQIBADANBgkqhkiG9w0BAQEFAASCAl8wggJbAgEAAoGBAKXWf8ZA0/wU9BIgs10WK6eM1WFIeGLIESJ2aPvo7y2+JiXrOGzgvmVkW5WzAgEHFICuChsqkT8AGXQO7d8UpXF+g35CzH15yGkX4HCZ3bSy+53uktj4PrYLDGtl7kSfQ001sxywVNPx5fgwH+kYk+kiRQFL2xIlST3c5T8SsXXnAgMBAAECgYAi2WyIcN8bPhv8IzsN+La7wvCkPOJvf7N6FoABT/XTGv5RQZjd6GyaSfilALUPGjnIwMoG428aWh7/MJP0KRaK5pcpkyOUkrY8DhW4VZhQ5qI9D/vnYK3dzkjH2JuKASjV1kWPtvZHMtvB9sIt5xp05imuVkDzOQXo3sY/hXflwQJBAP38q67jG6QII3+cR9jlf0oI5+J5a8BENj9cqfa/2NG3FgPZPfUSkjwjNVbHWllB/jLUtUzZkxveoegpACtnb5kCQQCnJvo9arBPV3S6qLcBWQuRfKSbb3c+3ssc+0JpirhMyd+fYqTf4NAmkyjQyubCI4VbRyuBNmien5aW/dt/bYF/AkA0KfTI0nQW2GUSDHLlJR1jgzi81ts+fcP2d32g4/4P9F5dI/0JnGrUVxbZX9A6jMc8gVtLEVSZYLw4BlO2lmPhAkBzMN1K7fdK9k4vRI25lA/w1yDpLUvUO91lv5HpAfw4jvZY9LYCwv8vVkLOgMW+DJSebtGAXmqCxiAVNiTKEEEpAkBmbcoupCbTUTVaeQKGjIFOl5+JG58LVHuFTJ2G5U8ShR25e0i0FGo+JkbCRbMWnElhNSIhTAs66EUcdhOFDtSa";
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
		
}
