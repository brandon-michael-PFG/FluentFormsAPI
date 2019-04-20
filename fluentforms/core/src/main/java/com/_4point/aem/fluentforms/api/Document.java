package com._4point.aem.fluentforms.api;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public interface Document extends AutoCloseable, Closeable {

	void close() throws IOException;

	void copyToFile(File arg0) throws IOException;

	void dispose();

	Object getAttribute(String name);

	String getContentType() throws IOException;

	byte[] getInlineData() throws IOException;

	InputStream getInputStream() throws IOException;

	int getMaxInlineSize();

	long length() throws IOException;

	void passivate() throws IOException;

	void removeAttribute(String name);

	void setAttribute(String name, Object val);

	void setContentType(String contentType);

	void setMaxInlineSize(int maxInlineSize);

	com.adobe.aemfd.docmanager.Document getAdobeDocument();
	
}