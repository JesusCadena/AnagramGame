//Castellano
/*Copyright (c) 2010, Oráculo.
Todos los derechos reservaron.

* Redistribución y uso dentro de fuente y formas binarias, con o sin
* modificación, es permitted con tal que las condiciones siguientes son conocidas:

* * las redistribuciones de código de fuente tienen que retener el encima aviso de copyright,
* esta lista de condiciones y el siguiente disclaimer.
* * Las redistribuciones en forma binaria tienen que reproducir el encima aviso
* de copyright, esta lista de condiciones y el siguiente disclaimer en
* la documentación y/u otros materiales proporcionados con la distribución.
* * Tampoco el nombre de Oráculo ni los nombres de sus
* colaboradores pueden soler aprobar o promover los productos derivaron
* de este software sin permiso escrito previo específico.

* ESTE SOFTWARE ES PROPORCIONADO POR LOS TITULARES de COPYRIGHT Y COLABORADORES
* "MIENTRAS ES" Y CUALESQUIERA EXPRESAN O IMPLICÓ GARANTÍAS, INCLUYENDO, PERO NO
* LIMITADO A, LO IMPLICÓ GARANTÍAS DE MERCHANTABILITY Y FITNESS POR
* Un PROPÓSITO PARTICULAR ES DISCLAIMED. EN NINGÚN ACONTECIMIENTO EL COPYRIGHT 
* OWNER O COLABORADORES SER PROPENSO POR CUALQUIER DIRECTO, INDIRECTO, INCIDENTAL, 
* ESPECIAL, EJEMPLAR, O DAÑOS CONSIGUIENTES (INCLUYENTE, PERO NO LIMITADO 
* A, APROVISIONAMIENTO DE BIENES de SUSTITUTO O SERVICIOS; PÉRDIDA De USO, DATO, O 
BENEFICIOS; O INTERRUPCIÓN EMPRESARIAL) AUN ASÍ CAUSADO Y EN CUALQUIER TEORÍA DE
RESPONSABILIDAD, SI DENTRO DE CONTRATO, RESPONSABILIDAD ESTRICTA, O TORCIDO (INCLUYENTE
* NEGLIGENCIA O DE LO CONTRARIO) SURGIENDO EN CUALQUIER MANERA FUERA DEL USO De ESTE
* SOFTWARE, INCLUSO SI ACONSEJADO DE LA POSIBILIDAD DE TAL DAÑO. 
*/

/* Anagram Aplicación de juego /
//Catalán
/*
*Copyright (c) 2010, Oracle.
* Tots els drets van reservar.
*
* Redistribució i ús dins font i formes binàries, amb o sense
* modificació, és permitted amb la condició que les condicions següents són conegudes:
*
* les redistribucions de codi de font han de retenir el damunt avís de copyright,
* aquesta llista de condicions i el següent disclaimer.
* Les redistribucions en forma binària han de reproduir el damunt avís
* de copyright, aquesta llista de condicions i el següent disclaimer en
* la documentació i/o altres materials proporcionats amb la distribució.
* Tampoc el nom d'Oracle ni els noms dels seus
* col·laboradors poden soler aprovar o promoure els productes van derivar
* d'aquest programari sense permís escrit previ específic.

* AQUEST PROGRAMARI ÉS PROPORCIONAT PELS TITULARS de COPYRIGHT I COL·LABORADORS
* "MENTRE ÉS" I QUALSSEVOL EXPRESSEN O va IMPLICAR GARANTIES, INCLOENT, PERÒ NO
* LIMITAT A, EL va IMPLICAR GARANTIES DE MERCHANTABILITY I FITNESS PER
* Un PROPÒSIT PARTICULAR ÉS DISCLAIMED. EN CAP ESDEVENIMENT EL COPYRIGHT 
* OWNER O COL·LABORADORS SER PROPENS PER QUALSEVOL DIRECTE, INDIRECTE, INCIDENTAL, 
* ESPECIAL, EXEMPLAR, O DANYS CONSEGÜENTS (INCLOENT, PERÒ NO LIMITAT 
* A, APROVISIONAMENT DE BÉNS de SUBSTITUT O SERVEIS; PÈRDUA D'ÚS, DADA, O
* BENEFICIS; O INTERRUPCIÓ EMPRESARIAL) TANMATEIX CAUSAT I EN QUALSEVOL TEORIA DE
* RESPONSABILITAT, SI DINS CONTRACTE, RESPONSABILITAT ESTRICTA, O TORT (INCLOENT
* NEGLIGÈNCIA O ALTRAMENT) SORGINT EN QUALSEVOL MANERA FORA DE L'ÚS D'AQUEST
* PROGRAMARI, FINS I TOT SI ACONSELLAT DE LA POSSIBILITAT DE TAL DANY. 
*/

