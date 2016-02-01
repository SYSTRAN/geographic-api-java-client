package net.systran.platform.geographic.client;


import net.systran.platform.geographic.client.api.InspirationsApi;
import net.systran.platform.geographic.client.auth.ApiKeyAuth;
import net.systran.platform.geographic.client.model.InspirationDetailsResponse;
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
    public void testGeographicInspirationsListGet() throws ApiException, IOException {
        InspirationsApi api = getInspirationsApi();
        InspirationResponse inspirationResponse = api.geographicInspirationsListGet(null, null, null, null, null, null, null, null, null, null, null, null, null);
        System.out.println(inspirationResponse.toString());
    }

    @Test
    public void testGeographicInspirationsDossiersListGet() throws ApiException, IOException {
        InspirationsApi api = getInspirationsApi();
        InspirationResponse inspirationResponse = api.geographicInspirationsDossiersListGet(null, null, null, null, null, null, null, null, null, null, null, null, null);
        System.out.println(inspirationResponse.toString());
    }

    @Test
    public void testGeographicInspirationsEventsListGet() throws ApiException, IOException {
        InspirationsApi api = getInspirationsApi();
        InspirationResponse inspirationResponse = api.geographicInspirationsEventsListGet(null, null, null, null, null, null, null, null, null, null, null, null, null);
        System.out.println(inspirationResponse.toString());
    }

    @Test
    public void testGeographicInspirationsGetGet() throws ApiException, IOException {
        InspirationsApi api = getInspirationsApi();
        String id = "56600afb14c46414e0275eb3";
        System.out.println("Use a valid 'id' and uncomment below codes to test");
        //InspirationDetailsResponse inspirationDetailsResponse = api.geographicInspirationsGetGet(id, null, null);
        //System.out.println(inspirationDetailsResponse.toString());
    }

    @Test
    public void testGeographicInspirationsNewsInBriefListGet() throws ApiException, IOException {
        InspirationsApi api = getInspirationsApi();
        InspirationResponse inspirationResponse = api.geographicInspirationsNewsInBriefListGet(null, null, null, null, null, null, null, null, null, null, null, null, null);
        System.out.println(inspirationResponse.toString());
    }

    @Test
    public void testGeographicInspirationsSlideShowsListGet() throws ApiException, IOException {
        InspirationsApi api = getInspirationsApi();
        InspirationResponse inspirationResponse = api.geographicInspirationsSlideShowsListGet(null, null, null, null, null, null, null, null, null, null, null, null, null);
        System.out.println(inspirationResponse.toString());
    }

    @Test
    public void testGeographicInspirationsTestsListGet() throws ApiException, IOException {
        InspirationsApi api = getInspirationsApi();
        InspirationResponse inspirationResponse = api.geographicInspirationsTestsListGet(null, null, null, null, null, null, null, null, null, null, null, null, null);
        System.out.println(inspirationResponse.toString());
    }
}
