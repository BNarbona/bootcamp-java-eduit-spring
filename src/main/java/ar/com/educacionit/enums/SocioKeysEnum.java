package ar.com.educacionit.enums;

public enum SocioKeysEnum {

	SOCIOS("SOCIOS"), 
	SOCIO("SOCIO")
	;
	
	private String key;
	
	private SocioKeysEnum(String key) {
		this.key = key;			
	}

	public String getKey() {
		return key;
	}
	
	
}
