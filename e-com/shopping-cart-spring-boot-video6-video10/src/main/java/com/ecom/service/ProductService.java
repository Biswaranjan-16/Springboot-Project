package com.ecom.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.web.multipart.MultipartFile;

import com.ecom.model.Product;

public interface ProductService {

	public Product saveProduct(Product product);

	public List<Product> getAllProducts();

	public Boolean deleteProduct(Integer id);

	public Product getProductById(Integer id);

	public Product updateProduct(Product product, MultipartFile file);

	public List<Product> getAllActiveProducts(String category);

	//search
	
	public List<Product> searchProduct(String ch);
	
	
	Page<Product> getAllActiveProductPagination(Integer pageNo, Integer pageSize, String category);

	//search product with pagination   
	
	public Page<Product> searchProductPagination(Integer pageNo, Integer pageSize, String ch);

	//All product with pagination 

	public Page<Product> getAllProductsPagination(Integer pageNo, Integer pageSize);
	
	//All product  Active with pagination 
	
	public Page<Product> searchActiveProductPagination(Integer pageNo, Integer pageSize, String category, String ch);

	
}
