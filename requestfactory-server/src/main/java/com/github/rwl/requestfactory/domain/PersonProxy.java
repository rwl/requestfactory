package com.github.rwl.requestfactory.domain;

import java.util.List;

import com.google.web.bindery.requestfactory.shared.EntityProxy;
import com.google.web.bindery.requestfactory.shared.ProxyFor;

@ProxyFor(Person.class)
public interface PersonProxy extends EntityProxy {

  String getDisplayName();

  Long getId();

  void setDisplayName(String displayName);

  void setParent(PersonProxy parent);

  Gender getGender();

  List<PersonProxy> getChildren();

  AddressProxy getAddress();
}