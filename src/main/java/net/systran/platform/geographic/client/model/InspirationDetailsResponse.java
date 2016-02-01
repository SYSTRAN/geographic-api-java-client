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

import net.systran.platform.geographic.client.model.FullInspiration;
import net.systran.platform.geographic.client.model.ErrorResponse;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class InspirationDetailsResponse  {
  
  private ErrorResponse error = null;
  private FullInspiration result = null;

  
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
   * Full Inspiration data
   **/
  @ApiModelProperty(required = true, value = "Full Inspiration data")
  @JsonProperty("result")
  public FullInspiration getResult() {
    return result;
  }
  public void setResult(FullInspiration result) {
    this.result = result;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InspirationDetailsResponse {\n");
    
    sb.append("  error: ").append(error).append("\n");
    sb.append("  result: ").append(result).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
