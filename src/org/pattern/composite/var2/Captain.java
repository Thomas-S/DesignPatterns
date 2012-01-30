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
package org.pattern.composite.var2;

import java.util.ArrayList;
import java.util.List;

/**
 * A composite MilitaryUnit.
 * 
 * @author Thomas Schulz
 * @version 1.0
 */
public class Captain extends MilitaryUnit {

    // =========================
    // ======= Composite =======
    // =========================

    List<MilitaryUnit> company = new ArrayList<MilitaryUnit>();

    /**
     * Creates a new Captain.
     * 
     * @param name
     */
    public Captain(String name) {
	setName(name);
    }
    
    /**
     * 
     * @param mu The MilitaryUnit to add.
     */
    protected boolean add(MilitaryUnit mu) {
	company.add(mu);
	return true;
    }
    
    /**
     * 
     * @param mu The MilitaryUnit to remove.
     */
    protected boolean remove(MilitaryUnit mu) {
	company.remove(mu);
	return true;
    }
    
    /**
     * 
     * @param i
     * @return Returns the i-th MilitaryUnit.
     */
    protected MilitaryUnit getMilitaryUnit(int i) {
	return company.get(i);
    }

    @Override
    protected String print() {
	String result = "-Captain " + getName() + "\n";
	for (MilitaryUnit mu : company) {
	    result += mu.print();
	}
	return result;
    }

}
