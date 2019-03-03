package com.zkk.product.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.zkk.product.bean.Product;

@Mapper
public interface ProductMapper {
	
	@Insert("insert into products(pname,ptype,price) values(#{pname},#{ptype},#{price})")
	public Integer addProduct(Product p);
	
	@Delete("delete from products where pid = #{pid}")
	public Integer delProductById(Integer pid);
	
	@Update(value = { "update products set pname = #{pname},ptype = #{ptype},price = #{price} where pid = #{pid}" })
	public Integer updateProduct(Product p);
	
	@Select(value = { "select * from products where pid = #{pid}" })
	public Product queryProductById(Integer pid);
	
	@Select(value = { "select * from products order by pid desc" })
	public List<Product> queryList();
}
