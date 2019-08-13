package com.wqlm.product.service;

import com.wqlm.product.dataobject.ProductCategory;

import java.util.List;


public interface CategoryService {

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
