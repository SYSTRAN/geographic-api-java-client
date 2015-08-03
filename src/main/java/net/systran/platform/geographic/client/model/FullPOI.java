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

import net.systran.platform.geographic.client.model.Description;
import net.systran.platform.geographic.client.model.OpeningHours;
import net.systran.platform.geographic.client.model.Contact;
import net.systran.platform.geographic.client.model.Review;
import net.systran.platform.geographic.client.model.Booking;
import java.util.*;
import net.systran.platform.geographic.client.model.FullLocation;
import net.systran.platform.geographic.client.model.Photo;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * POI with detailled information
 **/
@ApiModel(description = "POI with detailled information")
public class FullPOI  {
  
  private String id = null;
  private FullLocation location = null;
  private String name = null;
  private List<String> types = new ArrayList<String>() ;
  private Integer rating = null;
  private Integer priceLevel = null;
  private Contact contact = null;
  private Boolean openNow = null;
  private List<OpeningHours> openingHours = new ArrayList<OpeningHours>() ;
  private List<Photo> photos = new ArrayList<Photo>() ;
  private String url = null;
  private List<Description> descriptions = new ArrayList<Description>() ;
  private List<Review> reviews = new ArrayList<Review>() ;
  private Booking booking = null;

  
  /**
   * POI Identifier
   **/
  @ApiModelProperty(required = true, value = "POI Identifier")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * Location
   **/
  @ApiModelProperty(required = true, value = "Location")
  @JsonProperty("location")
  public FullLocation getLocation() {
    return location;
  }
  public void setLocation(FullLocation location) {
    this.location = location;
  }

  
  /**
   * Name
   **/
  @ApiModelProperty(value = "Name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Types, ordered from general to specific
   **/
  @ApiModelProperty(required = true, value = "Types, ordered from general to specific")
  @JsonProperty("types")
  public List<String> getTypes() {
    return types;
  }
  public void setTypes(List<String> types) {
    this.types = types;
  }

  
  /**
   * Rating
   **/
  @ApiModelProperty(value = "Rating")
  @JsonProperty("rating")
  public Integer getRating() {
    return rating;
  }
  public void setRating(Integer rating) {
    this.rating = rating;
  }

  
  /**
   * Price Level
   **/
  @ApiModelProperty(value = "Price Level")
  @JsonProperty("priceLevel")
  public Integer getPriceLevel() {
    return priceLevel;
  }
  public void setPriceLevel(Integer priceLevel) {
    this.priceLevel = priceLevel;
  }

  
  /**
   * Contact
   **/
  @ApiModelProperty(value = "Contact")
  @JsonProperty("contact")
  public Contact getContact() {
    return contact;
  }
  public void setContact(Contact contact) {
    this.contact = contact;
  }

  
  /**
   * Open Now
   **/
  @ApiModelProperty(value = "Open Now")
  @JsonProperty("openNow")
  public Boolean getOpenNow() {
    return openNow;
  }
  public void setOpenNow(Boolean openNow) {
    this.openNow = openNow;
  }

  
  /**
   * Opening Hours
   **/
  @ApiModelProperty(value = "Opening Hours")
  @JsonProperty("openingHours")
  public List<OpeningHours> getOpeningHours() {
    return openingHours;
  }
  public void setOpeningHours(List<OpeningHours> openingHours) {
    this.openingHours = openingHours;
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
   * POI
   **/
  @ApiModelProperty(value = "POI")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  
  /**
   * Description content splitted in several parts
   **/
  @ApiModelProperty(value = "Description content splitted in several parts")
  @JsonProperty("descriptions")
  public List<Description> getDescriptions() {
    return descriptions;
  }
  public void setDescriptions(List<Description> descriptions) {
    this.descriptions = descriptions;
  }

  
  /**
   * Reviews
   **/
  @ApiModelProperty(value = "Reviews")
  @JsonProperty("reviews")
  public List<Review> getReviews() {
    return reviews;
  }
  public void setReviews(List<Review> reviews) {
    this.reviews = reviews;
  }

  
  /**
   * Booking
   **/
  @ApiModelProperty(value = "Booking")
  @JsonProperty("booking")
  public Booking getBooking() {
    return booking;
  }
  public void setBooking(Booking booking) {
    this.booking = booking;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FullPOI {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  location: ").append(location).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  types: ").append(types).append("\n");
    sb.append("  rating: ").append(rating).append("\n");
    sb.append("  priceLevel: ").append(priceLevel).append("\n");
    sb.append("  contact: ").append(contact).append("\n");
    sb.append("  openNow: ").append(openNow).append("\n");
    sb.append("  openingHours: ").append(openingHours).append("\n");
    sb.append("  photos: ").append(photos).append("\n");
    sb.append("  url: ").append(url).append("\n");
    sb.append("  descriptions: ").append(descriptions).append("\n");
    sb.append("  reviews: ").append(reviews).append("\n");
    sb.append("  booking: ").append(booking).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
