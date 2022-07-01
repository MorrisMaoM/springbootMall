package com.morris.springbootmall.service.impl;

import com.morris.springbootmall.dao.ProductDao;
import com.morris.springbootmall.dao.impl.ProductDaoImpl;
import com.morris.springbootmall.dto.ProductRequest;
import com.morris.springbootmall.model.Product;
import com.morris.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }

    @Override
    public Integer creatProduct(ProductRequest productRequest) {
        return productDao.createProduct(productRequest);
    }

    @Override
    public void updateProduct(Integer productId, ProductRequest productRequest) {
        productDao.updateProduct(productId,productRequest);
    }

}
