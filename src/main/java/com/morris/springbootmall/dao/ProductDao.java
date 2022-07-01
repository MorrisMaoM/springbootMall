package com.morris.springbootmall.dao;

import com.morris.springbootmall.dto.ProductRequest;
import com.morris.springbootmall.model.Product;
import org.springframework.stereotype.Component;

@Component
public interface ProductDao {
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);
}
