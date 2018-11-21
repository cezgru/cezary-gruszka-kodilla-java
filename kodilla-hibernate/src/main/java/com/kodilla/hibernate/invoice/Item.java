package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
@Table(name = "ITEM")
public class Item {
    private int id;
    private Product product;
    private BigDecimal price;
    private int quantity;
    private Invoice invoice;

    public Item() {
    }

    public Item(int id, Product product, BigDecimal price, int quantity, Invoice invoice) {
        this.id = id;
        this.product = product;
        this.price = price;
        this.quantity = quantity;
        this.invoice = invoice;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    @ManyToOne
    @NotNull
    @JoinColumn(name = "INVOICE")
    public Invoice getInvoice() {
        return invoice;
    }

    @ManyToOne
    @NotNull
    @JoinColumn(name = "PRODUCT")
    public Product getProduct() {
        return product;
    }

    private void setProduct(Product product) {
        this.product = product;
    }

    @Column(name = "PRICE")
    public BigDecimal getPrice() {
        return price;
    }

    private void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Column(name = "QUANTITY")
    public int getQuantity() {
        return quantity;
    }

    private void setQuantity(int quantity) {
        this.quantity = quantity;
    }



    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
}
