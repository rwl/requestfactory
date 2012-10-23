package com.github.rwl.requestfactory.dummy;

//import com.github.rwl.requestfactory.server.MessageServiceLocator;
//import com.github.rwl.requestfactory.server.MessageServiceWrapper;
import com.google.web.bindery.requestfactory.shared.Request;
import com.google.web.bindery.requestfactory.shared.RequestContext;
import com.google.web.bindery.requestfactory.shared.Service;
import com.google.web.bindery.requestfactory.shared.ServiceName;

/**
 * Makes requests of the account service.
 */
//@Service(value = MessageServiceWrapper.class, locator = MessageServiceLocator.class)
@ServiceName(value="com.github.rwl.requestfactory.server.MessageServiceWrapper",
    locator = "com.github.rwl.requestfactory.server.MessageServiceLocator")
public interface FooServiceRequest extends RequestContext {

	Request<String> getMessage();
}
