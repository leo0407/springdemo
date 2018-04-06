package com.leo.demo.foundation.util;

import org.springframework.context.ConfigurableApplicationContext;

public class AppContextUtil {
	private static ConfigurableApplicationContext context = null;

	public static ConfigurableApplicationContext getContext() {
		return context;
	}

	public static void setContext(ConfigurableApplicationContext context) {
		AppContextUtil.context = context;
	}
	
}
