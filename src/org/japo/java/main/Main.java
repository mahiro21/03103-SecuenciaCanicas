/* 
 * Copyright 2019 Mario Merlos Abella - mario.merlos.alum@iescamp.es
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;


/**
 *
 * @author Mario Merlos Abella - mario.merlos.alum@iescamp.es
 */
public final class Main {

    public static void main(String[] args) {

        // Variables
        int canicasLeft;

        //Constantes
        final String NAME_CANICA = "Ruperta";
        final int CANICAS_INI = 5;
        final int CANICAS_FIN = 1;

        System.out.printf("Secuencia de Canicas%n====================%n");
        System.out.printf("Nombre de la canica ........: %s%n", NAME_CANICA);
          System.out.printf("---%n");
        System.out.printf("Número de canicas inicial ..: %d%n", CANICAS_INI);
        System.out.printf("Número de canicas final ....: %d%n", CANICAS_FIN);
        canicasLeft = CANICAS_INI - CANICAS_FIN;
        System.out.printf("---%n");
        System.out.printf("Número de canicas perdidas .: %d%n", canicasLeft);

    }
}
