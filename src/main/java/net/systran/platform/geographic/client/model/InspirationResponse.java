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

import net.systran.platform.geographic.client.model.Inspiration;
import java.util.*;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class InspirationResponse  {
  
  private Integer total = null;
  private Integer offset = null;
  private List<Inspiration> inspirations = new ArrayList<Inspiration>() ;

  
  /**
   * Total number of elements matching the criteria (for pagination)
   **/
  @ApiModelProperty(required = true, value = "Total number of elements matching the criteria (for pagination)")
  @JsonProperty("total")
  public Integer getTotal() {
    return total;
  }
  public void setTotal(Integer total) {
    this.total = total;
  }

  
  /**
   * Pagination offset
   **/
  @ApiModelProperty(required = true, value = "Pagination offset")
  @JsonProperty("offset")
  public Integer getOffset() {
    return offset;
  }
  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  
  /**
   * Array of inspirations
   **/
  @ApiModelProperty(required = true, value = "Array of inspirations")
  @JsonProperty("inspirations")
  public List<Inspiration> getInspirations() {
    return inspirations;
  }
  public void setInspirations(List<Inspiration> inspirations) {
    this.inspirations = inspirations;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InspirationResponse {\n");
    
    sb.append("  total: ").append(total).append("\n");
    sb.append("  offset: ").append(offset).append("\n");
    sb.append("  inspirations: ").append(inspirations).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
