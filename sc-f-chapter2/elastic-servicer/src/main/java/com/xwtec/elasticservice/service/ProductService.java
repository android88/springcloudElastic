package com.xwtec.elasticservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.xwtec.elasticservice.entity.Product;


public interface ProductService {
    //保存商品
    Product save(Product product);
    //删除全部产品
    void deleteAll();
    //根据产品id删除指定商品
    void deleteByProductId(long id);
    //查询全部商品
    Iterable<Product> findAll();
    //根据商品id查询指定商品
    Optional<Product> findByProductId(long id);
    //根据商品名称查询商品，并分页
    Page<Product> findByProductName(String name,PageRequest pageRequest);
    //根据商品分类查询商品
    List<Product> findByProductCategory(String category);
}
