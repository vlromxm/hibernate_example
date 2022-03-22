package com.hibernate.proxy_example;

public class MyListImpl implements MyList {

    private String element;

    public MyListImpl(String element) {
        this.element = element;
    }

    @Override
    public String getElement() {
        return element;
    }
}
