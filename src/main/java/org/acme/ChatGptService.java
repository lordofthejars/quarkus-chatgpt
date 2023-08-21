package org.acme;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

// Annotates the interface as a Rest Client
@RegisterRestClient

// Use Jakarta EE RS annotations to set the path of the endpoint
@Path("/v1/chat")
public interface ChatGptService {

    // Uses POST method
    @POST
    @Path("/completions")

    // Return body is automatically modeled
    public ChatGptResponse completion(

        // Sets this parameter as header parameter
        @HeaderParam("Authorization") String token,

        // Body content
        ChatGptRequest request);

}
