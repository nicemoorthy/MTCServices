package com.selva.mtc.service.dataaccess;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "route_head")
public class RouteHead {

	@Id
	private long _id;
	// @Indexed(unique = true)
	private String route_no;
	private String service_type;
	private String orgin;
	private String destination;
	private String journy_time;

	public long get_id() {
		return _id;
	}

	public void set_id(long _id) {
		this._id = _id;
	}

	public String getRoute_no() {
		return route_no;
	}

	public void setRoute_no(String route_no) {
		this.route_no = route_no;
	}

	public String getService_type() {
		return service_type;
	}

	public void setService_type(String service_type) {
		this.service_type = service_type;
	}

	public String getOrgin() {
		return orgin;
	}

	public void setOrgin(String orgin) {
		this.orgin = orgin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getJourny_time() {
		return journy_time;
	}

	public void setJourny_time(String journy_time) {
		this.journy_time = journy_time;
	}

}
