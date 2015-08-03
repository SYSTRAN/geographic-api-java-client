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

import net.systran.platform.geographic.client.model.PhoneNumber;
import net.systran.platform.geographic.client.model.Mail;
import java.util.*;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Contact
 **/
@ApiModel(description = "Contact")
public class Contact  {
  
  private List<PhoneNumber> phoneNumbers = new ArrayList<PhoneNumber>() ;
  private List<Mail> mails = new ArrayList<Mail>() ;

  
  /**
   * Array of phone numbers
   **/
  @ApiModelProperty(value = "Array of phone numbers")
  @JsonProperty("phoneNumbers")
  public List<PhoneNumber> getPhoneNumbers() {
    return phoneNumbers;
  }
  public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }

  
  /**
   * Array of mails
   **/
  @ApiModelProperty(value = "Array of mails")
  @JsonProperty("mails")
  public List<Mail> getMails() {
    return mails;
  }
  public void setMails(List<Mail> mails) {
    this.mails = mails;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Contact {\n");
    
    sb.append("  phoneNumbers: ").append(phoneNumbers).append("\n");
    sb.append("  mails: ").append(mails).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
