package com.github.rwl.requestfactory.server;

import org.mortbay.jetty.Server;
import org.mortbay.jetty.servlet.Context;
import org.mortbay.jetty.servlet.ServletHolder;

import com.github.rwl.requestfactory.domain.Address;
import com.github.rwl.requestfactory.domain.Gender;
import com.github.rwl.requestfactory.domain.Person;
import com.google.web.bindery.requestfactory.server.RequestFactoryServlet;

public class RequestFactoryServer {

    public static final String RF_METHOD = "/gwtRequest";
    public static final String HOST = "http://localhost";
    public static final int PORT = 8080;

    public static void main(String[] args) {
        init();

        Server server = new Server(PORT);
        Context root = new Context(server, "/", Context.SESSIONS);
        root.addServlet(new ServletHolder(new RequestFactoryServlet()), RF_METHOD);
        try {
            server.start();
        } catch (Exception e1) {
            e1.printStackTrace();
            return;
        }
    }

    private static void init() {
        Person john = new Person();
        john.setDisplayName("John");
        john.setGender(Gender.MALE);

        Person april = new Person();
        april.setDisplayName("April");
        april.setGender(Gender.FEMALE);
        john.getChildren().add(april);
        april.setParent(john);

        Address address = new Address();
        address.setCity("New York");
        address.setZip("12345");
        john.setAddress(address);
        april.setAddress(address);

        System.out.println("PEOPLE: " + Person.findAllPeople().toString());
    }
}
