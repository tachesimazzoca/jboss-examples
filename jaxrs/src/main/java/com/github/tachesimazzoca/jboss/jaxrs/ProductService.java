package com.github.tachesimazzoca.jboss.jaxrs;

public class ProductService {
   public Product getProduct(Long id) {
      return new Product(id);
   }
}
