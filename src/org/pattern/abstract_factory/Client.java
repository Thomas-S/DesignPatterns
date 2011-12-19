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

import java.util.ArrayList;
import java.util.List;

/**
 * A possible Client.
 * 
 * @author Thomas Schulz
 * @version 1.0
 */
public class Client {

    private Client() {
    };

    /**
     * Creates a new vegetation.
     * 
     * @param vegetation
     *            An abstract vegetation for which the products shall be
     *            created.
     * @return A list of string representations of the products.
     */
    private static List<String> createVegetation(AbstractVegetation vegetation) {
	List<String> list = new ArrayList<String>();

	// product implementations of ConcreteFactory
	IWeather weather = vegetation.createWeather();
	IAnimal animal = vegetation.createAnimal();
	IPlant plant = vegetation.createPlant();

	// product methods
	list.add(weather.startWeather());
	list.add(animal.getAnimalAction());
	list.add(plant.getNameOfPlant());

	return list;
    }

    // ESCA-JAVA0266:
    private static void printVegetation(List<String> stringVegetation) {
	for (String s : stringVegetation) {
	    System.out.println(s);
	}
	System.out.println("=====");
    }

    /**
     * The main method.
     * 
     * @param args
     */
    public static void main(String[] args) {
	// exchangability at this point
	AbstractVegetation vegetation = new TropicalVegetation();
	printVegetation(createVegetation(vegetation));

	// exchangability at this point
	vegetation = new DesertVegetation();
	printVegetation(createVegetation(vegetation));

    }

}