/* Anagram Aplicació de joc */

/*
 * Copyright (c) 2010, Oracle.
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *  * Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 *  * Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the distribution.
 *  * Neither the name of Oracle nor the names of its
 *    contributors may be used to endorse or promote products derived
 *    from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT 
 * OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, 
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED 
 * TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. 
 */

/* Anagram Game Application */

package com.toy.anagrams.lib;

/**
 * Implementation of the logic for the Anagram Game application.
 */
final class StaticWordLibrary extends WordLibrary {

    private static final String[] WORD_LIST = {
        "abstraction",
        "ambiguous",
        "arithmetic",
        "backslash",
        "bitmap",
        "circumstance",
        "combination",
        "consequently",
        "consortium",
        "decrementing",
        "dependency",
        "disambiguate",
        "dynamic",
        "encapsulation",
        "equivalent",
        "expression",
        "facilitate",
        "fragment",
        "hexadecimal",
        "implementation",
        "indistinguishable",
        "inheritance",
        "internet",
        "java",
        "localization",
        "microprocessor",
        "navigation",
        "optimization",
        "parameter",
        "patrick",
        "pickle",
        "polymorphic",
        "rigorously",
        "simultaneously",
        "specification",
        "structure",
        "lexical",
        "likewise",
        "management",
        "manipulate",
        "mathematics",
        "hotjava",
        "vertex",
        "unsigned",
        "traditional"};

    private static final String[] SCRAMBLED_WORD_LIST = {
        "batsartcoin",
        "maibuguos",
        "ratimhteci",
        "abkclssha",
        "ibmtpa",
        "iccrmutsnaec",
        "ocbmnitaoni",
        "ocsnqeeutnyl",
        "ocsnroitmu",
        "edrcmeneitgn",
        "edepdnneyc",
        "idasbmgiauet",
        "ydanicm",
        "neacsplutaoni",
        "qeiuaveltn",
        "xerpseisno",
        "aficilatet",
        "rfgaemtn",
        "ehaxedicalm",
        "milpmeneatitno",
        "niidtsniugsiahleb",
        "niehiratcen",
        "nietnret",
        "ajav",
        "olacilazitno",
        "imrcpoorecssro",
        "anivagitno",
        "poitimazitno",
        "aparemert",
        "aprtcki",
        "ipkcel",
        "opylomprich",
        "irogorsuyl",
        "isumtlnaoesuyl",
        "psceficitaoni",
        "tsurtcreu",
        "elixalc",
        "ilekiwse",
        "amanegemtn",
        "aminupalet",
        "amhtmetacsi",
        "ohjtvaa",
        "evtrxe",
        "nuisngde",
        "rtdatioialn"
    };
    
    final static WordLibrary DEFAULT = new StaticWordLibrary();

    /**
     * Singleton class.
     */
    private StaticWordLibrary() {
    }

    /**
     * Gets the word at a given index.
     * @param idx index of required word
     * @return word at that index in its natural form
     */
    public String getWord(int idx) {
        return WORD_LIST[idx];
    }

    /**
     * Gets the word at a given index in its scrambled form.
     * @param idx index of required word
     * @return word at that index in its scrambled form
     */
    public String getScrambledWord(int idx) {
        return SCRAMBLED_WORD_LIST[idx];
    }

    /**
     * Gets the number of words in the library.
     * @return the total number of plain/scrambled word pairs in the library
     */
    public int getSize() {
        return WORD_LIST.length;
    }

    /**
     * Checks whether a user's guess for a word at the given index is correct.
     * @param idx index of the word guessed
     * @param userGuess the user's guess for the actual word
     * @return true if the guess was correct; false otherwise
     */
    public boolean isCorrect(int idx, String userGuess) {
        return userGuess.equals(getWord(idx));
    }

}
