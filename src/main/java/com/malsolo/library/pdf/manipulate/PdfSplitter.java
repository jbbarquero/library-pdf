package com.malsolo.library.pdf.manipulate;

import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfCopy;
import com.itextpdf.text.pdf.PdfReader;

public class PdfSplitter {
	
	public void split(String sourceFileName, String destinationFileNamePrefix, int pagesToSplit) throws IOException, DocumentException {
		PdfReader reader = new PdfReader(sourceFileName);
		
		PdfCopy copy = null;
		int n = reader.getNumberOfPages();
		if (n>0) {
			int pagesIncluded = 0;
			int i = 0;
			Document document = null;
			FileOutputStream fileToWriteTo = null;
			for (; i < n; ) {
				if (pagesIncluded==0) {
					document = new Document();//1
					fileToWriteTo = new FileOutputStream(String.format(destinationFileNamePrefix, ((i/pagesToSplit)+1)));
					copy = new PdfCopy(document, fileToWriteTo);//2
					document.open();//3
				}
				copy.addPage(copy.getImportedPage(reader, ++i));//4
				pagesIncluded++;
				if (pagesIncluded==pagesToSplit) {
					pagesIncluded = 0;
					document.close();//5
					fileToWriteTo.close();
				}
			}
			if (pagesIncluded>0) {
				document.close();//5
				fileToWriteTo.close();
			}
		}
	}

}
