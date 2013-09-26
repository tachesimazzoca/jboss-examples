package com.github.tachesimazzoca.jboss.jaxrs;

public class Product {
    private final Long id;

    private Product() {
        this.id = null;
    }

    public Product(Long id) {
        this.id = id;
    }

    public String toJSON() {
        return "{\"id\":" + this.id.toString()
            + ",\"hashCode\":\"" + this.hashCode() + "\"}";
    }
}
