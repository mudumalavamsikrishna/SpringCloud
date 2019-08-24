package com.vamsi.microservices.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;
import java.lang.String;
import com.vamsi.microservices.currencyexchangeservice.ExchangeValue;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {

	ExchangeValue findByFromAndTo(String from, String to);

}
