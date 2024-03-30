The theoretical worst-case running time of this algorithm is O(n * m * log(m)), where n is the number of words in the input file and m is the maximum length of a word. This is because:

Reading the file and iterating over the words takes O(n) time.
For each word, sorting its characters takes O(m * log(m)) time in the worst case (using a comparison-based sorting algorithm like Arrays.sort()).
Inserting into the hash map takes O(1) time on average.
Printing the anagram sets takes O(n) time.
So, the overall worst-case time complexity is dominated by the sorting step, resulting in O(n * m * log(m)).