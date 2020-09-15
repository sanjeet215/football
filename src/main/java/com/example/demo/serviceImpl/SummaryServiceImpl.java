package com.example.demo.serviceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.example.demo.exception.InternalServerError;
import com.example.demo.model.Summary;
import com.example.demo.service.LeagueService;
import com.example.demo.service.SummaryService;

@Component
public class SummaryServiceImpl implements SummaryService {

	@Value("${base.url}")
	private String BASEURL;

	@Value("${api-key}")
	private String apikey;

	@Autowired
	LeagueService leagueService;

	@Autowired
	RestTemplate restTemplate;

	@Autowired
	SummaryService summaryService;

	private static final Logger log = LoggerFactory.getLogger(TeamServiceImpl.class);

	@Override
	public List<Summary> findPositions() {

		List<Summary> result = new ArrayList<>();

		// Step 1 : Get all league ids
		List<Integer> leagueidList = leagueService.findAllLeagues().stream().map(item -> item.getLeague_id())
				.collect(Collectors.toList());

		try {

			for (Integer league_id : leagueidList) {
				String str = String.valueOf(league_id);

				ResponseEntity<Summary[]> response = restTemplate.getForEntity(
						BASEURL + "get_standings&league_id=" + str + "&APIkey=" + apikey, Summary[].class);

				log.trace("API is invoked and response code is ", response.getStatusCodeValue());

				List<Summary> tempresult = new ArrayList<>();

				if (response.getStatusCodeValue() == 200) {
					tempresult = Arrays.asList(response.getBody());
				}

				result.addAll(tempresult);
			}

		} catch (Exception ep) {
			log.error("Error while getting response from API url {}", ep.getMessage());
			throw new InternalServerError("An internal server error occured, please try after some time");
		}

		return result;
	}

}
