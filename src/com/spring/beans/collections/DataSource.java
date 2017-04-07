package com.spring.beans.collections;

import java.util.Properties;

public class DataSource {
	private Properties propertities;

	public Properties getPropertities() {
		return propertities;
	}

	public void setPropertities(Properties propertities) {
		this.propertities = propertities;
	}

	@Override
	public String toString() {
		return "DataSource [propertities=" + propertities + "]";
	}
	
}
