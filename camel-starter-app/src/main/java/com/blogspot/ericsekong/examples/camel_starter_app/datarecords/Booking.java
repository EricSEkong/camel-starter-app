package com.blogspot.ericsekong.examples.camel_starter_app.datarecords;

import java.util.Date;

public class Booking {

	private String reference;
	private Date lastUpdated;
	private Date tripDate;
	private Date createdDate;
	private Date cancelledDate;
	private String groupLeaderId;
	private String groupMembersId;
	private Double bookingTotal;
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public Date getLastUpdated() {
		return lastUpdated;
	}
	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
	public Date getTripDate() {
		return tripDate;
	}
	public void setTripDate(Date tripDate) {
		this.tripDate = tripDate;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getCancelledDate() {
		return cancelledDate;
	}
	public void setCancelledDate(Date cancelledDate) {
		this.cancelledDate = cancelledDate;
	}
	public String getGroupLeaderId() {
		return groupLeaderId;
	}
	public void setGroupLeaderId(String groupLeaderId) {
		this.groupLeaderId = groupLeaderId;
	}
	public String getGroupMembersId() {
		return groupMembersId;
	}
	public void setGroupMembersId(String groupMembersId) {
		this.groupMembersId = groupMembersId;
	}
	public Double getBookingTotal() {
		return bookingTotal;
	}
	public void setBookingTotal(Double bookingTotal) {
		this.bookingTotal = bookingTotal;
	}
	
	@Override
	public String toString() {
		return "Booking [reference=" + reference + ", lastUpdated=" + lastUpdated + ", tripDate=" + tripDate
				+ ", createdDate=" + createdDate + ", cancelledDate=" + cancelledDate + ", groupLeaderId="
				+ groupLeaderId + ", groupMembersId=" + groupMembersId + ", bookingTotal=" + bookingTotal + "]";
	}
}
