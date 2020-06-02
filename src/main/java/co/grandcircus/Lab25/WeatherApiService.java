package co.grandcircus.Lab25;


import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherApiService {
	
	private RestTemplate rest = new RestTemplate();
	
	public WeatherOverview getForecast(){
		
		String url = "https://forecast.weather.gov/MapClick.php?lat=38.4247341&lon=-86.9624086&FcstType=json";
		
		WeatherOverview response = rest.getForObject(url, WeatherOverview.class);
		
		return response;
		
	}

}
