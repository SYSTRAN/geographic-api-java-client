/*
 * Copyright © 2015 SYSTRAN Software, Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.systran.platform.geographic.client.api;

import net.systran.platform.geographic.client.ApiException;
import net.systran.platform.geographic.client.ApiClient;
import net.systran.platform.geographic.client.Configuration;

import net.systran.platform.geographic.client.model.*;

import java.util.*;

import net.systran.platform.geographic.client.model.PoiDetailsResponse;
import net.systran.platform.geographic.client.model.PoiResponse;
import net.systran.platform.geographic.client.model.PoiTypesResponse;

import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.multipart.FormDataMultiPart;
import com.sun.jersey.multipart.file.FileDataBodyPart;

import javax.ws.rs.core.MediaType;

import java.io.InputStream;
import java.io.File;
import java.util.Map;
import java.util.HashMap;

public class PoiApi {
  private ApiClient apiClient;

  public PoiApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PoiApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Get a specific Point of interest
   * Get a specific `Point of interest`.
   * @param id POI identifier
   * @param acceptLanguage Preferred languages for response localization.\n\nSee [Accept-Language header specification for HTTP\n1.1](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.4)\n
   * @param callback Javascript callback function name for JSONP Support\n
   * @return PoiDetailsResponse
   */
  public PoiDetailsResponse geographicPoiGetGet (String id, String acceptLanguage, String callback) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling geographicPoiGetGet");
    }
    

    // create path and map variables
    String path = "/geographic/poi/get".replaceAll("\\{format\\}","json");

    // query params
    Map<String, Object> queryParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (id != null)
      queryParams.put("id", apiClient.parameterToString(id));
    if (callback != null)
      queryParams.put("callback", apiClient.parameterToString(callback));
    

    if (acceptLanguage != null)
      headerParams.put("Accept-Language", apiClient.parameterToString(acceptLanguage).toString());
    

    final String[] accepts = {
      
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String[] authNames = new String[] { "accessToken", "apiKey" };
      ClientResponse response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
      if(response != null){ 
        return (PoiDetailsResponse) apiClient.deserialize(response, "", PoiDetailsResponse.class); 
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * List Point of interests\n
   * Get a list of `Point of interests`.\n\nThe main criteria can be:\n* a position and a radius\n* a bounding box\n* a textual search\n\nAdditional critera can be added.\n
   * @param latitude Latitude location. Musts be used together with `longitude` and `radius` parameters.
   * @param longitude Longitude location. Musts be used together with `latitude` and `radius` parameters.
   * @param radius Radius in meters. Musts be used together with `latitude` and `longitude` parameters.
   * @param maximumLatitude Latitude of the top (northernmost) side of the bounding box. Musts be used together with `maximumLongitude`, `minimumLatitude` and `minimumLongitude` parameters.
   * @param maximumLongitude Longitude of the right (easternmost) side of the bounding box. Musts be used together with `maximumLatitude`, `minimumLatitude` and `minimumLongitude` parameters.
   * @param minimumLatitude Latitude of the bottom (southernmost) side of the bounding box. Musts be used together with `maximumLatitude`, `maximumLongitude` and `minimumLongitude` parameters.
   * @param minimumLongitude Longitude of the left (westernmost) side of the bounding box. Musts be used together with `maximumLatitude`, `maximumLongitude` and `minimumLatitude` parameters.
   * @param filter Filter on all relevent POI data (name, type, address, ...)
   * @param name POI name
   * @param mainType POI main type
   * @param type POI type
   * @param address POI address
   * @param country POI country
   * @param state POI state
   * @param county POI county
   * @param city POI city
   * @param postalCode POI postal code
   * @param street POI street
   * @param rankBy Ranking criteria
   * @param openNow Only open for business POI
   * @param minimumRating Minimum rating (from 1 to 5)
   * @param maximumRating Maximum rating (from 1 to 5)
   * @param minimumPrice Minimum price level (from 0 to 3)
   * @param maximumPrice Maximum price level (from 0 to 3)
   * @param limit Pagination limit
   * @param offset Pagination offset
   * @param acceptLanguage Preferred languages for response localization.\n\nSee [Accept-Language header specification for HTTP\n1.1](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.4)\n
   * @param callback Javascript callback function name for JSONP Support\n
   * @return PoiResponse
   */
  public PoiResponse geographicPoiListGet (Double latitude, Double longitude, Double radius, Double maximumLatitude, Double maximumLongitude, Double minimumLatitude, Double minimumLongitude, List<String> filter, List<String> name, String mainType, List<String> type, String address, String country, String state, String county, String city, String postalCode, String street, String rankBy, Boolean openNow, Integer minimumRating, Integer maximumRating, Integer minimumPrice, Integer maximumPrice, Integer limit, Integer offset, String acceptLanguage, String callback) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/geographic/poi/list".replaceAll("\\{format\\}","json");

    // query params
    Map<String, Object> queryParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (latitude != null)
      queryParams.put("latitude", apiClient.parameterToString(latitude));
    if (longitude != null)
      queryParams.put("longitude", apiClient.parameterToString(longitude));
    if (radius != null)
      queryParams.put("radius", apiClient.parameterToString(radius));
    if (maximumLatitude != null)
      queryParams.put("maximumLatitude", apiClient.parameterToString(maximumLatitude));
    if (maximumLongitude != null)
      queryParams.put("maximumLongitude", apiClient.parameterToString(maximumLongitude));
    if (minimumLatitude != null)
      queryParams.put("minimumLatitude", apiClient.parameterToString(minimumLatitude));
    if (minimumLongitude != null)
      queryParams.put("minimumLongitude", apiClient.parameterToString(minimumLongitude));
    if (filter != null)
      queryParams.put("filter", apiClient.parameterToString(filter));
    if (name != null)
      queryParams.put("name", apiClient.parameterToString(name));
    if (mainType != null)
      queryParams.put("mainType", apiClient.parameterToString(mainType));
    if (type != null)
      queryParams.put("type", apiClient.parameterToString(type));
    if (address != null)
      queryParams.put("address", apiClient.parameterToString(address));
    if (country != null)
      queryParams.put("country", apiClient.parameterToString(country));
    if (state != null)
      queryParams.put("state", apiClient.parameterToString(state));
    if (county != null)
      queryParams.put("county", apiClient.parameterToString(county));
    if (city != null)
      queryParams.put("city", apiClient.parameterToString(city));
    if (postalCode != null)
      queryParams.put("postalCode", apiClient.parameterToString(postalCode));
    if (street != null)
      queryParams.put("street", apiClient.parameterToString(street));
    if (rankBy != null)
      queryParams.put("rankBy", apiClient.parameterToString(rankBy));
    if (openNow != null)
      queryParams.put("openNow", apiClient.parameterToString(openNow));
    if (minimumRating != null)
      queryParams.put("minimumRating", apiClient.parameterToString(minimumRating));
    if (maximumRating != null)
      queryParams.put("maximumRating", apiClient.parameterToString(maximumRating));
    if (minimumPrice != null)
      queryParams.put("minimumPrice", apiClient.parameterToString(minimumPrice));
    if (maximumPrice != null)
      queryParams.put("maximumPrice", apiClient.parameterToString(maximumPrice));
    if (limit != null)
      queryParams.put("limit", apiClient.parameterToString(limit));
    if (offset != null)
      queryParams.put("offset", apiClient.parameterToString(offset));
    if (callback != null)
      queryParams.put("callback", apiClient.parameterToString(callback));
    

    if (acceptLanguage != null)
      headerParams.put("Accept-Language", apiClient.parameterToString(acceptLanguage).toString());
    

    final String[] accepts = {
      
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String[] authNames = new String[] { "accessToken", "apiKey" };
      ClientResponse response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
      if(response != null){ 
        return (PoiResponse) apiClient.deserialize(response, "", PoiResponse.class); 
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Get available Point of interest types
   * Get available `Point of interest` types.
   * @param acceptLanguage Preferred languages for response localization.\n\nSee [Accept-Language header specification for HTTP\n1.1](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.4)\n
   * @param callback Javascript callback function name for JSONP Support\n
   * @return PoiTypesResponse
   */
  public PoiTypesResponse geographicPoiTypesGet (String acceptLanguage, String callback) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/geographic/poi/types".replaceAll("\\{format\\}","json");

    // query params
    Map<String, Object> queryParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (callback != null)
      queryParams.put("callback", apiClient.parameterToString(callback));
    

    if (acceptLanguage != null)
      headerParams.put("Accept-Language", apiClient.parameterToString(acceptLanguage).toString());
    

    final String[] accepts = {
      
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String[] authNames = new String[] { "accessToken", "apiKey" };
      ClientResponse response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
      if(response != null){ 
        return (PoiTypesResponse) apiClient.deserialize(response, "", PoiTypesResponse.class); 
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
