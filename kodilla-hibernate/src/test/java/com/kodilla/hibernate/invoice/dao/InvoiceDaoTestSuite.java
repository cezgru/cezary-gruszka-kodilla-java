package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ProductDao productDao;
    @Test
    public void testInvoiceDao() {
        //Given
        Product product = new Product(0, "zero");
        Product product1 = new Product(1, "jeden");
        List<Item> itemList = new ArrayList<>();
        Invoice invoice = new Invoice(0, "12345", itemList);
        Item item = new Item(0, product, new BigDecimal(10), 3, invoice);
        Item item1 = new Item(1, product, new BigDecimal(103), 5, invoice);
        Item item2 = new Item(2, product1, new BigDecimal(21), 1, invoice);
        Item item3 = new Item(3, product1, new BigDecimal(32), 4, invoice);
        itemList.add(item);
        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);


        //When
        invoiceDao.save(invoice);


        int id = invoice.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //CleanUp
    }
}
