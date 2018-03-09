package com.orangeandbronze.webdev.service;

import java.util.*;

public class SectionManagementService {
	
	private static Map<String, SectionDTO> sectionDTOs = new LinkedHashMap<>(); 
	
	static {
		put("AAA111", "MATH11", "MTH H1130", "AVR2");
		put("BBB222", "SOCSCI2", "TF H1000", "AS113");
		put("CCC333", "HISTORY1", "WS H1430", "CAL114");
	}
	
	private static void put(String sectionId, String subjectId, String schedule, String roomName) {
		sectionDTOs.put(sectionId, new SectionDTO(sectionId, subjectId, schedule, roomName));
	}
	
	public SectionDTO findSectionInfoById(String sectionId) {
		return sectionDTOs.getOrDefault(sectionId.trim(), SectionDTO.NONE);
	}
	
	public Collection<SectionDTO> findAllSectionDTOs() {
		Collection<SectionDTO> DTOs = new ArrayList<>();
		for (Map.Entry<String, SectionDTO> entries : sectionDTOs.entrySet()) {
			DTOs.add(entries.getValue());
		}
		return DTOs;
	}
}
