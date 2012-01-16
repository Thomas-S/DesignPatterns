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

//=======================
//======= Builder =======
//=======================

interface CarBuilder {

    /**
     * 
     * @param lightType
     * @return A string representation of lights.
     */
    String addLights(String lightType);

    /**
     * 
     * @param engineType
     * @return A string representation of the engine.
     */
    String addEngine(String engineType);

    /**
     * @return A string representation of tyres.
     */
    String addTyres();

    /**
     * Construct the car.
     */
    void buildCar();

    /**
     * 
     * @return The Car object.
     */
    Car getCar();

}



//=================================
//======= Concrete Builders =======
//=================================


// ESCA-JAVA0137:
/**
 * This class builds a Car of type Mercedes.
 *
 * @author Thomas Schulz
 * @version 1.0
 */
class MercedesCarBuilder implements CarBuilder {
    
    Car car;

    @Override
    public String addLights(String lightType) {
	return "Mercedes with " + lightType + " lights";
    }

    @Override
    public String addEngine(String engineType) {
	return "Mercedes with " + engineType + " engine";
    }

    @Override
    public String addTyres() {
	return "Mercedes with Goodyear tyres";
    }

    @Override
    public void buildCar() {
	car = new Car(addLights("Halogen"),addEngine("V6"),addTyres());
    }

    @Override
    public Car getCar() {
	return car;
    }

}


// ESCA-JAVA0137:
/**
 * This class builds a Car of type Bentley.
 *
 * @author Thomas Schulz
 * @version 1.0
 */
class BentleyCarBuilder implements CarBuilder {
    
    Car car;

    @Override
    public String addLights(String lightType) {
	return "Bentley with " + lightType + " lights";
    }

    @Override
    public String addEngine(String engineType) {
	return "Bentley with " + engineType + " engine";
    }

    @Override
    public String addTyres() {
	return "Bentley with Continental tyres";
    }

    @Override
    public void buildCar() {
	car = new Car(addLights("Xenon"),addEngine("V12"),addTyres());
    }

    @Override
    public Car getCar() {
	return car;
    }

}