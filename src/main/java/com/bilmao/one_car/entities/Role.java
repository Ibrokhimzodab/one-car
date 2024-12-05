package com.bilmao.one_car.entities;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Role {
    ADMIN("Admin"),
    CUSTOMER("Customer");

    private final String slug;

    Role(String slug) {
        this.slug = slug;
    }

    @JsonValue
    public String getSlug() {
        return slug;
    }
}
