/** License (BSD Style License):
 *  Copyright (c) 2011
 *  Thomas Schulz
 *  All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without
 *  modification, are permitted provided that the following conditions are met:
 *
 *  - Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 *  - Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *  - The name of the author may not be used to endorse or promote products
 *    derived from this software without specific prior written permission.
 *
 *  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 *  AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 *  IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 *  ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 *  LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 *  CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 *  SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 *  INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 *  CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 *  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 *  POSSIBILITY OF SUCH DAMAGE.
 */
package org.pattern.facade;

/**
 * The subsystem - encapsulates a formatted document.
 * 
 * @author Thomas Schulz
 * @version 1.0
 */
public class Document {

    private String content;

    private String header;

    private String footer;

    /**
     * 
     * Creates a new Document.
     */
    public Document() {

    }

    /**
     * Creates a new Document.
     * 
     * @param content
     * @param header
     * @param footer
     */
    public Document(final String content, final String header,
	    final String footer) {
	this.content = content;
	this.header = header;
	this.footer = footer;
    }

    /**
     * @return Returns the content.
     */
    public String getContent() {
	return this.content;
    }

    /**
     * @param content
     *            The content to set.
     */
    public void setContent(final String content) {
	this.content = content;
    }

    /**
     * @return Returns the header.
     */
    public String getHeader() {
	return this.header;
    }

    /**
     * @param header
     *            The header to set.
     */
    public void setHeader(final String header) {
	this.header = header;
    }

    /**
     * @return Returns the footer.
     */
    public String getFooter() {
	return this.footer;
    }

    /**
     * @param footer
     *            The footer to set.
     */
    public void setFooter(final String footer) {
	this.footer = footer;
    }


    // ESCA-JAVA0266:
    
    /**
     * Sends the document.
     */
    public void send() {
	System.out.println("Document sent.");
    }

    /**
     * Prints a copy.
     */
    public void printCopy() {
	System.out.println(header);
	System.out.println(content);
	System.out.println(footer);
    }
}
