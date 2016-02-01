package net.systran.platform.geographic.client;


import net.systran.platform.geographic.client.api.DestinationsApi;
import net.systran.platform.geographic.client.auth.ApiKeyAuth;
import net.systran.platform.geographic.client.model.DestinationDetailsResponse;
import net.systran.platform.geographic.client.model.DestinationResponse;
import org.junit.Test;

import java.io.IOException;

public class TestDestinations {
    public static DestinationsApi getDestinationsApi() throws IOException {
        ApiClient apc = new ApiClient();
        ApiKeyAuth apiKeyAuth = (ApiKeyAuth) apc.getAuthentication("apiKey");
        String apiKey = ApiClient.LoadAPIKey(".//apiKey.txt");
        apiKeyAuth.setApiKey(apiKey);
        return new DestinationsApi(apc);
    }

    @Test
    public void testGeographicDestinationsListGet() throws ApiException, IOException {
        DestinationsApi api = getDestinationsApi();
        DestinationResponse destinationResponse = api.geographicDestinationsListGet(null, null, null, null, null, null, null, null, null, null, null, null, null);
        System.out.println(destinationResponse.toString());
    }

    @Test
    public void testGeographicDestinationsGetGet() throws ApiException, IOException {
        DestinationsApi api = getDestinationsApi();
        String id = "56600a3a14c46414e0275cf0";
        System.out.println("Use a valid 'id' and uncomment below codes to test");
        //DestinationDetailsResponse destinationDetailsResponse = api.geographicDestinationsGetGet(id, null, null);
        //System.out.println(destinationDetailsResponse.toString());
    }
}
