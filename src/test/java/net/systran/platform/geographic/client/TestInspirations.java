package net.systran.platform.geographic.client;


import net.systran.platform.geographic.client.api.InspirationsApi;
import net.systran.platform.geographic.client.auth.ApiKeyAuth;
import net.systran.platform.geographic.client.model.InspirationResponse;
import org.junit.Test;

import java.io.IOException;

public class TestInspirations {
    public static InspirationsApi getInspirationsApi() throws IOException {
        ApiClient apc = new ApiClient();
        ApiKeyAuth apiKeyAuth = (ApiKeyAuth) apc.getAuthentication("apiKey");
        String apiKey = ApiClient.LoadAPIKey(".//apiKey.txt");
        apiKeyAuth.setApiKey(apiKey);
        return new InspirationsApi(apc);
    }

    @Test
    public void testGeographicInspirationsGet() throws ApiException, IOException {
        InspirationsApi api = getInspirationsApi();
        InspirationResponse inspirationResponse = api.geographicInspirationsGet(null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        System.out.println(inspirationResponse.toString());
    }
}
