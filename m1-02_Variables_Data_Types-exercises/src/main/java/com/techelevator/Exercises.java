package com.techelevator;

public class Exercises {

	private static final String Final = null;
	private static int percentageOfTripCompleted;

	public static void main(String[] args) {

        /*
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */

		// ### EXAMPLE:
		int initialNumberOfBirds = 4;
		int birdsThatFlewAway = 1;
		int remainingNumberOfBirds = initialNumberOfBirds - birdsThatFlewAway;

        /*
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */

		// ### EXAMPLE:
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;

		
        /*
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */
		int numberOfRacoonsPlaying = 3;
		int numberOfRacoonsThatLeft = 2;
		int remainingNumberOfRacoons = numberOfRacoonsPlaying - numberOfRacoonsThatLeft;
		System.out.println(remainingNumberOfRacoons);

		
        /*
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */
		int numberOfFlowers = 5;
		int numberOfBees = 3;
		int numberOfLessBees = numberOfFlowers - numberOfBees;
		System.out.println(numberOfLessBees);

        /*
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */
		int initialNumberOfPigeons = 1;
		int numberOfAdditionalPigeons = 1;
		int totalNumberOfPigeons = initialNumberOfPigeons + numberOfAdditionalPigeons;
		System.out.println(totalNumberOfPigeons);

		/*
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */
		int initialNumberOfOwls = 3;
		int numberOfAdditionalOwls = 2; 
		int totalNumberOfOwls = initialNumberOfOwls + numberOfAdditionalOwls;
        
		System.out.println(totalNumberOfOwls);

		/*
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */
		
		int initialNumberOfBeaversWorking = 2;
		int numberOfBeaversLeft = 1;
		int remainingNumberOfBeaversWorking = initialNumberOfBeaversWorking - numberOfBeaversLeft;
		System.out.println(remainingNumberOfBeaversWorking);

		/*
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */
		int initialNumberOfToucans = 2;
		int numberOfAdditionalToucans = 1;
		int totalNumberOfToucans = initialNumberOfToucans - numberOfAdditionalToucans;

		System.out.println(totalNumberOfToucans);

        /*
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */
		int numberOfSquirrels = 4;
		int numberOfNuts = 2;
		int numberOfExtraSquirrels = numberOfSquirrels - numberOfNuts;
		
		System.out.println(numberOfExtraSquirrels);

		/*
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */
		final double DIME = .10;
		final double QUARTER = .25;
		final double NICKEL = .05;
		
		int numberOfQuarters = 1;
		int numberOfDimes = 1;
		int numberOfNickels = 2;
		
		double totalAmountOfMoneyFound = (QUARTER * numberOfQuarters)  + (DIME * numberOfDimes) + (NICKEL * numberOfNickels);
		
		System.out.println(totalAmountOfMoneyFound);

        /*
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */
		int numberOfMuffinsBakedMrsBrier = 18;
		int numberOfMuffinsBakedMrsMacAdams = 20;
		int numberOfMuffinsBakedMrsFlannery = 17;
		
		int totalNumberOfMuffinsBaked = numberOfMuffinsBakedMrsBrier + numberOfMuffinsBakedMrsMacAdams + numberOfMuffinsBakedMrsFlannery;
		System.out.println(totalNumberOfMuffinsBaked);

		/*
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
		double amountPaidForYoyo = .24;
		double amountPaidForWhistle = .14;
		double totalAmountSpentForToys = (amountPaidForYoyo + amountPaidForWhistle);
		
		System.out.println("$ " + totalAmountSpentForToys);
        /*
        13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows
        and 10 mini marshmallows. How many marshmallows did she use
        altogether?
        */
		int amountOfLargeMarshmellowsUsed = 8;
		int amountOfMiniMarshmellowsUsed = 10;
		int totalAmountOfMarshmellowsUsed = amountOfLargeMarshmellowsUsed * amountOfMiniMarshmellowsUsed;
		System.out.println(totalAmountOfMarshmellowsUsed);

		/*
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
		float totalInchesOfSnowMrsHiltsHouse = 29;
		float totalInchesOfSnowBrecknockSchool = 17;
		float amountOfExtraSnowMrsHiltsHouse = totalInchesOfSnowMrsHiltsHouse - totalInchesOfSnowBrecknockSchool;
		System.out.println(amountOfExtraSnowMrsHiltsHouse);

		/*
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
		double initialAmountOfMoneyToSpend = 10;
		double costOfToyTruck = 3;
		double costOfPencilCase = 2;
		double totalAmountOfMoneyLeft = initialAmountOfMoneyToSpend - (costOfToyTruck + costOfPencilCase);
		System.out.println(totalAmountOfMoneyLeft);

		/*
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
		int totalAmountOfMarblesInCollection = 16;
		int totalMarblesLost = 7;
		int amountOfMarblesLeft = totalAmountOfMarblesInCollection - totalMarblesLost;
		System.out.println(amountOfMarblesLeft);

		/*
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
		int amountOfSeashellsOnHand = 19;
		int wantedAmountOfSeashells = 25;
		int extraSeashellsNeeded = wantedAmountOfSeashells - amountOfSeashellsOnHand;
		System.out.println(extraSeashellsNeeded);

		/*
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
		int totalBalloons = 17;
		int amountRedBallons = 8;
		int amountGreenBalloons = totalBalloons - amountRedBallons;
		System.out.println(amountGreenBalloons);
		
		/*
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
		int initialAmountOfBooks = 38;
		int numberBooksAdded = 10;
		int totalBooksOnShelf = initialAmountOfBooks + numberBooksAdded;
		System.out.println(totalBooksOnShelf);
		
        /*
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
		int numberOfLegsOnABee = 6;
		int totalNumberOfBees = 8;
		int totalNumberOfLegs = totalNumberOfBees * numberOfLegsOnABee;
		System.out.println(totalNumberOfLegs);
		
		/*
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
		double costOfIceCream = .99;
		int numberOfIceCreamsPurchased = 2;
		double totalAmountSpent = costOfIceCream * numberOfIceCreamsPurchased;
		System.out.println(totalAmountSpent);
		
		/*
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
		int numberOfRocksOnHand = 64;
		int totalNumberOfRocksRequired = 125;
		int additionalRocksNeeded = totalNumberOfRocksRequired - numberOfRocksOnHand;
		System.out.println(additionalRocksNeeded);

		/*
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
		int initialAmountMarbles = 38;
		int amountMarblesLost = 15;
		int currentAmountOfMarbles = initialAmountMarbles - amountMarblesLost;
		System.out.println(currentAmountOfMarbles);

		/*
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
		float eventDrivingDistanceInMiles = 78;
		float milesDrivenBeforeStopping = 32;
		float totalMilesLeftToDrive = eventDrivingDistanceInMiles - milesDrivenBeforeStopping;
		System.out.println(totalMilesLeftToDrive);

		/*
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time did she spend shoveling snow?
        */
		final float oneHourInMinutes = 60;
		float saturdayMorning = oneHourInMinutes + 30;
		float saturdayAfternoon = 45;
		float totalTimeShovelingSnow = saturdayMorning + saturdayAfternoon;
		
		System.out.println(totalTimeShovelingSnow + " minutes");
        /*
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
		int amountOfHotDogsPurchased = 6;
		double costOfOneHotDog = .50;
		double totalCostOfHotDogs = amountOfHotDogsPurchased * costOfOneHotDog;
		System.out.println("$" + totalCostOfHotDogs);

        /*
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
		double currentAmountOfMoneyOnHand = .50;
		double pencilCost = .07;
		double numberOfPencilsPurchased = currentAmountOfMoneyOnHand/pencilCost;
		System.out.println(numberOfPencilsPurchased);

        /*
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
		int numberOfOrangeButterflies = 20;
		int totalNumberOfButterflies = 33; 
		int numberOfRedButterflies = totalNumberOfButterflies - numberOfOrangeButterflies;
		System.out.println(numberOfRedButterflies);

        /*
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
		double amountGivenToClerk = 1.00;
		double costOfCandy = 0.54;
		double returnedChange = amountGivenToClerk - costOfCandy;
		System.out.println("$" + returnedChange);
		
        /*
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
		int initialNumberOfTrees = 13; 
		int additionalNumberOfTreesPlanted = 12;
		int totalNumberOfTrees = initialNumberOfTrees + additionalNumberOfTreesPlanted;
		System.out.println(totalNumberOfTrees);

        /*
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
		final int HOURS_IN_DAY = 24;
		int numberOfDaysUntilJoySeesGrandma = 2;
		int numberOfHoursUntilJoySeesGrandma = HOURS_IN_DAY * numberOfDaysUntilJoySeesGrandma;
		System.out.println(numberOfHoursUntilJoySeesGrandma);

        /*
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
		int numberOfCousins = 4;
		int numberOfGumPiecesGiving = 5; 
		int amountOfGumNeeded = numberOfCousins * numberOfGumPiecesGiving;
		System.out.println(amountOfGumNeeded);

        /*
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
		double amountMoneyOnHand = 3.00;
		double totalCandyBar = 1.00;
		double amountOfMoneyLeft = amountMoneyOnHand - totalCandyBar;
		System.out.println(amountOfMoneyLeft);

        /*
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
		int totalBoatsInLake = 5;
		int numberOfPeopleEachBoat = 3;
		int totalNumberOfPeopleOnBoats = totalBoatsInLake * numberOfPeopleEachBoat;
		System.out.println(totalNumberOfPeopleOnBoats);

        /*
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
		int initialNumberOfLegos = 300;
		int amountLegosLost = 57;
		int totalLegosLeft = initialNumberOfLegos - amountLegosLost;
		System.out.println(totalLegosLeft);

        /*
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
		int initialNumberMuffinsBaked = 35;
		int totalNumberMuffinsBaked = 83;
		int numberAdditionalMuffinsNeedingBaked = totalNumberMuffinsBaked - initialNumberMuffinsBaked;
		System.out.println(numberAdditionalMuffinsNeedingBaked);

        /*
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
		int numberOfCrayonsWilly = 1400;
		int numberOfCrayonsLucy = 290;
		int howManyMoreCrayonsWilly = numberOfCrayonsWilly - numberOfCrayonsLucy;
		System.out.println(howManyMoreCrayonsWilly);

        /*
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
		int numberOfStickersOnSinglePage = 10;
		int numberOfPages = 22;
		int totalNumberOfStickers = numberOfPages * numberOfStickersOnSinglePage;
		System.out.println(totalNumberOfStickers);

        /*
        39. There are 96 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
		int numberOfChildren = 8;
		int numberOfCupcakesAvailable = 96; 
		int numberCupcakesEachChild = numberOfCupcakesAvailable/numberOfChildren;
		System.out.println(numberCupcakesEachChild);

        /*
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies each, how many
        cookies will not be placed in a jar?
        */
		int totalCookiesMade = 47;
		int numberOfCookiesInEachJar = 6;
		int numberOfTotalJars = totalCookiesMade/numberOfCookiesInEachJar;
		int numberOfCookiesNotPlacedInJars = totalCookiesMade - (numberOfTotalJars * numberOfCookiesInEachJar);
		System.out.println(numberOfCookiesNotPlacedInJars);
	
        /*
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received and equal number of croissants,
        how many will be left with Marian?
        */
		int totalNumberCroissants = 59;
		int numberOfNeighbors = 8;
		int numberOfCroissantsEach = totalNumberCroissants/numberOfNeighbors;
		int numberOfCroissantsLeftOver = totalNumberCroissants - (numberOfCroissantsEach * numberOfNeighbors);
		System.out.println(numberOfCroissantsLeftOver);

        /*
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
		int totalCookiesOnOneTray = 12;
		int totalNumberOfCookiesToPrepare = 276;
		int numberOfTraysNeeded = totalNumberOfCookiesToPrepare/totalCookiesOnOneTray;
		System.out.println(numberOfTraysNeeded);

        /*
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
		int numberOfPretzelsMade = 480;
		int numberPretzelsPerServing = 12;
		int numberOfServingsPrepared = numberOfPretzelsMade/numberPretzelsPerServing;
	
		System.out.println(numberOfServingsPrepared);

        /*
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
		int totalCupCakesBaked = 53;
		int numberLeftAtHome = 2;
		int numberCupCakesInEachBox = 3;
		int numberOfBoxesGiven = (totalCupCakesBaked - numberLeftAtHome)/numberCupCakesInEachBox;
		
		System.out.println(numberOfBoxesGiven);

        /*
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
		int totalCarrotSticksPrepared = 74;
		int numberOfPeopleServed = 12;
		int numberEachPersonReceived = totalCarrotSticksPrepared/numberOfPeopleServed;
		int numberOfCarrotSticksLeftUneaten = totalCarrotSticksPrepared - (numberEachPersonReceived * numberOfPeopleServed);
		
		System.out.println(numberOfCarrotSticksLeftUneaten);
        /*
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
		int totalNumberTeddyBears = 98;
		int amountEachShelfCanHold = 7;
		int numberOfShelvesFilled = totalNumberTeddyBears/amountEachShelfCanHold;
		
		System.out.println(numberOfShelvesFilled);

        /*
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
		final int NUMBER_ALBUM_HOLDS = 20;
		int totalAmountOfPictures = 480;
		int numberOfAlbumsNeeded = totalAmountOfPictures/NUMBER_ALBUM_HOLDS;
		
		System.out.println(numberOfAlbumsNeeded);

        /*
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
		int totalAmountOfTradingCards = 94;
		final int fullBoxMaximumLoad = 8;
		int numberBoxesFilled = totalAmountOfTradingCards/fullBoxMaximumLoad;
		System.out.println(numberBoxesFilled + " Filled Trading Card Boxes");
		
		int numberCardsInUnfilledBox = totalAmountOfTradingCards - (fullBoxMaximumLoad * numberBoxesFilled);
		System.out.println(numberCardsInUnfilledBox + " Trading Cards in Unfilled box");
		
        /*
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */
		int numberOfBooks = 210;
		int numberOfShelves = 10;
		int numberBooksOnEachShelf = numberOfBooks/numberOfShelves;
		
		System.out.println(numberBooksOnEachShelf);

        /*
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
		int totalBaked = 17;
		int numberOfGuests = 7;
		int numberServingPerGuest = totalBaked/numberOfGuests;
		System.out.println(numberServingPerGuest);


		
		        /*
            CHALLENGE PROBLEMS
        */

        /*
        Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages
        1.90 hours. How long will it take the two painter working together to paint 5 12 x 14 rooms?
        Hint: Calculate the hourly rate for each painter, combine them, and then divide the total walls in feet by the combined hourly rate of the painters.
        Challenge: How many days will it take the pair to paint 623 rooms assuming they work 8 hours a day?.
        */
		double oneRoomSquareFeet = (12*2) + (14*2);
		int sizeRoom = (int)oneRoomSquareFeet;
		int initialTotalNumberOfRooms = 5;
		int squareFootPerHourBill = (int)(sizeRoom/2.15);
		int squareFootPerHourJill = (int)(sizeRoom/1.90);
		int hourlyRateAsAPair = squareFootPerHourBill + squareFootPerHourJill;
		int timeToPaintFiveRooms = (sizeRoom * 5)/hourlyRateAsAPair;
		System.out.println(timeToPaintFiveRooms + " hours to paint 5 rooms");
		
		int newTotalNumberOfRooms = 623;
		int totalSquareFeet = newTotalNumberOfRooms * sizeRoom;
		int timeToPaintHundredsOfRooms = totalSquareFeet/hourlyRateAsAPair;		
		int totalDays = timeToPaintHundredsOfRooms/8;
		System.out.println(totalDays + " days to paint 623 rooms");

	/*
        Create and assign variables to hold your first name, last name, and middle initial. Using concatenation,
        build an additional variable to hold your full name in the order of last name, first name, middle initial. The
        last and first names should be separated by a comma followed by a space, and the middle initial must end
        with a period.
        Example: "Hopper, Grace B."
        */
		String firstName = "Andrea";
		String lastName = "Johnson";
		String middleInitial = "L"; 
		String fullName = (lastName + ", " + firstName + ", " + middleInitial + ".");
		
		System.out.println(fullName);

        /*
        The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
        What percentage of the trip has been completed?
        Hint: The percent completed is the miles already travelled divided by the total miles.
        Challenge: Display as an integer value between 0 and 100 using casts.
        */
		double travelingDistance = 800;
		double distanceAlreadyTraveled = 537; 
		double percentageOfTripCompleted = distanceAlreadyTraveled/travelingDistance;
		
		System.out.println(percentageOfTripCompleted);
		
	}

}
