/*
 * Copyright 2023 Michelin CERT (https://cert.michelin.com/)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.michelin.cert.redscan.api;

import com.michelin.cert.redscan.service.IpService;
import com.michelin.cert.redscan.utils.models.Ip;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * IP controller.
 *
 * @author Axel REMACK
 */
@RestController
@RequestMapping("/api/ips")
public class IpController extends DatalakeStorageItemController<Ip> {

  @Autowired
  public void setService(IpService service) {
    this.service = service;
  }
  /**
   * Default constructor.
   */
  @Autowired
  public IpController() {  }

}
