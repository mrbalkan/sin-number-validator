#  Setup

### Reference Documentation

* Initialize with Spring Initlzr. Web based REST API. Download the zip and copy the contents into the repo root directory., Update Maven Project, Restart eclipse. (old version displays an X sign, nothing in the problems tab)

* Sin Numbers are not managed my this app. So, this API is an RPC API no need to create a Representation Class of a resource:sin
However, we need classes for API responses. Class=>JSON conversion will be done by Spring. (Jackson, if accept header is json)
/
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
* Test with 
	curl -X POST -F 'sin=123456781' -F 'caller=web' http://localhost:8080/validate
* Add Actuator Dependency:

    <dependency>
	        <groupId>org.springframework.boot</groupId>
	        <artifactId>spring-boot-starter-actuator</artifactId>
    	</dependency>
		<!-- Micrometer Prometheus registry  -->
		<dependency>
			<groupId>io.micrometer</groupId>
			<artifactId>micrometer-registry-prometheus</artifactId>
		</dependency>

  Goto application.properties and add:
  
	management.endpoints.web.exposure.include=health,info,prometheus
	management.health.diskspace.enabled=false
	management.health.ping.enabled=false
	management.health.datasource.enabled=false
	management.endpoint.health.show-details=always

*Test actuator
curl http://localhost:8080/actuator/health/
