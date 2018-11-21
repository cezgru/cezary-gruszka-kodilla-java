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
    @Autowired
    private ItemDao itemDao;
    @Test
    public void testInvoiceDao() {
        //Given
        Product product = new Product("zero");
        Product product1 = new Product("jeden");
        List<Item> itemList = new ArrayList<>();
        Invoice invoice = new Invoice("12345", itemList);
        Item item1 = new Item(product, new BigDecimal(10), 3, invoice);
        Item item2 = new Item(product, new BigDecimal(103), 5, invoice);
        Item item3 = new Item(product1, new BigDecimal(21), 1, invoice);
        Item item4 = new Item(product1, new BigDecimal(32), 4, invoice);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);
        item4.setInvoice(invoice);
        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);
        itemList.add(item4);
        invoice.setItems(itemList);


        //When

        productDao.save(product);
        productDao.save(product1);
        //itemDao.save(item1);
        //itemDao.save(item2);
        //itemDao.save(item3);
        //itemDao.save(item4);
        invoiceDao.save(invoice);

        int id = invoice.getId();

        //Then
        Assert.assertEquals(0, id);

        //CleanUp
    }
}
