package com.techelevator;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Exercises {

	/*
	 * Map Exercises
	 */

	/*
	 * Given the name of an animal, return the name of a group of that animal
	 * (e.g. "Elephant" -> "Herd", "Rhino" - "Crash").
	 *
	 * The animal name should be case insensitive so "elephant", "Elephant", and
	 * "ELEPHANT" should all return "herd".
	 *
	 * If the name of the animal is not found, null, or empty, return "unknown".
	 *
	 * Rhino -> Crash
	 * Giraffe -> Tower
	 * Elephant -> Herd
	 * Lion -> Pride
	 * Crow -> Murder
	 * Pigeon -> Kit
	 * Flamingo -> Pat
	 * Deer -> Herd
	 * Dog -> Pack
	 * Crocodile -> Float
	 *
	 * animalGroupName("giraffe") → "Tower"
	 * animalGroupName("") -> "unknown"
	 * animalGroupName("walrus") -> "unknown"
	 *
	 */
	public String animalGroupName(String animalName) {
		
		Map<String, String> animal = new HashMap<String, String>();
		
		animal.put("rhino", "Crash");
		animal.put("giraffe", "Tower");
		animal.put("elephant", "Herd");
		animal.put("lion", "Pride");
		animal.put("crow", "Murder");
		animal.put("pigeon", "Kit");
		animal.put("flamingo", "Pat");
		animal.put("deer", "Herd");
		animal.put("dog", "Pack");
		animal.put("crocodile", "Float");
		//Set<String> keys = animal.keySet();
		//for(String animalNames : keys)
		
		if(animal.containsKey(animalName.toLowerCase()))
		{
			return animal.get(animalName.toLowerCase());
		}
			else {
				return "unknown";
			}
		}

	/*
	 * Given an String item number (a.k.a. SKU), return the discount percentage if the item is on sale.
	 * If the item is not on sale, return 0.00.
	 *
	 * If the item number is empty or null, return 0.00.
	 *
	 * "KITCHEN4001" -> 0.20
	 * "GARAGE1070" -> 0.15
	 * "LIVINGROOM"	-> 0.10
	 * "KITCHEN6073" -> 0.40
	 * "BEDROOM3434" -> 0.60
	 * "BATH0073" -> 0.15
	 *
	 * The item number should be case insensitive so "kitchen4001", "Kitchen4001", and "KITCHEN4001"
	 * should all return 0.20.
	 *
	 * isItOnSale("kitchen4001") → 0.20
	 * isItOnSale("") → 0.00
	 * isItOnSale("GARAGE1070") → 0.15
	 * isItOnSale("dungeon9999") → 0.00
	 *
	 */
	public Double isItOnSale(String itemNumber) {
		
		Map<String, Double> isItOnSale = new HashMap<String, Double>();
		
		isItOnSale.put("KITCHEN4001", 0.20);
		isItOnSale.put("GARAGE1070", 0.15);
		isItOnSale.put("LIVINGROOM", 0.10);
		isItOnSale.put("BEDROOM3434", 0.60);
		isItOnSale.put("BATH0073", 0.15);
		isItOnSale.put("KITCHEB6073", 0.40);
		
		if(isItOnSale.containsKey(itemNumber.toUpperCase()))
		{
			return isItOnSale.get(itemNumber.toUpperCase());
		}
	
		return 0.00;
	}

	/*
	 * Modify and return the given map as follows: if "Peter" has more than 0 money, transfer half of it to "Paul",
	 * but only if Paul has less than $10s.
	 *
	 * Note, monetary amounts are specified in cents: penny=1, nickel=5, ... $1=100, ... $10=1000, ...
	 *
	 * robPeterToPayPaul({"Peter": 2000, "Paul": 99}) → {"Peter": 1000, "Paul": 1099}
	 * robPeterToPayPaul({"Peter": 2000, "Paul": 30000}) → {"Peter": 2000, "Paul": 30000}
	 *
	 */
	public Map<String, Integer> robPeterToPayPaul(Map<String, Integer> peterPaul) {
		
		
		Map<String, Integer> robPeterToPayPaul = new HashMap<String, Integer>();
		
		if(peterPaul.get("Peter") > 0 && peterPaul.get("Paul") < 1000) 
		{
			 robPeterToPayPaul.put("Paul", peterPaul.get("Peter")/2 + peterPaul.get("Paul"));
			 robPeterToPayPaul.put("Peter", peterPaul.get("Peter")- peterPaul.get("Peter")/2);
			 return robPeterToPayPaul;
		}
		
		return peterPaul;
	}

    /*
	 * Modify and return the given map as follows: if "Peter" has $50 or more, AND "Paul" has $100 or more,
	 * then create a new "PeterPaulPartnership" worth a combined contribution of a quarter of each partner's
	 * current worth.
	 *
	 * peterPaulPartnership({"Peter": 5000, "Paul": 10000}) → {"Peter": 3750, "Paul": 7500, "PeterPaulPartnership": 3750}
	 * peterPaulPartnership({"Peter": 3333, "Paul": 1234567890}) → {"Peter": 3333, "Paul": 1234567890}
	 *
	 */
	public Map<String, Integer> peterPaulPartnership(Map<String, Integer> peterPaul) {
		
		
		if(peterPaul.get("Peter") >= 50 && peterPaul.get("Paul") >= 100) 
		{
			int petersWorth = (peterPaul.get("Peter") - (int) (peterPaul.get("Peter")* .25));                     //I can't figure this one out? spent about 3 hours off an on. 
			int paulsWorth = (peterPaul.get("Paul") - (int) (peterPaul.get("Paul")* .25));
			int peterPaulPartnership = (int) ((peterPaul.get("Peter") * .25) + (int) (peterPaul.get("Paul")* .25));
			
			peterPaul.put("Peter", petersWorth);
			peterPaul.put("Paul", paulsWorth);
			peterPaul.put("PeterPaulPartnership",peterPaulPartnership);
		}
		return peterPaul;
	}
	/*
	 * Given an array of non-empty strings, return a Map<String, String> where for every different string in the array,
	 * there is a key of its first character with the value of its last character.
	 *
	 * beginningAndEnding(["code", "bug"]) → {"b": "g", "c": "e"}
	 * beginningAndEnding(["man", "moon", "main"]) → {"m": "n"}
	 * beginningAndEnding(["muddy", "good", "moat", "good", "night"]) → {"g": "d", "m": "t", "n": "t"}
	 */
	public Map<String, String> beginningAndEnding(String[] words) {
		
		Map<String,String> beginningAndEnding = new HashMap<String, String>();
		
		for(String beginAndEnd : words) {
			String firstLetter = beginAndEnd.substring(0, 1);
			String lastLetter = beginAndEnd.substring(beginAndEnd.length()-1, beginAndEnd.length());
			beginningAndEnding.put(firstLetter, lastLetter);
		}
		return beginningAndEnding;
	}

	/*
	 * Given an array of strings, return a Map<String, Integer> with a key for each different string, with the value the
	 * number of times that string appears in the array.
	 *
	 * ** A CLASSIC **
	 *
	 * wordCount(["a", "b", "a", "c", "b"]) → {"b": 2, "c": 1, "a": 2}
	 * wordCount([]) → {}
	 * wordCount(["c", "b", "a"]) → {"b": 1, "c": 1, "a": 1}
	 *
	 */
	public Map<String, Integer> wordCount(String[] words) {
		
		Map<String, Integer> wordCount = new HashMap<String, Integer>();
		
		for(String letterChar : words) {
			
			if(!wordCount.containsKey(letterChar)) {
				wordCount.put(letterChar, 1);                  //foreach loop to loop through all entries
			}
			else {
				int countLetters = wordCount.get(letterChar);
				wordCount.put(letterChar, countLetters + 1);
			}
		}
		return wordCount;
	}

	/*
	 * Given an array of int values, return a Map<Integer, Integer> with a key for each int, with the value the
	 * number of times that int appears in the array.
	 *
	 * ** The lesser known cousin of the the classic wordCount **
	 *
	 * integerCount([1, 99, 63, 1, 55, 77, 63, 99, 63, 44]) → {1: 1, 44: 1, 55: 1, 63: 3, 77: 1, 99:2}
	 * integerCount([107, 33, 107, 33, 33, 33, 106, 107]) → {33: 4, 106: 1, 107: 3}
	 * integerCount([]) → {}
	 *
	 */
	public Map<Integer, Integer> integerCount(int[] ints) {
		
		Map<Integer, Integer> integerCount = new HashMap<Integer, Integer>();
		
			for(Integer values : ints) {
			
			if(!integerCount.containsKey(values)) {
				integerCount.put(values, 1);                  //Comments to myself:for each ints placed in values variable, if the value is not currently in the integerCount 
			}												  //HashMap assign the integer value a Key and a value of 1 in the HashMap. Else, if the HashMap contains
			else {											  //the integer value then get the current integercount value from the HashMap and plus 1 additional value before
				int countValues = integerCount.get(values);   //putting back into Hashmap.
				integerCount.put(values, countValues + 1);
			}
		}
		return integerCount;
	}

	/*
	 * Given an array of strings, return a Map<String, Boolean> where each different string is a key and value
	 * is true only if that string appears 2 or more times in the array.
	 *
	 * wordMultiple(["a", "b", "a", "c", "b"]) → {"b": true, "c": false, "a": true}
	 * wordMultiple(["c", "b", "a"]) → {"b": false, "c": false, "a": false}
	 * wordMultiple(["c", "c", "c", "c"]) → {"c": true}
	 *
	 */
	public Map<String, Boolean> wordMultiple(String[] words) {
		
		Map<String, Boolean> wordMultiple = new HashMap<String, Boolean>();
			
		 
			for(String letterChar : words) {
				
				if(!wordMultiple.containsKey(letterChar)){
					wordMultiple.put(letterChar, false);
				}
				else {
					wordMultiple.put(letterChar, true);
				}
			}
		return wordMultiple;
	}

	/*
	 * Given two maps, Map<String, Integer>, merge the two into a new map, Map<String, Integer> where keys in Map2,
	 * and their Integer values, are added to the Integer values of matching keys in Map1. Return the new map.
	 *
	 * Unmatched keys and their Integer values in Map2 are simply added to Map1.
	 *
	 * consolidateInventory({"SKU1": 100, "SKU2": 53, "SKU3": 44} {"SKU2":11, "SKU4": 5})
	 * 	 → {"SKU1": 100, "SKU2": 64, "SKU3": 44, "SKU4": 5}
	 *
	 */
	public Map<String, Integer> consolidateInventory(Map<String, Integer> mainWarehouse, Map<String, Integer> remoteWarehouse) {
	
		Map<String, Integer> inventoryNewKey = new HashMap<String, Integer>();
		
		for (Map.Entry<String, Integer> e : remoteWarehouse.entrySet() )
			 
		
		mainWarehouse.forEach((k, v) -> remoteWarehouse.merge(k, v);
		
		if(mainWarehouse.containsKey(remoteWarehouse)) {				//Need assistance
			int remoteValue = remoteWarehouse.get(" ");
			int mainValue = mainWarehouse.get(" ");
		}
	
		return inventoryNewKey;
	}
	/*
	 * Just when you thought it was safe to get back in the water --- last2Revisited!!!!
	 *
	 * Given an array of strings, for each string, the count of the number of times that a substring length 2 appears
	 * in the string and also as the last 2 chars of the string, so "hixxxhi" yields 1.
	 *
	 * We don't count the end substring, but the substring may overlap a prior position by one.  For instance, "xxxx"
	 * has a count of 2, one pair at position 0, and the second at position 1. The third pair at position 2 is the
	 * end substring, which we don't count.
	 *
	 * Return Map<String, Integer>, where the key is string from the array, and its last2 count.
	 *
	 * last2Revisited(["hixxhi", "xaxxaxaxx", "axxxaaxx"]) → {"hixxhi": 1, "xaxxaxaxx": 1, "axxxaaxx": 2}
	 *
	 */
	public Map<String, Integer> last2Revisited(String[] words) {
		
		Map<String, Integer> last2Revisited = new HashMap<String, Integer>();          //need assistance
		
		for(String revisited : words) {
			String firstCharacters = revisited.substring(0, 1);
		}
		return last2Revisited;	}

	/*
	 Given a list of Strings, return a list that contains the distinct values. In other words, no value is to be
	 included more than once in the returned list. (Hint: Think Set)
	 distinctValues( ["red", "yellow", "green", "yellow", "blue", "green", "purple"] ) -> ["red", "yellow", "green", "blue", "purple"]
	 distinctValues( ["jingle", "bells", "jingle", "bells", "jingle", "all", "the", "way"] ) -> ["jingle", "bells", "all", "the", "way"]
	 */
	public List<String> distinctValues(List<String> stringList) {
				
		Set<String> distinctValues = new LinkedHashSet<String>();
		
		distinctValues.addAll(stringList);              //added all elements of stringList to the LinkedHashSet...tried a HashSet but wasn't working found this set and it works!!
		
		stringList.clear();                            //Clears the list provided of all values...LinkedHashSet doesn't allow duplicates so duplicate..when attempting to return distinctValues received error  
		
		stringList.addAll(distinctValues);
		
		return stringList;
	}
}
	
