package com.cox.cox;

import java.time.LocalDateTime;
import org.kie.dmn.feel.lang.FEELProperty;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class IssueDO implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private LocalDateTime startDateTime;

	private LocalDateTime endDateTime;

	private java.lang.String node;

	private java.lang.String type;

	public IssueDO() {
	}

	public java.lang.String getNode() {
		return this.node;
	}

	public void setNode(java.lang.String node) {
		this.node = node;
	}

	public java.time.LocalDateTime getStartDateTime() {
		return this.startDateTime;
	}

	public void setStartDateTime(java.time.LocalDateTime startDateTime) {
		this.startDateTime = startDateTime;
	}

	public java.time.LocalDateTime getEndDateTime() {
		return this.endDateTime;
	}

	public void setEndDateTime(java.time.LocalDateTime endDateTime) {
		this.endDateTime = endDateTime;
	}

	public java.lang.String getType() {
		return this.type;
	}

	public void setType(java.lang.String type) {
		this.type = type;
	}

	public IssueDO(java.time.LocalDateTime startDateTime,
			java.time.LocalDateTime endDateTime, java.lang.String node,
			java.lang.String type) {
		this.startDateTime = startDateTime;
		this.endDateTime = endDateTime;
		this.node = node;
		this.type = type;
	}

}