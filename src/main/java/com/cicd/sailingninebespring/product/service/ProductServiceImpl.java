package com.cicd.sailingninebespring.product.service;

import com.cicd.sailingninebespring.product.domain.ProductDTO;
import com.cicd.sailingninebespring.product.entity.Product;
import com.cicd.sailingninebespring.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService{

    private final ModelMapper modelMapper;
    private final ProductRepository productRepository;

    @Override
    public List<ProductDTO> getProductList() {
        List<Product> productList = productRepository.findAll();

        return productList.stream().map(product -> modelMapper.map(product, ProductDTO.class)).toList();
    }

    @Override
    public ProductDTO getProductDetail(Long productId) {
        Product product = productRepository.findById(productId).orElseThrow(RuntimeException::new);
        return modelMapper.map(product, ProductDTO.class);
    }

}
