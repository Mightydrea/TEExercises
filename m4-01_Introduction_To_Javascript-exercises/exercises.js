function sumDouble(value1, value2){
  
    if(value1 === value2){
        return (value1 + value2) * 2;
    }
    else{
        return value1 + value2;
    }
}

function hasTeen(value1, value2, value3){

    if(value1 >= 13 && value1 <= 19){
        return true;
    }
    else if(value2 >= 13 && value2 <= 19){
        return true;
    }
    else if(value3 >= 13 && value3 <= 19){
        return true;
    }
    return false;
}

function lastDigit(value1, value2){

    if((value1 % 10) == (value2 %10)){
        return true;
    }
    return false;
   
}

function seeColor(color){

    if (color.startsWith('red')){
3
        return 'red';
    }
4
  if (color.startsWith('blue')){
5
    return 'blue';
  } 
  else if (color.endsWith('red') || color == ''){
7
    return '';
8
    }
}

function oddOnly(odd) {
        return odd.filter((value)=>{ 
            if(value % 2 == 0){
                return '';
            } 
            else{
                return value;
            }
        });
    }


function frontAgain(firstTwo){

    if (firstTwo.length < 2){
        return false;
    }
    else if (firstTwo.slice(0,2) == (firstTwo.slice(firstTwo.length-2, firstTwo.length))){
        return true;
    }
    else{
        return false;
    }
}
function cigarParty(cigars, isWeekend){
        
    if(isWeekend && cigars >= 40) {
      return true;
    }
    else if(cigars >=40 && cigars <= 60) {
      return true;
    }
    else {
      return false;
    }
}
function fizzBuzz(nums){
    
    for (let i = 1; i <= 100; nums++) {  
        
        if ( nums % 3 == 0 && nums % 5 == 0 ) {
            return 'FizzBuzz';
        }
        else if ( nums % 3 == 0 ) {
          return 'Fizz';
        }
        else if ( nums % 5 == 0 ) {
          return 'Buzz';
        }
        else {
          return nums;
        }
      }
    }

    function filterEvens(even) {
            return even.filter((value)=>{ 
                return value % 2 == 0; 
            });
        }

    function filterBigNumbers(big){
        return big.filter((value) => {
            return value >= 100;
        });
    }

    function filterMultiplesOfX(x){
        return x.filter((multiples) => {
            for(let i= 0; i <length; i++){
                multiples % x == 0;
                return x;
            }
             
        });
        return multiples;
    }
    
    function createObject(firstName, lastName, age){

        return 
        return firstName.filter() + '' + lastName.filter() + '' + age.filter();

    }