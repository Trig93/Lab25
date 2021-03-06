package co.grandcircus.Lab25;

public class WeatherOverview {
	
	private String operationalMode;
	private String srsName;
	private String creationDate;
	private String creationDateLocal;
	private String productionCenter;
	private String credit;
	private String moreInformation;
	private Location location;
	private Time time;
	private Data data;
	private CurrentObservation currentObservation;
	
	public String getOperationalMode() {
		return operationalMode;
	}
	public void setOperationalMode(String operationalMode) {
		this.operationalMode = operationalMode;
	}
	public String getSrsName() {
		return srsName;
	}
	public void setSrsName(String srsName) {
		this.srsName = srsName;
	}
	public String getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}
	public String getCreationDateLocal() {
		return creationDateLocal;
	}
	public void setCreationDateLocal(String creationDateLocal) {
		this.creationDateLocal = creationDateLocal;
	}
	public String getProductionCenter() {
		return productionCenter;
	}
	public void setProductionCenter(String productionCenter) {
		this.productionCenter = productionCenter;
	}
	public String getCredit() {
		return credit;
	}
	public void setCredit(String credit) {
		this.credit = credit;
	}
	public String getMoreInformation() {
		return moreInformation;
	}
	public void setMoreInformation(String moreInformation) {
		this.moreInformation = moreInformation;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	public Data getData() {
		return data;
	}
	public void setData(Data data) {
		this.data = data;
	}
	public CurrentObservation getCurrentObservation() {
		return currentObservation;
	}
	public void setCurrentObservation(CurrentObservation currentObservation) {
		this.currentObservation = currentObservation;
	}

}
