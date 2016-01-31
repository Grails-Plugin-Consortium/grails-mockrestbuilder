package org.grails.demo

import grails.plugins.rest.client.RequestCustomizer
import grails.plugins.rest.client.RestResponse
import org.springframework.http.HttpMethod
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.client.RestTemplate

public class MockRestBuilder {
	MockRestBuilder(Map settings) {
		println 'Not calling super constructor due to NPE'
	}

	MockRestBuilder(RestTemplate restTemplate) {
		println 'Not calling super constructor due to NPE'
	}

	MockRestBuilder() {
		println 'Not calling super constructor due to NPE'
	}


	RestResponse get(String url, @DelegatesTo(RequestCustomizer.class) Closure customizer) {
		return new RestResponse(new ResponseEntity(HttpStatus.OK))
	}


	RestResponse get(String url, Map<String, Object> urlVariables,
					 @DelegatesTo(RequestCustomizer.class) Closure customizer) {
		return new RestResponse(new ResponseEntity(HttpStatus.OK))
	}


	RestResponse put(String url, @DelegatesTo(RequestCustomizer.class) Closure customizer) {
		return new RestResponse(new ResponseEntity(HttpStatus.OK))
	}


	RestResponse put(String url, Map<String, Object> urlVariables,
					 @DelegatesTo(RequestCustomizer.class) Closure customizer) {
		return new RestResponse(new ResponseEntity(HttpStatus.OK))
	}


	RestResponse post(String url, @DelegatesTo(RequestCustomizer.class) Closure customizer) {
		return new RestResponse(new ResponseEntity(HttpStatus.OK))
	}


	RestResponse post(String url, Map<String, Object> urlVariables,
					  @DelegatesTo(RequestCustomizer.class) Closure customizer) {
		return new RestResponse(new ResponseEntity(HttpStatus.OK))
	}


	RestResponse patch(String url, @DelegatesTo(RequestCustomizer.class) Closure customizer) {
		return new RestResponse(new ResponseEntity(HttpStatus.OK))
	}


	RestResponse patch(String url, Map<String, Object> urlVariables,
					   @DelegatesTo(RequestCustomizer.class) Closure customizer) {
		return new RestResponse(new ResponseEntity(HttpStatus.OK))
	}


	RestResponse delete(String url, @DelegatesTo(RequestCustomizer.class) Closure customizer) {
		return new RestResponse(new ResponseEntity(HttpStatus.OK))
	}


	RestResponse delete(String url, Map<String, Object> urlVariables,
						@DelegatesTo(RequestCustomizer.class) Closure customizer) {
		return new RestResponse(new ResponseEntity(HttpStatus.OK))
	}


	RestResponse head(String url, Map<String, Object> urlVariables,
					  @DelegatesTo(RequestCustomizer.class) Closure customizer) {
		return new RestResponse(new ResponseEntity(HttpStatus.OK))
	}


	RestResponse head(String url, @DelegatesTo(RequestCustomizer.class) Closure customizer) {
		return new RestResponse(new ResponseEntity(HttpStatus.OK))
	}


	RestResponse options(String url, Map<String, Object> urlVariables,
						 @DelegatesTo(RequestCustomizer.class) Closure customizer) {
		return new RestResponse(new ResponseEntity(HttpStatus.OK))
	}


	RestResponse options(String url, @DelegatesTo(RequestCustomizer.class) Closure customizer) {
		return new RestResponse(new ResponseEntity(HttpStatus.OK))
	}


	RestResponse trace(String url, Map<String, Object> urlVariables,
					   @DelegatesTo(RequestCustomizer.class) Closure customizer) {
		return new RestResponse(new ResponseEntity(HttpStatus.OK))
	}


	RestResponse trace(String url, @DelegatesTo(RequestCustomizer.class) Closure customizer) {
		return new RestResponse(new ResponseEntity(HttpStatus.OK))
	}


	protected RestResponse doRequestInternal(String url, Closure customizer, HttpMethod method, Map<String, Object> urlVariables) {
		return new RestResponse(new ResponseEntity(HttpStatus.OK))
	}


	protected void registerMessageConverters(RestTemplate restTemplate) {
		null
	}


	protected ResponseEntity invokeRestTemplate(String url, HttpMethod method, RequestCustomizer requestCustomizer) {
		return new ResponseEntity(HttpStatus.OK)
	}


	protected RestResponse handleResponse(ResponseEntity responseEntity) {
		return new RestResponse(new ResponseEntity(HttpStatus.OK))
	}


	RestResponse get(String url) {
		return new RestResponse(new ResponseEntity(HttpStatus.OK))
	}


	RestResponse get(String url, Map<String, Object> urlVariables) {
		return new RestResponse(new ResponseEntity(HttpStatus.OK))
	}


	RestResponse put(String url) {
		return new RestResponse(new ResponseEntity(HttpStatus.OK))
	}


	RestResponse put(String url, Map<String, Object> urlVariables) {
		return new RestResponse(new ResponseEntity(HttpStatus.OK))
	}


	RestResponse post(String url) {
		return new RestResponse(new ResponseEntity(HttpStatus.OK))
	}


	RestResponse post(String url, Map<String, Object> urlVariables) {
		return new RestResponse(new ResponseEntity(HttpStatus.OK))
	}


	RestResponse patch(String url) {
		return new RestResponse(new ResponseEntity(HttpStatus.OK))
	}


	RestResponse patch(String url, Map<String, Object> urlVariables) {
		return new RestResponse(new ResponseEntity(HttpStatus.OK))
	}


	RestResponse delete(String url) {
		return new RestResponse(new ResponseEntity(HttpStatus.OK))
	}


	RestResponse delete(String url, Map<String, Object> urlVariables) {
		return new RestResponse(new ResponseEntity(HttpStatus.OK))
	}


	RestResponse head(String url, Map<String, Object> urlVariables) {
		return new RestResponse(new ResponseEntity(HttpStatus.OK))
	}


	RestResponse head(String url) {
		return new RestResponse(new ResponseEntity(HttpStatus.OK))
	}


	RestResponse options(String url, Map<String, Object> urlVariables) {
		return new RestResponse(new ResponseEntity(HttpStatus.OK))
	}


	RestResponse options(String url) {
		return new RestResponse(new ResponseEntity(HttpStatus.OK))
	}


	RestResponse trace(String url, Map<String, Object> urlVariables) {
		return new RestResponse(new ResponseEntity(HttpStatus.OK))
	}


	RestResponse trace(String url) {
		return new RestResponse(new ResponseEntity(HttpStatus.OK))
	}


	protected RestResponse doRequestInternal(String url, Closure customizer, HttpMethod method) {
		return new RestResponse(new ResponseEntity(HttpStatus.OK))
	}


	RestTemplate getRestTemplate() {
		return null
	}


	void setRestTemplate(RestTemplate restTemplate) {
		null
	}
}