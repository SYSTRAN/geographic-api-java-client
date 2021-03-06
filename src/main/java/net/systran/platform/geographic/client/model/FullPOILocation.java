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

import net.systran.platform.geographic.client.model.POIAddress;
import net.systran.platform.geographic.client.model.FullPosition;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Location
 **/
@ApiModel(description = "Location")
public class FullPOILocation  {
  
  private FullPosition position = null;
  private POIAddress address = null;

  
  /**
   * Position defined by coordinates and type
   **/
  @ApiModelProperty(required = true, value = "Position defined by coordinates and type")
  @JsonProperty("position")
  public FullPosition getPosition() {
    return position;
  }
  public void setPosition(FullPosition position) {
    this.position = position;
  }

  
  /**
   * Address
   **/
  @ApiModelProperty(value = "Address")
  @JsonProperty("address")
  public POIAddress getAddress() {
    return address;
  }
  public void setAddress(POIAddress address) {
    this.address = address;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FullPOILocation {\n");
    
    sb.append("  position: ").append(position).append("\n");
    sb.append("  address: ").append(address).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
