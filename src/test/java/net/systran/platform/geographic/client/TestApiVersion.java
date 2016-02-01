package net.systran.platform.geographic.client;


import net.systran.platform.geographic.client.api.ApiVersionApi;
import net.systran.platform.geographic.client.auth.ApiKeyAuth;
import net.systran.platform.geographic.client.model.ApiVersionResponse;
import org.junit.Test;

import java.io.IOException;

public class TestApiVersion {
    public static ApiVersionApi getApiVersionApi() throws IOException {
        ApiClient apc = new ApiClient();
        ApiKeyAuth apiKeyAuth = (ApiKeyAuth) apc.getAuthentication("apiKey");
        String apiKey = ApiClient.LoadAPIKey(".//apiKey.txt");
        apiKeyAuth.setApiKey(apiKey);
        return new ApiVersionApi(apc);
    }

    @Test
    public void testGeographicApiVersionGet() throws ApiException, IOException {
        ApiVersionApi api = getApiVersionApi();
        ApiVersionResponse apiVersionResponse = api.geographicApiVersionGet(null);
        System.out.println(apiVersionResponse.toString());
    }
}
