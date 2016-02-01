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

package net.systran.platform.geographic.client.model;


import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Address components
 **/
@ApiModel(description = "Address components")
public class POIAddressComponents  {
  
  private String country = null;
  private String state = null;
  private String county = null;
  private String city = null;
  private String postalCode = null;
  private String street = null;

  
  /**
   * Country
   **/
  @ApiModelProperty(value = "Country")
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }

  
  /**
   * State
   **/
  @ApiModelProperty(value = "State")
  @JsonProperty("state")
  public String getState() {
    return state;
  }
  public void setState(String state) {
    this.state = state;
  }

  
  /**
   * County
   **/
  @ApiModelProperty(value = "County")
  @JsonProperty("county")
  public String getCounty() {
    return county;
  }
  public void setCounty(String county) {
    this.county = county;
  }

  
  /**
   * City
   **/
  @ApiModelProperty(value = "City")
  @JsonProperty("city")
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }

  
  /**
   * Postal code
   **/
  @ApiModelProperty(value = "Postal code")
  @JsonProperty("postalCode")
  public String getPostalCode() {
    return postalCode;
  }
  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  
  /**
   * Street
   **/
  @ApiModelProperty(value = "Street")
  @JsonProperty("street")
  public String getStreet() {
    return street;
  }
  public void setStreet(String street) {
    this.street = street;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class POIAddressComponents {\n");
    
    sb.append("  country: ").append(country).append("\n");
    sb.append("  state: ").append(state).append("\n");
    sb.append("  county: ").append(county).append("\n");
    sb.append("  city: ").append(city).append("\n");
    sb.append("  postalCode: ").append(postalCode).append("\n");
    sb.append("  street: ").append(street).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
