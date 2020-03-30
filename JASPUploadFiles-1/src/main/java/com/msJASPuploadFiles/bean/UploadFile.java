package com.msJASPuploadFiles.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Entity
public class UploadFile {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String request;
	private List<String> links;

	// Constructeur
	public UploadFile() {
		super();
	}
	// Getters and setters

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the request
	 */
	public String getRequest() {
		return request;
	}

	/**
	 * @param request the request to set
	 */
	public void setRequest(String request) {
		this.request = request;
	}

	public java.util.List<String> getLinks() {
		return links;
	}

	public void setLinks(java.util.List<String> links) {
		this.links = links;
	}

	// tostring

	@Override
	public String toString() {
		return "UploadeFilesRepository [id=" + id + ", request=" + request + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	// equals and hash..

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UploadFile other = (UploadFile) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
