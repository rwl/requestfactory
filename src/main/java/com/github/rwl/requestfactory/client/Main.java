package com.github.rwl.requestfactory.client;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import com.github.rwl.requestfactory.domain.PersonProxy;
import com.github.rwl.requestfactory.server.RequestFactoryServer;
import com.github.rwl.requestfactory.shared.MessageRequestFactory;
import com.google.web.bindery.event.shared.SimpleEventBus;
import com.google.web.bindery.requestfactory.shared.Receiver;
import com.google.web.bindery.requestfactory.vm.RequestFactorySource;

public class Main {

    public static void main(String[] args) {

        final MessageRequestFactory requestFactory = RequestFactorySource
                .create(MessageRequestFactory.class);
        final String uriString = RequestFactoryServer.HOST + ":"
                + String.valueOf(RequestFactoryServer.PORT)
                + RequestFactoryServer.RF_METHOD;
        final URI uri;
        try {
            uri = new URI(uriString);
        } catch (URISyntaxException e) {
            System.err.println("Bad URI: " + uriString);
            return;
        }
        requestFactory.initialize(new SimpleEventBus(),
                new MessageRequestTransport(uri));
        requestFactory.messageRequest().getMessage()
            .fire(new Receiver<String>() {
                @Override
                public void onSuccess(final String message) {
                    log("MESSAGE: " + message);
                }
            });
        requestFactory.personRequest().findAllPeople().with("address", "children").fire(new Receiver<List<PersonProxy>>() {
            @Override
            public void onSuccess(List<PersonProxy> people) {
                if (people != null) {
                    for (PersonProxy proxy : people) {
                        log(proxy.getDisplayName());
                        log(proxy.getGender().toString());
                        log(proxy.getAddress().getCity());
                        log(proxy.getAddress().getZip());
                        log(proxy.getChildren().toString());
                    }
                }
            }
        });
    }

    private static void log(String arg) {
        System.out.println(arg);
    }
}
