package com.example.demo.serviceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.example.demo.exception.InternalServerError;
import com.example.demo.model.League;
import com.example.demo.service.LeagueService;

@Component
public class LeagueServiceImpl implements LeagueService {

	private static final Logger log = LoggerFactory.getLogger(LeagueServiceImpl.class);

	@Value("${base.url}")
	private String BASEURL;

	@Value("${api-key}")
	private String apikey;

	@Autowired
	RestTemplate restTemplate;

	@Override
	public List<League> findAllLeagues() {

		List<League> result = new ArrayList<>();

		try {
			ResponseEntity<League[]> response = restTemplate.getForEntity(BASEURL + "get_leagues&APIkey=" + apikey,
					League[].class);

			log.trace("API is invoked and response code is ", response.getStatusCodeValue());

			if (response.getStatusCodeValue() == 200) {
				result = Arrays.asList(response.getBody());
			}

		} catch (Exception ep) {
			log.error("Error while getting response from API url {}", ep.getMessage());
			throw new InternalServerError("An internal server error occured, please try after some time");
		}
		return result;

	}
}
