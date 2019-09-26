package com.poc.dev;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "devicedetails")
public class DeviceDetails implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public String id;
	public String year;
	public String startMeterReading ;
	public String endMeterReading;
	public String units;
	
	
	public DeviceDetails(){} 
	   
	public DeviceDetails (String id,String year,String startMeterReading,String endMeterReading, String units){
	      this.id = id;
	      this.year =  year;
	      this.startMeterReading=startMeterReading;
	      this.endMeterReading=endMeterReading;
	      this.units=units;
	      
	   }
	
	@XmlElement
	public String getId() {
		return id;
	}

	@XmlElement
	public void setId(String id) {
		this.id = id;
	}

	@XmlElement
	public String getYear() {
		return year;
	}

	@XmlElement
	public void setYear(String year) {
		this.year = year;
	}

	@XmlElement
	public String getStartMeterReading() {
		return startMeterReading;
	}

	@XmlElement
	public void setStartMeterReading(String startMeterReading) {
		this.startMeterReading = startMeterReading;
	}

	@XmlElement
	public String getEndMeterReading() {
		return endMeterReading;
	}

	@XmlElement
	public void setEndMeterReading(String endMeterReading) {
		this.endMeterReading = endMeterReading;
	}

	@XmlElement
	public String getUnits() {
		return units;
	}

	@XmlElement
	public void setUnits(String units) {
		this.units = units;
	}

	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
