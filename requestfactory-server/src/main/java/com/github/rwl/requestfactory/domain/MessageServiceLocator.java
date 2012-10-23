package com.github.rwl.requestfactory.domain;

import com.google.web.bindery.requestfactory.shared.ServiceLocator;


public class MessageServiceLocator implements ServiceLocator {

	public MessageServiceWrapper getInstance(Class<?> clazz) {

		return new MessageServiceWrapper() {

            public String getMessage() {
                return "Hello World!";
            }
		};
	}
}
