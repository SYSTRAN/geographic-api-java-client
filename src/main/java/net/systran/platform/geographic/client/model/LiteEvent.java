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

import net.systran.platform.geographic.client.model.OpeningDates;
import net.systran.platform.geographic.client.model.LiteLocation;
import java.util.*;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Event with only basic information
 **/
@ApiModel(description = "Event with only basic information")
public class LiteEvent  {
  
  private String id = null;
  private LiteLocation location = null;
  private String name = null;
  private OpeningDates openingDates = null;
  private String mainType = null;
  private List<String> types = new ArrayList<String>() ;
  private Integer rating = null;
  private Integer priceLevel = null;

  
  /**
   * Event Identifier
   **/
  @ApiModelProperty(required = true, value = "Event Identifier")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * Location
   **/
  @ApiModelProperty(required = true, value = "Location")
  @JsonProperty("location")
  public LiteLocation getLocation() {
    return location;
  }
  public void setLocation(LiteLocation location) {
    this.location = location;
  }

  
  /**
   * Name
   **/
  @ApiModelProperty(value = "Name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Opening dates
   **/
  @ApiModelProperty(required = true, value = "Opening dates")
  @JsonProperty("openingDates")
  public OpeningDates getOpeningDates() {
    return openingDates;
  }
  public void setOpeningDates(OpeningDates openingDates) {
    this.openingDates = openingDates;
  }

  
  /**
   * Main type
   **/
  @ApiModelProperty(required = true, value = "Main type")
  @JsonProperty("mainType")
  public String getMainType() {
    return mainType;
  }
  public void setMainType(String mainType) {
    this.mainType = mainType;
  }

  
  /**
   * Types, ordered from general to specific
   **/
  @ApiModelProperty(required = true, value = "Types, ordered from general to specific")
  @JsonProperty("types")
  public List<String> getTypes() {
    return types;
  }
  public void setTypes(List<String> types) {
    this.types = types;
  }

  
  /**
   * Rating
   **/
  @ApiModelProperty(value = "Rating")
  @JsonProperty("rating")
  public Integer getRating() {
    return rating;
  }
  public void setRating(Integer rating) {
    this.rating = rating;
  }

  
  /**
   * Price Level
   **/
  @ApiModelProperty(value = "Price Level")
  @JsonProperty("priceLevel")
  public Integer getPriceLevel() {
    return priceLevel;
  }
  public void setPriceLevel(Integer priceLevel) {
    this.priceLevel = priceLevel;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiteEvent {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  location: ").append(location).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  openingDates: ").append(openingDates).append("\n");
    sb.append("  mainType: ").append(mainType).append("\n");
    sb.append("  types: ").append(types).append("\n");
    sb.append("  rating: ").append(rating).append("\n");
    sb.append("  priceLevel: ").append(priceLevel).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
