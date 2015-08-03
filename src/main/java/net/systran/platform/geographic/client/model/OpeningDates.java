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
 * Opening dates
 **/
@ApiModel(description = "Opening dates")
public class OpeningDates  {
  
  private String begin = null;
  private String end = null;

  
  /**
   * Begin date
   **/
  @ApiModelProperty(required = true, value = "Begin date")
  @JsonProperty("begin")
  public String getBegin() {
    return begin;
  }
  public void setBegin(String begin) {
    this.begin = begin;
  }

  
  /**
   * End date
   **/
  @ApiModelProperty(required = true, value = "End date")
  @JsonProperty("end")
  public String getEnd() {
    return end;
  }
  public void setEnd(String end) {
    this.end = end;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpeningDates {\n");
    
    sb.append("  begin: ").append(begin).append("\n");
    sb.append("  end: ").append(end).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
