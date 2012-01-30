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
package org.pattern.composite.var1;

/**
 * An example client which benefits from the Composite pattern.
 * 
 * @author Thomas Schulz
 * @version 1.0
 */
public class Client {

    private Client() {
    }

    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
	MilitaryUnit major = new Major("Payne");
	MilitaryUnit captain1 = new Captain("Kirk");
	MilitaryUnit corporal1a = new Corporal("Kirkguy");
	MilitaryUnit corporal1b = new Corporal("Kirkdouche");
	MilitaryUnit captain2 = new Captain("Picard");
	MilitaryUnit corporal2a = new Corporal("Picardguy");
	MilitaryUnit corporal2b = new Corporal("Picardson");
	
	major.add(captain1);
	major.add(captain2);
	
	captain1.add(corporal1a);
	captain1.add(corporal1b);
	
	captain2.add(corporal2a);
	captain2.add(corporal2b);
	
	// ESCA-JAVA0266:
	System.out.println(major.print());
	
	captain1.remove(corporal1b);
	
	// ESCA-JAVA0266:
	System.out.println(major.print());
	
	// ESCA-JAVA0266:
	System.out.println(captain2.getMilitaryUnit(1).print());
    }

}