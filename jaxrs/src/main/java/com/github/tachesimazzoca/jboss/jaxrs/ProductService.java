package com.github.tachesimazzoca.jboss.jaxrs;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
   public List<Product> getProducts() {
      return new ArrayList<Product>();
   }

   public Product getProduct(Long id) {
      return new Product(id, "Product-" + id);
   }
}
