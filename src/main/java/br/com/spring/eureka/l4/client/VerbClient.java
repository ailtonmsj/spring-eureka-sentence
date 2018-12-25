package br.com.spring.eureka.l4.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

@FeignClient(WordClient.VERB)
@Component("verbClient")
public interface VerbClient extends WordClient {

}
