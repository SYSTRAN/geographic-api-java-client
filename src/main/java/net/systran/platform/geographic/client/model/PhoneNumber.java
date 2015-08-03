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
 * Phone number
 **/
@ApiModel(description = "Phone number")
public class PhoneNumber  {
  
  private String value = null;
  private String formatted = null;
  private String international = null;
  private String type = null;

  
  /**
   * Raw phone number
   **/
  @ApiModelProperty(required = true, value = "Raw phone number")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

  
  /**
   * Formatted phone number
   **/
  @ApiModelProperty(value = "Formatted phone number")
  @JsonProperty("formatted")
  public String getFormatted() {
    return formatted;
  }
  public void setFormatted(String formatted) {
    this.formatted = formatted;
  }

  
  /**
   * International phone number
   **/
  @ApiModelProperty(value = "International phone number")
  @JsonProperty("international")
  public String getInternational() {
    return international;
  }
  public void setInternational(String international) {
    this.international = international;
  }

  
  /**
   * Professional, Fax, Mobile, ...
   **/
  @ApiModelProperty(value = "Professional, Fax, Mobile, ...")
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
    sb.append("class PhoneNumber {\n");
    
    sb.append("  value: ").append(value).append("\n");
    sb.append("  formatted: ").append(formatted).append("\n");
    sb.append("  international: ").append(international).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
