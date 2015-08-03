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
 * Opening hours
 **/
@ApiModel(description = "Opening hours")
public class OpeningHours  {
  
  private Integer begin = null;
  private Integer end = null;

  
  /**
   * Opening hour (day(1 digit),hour(2 digits), minutes(2digits)), ex: 50928 for Friday 9h28
   **/
  @ApiModelProperty(required = true, value = "Opening hour (day(1 digit),hour(2 digits), minutes(2digits)), ex: 50928 for Friday 9h28")
  @JsonProperty("begin")
  public Integer getBegin() {
    return begin;
  }
  public void setBegin(Integer begin) {
    this.begin = begin;
  }

  
  /**
   * Closing hour (day(1 digit),hour(2 digits), minutes(2digits)), ex: 51722 for Friday 17h22
   **/
  @ApiModelProperty(required = true, value = "Closing hour (day(1 digit),hour(2 digits), minutes(2digits)), ex: 51722 for Friday 17h22")
  @JsonProperty("end")
  public Integer getEnd() {
    return end;
  }
  public void setEnd(Integer end) {
    this.end = end;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpeningHours {\n");
    
    sb.append("  begin: ").append(begin).append("\n");
    sb.append("  end: ").append(end).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
