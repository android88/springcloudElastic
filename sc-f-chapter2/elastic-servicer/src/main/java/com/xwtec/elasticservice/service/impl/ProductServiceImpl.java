package com.xwtec.elasticservice.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.xwtec.elasticservice.entity.Product;
import com.xwtec.elasticservice.repo.ProductRepository;
import com.xwtec.elasticservice.service.ProductService;


//在实现类而不是接口上添加注解
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository prodRepository;

    @Override
    public Product save(Product product) {
        return prodRepository.save(product);
    }

    @Override
    public void deleteByProductId(long id) {
        prodRepository.deleteById(id);
    }

    @Override
    public Optional<Product> findByProductId(long id) {
        return prodRepository.findById(id);
    }

    @Override
    public Page<Product> findByProductName(String name,PageRequest pageRequest) {
        return prodRepository.findByProdName(name,pageRequest);
    }

    @Override
    public List<Product> findByProductCategory(String category) {
        return prodRepository.findByProdCategory(category);
    }

    @Override
    public void deleteAll() {
        prodRepository.deleteAll();
    }

    @Override
    public Iterable<Product> findAll() {
        return prodRepository.findAll();
    }

}
