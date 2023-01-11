## Number To Words

### Description

Write a method called <b>numberToWords</b> with one <b>int</b> parameter named <b>number</b>. The method should print out the passed number using words for the digits. If the number is negative, print "Invalid Value".

Write a second method called <b>reverse</b>. The method <b>reverse</b> should have one <b>int</b> parameter and return the reversed number (<b>int</b>). For example, if the number passed is 234, then the reversed number would be 432. The method <b>reverse</b> should also reverse negative numbers. Use the method <b>reverse</b> within the method <b>numberToWords</b> in order to print the words in the correct order.

Write a third method called <b>getDigitCount</b>. The method <b>getDigitCount</b> should have one <b>int</b> parameter called number and return the count of the digits in that number. If the number is negative, return -1 to indicate an invalid value. 

### Examples of input/output

<ul>
<li>getDigitCount(0); should return 1 since there is only 1 digit</li>
<li>getDigitCount(123); should return 3</li>
<li>getDigitCount(-12); should return -1 since the parameter is negative</li>
<li>getDigitCount(5200); should return 4 since there are 4 digits in the number</li>
</ul>

### Examples of input/output

<ul>
<li>reverse(-121); should  return -121</li>
<li>reverse(1212); should return  2121</li>
<li>reverse(1234); should return 4321</li>
<li>reverse(100); should return 1</li>
</ul>

### Examples of input/output

<ul>
<li>numberToWords(123); should print "One Two Three".</li>
<li>numberToWords(1010); should print "One Zero One Zero".</li>
<li>numberToWords(1000); should print "One Zero Zero Zero".</li>
<li>numberToWords(-12); should print "Invalid Value" since the parameter is negative.</li>
</ul>
