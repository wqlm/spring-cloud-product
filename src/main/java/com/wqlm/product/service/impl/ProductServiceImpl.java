package com.wqlm.product.service.impl;

import com.wqlm.product.dataobject.ProductInfo;
import com.wqlm.product.enums.ProductStatusEnum;
import com.wqlm.product.repository.ProductInfoRepository;

import com.wqlm.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Override
    public List<ProductInfo> findUpAll() {
        return productInfoRepository.findByProductStatus(ProductStatusEnum.UP.getCode());
    }
}
