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
import net.systran.platform.geographic.client.model.ErrorResponse;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class PoiTypesResponse  {
  
  private ErrorResponse error = null;
  private List<String> poiTypes = new ArrayList<String>() ;

  
  /**
   * Error at request level
   **/
  @ApiModelProperty(value = "Error at request level")
  @JsonProperty("error")
  public ErrorResponse getError() {
    return error;
  }
  public void setError(ErrorResponse error) {
    this.error = error;
  }

  
  /**
   * POI types
   **/
  @ApiModelProperty(required = true, value = "POI types")
  @JsonProperty("poiTypes")
  public List<String> getPoiTypes() {
    return poiTypes;
  }
  public void setPoiTypes(List<String> poiTypes) {
    this.poiTypes = poiTypes;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoiTypesResponse {\n");
    
    sb.append("  error: ").append(error).append("\n");
    sb.append("  poiTypes: ").append(poiTypes).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
