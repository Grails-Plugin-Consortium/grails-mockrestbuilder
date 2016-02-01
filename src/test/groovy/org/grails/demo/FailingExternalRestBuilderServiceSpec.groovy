package org.grails.demo

import grails.plugins.rest.client.RequestCustomizer
import grails.plugins.rest.client.RestBuilder
import grails.plugins.rest.client.RestResponse
import grails.test.mixin.TestFor
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import spock.lang.Specification

@TestFor(ExternalRestBuilderService)
class FailingExternalRestBuilderServiceSpec extends Specification {
	def "Mocked Post InvokeRestBuilderWithUrl"() {
		given:
		final String restUrl = "http://api.twitter.com"
		String capturedUrl = null
		def requestCustomizer = Mock(RequestCustomizer)
		RestBuilder.metaClass.post = { String url, Closure closure ->
			capturedUrl = url
			closure.delegate = requestCustomizer
			closure.call()
			return new RestResponse(new ResponseEntity(HttpStatus.OK))
		}

		when:
		service.invokeRestBuilderPostWithUrl(restUrl)

		then:
		capturedUrl == restUrl
		1 * requestCustomizer.header('Cookie', "TEST=test")
		1 * requestCustomizer.header('X-DEBUG', 'true')
		1 * requestCustomizer.contentType("application/json")
	}

	def "Mocked Get InvokeRestBuilderWithUrl"() {
		given:
		final String restUrl = "http://api.twitter.com"
		String capturedUrl = null
		def requestCustomizer = Mock(RequestCustomizer)
		RestBuilder.metaClass.get = { String url, Closure closure ->
			capturedUrl = url
			closure.delegate = requestCustomizer
			closure.call()
			return new RestResponse(new ResponseEntity(HttpStatus.OK))
		}

		when:
		service.invokeRestBuilderGetWithUrl(restUrl)

		then:
		capturedUrl == restUrl
		1 * requestCustomizer.header('Cookie', "TEST=test2")
		1 * requestCustomizer.header('X-DEBUG', 'false')
		1 * requestCustomizer.contentType("application/json")
	}

	def "Mocked Post InvokeRestBuilderWithUrl NullPointerException"() {
		given:
		final String restUrl = "http://api.twitter.com"
		String capturedUrl = null
		def requestCustomizer = Mock(RequestCustomizer)
		RestBuilder.metaClass.post = { String url, Closure closure ->
			capturedUrl = url
			closure.delegate = requestCustomizer
			closure.call()
			return new RestResponse(new ResponseEntity(HttpStatus.OK))
		}

		when:
		service.invokeRestBuilderPostWithUrl(restUrl)

		then:
		thrown(NullPointerException)
	}

	def "Mocked Get InvokeRestBuilderWithUrl NullPointerException"() {
		given:
		final String restUrl = "http://api.twitter.com"
		String capturedUrl = null
		def requestCustomizer = Mock(RequestCustomizer)
		RestBuilder.metaClass.get = { String url, Closure closure ->
			capturedUrl = url
			closure.delegate = requestCustomizer
			closure.call()
			return new RestResponse(new ResponseEntity(HttpStatus.OK))
		}

		when:
		service.invokeRestBuilderGetWithUrl(restUrl)

		then:
		thrown(NullPointerException)
	}
}
