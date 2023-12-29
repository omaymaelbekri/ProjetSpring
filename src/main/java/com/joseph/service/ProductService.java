package com.joseph.service;

import java.util.List;
import com.joseph.entity.Product;

public interface ProductService {

    List<Product> getProducts();

    void saveProduct(Product theProduct);

    Product getProduct(int theId);

    void deleteProduct(int theId);

}

