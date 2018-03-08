package com.kodilla.hibernate.invoice;


import com.kodilla.hibernate.invoice.dao.InvoiceDao;

import com.kodilla.hibernate.invoice.dao.ProductDao;
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
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Item item1 = new Item(new BigDecimal("12345153454135"), 90, new BigDecimal("389723402394"));
        Item item2 = new Item(new BigDecimal("8719436592374584"), 78, new BigDecimal("982374892374"));
        Product product = new Product("Product");
        Product product1 = new Product("Product1");
        product.getItems().add(item1);
        product1.getItems().add(item2);
        item1.setProduct(product);
        item2.setProduct(product1);
        Invoice invoice = new Invoice("001");
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();
        System.out.println("ID" + id);

        //Then
        Assert.assertNotEquals(0, id);
        //CleanUp
        try {

            invoiceDao.delete(id);
        } catch (Exception e) {
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }


    }
}
