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
package org.pattern.abstract_factory;

//================================
//======= Abstract Factory =======
//================================

interface AbstractVegetation {

    /**
     * @return Returns a new Weather object.
     */
    IWeather createWeather();

    /**
     * @return Returns a new Animal object.
     */
    IAnimal createAnimal();

    /**
     * @return Returns a new Plant object.
     */
    IPlant createPlant();
}

// ==================================
// ======= Concrete Factories =======
// ==================================

// ======= The desert =======

class DesertVegetation implements AbstractVegetation {
    @Override
    public IWeather createWeather() {
	return new DryWeather();
    }

    @Override
    public IAnimal createAnimal() {
	return new ScorpionAnimal();
    }

    @Override
    public IPlant createPlant() {
	return new CactusPlant();
    }
}

// ======= The tropical zone =======

class TropicalVegetation implements AbstractVegetation {
    @Override
    public IWeather createWeather() {
	return new RainyWeather();
    }

    @Override
    public IAnimal createAnimal() {
	return new PythonAnimal();
    }

    @Override
    public IPlant createPlant() {
	return new BananaPlant();
    }
}
