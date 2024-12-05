package com.bilmao.one_car.entities;

import com.fasterxml.jackson.annotation.JsonValue;

public enum OrderStatus {
    SCHEDULED("Scheduled"),
    IN_PROGRESS("InProgress"),
    COMPLETED("Completed"),
    CANCELLED("Cancelled");

    private final String slug;

    OrderStatus(String slug) {
        this.slug = slug;
    }

    @JsonValue
    public String getSlug() {
        return slug;
    }
}
