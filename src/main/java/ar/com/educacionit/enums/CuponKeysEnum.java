package ar.com.educacionit.enums;

public enum CuponKeysEnum {

	CUPON("CUPON"),
	CUPONES("CUPONES");

	
	private String key;

	private CuponKeysEnum(String key) {
		this.key = key;
	}

	public String getKey() {
		return key;
	}
	
}
