package org.acme;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

@RegisterRestClient
@Path("/v1/chat")
public interface ChatGptService {
    
    @POST
    @Path("/completions")
    public ChatGptResponse completion(@HeaderParam("Authorization") String token, ChatGptRequest request);

}
