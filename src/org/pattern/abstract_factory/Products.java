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

//==================================
// ======= Abstract Products =======
//==================================

interface IWeather {
    /**
     * @return A string representation of the weather.
     */
    String startWeather();
}

interface IAnimal {
    /**
     * @return A string representation of the animal.
     */
    String getAnimalAction();
}

interface IPlant {
    /**
     * @return A string representation of the plant.
     */
    String getNameOfPlant();
}

// =================================
// ======= Concrete Products =======
// =================================

//======= Weather =======

class DryWeather implements IWeather {

    @Override
    public String startWeather() {
	return "It's really dry and there is almost no water around...";
    }
}

class RainyWeather implements IWeather {

    @Override
    public String startWeather() {
	return "It's hot and rainy all the time...";
    }
}

//======= Animal =======

class ScorpionAnimal implements IAnimal {

    @Override
    public String getAnimalAction() {
	return "A scorpion circles you and raises its sting.";
    }
}

class PythonAnimal implements IAnimal {

    @Override
    public String getAnimalAction() {
	return "You see a python snake eating a gecko.";
    }
}

//======= Plant =======

class CactusPlant implements IPlant {

    @Override
    public String getNameOfPlant() {
	return "This cactus looks really boring.";
    }
}

class BananaPlant implements IPlant {

    @Override
    public String getNameOfPlant() {
	return "That banana over there is almost yellow.";
    }
}
