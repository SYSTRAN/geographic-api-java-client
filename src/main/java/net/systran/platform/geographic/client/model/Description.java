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

import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.HashMap;
import java.util.Map;

@ApiModel(description = "")
public class Description  {
  
  private String content = null;
  public enum TypeEnum {
    description("description"), generalInformation("general information"), detailedPresentation("detailed presentation"); 

    private final String text;
    private static Map<String, TypeEnum> namesMap = new HashMap<String, TypeEnum>();
    
    static { 
      namesMap.put("description", description);
      namesMap.put("general information", generalInformation);
      namesMap.put("detailed presentation", detailedPresentation);
    }
    
    private TypeEnum(final String text) {
      this.text = text;
    }

    @JsonCreator
    public static TypeEnum forValue(String value) throws Exception {
      if (namesMap.get(value) == null) {
        throw new Exception("Invalid enum value");
      }

      return namesMap.get(value);
    }

    @Override
    public String toString() {
      return text;
    }
  };
  private TypeEnum type = null;

  
  /**
   * Description part content
   **/
  @ApiModelProperty(required = true, value = "Description part content")
  @JsonProperty("content")
  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }

  
  /**
   * Description part category
   **/
  @ApiModelProperty(required = true, value = "Description part category")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Description {\n");
    
    sb.append("  content: ").append(content).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
