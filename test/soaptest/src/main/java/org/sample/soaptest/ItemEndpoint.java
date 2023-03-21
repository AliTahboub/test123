package org.sample.soaptest;

import io.spring.guides.gs_producing_web_service.Item;
import org.sample.soaptest.repository.ItemRepository;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import io.spring.guides.gs_producing_web_service.GetItemRequest;
import io.spring.guides.gs_producing_web_service.GetItemResponse;

@Endpoint
public class ItemEndpoint {
    private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";

    private ItemRepository itemRepository ;


    public ItemEndpoint(ItemRepository itemRepository){
        this.itemRepository = itemRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getItemRequest")
    @ResponsePayload
    public GetItemResponse getItem(@RequestPayload GetItemRequest request){
        GetItemResponse response = new GetItemResponse();
        response.setItem(new Item());
        return response;
    }
}


