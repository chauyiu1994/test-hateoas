package com.chauyiu1994.testhateoas.testhateoas;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "ORDERS")
public class Order {

    @Id
    @GeneratedValue
    private Long id;

    private OrderStatus orderStatus;

    private String description;

    private Order() {
        this.id = null;
        this.orderStatus = OrderStatus.BEING_CREATED;
        this.description = "";
    }

    public Order(String description) {
        this();
        this.description = description;
    }
}
