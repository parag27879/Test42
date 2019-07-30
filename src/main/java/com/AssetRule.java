package com;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class AssetRule implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "ASSETRULE_ID_GENERATOR")
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(name = "ASSETRULE_ID_GENERATOR", sequenceName = "ASSETRULE_ID_SEQ")
	private java.lang.Long id;

	@org.kie.api.definition.type.Label("Line Of Business")
	private java.lang.String lineOfBusiness;

	@org.kie.api.definition.type.Label("Business Unit")
	private java.lang.String businessUnit;

	@org.kie.api.definition.type.Label("Product Category")
	private java.lang.String productCategory;

	@org.kie.api.definition.type.Label("Consent Category")
	private java.lang.String consentCategory;

	@org.kie.api.definition.type.Label("CMBS")
	private java.lang.String cmbs;

	@org.kie.api.definition.type.Label("Processor")
	private java.lang.String processor;

	@org.kie.api.definition.type.Label("roles temp")
	private java.lang.String rolesTemp;

	@javax.persistence.ElementCollection(fetch = javax.persistence.FetchType.EAGER)
	@org.kie.api.definition.type.Label(value = "Result List")
	private java.util.List<java.lang.String> resultList;

	public AssetRule() {
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public java.lang.String getLineOfBusiness() {
		return this.lineOfBusiness;
	}

	public void setLineOfBusiness(java.lang.String lineOfBusiness) {
		this.lineOfBusiness = lineOfBusiness;
	}

	public java.lang.String getBusinessUnit() {
		return this.businessUnit;
	}

	public void setBusinessUnit(java.lang.String businessUnit) {
		this.businessUnit = businessUnit;
	}

	public java.lang.String getProductCategory() {
		return this.productCategory;
	}

	public void setProductCategory(java.lang.String productCategory) {
		this.productCategory = productCategory;
	}

	public java.lang.String getConsentCategory() {
		return this.consentCategory;
	}

	public void setConsentCategory(java.lang.String consentCategory) {
		this.consentCategory = consentCategory;
	}

	public java.lang.String getCmbs() {
		return this.cmbs;
	}

	public void setCmbs(java.lang.String cmbs) {
		this.cmbs = cmbs;
	}

	public java.lang.String getProcessor() {
		return this.processor;
	}

	public void setProcessor(java.lang.String processor) {
		this.processor = processor;
	}

	public java.lang.String getRolesTemp() {
		return this.rolesTemp;
	}

	public void setRolesTemp(java.lang.String rolesTemp) {
		this.rolesTemp = rolesTemp;
	}

	public java.util.List<java.lang.String> getResultList() {
		return this.resultList;
	}

	public void setResultList(java.util.List<java.lang.String> resultList) {
		this.resultList = resultList;
	}

	public AssetRule(java.lang.Long id, java.lang.String lineOfBusiness,
			java.lang.String businessUnit, java.lang.String productCategory,
			java.lang.String consentCategory, java.lang.String cmbs,
			java.lang.String processor, java.lang.String rolesTemp,
			java.util.List<java.lang.String> resultList) {
		this.id = id;
		this.lineOfBusiness = lineOfBusiness;
		this.businessUnit = businessUnit;
		this.productCategory = productCategory;
		this.consentCategory = consentCategory;
		this.cmbs = cmbs;
		this.processor = processor;
		this.rolesTemp = rolesTemp;
		this.resultList = resultList;
	}

}