package com.selva.mtc.service.dataaccess;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface RouteRepository extends MongoRepository<RouteHead, Long> {

	RouteHead listAllRoute();

//	RouteHead findByDomainAndDisplayAds(String domain, boolean displayAds);
//
//	// Supports native JSON query string
//	@Query("{domain:'?0'}")
//	RouteHead findCustomByDomain(String domain);
//
//	@Query("{domain: { $regex: ?0 } })")
//	List<RouteHead> findCustomByRegExDomain(String domain);

}