package com.github.rwl.requestfactory.client;

import java.net.URI;
import java.net.URISyntaxException;

import com.github.rwl.requestfactory.shared.MessageRequestFactory;
import com.google.web.bindery.event.shared.SimpleEventBus;
import com.google.web.bindery.requestfactory.shared.Receiver;
import com.google.web.bindery.requestfactory.vm.RequestFactorySource;

public class Main {

    public static final String RF_METHOD = "/gwtRequest";

    public static final String HOST = "http://localhost";

    public static final int PORT = 8080;

    public static void main(String[] args) {

        final MessageRequestFactory requestFactory = RequestFactorySource
                .create(MessageRequestFactory.class);
        final String uriString = HOST + ":"
                + String.valueOf(PORT)
                + RF_METHOD;
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
                    System.out.println("MESSAGE: " + message);
                }
            });
    }
}
