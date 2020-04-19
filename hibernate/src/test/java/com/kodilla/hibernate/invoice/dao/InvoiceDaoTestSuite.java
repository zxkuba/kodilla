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

import javax.transaction.Transactional;
import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    InvoiceDao invoiceDao;
    @Autowired
    ProductDao productDao;
    @Autowired
    ItemDao itemDao;

    @Test
    @Transactional
    public void testInvoiceDaoSave() {
        //Given

        Product product = new Product("Pomidor");
        Product product1 = new Product("Ziemniak");
        Product product2 = new Product("Seler");
        Item item = new Item(new BigDecimal(10), 5, new BigDecimal(50));
        Item item1 = new Item(new BigDecimal(3), 2, new BigDecimal(6));
        Item item2 = new Item(new BigDecimal(5), 3, new BigDecimal(15));
        Invoice invoice = new Invoice("covid/19");

        item.setInvoice(invoice);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        invoice.getItems().add(item);
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);

        item.setProduct(product);
        item1.setProduct(product1);
        item2.setProduct(product2);
        product.getItems().add(item);
        product1.getItems().add(item1);
        product2.getItems().add(item2);

        //When

        invoiceDao.save(invoice);

        int id = invoice.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //CleanUp
        invoiceDao.deleteById(id);
    }

}