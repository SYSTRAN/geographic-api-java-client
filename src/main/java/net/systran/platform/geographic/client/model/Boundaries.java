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

import java.util.*;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Boundaries defined by a polygon composed of a list of coordinates
 **/
@ApiModel(description = "Boundaries defined by a polygon composed of a list of coordinates")
public class Boundaries  {
  
  private List<Double> coordinates = new ArrayList<Double>() ;
  private String type = null;

  
  /**
   * Coordinates defined by latitude and longitude
   **/
  @ApiModelProperty(value = "Coordinates defined by latitude and longitude")
  @JsonProperty("coordinates")
  public List<Double> getCoordinates() {
    return coordinates;
  }
  public void setCoordinates(List<Double> coordinates) {
    this.coordinates = coordinates;
  }

  
  /**
   * The type of coordinates
   **/
  @ApiModelProperty(value = "The type of coordinates")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Boundaries {\n");
    
    sb.append("  coordinates: ").append(coordinates).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
