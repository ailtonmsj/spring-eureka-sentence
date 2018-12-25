package br.com.spring.eureka.l4.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

@FeignClient(WordClient.ADJECTIVE)
@Component("adjectiveClient")
public interface AdjectiveClient extends WordClient {

}
