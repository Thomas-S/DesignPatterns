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
package org.pattern.state.var2;

/**
 * A soldier who can have several health states.
 *
 * @author Thomas Schulz
 * @version 1.0
 */
public class Soldier {

    // =======
    // CONTEXT
    // =======
    
    private HealthState healthy = new Healthy();
    private HealthState wounded = new Wounded();
    private HealthState dead = new Dead();
    
    private HealthState currentState;
    
    /**
     * @return Returns the currentState.
     */
    public HealthState getCurrentState() {
        return currentState;
    }
    
    /**
     * Creates a new healthy Soldier.
     */
    public Soldier() {
	currentState = healthy;
    }

    
    /**
     * Heals a wounded Soldier.
     */
    public void cure() {
	printState(currentState.cure());
	if (is(wounded)) {
	    currentState = healthy;
	}
    }
    
    /**
     * Injures a healthy Soldier and kills an injured Soldier.
     */
    public void wound() {
	printState(currentState.wound());
	if (is(wounded)) {
	    currentState = dead;
	} else if (is(healthy)) {
	    currentState = wounded;
	}
    }
    
    /**
     * Resurrects a dead Soldier.
     */
    public void resurrect() {
	printState(currentState.resurrect());
	if (is(dead)) {
	    currentState = healthy;
	}
    }
    
    /**
     * Kills a Soldier.
     */
    public void kill() {
	printState(currentState.kill());
	if (!is(dead)) {
	    currentState = dead;
	}
    }
    
    private static void printState(String s) {
	// ESCA-JAVA0266:
	System.out.println(s);
    }
    
    private boolean is(HealthState s) {
	return currentState == s;
    }
    
}
