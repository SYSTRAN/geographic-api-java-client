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
    public void testGeographicPoiListGet() throws ApiException, IOException {
        PoiApi api = getPoiApi();
        PoiResponse poiResponse = api.geographicPoiListGet(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        System.out.println(poiResponse.toString());
    }

    @Test
    public void testGeographicPoiListGetWithParameters() throws ApiException, IOException {
        PoiApi api = getPoiApi();
        double lat = 47.219510;
        double lng = -1.553694;
        double radius = 1000;

        PoiResponse poiResponse = api.geographicPoiListGet(lat, lng, radius, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        System.out.println(poiResponse.toString());
    }

    @Test
    public void testGeographicPoiListGetWithLimit() throws ApiException, IOException {
        PoiApi api = getPoiApi();
        double lat = 47.219510;
        double lng = -1.553694;
        double radius = 1000;
        int limit = 10;

        PoiResponse poiResponse = api.geographicPoiListGet(lat, lng, radius, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, limit, null, null, null);
        System.out.println(poiResponse.toString());
    }

    @Test
    public void testGeographicPoiListGetWithName() throws ApiException, IOException {
        PoiApi api = getPoiApi();
        double lat = 47.219510;
        double lng = -1.553694;
        double radius = 1000;
        List<String> names = new ArrayList<String>();
        names.add("OUEST INFO");
        names.add("RHUMS ET COCKTAILS");
        names.add("LES SENTIERS DE DAKAR");

        PoiResponse poiResponse = api.geographicPoiListGet(lat, lng, radius, null, null, null, null, null, names, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        System.out.println(poiResponse.toString());
    }

    @Test
    public void testGeographicPoiListGetWithFilter() throws ApiException, IOException {
        PoiApi api = getPoiApi();
        double lat = 47.219510;
        double lng = -1.553694;
        double radius = 1000;
        List<String> filter = new ArrayList<String>();
        //filter.add("OUEST INFO");
        //filter.add("RHUMS ET COCKTAILS");
        filter.add("LES SENTIERS DE DAKAR");

        PoiResponse poiResponse = api.geographicPoiListGet(lat, lng, radius, null, null, null, null, filter, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        System.out.println(poiResponse.toString());
    }

    @Test
    public void testGeographicPoiGetGet() throws ApiException, IOException {
        PoiApi api = getPoiApi();
        String id = "556eb3c9d61c8170d8cd6410";
        PoiDetailsResponse poiDetailsResponse = api.geographicPoiGetGet(id, null, null);
        System.out.println(poiDetailsResponse.toString());
    }

    @Test
    public void testGeographicPoiTypesGet() throws ApiException, IOException {
        PoiApi api = getPoiApi();
        PoiTypesResponse poiTypesResponse = api.geographicPoiTypesGet(null, null);
        System.out.println(poiTypesResponse.toString());
    }
}
