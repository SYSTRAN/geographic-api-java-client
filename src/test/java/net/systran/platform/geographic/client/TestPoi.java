package net.systran.platform.geographic.client;


import net.systran.platform.geographic.client.api.PoiApi;
import net.systran.platform.geographic.client.auth.ApiKeyAuth;
import net.systran.platform.geographic.client.model.*;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestPoi {
    public static PoiApi getPoiApi() throws IOException {
        ApiClient apc = new ApiClient();
        ApiKeyAuth apiKeyAuth = (ApiKeyAuth) apc.getAuthentication("apiKey");
        String apiKey = ApiClient.LoadAPIKey(".//apiKey.txt");
        apiKeyAuth.setApiKey(apiKey);
        return new PoiApi(apc);
    }

    @Test
    public void testGeographicPoiSupportedLanguagesGet() throws ApiException, IOException {
        PoiApi api = getPoiApi();
        SupportedLanguagesResponse supportedLanguagesResponse = api.geographicPoiSupportedLanguagesGet(null);
        System.out.println(supportedLanguagesResponse.toString());
    }

    @Test
    public void testGeographicPoiGet() throws ApiException, IOException {
        PoiApi api = getPoiApi();
        PoiResponse poiResponse = api.geographicPoiGet(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        System.out.println(poiResponse.toString());
    }

    @Test
    public void testGeographicPoiGetWithParameters() throws ApiException, IOException {
        PoiApi api = getPoiApi();
        double lat = 47.219510;
        double lng = -1.553694;
        double radius = 1000;

        PoiResponse poiResponse = api.geographicPoiGet(lat, lng, radius, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        System.out.println(poiResponse.toString());
    }

    @Test
    public void testGeographicPoiGetWithLimit() throws ApiException, IOException {
        PoiApi api = getPoiApi();
        double lat = 47.219510;
        double lng = -1.553694;
        double radius = 1000;
        int limit = 10;

        PoiResponse poiResponse = api.geographicPoiGet(lat, lng, radius, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, limit, null, null, null, null);
        System.out.println(poiResponse.toString());
    }

    @Test
    public void testGeographicPoiGetWithName() throws ApiException, IOException {
        PoiApi api = getPoiApi();
        double lat = 47.219510;
        double lng = -1.553694;
        double radius = 1000;
        List<String> names = new ArrayList<String>();
        names.add("OUEST INFO");
        names.add("RHUMS ET COCKTAILS");
        names.add("LES SENTIERS DE DAKAR");

        PoiResponse poiResponse = api.geographicPoiGet(lat, lng, radius, null, null, null, null, null, names, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        System.out.println(poiResponse.toString());
    }

    @Test
    public void testGeographicPoiGetWithFilter() throws ApiException, IOException {
        PoiApi api = getPoiApi();
        double lat = 47.219510;
        double lng = -1.553694;
        double radius = 1000;
        List<String> filter = new ArrayList<String>();
        //filter.add("OUEST INFO");
        //filter.add("RHUMS ET COCKTAILS");
        filter.add("LES SENTIERS DE DAKAR");

        PoiResponse poiResponse = api.geographicPoiGet(lat, lng, radius, null, null, null, null, filter, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        System.out.println(poiResponse.toString());
    }

    @Test
    public void testGeographicPoiDetailsGet() throws ApiException, IOException {
        PoiApi api = getPoiApi();
        String id = "556eb3c9d61c8170d8cd6410";
        PoiDetailsResponse poiDetailsResponse = api.geographicPoiDetailsGet(id, null, null);
        System.out.println(poiDetailsResponse.toString());
    }

    @Test
    public void testGeographicPoiTypesGet() throws ApiException, IOException {
        PoiApi api = getPoiApi();
        PoiTypesResponse poiTypesResponse = api.geographicPoiTypesGet(null, null);
        System.out.println(poiTypesResponse.toString());
    }

    @Test
    public void testGeographicPoiEventsGet() throws ApiException, IOException {
        PoiApi api = getPoiApi();
        EventsResponse eventsResponse = api.geographicPoiEventsGet(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        System.out.println(eventsResponse.toString());
    }
}
