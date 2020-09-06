package net.muratbalkan.sinnumbervalidator;

import org.springframework.http.HttpStatus;

public class ApiError {
	
    private HttpStatus status;
	private String errorDescription;
	
	public HttpStatus getStatus() {
		return status;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	public String getErrorDescription() {
		return errorDescription;
	}
	public void setErrorDescription(String errorDescription) {
		this.errorDescription = errorDescription;
	}
	public ApiError(HttpStatus status, String errorDescription) {
		super();
		this.status = status;
		this.errorDescription = errorDescription;
	}
	
}
