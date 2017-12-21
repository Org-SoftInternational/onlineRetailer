package cn.github.onlineRetailer.entity;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Category {
	
	private Integer categoryId;
	private String productType;
	private List<Product> products;
}
