package com.nxpert.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Data;

@Entity
@Table(name="product")
public @Data class Product implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	@Column(name="name")
	private String name;
	
	private String author;
	
	private Long price;
	
	@Column(name="price_currency")
	private String priceCurrency;
	
	private String description;

	private Long discount;
	
	@ManyToOne
	@JoinColumn(name = "category_id")
	private Category categoryId;

	@Transient
	private Long finalAfterTaxPrice;
}