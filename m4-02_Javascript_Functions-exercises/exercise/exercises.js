/** 
 *
 * Document this function
 * @param {number} month Displays the month as a number 1 - 12
 * @param {number}  day Displays the date as a number 
 * @param {string} hemisphere displays the hemisphere
 * @returns {boolean} Determines if month and day is summer
 */
function isSummer(month, day = 1, hemisphere = 'northern') {
  if (month === 7 || month === 8) {
    return hemisphere === 'northern';
  } else if (month === 6 && day >= 20) {
    return hemisphere === 'northern';
  } else if (month === 9 && day <= 20) {
    return hemisphere === 'northern';
  } else if (month === 1 || month === 2) {
    return hemisphere === 'southern';
  } else if (month === 12 && day >= 20) {
    return hemisphere === 'southern';
  } else if (month === 3 && day <= 20) {
    return hemisphere === 'southern';
  } else {
    return false;
  }
}

/**
 * Write a function called isAdmitted. It will check entrance
 * scores and return true if the students is admitted and
 * false if rejected. It takes three parameters:
 *
 *     * gpa
 *     * satScore (optional)
 *     * recommendation (optional)
 *
 * We admit them--return true--if:
 * gpa is above 4.0 OR
 * SAT score is above 1300 OR
 * gpa above 3.0 and they have a recommendation OR
 * SAT score is above 1200 and they have a recommendation
 * OTHERWISE reject it
 *
 * @param {number} gpa the GPA of the student, between 4.2 and 1.0
 * @param {number} [satScore=0] the student's SAT score
 * @param {boolean} [recommendation=false] does the student have a recommendation
 * @returns {boolean} true if they are admitted
 */
function isAdmitted(gpa, satScore = 0, recommendation = false) {
  if (gpa > 4.0 || satScore > 1300){
    return true;
  }else if(gpa > 3.0 && recommendation == true){
    return true;
  }else if(satScore > 1200 && recommendation == true){
    return true;
  }else{
    return false;
  }

}

/**
 * Write a function so that it takes an anonymous function and
 * uses that in `unfilteredArray` filter function. Return the result.
 *
 * @param {function} filterFunction the function to filter with
 * @returns {number[]} the filtered array
 */

 //I did this for you ;-)
let unfilteredArray = [1, 2, 3, 4, 5, 6];
function useParameterToFilterArray(filterFunction) {
  return unfilteredArray.filter(filterFunction);
}

/**
 * Write a function called makeNumber to take two strings
 * of digits, concatenate them together, and then return
 * the value back as a number.
 *
 * So if two strings are passed in "42293" and "443", then this function
 * should return thnumber 42293443.
 *
 * @param {string} first the first string of digits to concatenate
 * @param {string} [second=''] the second string of digits to concatenate
 * @returns {number} the resultant number
 */
function makeNumber(first, second = ''){
  let number = first + second;
  return Number(number);

}
/**
 * Write a function that takes an unknown number of parameters
 * and adds them all together. Return the result.
 *
 * @param {...number} num a series of numbers to add together
 * @returns {number} the sum of all the parameters (or arguments)
 */
function addAll(){   //not the simplest way but unsure why reduce not working
  let sum = 0;
  for(let i=0; i <arguments.length; i++){
  sum += arguments[i];
  }
    return sum;
}

/** 
 * Write and document a function called makeHappy that takes
 * an array and prepends 'Happy ' to the beginning of all the
 * words and returns them as a new array. Use the `map` function.
 * 
 * @param {string} arrayWords array of words
 * @returns {string} new array with Happy prepended to beginning of word
 */
function makeHappy(arrayWords){
  return arrayWords.map(
    (value) => {
     return "Happy "+ value;
    }
  )
}
/**
 * Write and document a function called getFullAddressesOfProperties
 * that takes an array of associative arrays containing the
 * following keys:
 *     * streetNumber
 *     * streetName
 *     * streetType
 *     * city
 *     * state
 *     * zip
 *
 * and returns an array of strings that turns the associative array
 * into mailing addresses in the form of:
 *     streetNumber streetName streetType city state zip
 *
 * Use `map` and an anonymous function.
 * 
 * @return {string}  an array of addresses
 */
function getFullAddressesOfProperties(fullAddress){
  return fullAddress.map((address) => {
  return address.streetNumber + ' ' + address.streetName + ' ' 
    + address.streetType + ' '+address.city+ ' ' +address.state+ ' '+address.zip; })
  }



/** 
 * Create and document a function called findLargest.
 *
 * Using `forEach`, find the largest element in an array.
 * It should work for strings and numbers.
 * @param {string} array  an array that passes in all of the String and number elements
 */
function findLargest(array) {
  let largestNumber = array[0];
  
  array.forEach((element) => {
  if (typeof element === 'string') {
  if (element > largestNumber) {
  largestNumber = element;
  }
  }
  else {
  elementNumber = parseInt(element);
  if (elementNumber > largestNumber) {
  largestNumber = elementNumber;
  }
  }
  });
  
  return largestNumber;
  }
  
  
/*
 * CHALLENGE
 * Create and document a function called getSumOfSubArrayValues.
 *
 * Take an array of arrays and add up all sub values and return
 * the sum. For instance, if you got this array as a parameter:
 * [
 *   [1, 2, 3],
 *   [2, 4, 6],
 *   [5, 10, 15]
 * ];
 *
 * You would return 48. To do this, you will use two nested `reduce`
 * calls with two anonymous functions.
 *
 * Read the tests to verify you have the correct behavior.
 * 
 */
