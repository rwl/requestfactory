package com.github.rwl.requestfactory.shared;

import java.util.List;

import com.github.rwl.requestfactory.domain.Person;
import com.github.rwl.requestfactory.domain.PersonProxy;
import com.google.web.bindery.requestfactory.shared.Request;
import com.google.web.bindery.requestfactory.shared.Service;
import com.google.web.bindery.requestfactory.shared.RequestContext;

@Service(Person.class)
public interface PersonRequest extends RequestContext {

    abstract Request<PersonProxy> findPerson(Long id);

    Request<List<PersonProxy>> findAllPeople();


}
