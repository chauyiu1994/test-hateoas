package com.chauyiu1994.testhateoas.testhateoas;

class OrderNotFoundException extends RuntimeException {

    public OrderNotFoundException(Long id) {
        super("Order " + id + " not found!");
    }
}