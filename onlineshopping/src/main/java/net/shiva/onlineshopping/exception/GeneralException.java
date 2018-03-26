package net.shiva.onlineshopping.exception;

public class GeneralException extends Exception {

	private static final long serialVersionUID = 1L;
	private String meassage;

	public GeneralException() {
		this("Product Not Available");
	}
	
	public GeneralException(String meassage) {
		super();
		this.meassage = System.currentTimeMillis()+ "::" + meassage;
	}

	public String getMeassage() {
		return meassage;
	}
}
