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

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    ProductDao productDao;

    @Autowired
    ItemDao itemDao;

    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {

        Product product1 = new Product("Table");
        Product product2 = new Product("Chair");
        Product product3 = new Product("Lamp");
        Product product4 = new Product("Carpet");

        Item item1 = new Item(new BigDecimal(1000), 12, new BigDecimal(900));
        Item item2 = new Item(new BigDecimal(1300), 14, new BigDecimal(1200));

        Invoice invoice = new Invoice("1");

        item1.setProduct(product1);
        product1.getItems().add(item1);

        item2.setProduct(product2);
        product2.getItems().add(item2);

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);

        invoiceDao.save(invoice);
        int id = invoice.getId();

        Assert.assertNotEquals(0, id);

        invoiceDao.deleteById(id);


    }
}
