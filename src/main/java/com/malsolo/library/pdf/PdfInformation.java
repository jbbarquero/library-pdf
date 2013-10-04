package com.malsolo.library.pdf;

import java.util.List;

import com.google.common.collect.ImmutableList;

public class PdfInformation {

	private String filename;
	private int numberOfPages;
	private long length;
	private boolean rebuilt;
	private boolean encrypted;
	private ImmutableList<PdfPageInformation> pages;
	public PdfInformation(String filename, int numberOfPages,
			long length, boolean rebuilt, boolean encrypted,
			List<PdfPageInformation> pages) {
		super();
		this.filename = filename;
		this.numberOfPages = numberOfPages;
		this.pages = ImmutableList.copyOf(pages);
		this.length = length;
		this.rebuilt = rebuilt;
		this.encrypted = encrypted;
	}
	@Override
	public String toString() {
		return "PdfInformation [filename=" + filename + ", numberOfPages="
				+ numberOfPages + ", length=" + length + ", rebuilt=" + rebuilt
				+ ", encrypted=" + encrypted + ", pages=" + pages + "]";
	}
	public String getFilename() {
		return filename;
	}
	public int getNumberOfPages() {
		return numberOfPages;
	}
	public long getLength() {
		return length;
	}
	public boolean isRebuilt() {
		return rebuilt;
	}
	public boolean isEncrypted() {
		return encrypted;
	}
	public ImmutableList<PdfPageInformation> getPages() {
		return pages;
	}
}
