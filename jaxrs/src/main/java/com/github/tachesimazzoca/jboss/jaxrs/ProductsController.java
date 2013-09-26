package com.github.tachesimazzoca.jboss.jaxrs;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/products")
public class ProductsController {
    @Inject
    private ProductService productService;

    @GET
    @Path("/")
    @Produces("application/json")
    public ApiResponse<Product> findAll() {
        return new ApiResponse(productService.getProducts());
    }

    @GET
    @Path("/{id: [0-9]+}")
    @Produces("application/json")
    public ApiResponse<Product> findById(@PathParam("id") Long id) {
        return new ApiResponse(productService.getProduct(id));
    }
}
