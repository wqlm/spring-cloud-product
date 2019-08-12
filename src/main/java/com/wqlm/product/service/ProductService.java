package com.wqlm.product.service;

import com.wqlm.product.dataobject.ProductInfo;
import com.wqlm.product.dto.CartDTO;
import com.wqlm.product.dto.ProductInfoOutput;

import java.util.List;


public interface ProductService {

    /**
     * 查询所有在架商品列表
     */
    List<ProductInfo> findUpAll();


    /**
     * 查询商品列表
     * @param productIdList
     * @return
     */
    List<ProductInfoOutput> findList(List<String> productIdList);

    /**
     * 扣库存
     * @param cartDTOList
     */
    void decreaseStock(List<CartDTO> cartDTOList);

}
