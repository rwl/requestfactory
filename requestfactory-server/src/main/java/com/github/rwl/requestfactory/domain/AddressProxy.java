package com.github.rwl.requestfactory.domain;

import com.google.web.bindery.requestfactory.shared.ProxyFor;
import com.google.web.bindery.requestfactory.shared.ValueProxy;

@ProxyFor(Address.class)
public interface AddressProxy extends ValueProxy {
    public String getStreet1();
    public String getStreet2();
    public String getCity();
    public String getSt();
    public String getZip();
}
