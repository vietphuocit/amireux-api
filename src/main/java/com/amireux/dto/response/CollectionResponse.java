package com.amireux.dto.response;

import java.util.List;

public class CollectionResponse {
    private Long id;
    private String name;
    private Long image;
    private List<ProductResponse> products;

    public CollectionResponse() {
    }

    public CollectionResponse(Long id, String name, List<ProductResponse> products, Long image) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.products = products;
    }

    public Long getImage() {
        return image;
    }

    public void setImage(Long image) {
        this.image = image;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ProductResponse> getProducts() {
        return products;
    }

    public void setProducts(List<ProductResponse> products) {
        this.products = products;
    }
}
