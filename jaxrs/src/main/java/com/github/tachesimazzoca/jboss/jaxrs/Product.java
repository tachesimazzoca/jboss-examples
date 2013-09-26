package com.github.tachesimazzoca.jboss.jaxrs;

public class Product {
    private final Long id;
    private final String name;

    private Product() {
        this.id = null;
        this.name = null;
    }

    public Product(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
