/***************************************************************/
/* Evelyn Vu                                                   */
/* Login ID: evu                                               */
/* CS 3310, Spring 2024                                        */
/* Programming Assignment 2                                    */
/* Prog2 class: With an word text file as input, output        */
/*              the sets of anagrams                           */
/***************************************************************/

import java.io.File;

public class Prog2 {
    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            System.out.println("Usage: java Prog2 <filename>");
            return;
        }

        File filename = new File("../input/" + args[0]);
        AnagramFinder anagram = new AnagramFinder(filename);
        anagram.process();
        anagram.printResult();
    }
}
