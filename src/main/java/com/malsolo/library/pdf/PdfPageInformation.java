package com.malsolo.library.pdf;

import com.itextpdf.text.Rectangle;

public class PdfPageInformation {
	
	private float lowerLeftXCoordinate;
	private float lowerLeftYCoordinate;
	private float upperRightXCoordinate;
	private float upperRightYCoordinate;
	private int rotation;
	private Rectangle pageSizeWithRotation;
	public PdfPageInformation(float lowerLeftXCoordinate,
			float lowerLeftYCoordinate, float upperRightXCoordinate,
			float upperRightYCoordinate, int rotation,
			Rectangle pageSizeWithRotation) {
		super();
		this.lowerLeftXCoordinate = lowerLeftXCoordinate;
		this.lowerLeftYCoordinate = lowerLeftYCoordinate;
		this.upperRightXCoordinate = upperRightXCoordinate;
		this.upperRightYCoordinate = upperRightYCoordinate;
		this.rotation = rotation;
		this.pageSizeWithRotation = pageSizeWithRotation;
	}
	public float getLowerLeftXCoordinate() {
		return lowerLeftXCoordinate;
	}
	public float getLowerLeftYCoordinate() {
		return lowerLeftYCoordinate;
	}
	public float getUpperRightXCoordinate() {
		return upperRightXCoordinate;
	}
	public float getUpperRightYCoordinate() {
		return upperRightYCoordinate;
	}
	public int getRotation() {
		return rotation;
	}
	public Rectangle getPageSizeWithRotation() {
		return pageSizeWithRotation;
	}
	@Override
	public String toString() {
		return "PdfPageInformation [lowerLeftXCoordinate="
				+ lowerLeftXCoordinate + ", lowerLeftYCoordinate="
				+ lowerLeftYCoordinate + ", upperRightXCoordinate="
				+ upperRightXCoordinate + ", upperRightYCoordinate="
				+ upperRightYCoordinate + ", rotation=" + rotation
				+ ", pageSizeWithRotation=" + pageSizeWithRotation + "]";
	}
}
