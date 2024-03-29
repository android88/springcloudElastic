package com.xwtec.elasticservice.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.xwtec.elasticservice.entity.Product;
import java.lang.String;
import java.util.List;

/**
 * @author chenxin
 * @since 2018-01-11
 * @abstract 数据操作
 */

public interface ProductRepository extends ElasticsearchRepository<Product, Long>{
    //根据产品名称查询并分页
    Page<Product> findByProdName(String prodname,Pageable pageable);
    //根据产品分类查询
    List<Product> findByProdCategory(String prodcategory);
}
