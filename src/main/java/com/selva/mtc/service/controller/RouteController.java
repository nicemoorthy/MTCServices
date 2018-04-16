package com.selva.mtc.service.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RouteController {

	@RequestMapping(path = "/totalroute")
	public void getTotalRoute() {

	}

	@RequestMapping(path = "/route")
	public void getRoute(String route_id) {

	}

}
