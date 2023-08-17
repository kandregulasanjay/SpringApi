package com.ApiDemo.SpringApiModel;

public class MobileStore {
	
	private String imei;
	private String company;
	private String model;
	private int price;
	
	public MobileStore() {
		
	}
	
	public MobileStore(String imei, String company, String model, int price) {
		this.imei = imei;
		this.company = company;
		this.model = model;
		this.setPrice(price);
	}
	
	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
}
