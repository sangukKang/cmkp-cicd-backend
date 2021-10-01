/**
 * Project: SKT MarketPlace
 *
 * <p>Copyright (c) 2021 Bespinglobal
 *
 * <p>This software is STK MP Launcher
 */
package com.bespinglobal.backend.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;
import java.util.Map;

/**
 *
 *
 * <pre>
 * service           : backend
 * package           : com.bespinglobal.backend.controller
 * class             : BackendController
 * description       :
 *
 * ====================================================================================
 *
 * </pre>
 *
 * @date 2021/09/23
 * @author minji.hong
 * @version 1.0.0
 */
@Controller
@RequestMapping("/api")
public class BackendController {

  static final String API_V1 = "/v1";

  @RequestMapping(value = API_V1 + "/backend", method = RequestMethod.POST)
  public ResponseEntity<Void> apply() {
    return new ResponseEntity(HttpStatus.CREATED);
  }

  @RequestMapping(value = API_V1 + "/sample", method = RequestMethod.POST)
  public ResponseEntity sample() {
    Map<String, String> mockup = new HashMap<>();
    mockup.put("userId", "P0001");
    mockup.put("userName", "admin");
    mockup.put("project", "skt");
    return new ResponseEntity(mockup, HttpStatus.OK);
  }
}
