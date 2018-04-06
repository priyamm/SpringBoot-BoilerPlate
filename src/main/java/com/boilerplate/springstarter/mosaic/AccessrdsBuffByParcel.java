/**
 * 
 */
package com.boilerplate.springstarter.mosaic;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * @author priyamgupta
 *
 */
@Document(collection = "accessrds_buff_byparcel")
public class AccessrdsBuffByParcel {
	@Id
	private ObjectId id;
	private String comments;
	private String rulesetVersion;
	private String createdBy;
	private String entity;
	private String approvedBy;
	private String rulesetId;
	@Field(value = "timeStamp")
	private String timestamp;
	private Long incomingId;
	private String submittedBy;
	private String geometryId;
	private Long submittedTimestamp;
	private Long approvedTimestamp;
	private InnerObject data;
	/**
	 * @return the id
	 */
	public String getId() {
		return id.toString();
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = new ObjectId(id);
	}
	/**
	 * @return the comments
	 */
	public String getComments() {
		return comments;
	}
	/**
	 * @param comments the comments to set
	 */
	public void setComments(String comments) {
		this.comments = comments;
	}
	/**
	 * @return the rulesetVersion
	 */
	public String getRulesetVersion() {
		return rulesetVersion;
	}
	/**
	 * @param rulesetVersion the rulesetVersion to set
	 */
	public void setRulesetVersion(String rulesetVersion) {
		this.rulesetVersion = rulesetVersion;
	}
	/**
	 * @return the createdBy
	 */
	public String getCreatedBy() {
		return createdBy;
	}
	/**
	 * @param createdBy the createdBy to set
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	/**
	 * @return the entity
	 */
	public String getEntity() {
		return entity;
	}
	/**
	 * @param entity the entity to set
	 */
	public void setEntity(String entity) {
		this.entity = entity;
	}
	/**
	 * @return the approvedBy
	 */
	public String getApprovedBy() {
		return approvedBy;
	}
	/**
	 * @param approvedBy the approvedBy to set
	 */
	public void setApprovedBy(String approvedBy) {
		this.approvedBy = approvedBy;
	}
	/**
	 * @return the rulesetId
	 */
	public String getRulesetId() {
		return rulesetId;
	}
	/**
	 * @param rulesetId the rulesetId to set
	 */
	public void setRulesetId(String rulesetId) {
		this.rulesetId = rulesetId;
	}
	/**
	 * @return the timestamp
	 */
	public String getTimestamp() {
		return timestamp;
	}
	/**
	 * @param timestamp the timestamp to set
	 */
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	/**
	 * @return the incomingId
	 */
	public Long getIncomingId() {
		return incomingId;
	}
	/**
	 * @param incomingId the incomingId to set
	 */
	public void setIncomingId(Long incomingId) {
		this.incomingId = incomingId;
	}
	/**
	 * @return the submittedBy
	 */
	public String getSubmittedBy() {
		return submittedBy;
	}
	/**
	 * @param submittedBy the submittedBy to set
	 */
	public void setSubmittedBy(String submittedBy) {
		this.submittedBy = submittedBy;
	}
	/**
	 * @return the geometryId
	 */
	public String getGeometryId() {
		return geometryId;
	}
	/**
	 * @param geometryId the geometryId to set
	 */
	public void setGeometryId(String geometryId) {
		this.geometryId = geometryId;
	}
	/**
	 * @return the submittedTimestamp
	 */
	public Long getSubmittedTimestamp() {
		return submittedTimestamp;
	}
	/**
	 * @param submittedTimestamp the submittedTimestamp to set
	 */
	public void setSubmittedTimestamp(Long submittedTimestamp) {
		this.submittedTimestamp = submittedTimestamp;
	}
	/**
	 * @return the approvedTimestamp
	 */
	public Long getApprovedTimestamp() {
		return approvedTimestamp;
	}
	/**
	 * @param approvedTimestamp the approvedTimestamp to set
	 */
	public void setApprovedTimestamp(Long approvedTimestamp) {
		this.approvedTimestamp = approvedTimestamp;
	}
	/**
	 * @return the data
	 */
	public InnerObject getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(InnerObject data) {
		this.data = data;
	}
	
}
