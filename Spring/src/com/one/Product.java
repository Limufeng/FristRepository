package com.one;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.portlet.bind.annotation.ResourceMapping;

public class Product {
	private int id;
	private String name;
	// 方法一 自动装载在这个位置
	// @Autowired
	@Resource(name="c")
	private Category category;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Category getCategory() {
		return category;
	}

	// 方法二自动装载在setter这个位置
	// @Autowired
	public void setCategory(Category category) {
		this.category = category;
	}

}
