package org.grails.demo

import grails.plugins.rest.client.RestBuilder
import grails.plugins.rest.client.RestResponse
import org.springframework.http.HttpStatus

class ExternalRestBuilderService {

	void invokeRestBuilderPostWithUrl(String url) {

		if (url) {
			def rest = new RestBuilder()
			RestResponse response = rest.post(url) {
				header 'Cookie', "TEST=test"
				header 'X-DEBUG', "true"
				contentType "application/json"
			}
			if (response.statusCode != HttpStatus.OK) {
				log.error("Error calling post, response code: ${response.statusCode}")
			}
		}
	}

	void invokeRestBuilderGetWithUrl(String url) {

		if (url) {
			def rest = new RestBuilder()
			RestResponse response = rest.get(url) {
				header 'Cookie', "TEST=test2"
				header 'X-DEBUG', "false"
				contentType "application/json"
			}
			if (response.statusCode != HttpStatus.OK) {
				log.error("Error calling post, response code: ${response.statusCode}")
			}
		}
	}
}
