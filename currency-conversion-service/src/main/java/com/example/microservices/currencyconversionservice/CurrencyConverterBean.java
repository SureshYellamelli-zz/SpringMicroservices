package com.example.microservices.currencyconversionservice;

import java.math.BigDecimal;

public class CurrencyConverterBean {

	
	
	private Long id;	
	private String to;	
	private String from;	
	private BigDecimal conversionMultiple;
	private BigDecimal quantity;
	private BigDecimal totalCalculatedValue;
	private int port; 
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}

	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getTotalCalculatedValue() {
		return totalCalculatedValue;
	}

	public void setTotalCalculatedValue(BigDecimal totalCalculatedValue) {
		this.totalCalculatedValue = totalCalculatedValue;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}
	public CurrencyConverterBean() {}
	public CurrencyConverterBean(Long id, String to, String from, BigDecimal conversionMultiple, BigDecimal quantity,
			BigDecimal totalCalculatedValue, int port) {
		super();
		this.id = id;
		this.to = to;
		this.from = from;
		this.conversionMultiple = conversionMultiple;
		this.quantity = quantity;
		this.totalCalculatedValue = totalCalculatedValue;
		this.port = port;
	}

}
