/**
 * Copyright(c) 2012-2019 optile GmbH. All Rights Reserved.
 * https://www.optile.net
 *
 * This software is the property of optile GmbH. Distribution  of  this
 * software without agreement in writing is strictly prohibited.
 *
 * This software may not be copied, used or distributed unless agreement
 * has been received in full.
 */
package com.realexpayments.remote.sdk.domain.payment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @author Ramy Mohamed
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class StoredCredential {

	@XmlElement(
		name = "type"
	)
	private String type;
	@XmlElement(
		name = "sequence"
	)
	private String sequence;
	@XmlElement(
		name = "initiator"
	)
	private String initiator;
	@XmlElement(
		name = "srd"
	)
	private String srd;

	public StoredCredential() {
	}

	public String getType() {
		return type;
	}

	public void setType(final String type) {
		this.type = type;
	}

	public String getSequence() {
		return sequence;
	}

	public void setSequence(final String sequence) {
		this.sequence = sequence;
	}

	public String getInitiator() {
		return initiator;
	}

	public void setInitiator(final String initiator) {
		this.initiator = initiator;
	}

	public String getSrd() {
		return srd;
	}

	public void setSrd(final String srd) {
		this.srd = srd;
	}

	public StoredCredential addType(Type type) {
		this.type = type.getType();
		return this;
	}

	public StoredCredential addSequence(Sequence sequence) {
		this.sequence = sequence.getSequence();
		return this;
	}

	public StoredCredential addInitiator(Initiator initiator) {
		this.initiator = initiator.getInitiator();
		return this;
	}

	public StoredCredential addSrd(String srd) {
		this.srd = srd;
		return this;
	}

	public static enum Initiator {
		CARDHOLDER("cardholder"),
		MERCHANT("merchant"),
		SCHEDULED("scheduled");

		private final String initiator;

		Initiator(final String initiator) {
			this.initiator = initiator;
		}

		public String getInitiator() {
			return initiator;
		}
	}

	public static enum Sequence {
		FIRST("first"),
		SUBSEQUENT("subsequent");

		private final String sequence;

		Sequence(final String sequence) {
			this.sequence = sequence;
		}

		public String getSequence() {
			return sequence;
		}
	}

	public static enum Type {
		ONEOFF("oneoff"),
		INSTALLMENT("installment"),
		RECURRING("recurring");

		private final String type;

		Type(final String type) {
			this.type = type;
		}

		public String getType() {
			return type;
		}
	}
}
