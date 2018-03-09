package com.orangeandbronze.webdev.service;


public class SectionDTO {
	final String sectionId;
	final String subjectId;
	final String schedule;
	final String roomName;
	
	public static final SectionDTO NONE = new SectionDTO("NONE", "NONE", "NONE", "NONE");

	SectionDTO(String sectionId, String subjectId, String schedule, String roomName) {
		this.sectionId = sectionId;
		this.subjectId = subjectId;
		this.schedule = schedule;
		this.roomName = roomName;
	}	

	public String getSectionId() {
		return sectionId;
	}

	public String getSubjectId() {
		return subjectId;
	}

	public String getSchedule() {
		return schedule;
	}

	public String getRoomName() {
		return roomName;
	}

	@Override
	public String toString() {
		return "SectionDTO [sectionId=" + sectionId + ", subjectId=" + subjectId + ", schedule=" + schedule
				+ ", roomName=" + roomName + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sectionId == null) ? 0 : sectionId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof SectionDTO)) {
			return false;
		}
		SectionDTO other = (SectionDTO) obj;
		if (sectionId == null) {
			if (other.sectionId != null) {
				return false;
			}
		} else if (!sectionId.equals(other.sectionId)) {
			return false;
		}
		return true;
	}
}
