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

import net.systran.platform.geographic.client.model.InspirationResponse;
import net.systran.platform.geographic.client.model.InspirationDetailsResponse;

import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.multipart.FormDataMultiPart;
import com.sun.jersey.multipart.file.FileDataBodyPart;

import javax.ws.rs.core.MediaType;

import java.io.InputStream;
import java.io.File;
import java.util.Map;
import java.util.HashMap;

public class InspirationsApi {
  private ApiClient apiClient;

  public InspirationsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public InspirationsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * List dossiers
   * Get a list of `Inspirations` of type `dossier`.\n\nThe main criteria can be:\n* a position and a radius\n* a textual search\n\nAdditional critera can be added.\n
   * @param latitude Latitude location. Musts be used together with `longitude` and `radius` parameters.
   * @param longitude Longitude location. Musts be used together with `latitude` and `radius` parameters.
   * @param radius Radius in meters. Musts be used together with `latitude` and `longitude` parameters.
   * @param address Address
   * @param country Country
   * @param state State
   * @param county County
   * @param city City
   * @param postalCode Postal Code
   * @param limit Pagination limit
   * @param offset Pagination offset
   * @param acceptLanguage Preferred languages for response localization.\n\nSee [Accept-Language header specification for HTTP\n1.1](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.4)\n
   * @param callback Javascript callback function name for JSONP Support\n
   * @return InspirationResponse
   */
  public InspirationResponse geographicInspirationsDossiersListGet (Double latitude, Double longitude, Double radius, String address, String country, String state, String county, String city, String postalCode, Integer limit, Integer offset, String acceptLanguage, String callback) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/geographic/inspirations/dossiers/list".replaceAll("\\{format\\}","json");

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
        return (InspirationResponse) apiClient.deserialize(response, "", InspirationResponse.class); 
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * List events
   * Get a list of `Inspirations` of type `event`.\n\nThe main criteria can be:\n* a position and a radius\n* a textual search\n\nAdditional critera can be added.\n
   * @param latitude Latitude location. Musts be used together with `longitude` and `radius` parameters.
   * @param longitude Longitude location. Musts be used together with `latitude` and `radius` parameters.
   * @param radius Radius in meters. Musts be used together with `latitude` and `longitude` parameters.
   * @param address Address
   * @param country Country
   * @param state State
   * @param county County
   * @param city City
   * @param postalCode Postal Code
   * @param limit Pagination limit
   * @param offset Pagination offset
   * @param acceptLanguage Preferred languages for response localization.\n\nSee [Accept-Language header specification for HTTP\n1.1](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.4)\n
   * @param callback Javascript callback function name for JSONP Support\n
   * @return InspirationResponse
   */
  public InspirationResponse geographicInspirationsEventsListGet (Double latitude, Double longitude, Double radius, String address, String country, String state, String county, String city, String postalCode, Integer limit, Integer offset, String acceptLanguage, String callback) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/geographic/inspirations/events/list".replaceAll("\\{format\\}","json");

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
        return (InspirationResponse) apiClient.deserialize(response, "", InspirationResponse.class); 
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Get a specific Inspiration
   * Get a specific `Inspiration`.
   * @param id Inspiration identifier
   * @param acceptLanguage Preferred languages for response localization.\n\nSee [Accept-Language header specification for HTTP\n1.1](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.4)\n
   * @param callback Javascript callback function name for JSONP Support\n
   * @return InspirationDetailsResponse
   */
  public InspirationDetailsResponse geographicInspirationsGetGet (String id, String acceptLanguage, String callback) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling geographicInspirationsGetGet");
    }
    

    // create path and map variables
    String path = "/geographic/inspirations/get".replaceAll("\\{format\\}","json");

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
        return (InspirationDetailsResponse) apiClient.deserialize(response, "", InspirationDetailsResponse.class); 
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * List Inspirations
   * Get a list of `Inspirations`.\n\nThe main criteria can be:\n* a position and a radius\n* a textual search\n\nAdditional critera can be added.\n
   * @param latitude Latitude location. Musts be used together with `longitude` and `radius` parameters.
   * @param longitude Longitude location. Musts be used together with `latitude` and `radius` parameters.
   * @param radius Radius in meters. Musts be used together with `latitude` and `longitude` parameters.
   * @param address Address
   * @param country Country
   * @param state State
   * @param county County
   * @param city City
   * @param postalCode Postal Code
   * @param limit Pagination limit
   * @param offset Pagination offset
   * @param acceptLanguage Preferred languages for response localization.\n\nSee [Accept-Language header specification for HTTP\n1.1](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.4)\n
   * @param callback Javascript callback function name for JSONP Support\n
   * @return InspirationResponse
   */
  public InspirationResponse geographicInspirationsListGet (Double latitude, Double longitude, Double radius, String address, String country, String state, String county, String city, String postalCode, Integer limit, Integer offset, String acceptLanguage, String callback) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/geographic/inspirations/list".replaceAll("\\{format\\}","json");

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
        return (InspirationResponse) apiClient.deserialize(response, "", InspirationResponse.class); 
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * List news in brief
   * Get a list of `Inspirations` of type `news in brief`.\n\nThe main criteria can be:\n* a position and a radius\n* a textual search\n\nAdditional critera can be added.\n
   * @param latitude Latitude location. Musts be used together with `longitude` and `radius` parameters.
   * @param longitude Longitude location. Musts be used together with `latitude` and `radius` parameters.
   * @param radius Radius in meters. Musts be used together with `latitude` and `longitude` parameters.
   * @param address Address
   * @param country Country
   * @param state State
   * @param county County
   * @param city City
   * @param postalCode Postal Code
   * @param limit Pagination limit
   * @param offset Pagination offset
   * @param acceptLanguage Preferred languages for response localization.\n\nSee [Accept-Language header specification for HTTP\n1.1](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.4)\n
   * @param callback Javascript callback function name for JSONP Support\n
   * @return InspirationResponse
   */
  public InspirationResponse geographicInspirationsNewsInBriefListGet (Double latitude, Double longitude, Double radius, String address, String country, String state, String county, String city, String postalCode, Integer limit, Integer offset, String acceptLanguage, String callback) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/geographic/inspirations/newsInBrief/list".replaceAll("\\{format\\}","json");

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
        return (InspirationResponse) apiClient.deserialize(response, "", InspirationResponse.class); 
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * List slide shows
   * Get a list of `Inspirations` of type `slide show`.\n\nThe main criteria can be:\n* a position and a radius\n* a textual search\n\nAdditional critera can be added.\n
   * @param latitude Latitude location. Musts be used together with `longitude` and `radius` parameters.
   * @param longitude Longitude location. Musts be used together with `latitude` and `radius` parameters.
   * @param radius Radius in meters. Musts be used together with `latitude` and `longitude` parameters.
   * @param address Address
   * @param country Country
   * @param state State
   * @param county County
   * @param city City
   * @param postalCode Postal Code
   * @param limit Pagination limit
   * @param offset Pagination offset
   * @param acceptLanguage Preferred languages for response localization.\n\nSee [Accept-Language header specification for HTTP\n1.1](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.4)\n
   * @param callback Javascript callback function name for JSONP Support\n
   * @return InspirationResponse
   */
  public InspirationResponse geographicInspirationsSlideShowsListGet (Double latitude, Double longitude, Double radius, String address, String country, String state, String county, String city, String postalCode, Integer limit, Integer offset, String acceptLanguage, String callback) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/geographic/inspirations/slideShows/list".replaceAll("\\{format\\}","json");

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
        return (InspirationResponse) apiClient.deserialize(response, "", InspirationResponse.class); 
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * List tests
   * Get a list of `Inspirations` of type `test`.\n\nThe main criteria can be:\n* a position and a radius\n* a textual search\n\nAdditional critera can be added.\n
   * @param latitude Latitude location. Musts be used together with `longitude` and `radius` parameters.
   * @param longitude Longitude location. Musts be used together with `latitude` and `radius` parameters.
   * @param radius Radius in meters. Musts be used together with `latitude` and `longitude` parameters.
   * @param address Address
   * @param country Country
   * @param state State
   * @param county County
   * @param city City
   * @param postalCode Postal Code
   * @param limit Pagination limit
   * @param offset Pagination offset
   * @param acceptLanguage Preferred languages for response localization.\n\nSee [Accept-Language header specification for HTTP\n1.1](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.4)\n
   * @param callback Javascript callback function name for JSONP Support\n
   * @return InspirationResponse
   */
  public InspirationResponse geographicInspirationsTestsListGet (Double latitude, Double longitude, Double radius, String address, String country, String state, String county, String city, String postalCode, Integer limit, Integer offset, String acceptLanguage, String callback) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/geographic/inspirations/tests/list".replaceAll("\\{format\\}","json");

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
        return (InspirationResponse) apiClient.deserialize(response, "", InspirationResponse.class); 
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
