package com.github.rwl.requestfactory.shared;

import com.google.web.bindery.requestfactory.shared.RequestFactory;

public interface MessageRequestFactory extends RequestFactory {

	MessageServiceRequest messageRequest();

	PersonRequest personRequest();

	AddressRequest addressRequest();
}
