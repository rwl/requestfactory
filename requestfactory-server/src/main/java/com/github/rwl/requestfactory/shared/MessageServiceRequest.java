package com.github.rwl.requestfactory.shared;

import com.github.rwl.requestfactory.domain.MessageServiceLocator;
import com.github.rwl.requestfactory.domain.MessageServiceWrapper;
import com.google.web.bindery.requestfactory.shared.Request;
import com.google.web.bindery.requestfactory.shared.RequestContext;
import com.google.web.bindery.requestfactory.shared.Service;

@Service(value = MessageServiceWrapper.class, locator = MessageServiceLocator.class)
//@ServiceName(value="com.github.rwl.requestfactory.server.MessageServiceWrapper", locator = "com.github.rwl.requestfactory.server.MessageServiceLocator")
public interface MessageServiceRequest extends RequestContext {

	Request<String> getMessage();
}
