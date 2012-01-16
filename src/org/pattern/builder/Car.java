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
package org.pattern.builder;

/**
 * A class that models a simplified car.
 *
 * @author Thomas Schulz
 * @version 1.0
 */
public class Car {
    
    //=======================
    //======= Product =======
    //=======================
    
    // ESCA-JAVA0098:
    String lightType;
    String engineType;
    String tyreType;
    
    /**
     * Creates a new Car with the given parameters.
     * 
     * @param lights
     * @param engine
     * @param tyres
     */
    public Car(String lights, String engine, String tyres) {
	lightType = lights;
	engineType = engine;
	tyreType = tyres;
    }
    
    /**
     * @return Returns the lightType.
     */
    public String getLightType() {
        return lightType;
    }
    /**
     * @param lightType The lightType to set.
     */
    public void setLightType(String lightType) {
        this.lightType = lightType;
    }
    /**
     * @return Returns the engineType.
     */
    public String getEngineType() {
        return engineType;
    }
    /**
     * @param engineType The engineType to set.
     */
    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
    /**
     * @return Returns the tyreType.
     */
    public String getTyreType() {
        return tyreType;
    }
    /**
     * @param tyreType The tyreType to set.
     */
    public void setTyreType(String tyreType) {
        this.tyreType = tyreType;
    }
    
    public String toString() {
	return String.format("%s.%n%s.%n%s.%n", lightType, engineType, tyreType);
    }
    

}
