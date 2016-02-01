package net.systran.platform.geographic.client;


import net.systran.platform.geographic.client.api.SupportedLanguagesApi;
import net.systran.platform.geographic.client.auth.ApiKeyAuth;
import net.systran.platform.geographic.client.model.SupportedLanguagesResponse;
import org.junit.Test;

import java.io.IOException;

public class TestSupportedLanguages {
    public static SupportedLanguagesApi getSupportedLanguagesApi() throws IOException {
        ApiClient apc = new ApiClient();
        ApiKeyAuth apiKeyAuth = (ApiKeyAuth) apc.getAuthentication("apiKey");
        String apiKey = ApiClient.LoadAPIKey(".//apiKey.txt");
        apiKeyAuth.setApiKey(apiKey);
        return new SupportedLanguagesApi(apc);
    }

    @Test
    public void testGeographicPoiSupportedLanguagesGet() throws ApiException, IOException {
        SupportedLanguagesApi api = getSupportedLanguagesApi();
        SupportedLanguagesResponse supportedLanguagesResponse = api.geographicSupportedLanguagesGet(null);
        System.out.println(supportedLanguagesResponse.toString());
    }
}
