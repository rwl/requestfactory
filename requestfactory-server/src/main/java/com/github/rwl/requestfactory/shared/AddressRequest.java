package com.github.rwl.requestfactory.shared;

import com.github.rwl.requestfactory.domain.Address;
import com.google.web.bindery.requestfactory.shared.RequestContext;
import com.google.web.bindery.requestfactory.shared.Service;

@Service(Address.class)
public interface AddressRequest extends RequestContext {

}
