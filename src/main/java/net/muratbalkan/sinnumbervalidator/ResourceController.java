package net.muratbalkan.sinnumbervalidator;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ResourceController {
	@PostMapping("/validate")
	  @ResponseBody //POST, use RequestParam. We don't send the entire representation to the REST POST RequestBody (normally the case, PUT is partial)
	  public ValidationRPCResponse validate(@RequestParam(name="sin", required=true, defaultValue="0") String sinNumber) {
		int validationResult=0;
		if(sinNumber.length()==9) validationResult=1;
	    return new ValidationRPCResponse(validationResult);
	  }
	
	class ValidationRPCResponse{
		private int validationResult;
		public ValidationRPCResponse(int validationResult) {
			super();
			this.validationResult = validationResult;
		}
		public int getValidationResult() {
			return validationResult;
		}
		public void setValidationResult(int validationResult) {
			this.validationResult = validationResult;
		}
	}
}//class
