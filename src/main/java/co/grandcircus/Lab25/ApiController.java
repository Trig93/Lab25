package co.grandcircus.Lab25;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ApiController {
	
	@Autowired
	private WeatherApiService service;
	
	@RequestMapping("/")
	public String weather(Model model) {
		WeatherOverview WeatherOverview = service.getForecast();
		model.addAttribute("weatheroverview", WeatherOverview);
		return "weather";
	}

}
