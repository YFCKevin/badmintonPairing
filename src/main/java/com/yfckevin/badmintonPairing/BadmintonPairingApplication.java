package com.yfckevin.badmintonPairing;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.client.RestTemplate;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;

@EnableScheduling
@EnableAsync
@SpringBootApplication
public class BadmintonPairingApplication {

	public static void main(String[] args) {
		SpringApplication.run(BadmintonPairingApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	@Bean
	public ObjectMapper objectMapper(){
		return new ObjectMapper();
	}
	@Bean(name = "sdf")
	public SimpleDateFormat dateTimeFormat() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		sdf.setTimeZone(TimeZone.getTimeZone("Asia/Taipei"));
		return sdf;
	}
	@Bean(name = "svf")
	public SimpleDateFormat dateFormat() {
		SimpleDateFormat svf = new SimpleDateFormat("yyyyMMdd");
		svf.setTimeZone(TimeZone.getTimeZone("Asia/Taipei"));
		return svf;
	}
	@Bean(name = "ssf")
	public SimpleDateFormat standardDateFormat() {
		SimpleDateFormat ssf = new SimpleDateFormat("yyyy-MM-dd");
		ssf.setTimeZone(TimeZone.getTimeZone("Asia/Taipei"));
		return ssf;
	}
	@Bean(name = "isoSdf")
	public SimpleDateFormat isoSdf() {
		SimpleDateFormat isoSdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX");
		isoSdf.setTimeZone(TimeZone.getTimeZone("Asia/Taipei"));
		return isoSdf;
	}
	@Bean(name = "picSuffix")
	public SimpleDateFormat picSuffix() {
		SimpleDateFormat picSuffix = new SimpleDateFormat("yyyyMMddHHmmss");
		picSuffix.setTimeZone(TimeZone.getTimeZone("Asia/Taipei"));
		return picSuffix;
	}
	@Bean
	public DateTimeFormatter dateTimeFormatter() {
		return DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	}
}
