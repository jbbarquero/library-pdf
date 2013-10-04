package com.malsolo.library.pdf.access;

import java.io.IOException;
import java.util.ArrayList;

import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfReader;
import com.malsolo.library.pdf.PdfInformation;
import com.malsolo.library.pdf.PdfPageInformation;

public class PdfInformationRetriever {
	
	public PdfInformation inspect(String filename) throws IOException {
		
		PdfReader reader = new PdfReader(filename);
		
		int numberOfPages = reader.getNumberOfPages();
		
		ArrayList<PdfPageInformation> pages = new ArrayList<>();
		for (int i = 1; i <= numberOfPages; i++) {
			Rectangle mediabox = reader.getPageSize(i);
			pages.add(
				new PdfPageInformation(
						mediabox.getLeft(), 
						mediabox.getBottom(), 
						mediabox.getRight(), 
						mediabox.getTop(), 
						reader.getPageRotation(i), 
						reader.getPageSizeWithRotation(i)
				)
			);
		}
		
		return new PdfInformation(filename, 
				numberOfPages, reader.getFileLength(), 
				reader.isRebuilt(), reader.isEncrypted(), pages); 
		
	}

}
