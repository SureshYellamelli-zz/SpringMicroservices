package com.example.microservices.currencyexchangeservice;

import java.math.BigDecimal;

import javax.persistence.*;

@Entity
public class ExchangeValue {

	@Id
	private Long id;
	@Column(name="conversion_to")
	private String to;
	@Column(name="conversion_from")
	private String from;	
	private BigDecimal conversionMultiple;
	private int port; 
	public void setPort(int port) {
		this.port = port;
	}
	public int getPort() {
		return port;
	}
	protected ExchangeValue() {}
	public ExchangeValue(String to, String from, Long id, BigDecimal conversionMultiple) {
		super();
		this.to = to;
		this.from = from;
		this.id = id;
		this.conversionMultiple = conversionMultiple;
	}
	public String getTo() {
		return to;
	}
	public String getFrom() {
		return from;
	}
	public Long getId() {
		return id;
	}
	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}
}
