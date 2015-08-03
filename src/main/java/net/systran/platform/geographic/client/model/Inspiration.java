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
import net.systran.platform.geographic.client.model.Photo;
import net.systran.platform.geographic.client.model.Video;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Inspiration
 **/
@ApiModel(description = "Inspiration")
public class Inspiration  {
  
  private String id = null;
  private String title = null;
  private String content = null;
  private List<Photo> photos = new ArrayList<Photo>() ;
  private List<Video> videos = new ArrayList<Video>() ;

  
  /**
   * Inspiration Identifier
   **/
  @ApiModelProperty(required = true, value = "Inspiration Identifier")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * Title
   **/
  @ApiModelProperty(required = true, value = "Title")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  
  /**
   * Content
   **/
  @ApiModelProperty(required = true, value = "Content")
  @JsonProperty("content")
  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }

  
  /**
   * Array of Photos
   **/
  @ApiModelProperty(value = "Array of Photos")
  @JsonProperty("photos")
  public List<Photo> getPhotos() {
    return photos;
  }
  public void setPhotos(List<Photo> photos) {
    this.photos = photos;
  }

  
  /**
   * Array of Videos
   **/
  @ApiModelProperty(value = "Array of Videos")
  @JsonProperty("videos")
  public List<Video> getVideos() {
    return videos;
  }
  public void setVideos(List<Video> videos) {
    this.videos = videos;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Inspiration {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  title: ").append(title).append("\n");
    sb.append("  content: ").append(content).append("\n");
    sb.append("  photos: ").append(photos).append("\n");
    sb.append("  videos: ").append(videos).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
