package com.github.rwl.requestfactory.dummy;

import com.github.rwl.requestfactory.shared.MessageServiceRequest;
import com.google.web.bindery.requestfactory.shared.RequestFactory;

public interface FooRequestFactory extends RequestFactory {

	MessageServiceRequest messageRequest();
}
