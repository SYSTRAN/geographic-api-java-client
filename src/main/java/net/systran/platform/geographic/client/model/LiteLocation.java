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

import net.systran.platform.geographic.client.model.Position;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class LiteLocation  {
  
  private Position position = null;
  private String vicinity = null;

  
  /**
   * Position defined by latitude and longitude
   **/
  @ApiModelProperty(required = true, value = "Position defined by latitude and longitude")
  @JsonProperty("position")
  public Position getPosition() {
    return position;
  }
  public void setPosition(Position position) {
    this.position = position;
  }

  
  /**
   * Vicinity description
   **/
  @ApiModelProperty(value = "Vicinity description")
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
    sb.append("class LiteLocation {\n");
    
    sb.append("  position: ").append(position).append("\n");
    sb.append("  vicinity: ").append(vicinity).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
