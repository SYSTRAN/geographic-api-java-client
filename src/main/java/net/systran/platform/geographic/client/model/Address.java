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

import net.systran.platform.geographic.client.model.AddressComponents;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Address
 **/
@ApiModel(description = "Address")
public class Address  {
  
  private AddressComponents components = null;
  private String formatted = null;
  private String vicinity = null;

  
  /**
   * Address components
   **/
  @ApiModelProperty(value = "Address components")
  @JsonProperty("components")
  public AddressComponents getComponents() {
    return components;
  }
  public void setComponents(AddressComponents components) {
    this.components = components;
  }

  
  /**
   * Formatted Address (Postal Address)
   **/
  @ApiModelProperty(value = "Formatted Address (Postal Address)")
  @JsonProperty("formatted")
  public String getFormatted() {
    return formatted;
  }
  public void setFormatted(String formatted) {
    this.formatted = formatted;
  }

  
  /**
   * Vicinity
   **/
  @ApiModelProperty(value = "Vicinity")
  @JsonProperty("vicinity")
  public String getVicinity() {
    return vicinity;
  }
  public void setVicinity(String vicinity) {
    this.vicinity = vicinity;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    
    sb.append("  components: ").append(components).append("\n");
    sb.append("  formatted: ").append(formatted).append("\n");
    sb.append("  vicinity: ").append(vicinity).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
