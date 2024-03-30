/***************************************************************/
/* Evelyn Vu                                                   */
/* Login ID: evu                                               */
/* CS 3310, Spring 2024                                        */
/* Programming Assignment 2                                    */
/* AnagramFinder class: functions to find anagrams             */
/***************************************************************/

import java.io.*;
import java.util.*;

class AnagramFinder {
    
    private Map<String, List<String>> anagramMap;
    private File filename;

    // Constructor
    AnagramFinder(File filename) {
        this.anagramMap = new HashMap<String, List<String>>();
        this.filename = filename;
    }


    /**************************************************************/
    /* Method: process                                            */
    /* Purpose: Read input file and find all anagrams             */
    /**************************************************************/

    void process() throws Exception{
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String word;
        while ((word = br.readLine()) != null) {
            String key = sortWord(word);
            anagramMap.putIfAbsent(key, new ArrayList<>());
            anagramMap.get(key).add(word);
        }
        br.close();
    }


    /**************************************************************/
    /* Method: printResult                                        */
    /* Purpose: Print the result in proper format                 */
    /**************************************************************/

    void printResult() {
        System.out.println("Anagram Sets:\n");
        for (List<String> anagramSet : anagramMap.values()) {
            if (anagramSet.size() > 1) {
                System.out.println(anagramSet);
            }
        }
    }


    /**************************************************************/
    /* Method: sortWord                                           */
    /* Purpose: Using presorting before finding anagrams          */
    /* Parameters:                                                */
    /* String[] word: Single word from list of words              */
    /**************************************************************/

    private String sortWord(String word) {
        char[] chars = word.toLowerCase().toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}