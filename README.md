# Anagrams Finder
CS 3310 - Design and Analysis of Algorithms: Program Assignment 2

This program output the detected sets of anagrams for a given word file.

## Description
An anagram is a word or phrase that is created by rearranging the letters of another word or phrase. For example, the words “eat”, “ate”, and “tea” are anagrams of one another.

This program accepts the name of a file on the command line. The file will contain an unknown number of words, with a single word on each line. The program will read the file and store the words internally in an appropriate format. 

The program will then find all sets of anagrams of words in the file in an efficient manner. The anagram-detection algorithms should ignore distinctions between upper-case and lower-case letters. For example, “Elvis” and “lives” should be identified as anagrams of one another.

An example of an input file is as follows:
```
Florine
Florine's
Florsheim
Florsheim's
Flory
Flory's
Flossie
Flossie's
Flowers
Floyd
Flynn
Flynn's
Fm
Fm's
Foch
Fokker
Foley
```

The output should look (something) like:
```
Anagram Sets:

[ilks, silk]
[ikon, oink]
[inks, sink, skin]
[despoil, spoiled]
[copula, cupola]
[Bohemian, bohemian]
[Kris, irks, risk]
[Flowers, flowers]
[Victor's, victor's]
[kits, skit]
[kiss, skis]
[Northwest's, northwest's]
[enumeration's, mountaineer's]
[Deloris, soldier, solider]
...
```

## Project Hierarchy
```
.
├── input
│   └── words.txt
├── output
│   └── SampleOutput.txt
├── prompt
│   ├── grade2.pdf
│   └── prog2.pdf
├── src
│   ├── AnagramFinder.java
│   └── Prog2.java
├── README.md
├── WRITEUP.md
└── .gitignore
```

## Usage
To use the program:

- Add your input file to `/input` folder
- Navigate to the /src directory by `cd src`
- Run `javac Prog2.java` and `java Prog2 <YOUR_INPUT_FILE>` (or `java Prog2 words.txt` for the sample input file)
- The program will output the sets of anagrams in your input file
