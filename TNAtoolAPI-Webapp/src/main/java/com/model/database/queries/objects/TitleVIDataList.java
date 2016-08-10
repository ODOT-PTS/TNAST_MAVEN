package com.model.database.queries.objects;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@XmlRootElement(name = "TitleVIDataL")
public class TitleVIDataList {
	
	@XmlAttribute
	@JsonSerialize
	public String metadata;

	@XmlElement(name = "TitleVIDataList")
	public List<TitleVIData> TitleVIDataList = new ArrayList<TitleVIData>();
	
}