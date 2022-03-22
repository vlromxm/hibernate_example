package com.hibernate.proxy_example;

public class PersistentBag implements MyList {

    private MyList data;

    @Override
    public String getElement() {
        if (data == null) {
            data = new MyListImpl("data from database");
        }
        return data.getElement();
    }
}
