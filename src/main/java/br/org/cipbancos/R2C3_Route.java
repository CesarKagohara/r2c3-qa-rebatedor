package br.org.cipbancos;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class R2C3_Route extends RouteBuilder {

    @Override
    public void configure() throws Exception {
    	from("undertow:http://0.0.0.0:8083/myapp1").id("test_route1").to("log:dummylog");
    	from("undertow:http://0.0.0.0:8084/myapp2").id("test_route2").to("log:dummylog");
    }
}
