package it.lorenzopavez.urbi.dto;

public class VehicleDto {

	private double lat;
	private double lon;
	private ProviderEnum provider;
	private String identifier;
	private String name;
	private String plate;
	private Integer distance;
	private Integer fuelLevel;
	private String address;
	
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public double getLon() {
		return lon;
	}
	public void setLon(double lon) {
		this.lon = lon;
	}
	public String getIdentifier() {
		return identifier;
	}
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlate() {
		return plate;
	}
	public void setPlate(String plate) {
		this.plate = plate;
	}
	
	public Integer getDistance() {
		return distance;
	}
	public void setDistance(Integer distance) {
		this.distance = distance;
	}
	public Integer getFuelLevel() {
		return fuelLevel;
	}
	public void setFuelLevel(Integer fuelLevel) {
		this.fuelLevel = fuelLevel;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public ProviderEnum getProvider() {
		return provider;
	}
	public void setProvider(ProviderEnum provider) {
		this.provider = provider;
	}
	
	
}
