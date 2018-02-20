package com.one;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.portlet.bind.annotation.ResourceMapping;

public class Product {
	private int id;
	private String name;
	// ����һ �Զ�װ�������λ��
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

	// �������Զ�װ����setter���λ��
	// @Autowired
	public void setCategory(Category category) {
		this.category = category;
	}

}
