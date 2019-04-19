// add pageTitle
const pageTitle = 'My Shopping List';
// add groceries

let groceries = [
  {item: 'Bread'},
  {item: 'Grape Jelly'},
  {item: 'Peanutbutter'},
  {item: 'Chicken'},
  {item: 'Pepperoni'},
  {item: 'Milk'},
  {item: 'Pretzels'},
  {item: 'Yogurt' },
  {item: 'Orange Juice'},
  {item: 'Butter'}
]

  
/**
 * This function will get a reference to the title and set its text to the value
 * of the pageTitle variable that was set above.
 */
function setPageTitle() {
  const heading = document.getElementById('title');
  heading.innerText = pageTitle;
}

/**
 * This function will loop over the array of groceries that was set above and add them to the DOM.
 */
function displayGroceries() {

const groceryList = document.querySelector('.shopping-list');

const ul = document.querySelector('.shopping-list ul');
groceries.forEach(list => {
  const li = document.createElement('li');

  li.innerText = list.item
  ul.appendChild(li)

});
groceryList.appendChild(ul);
}


/**
 * This function will be called wh4en the button is clicked. You will need to get a reference
 * to every list item and add the class completed to each one
 */
function markCompleted() {

  const purchased = document.querySelectorAll('li');

purchased.forEach(list => {

  list.setAttribute('class', 'completed');

});

}

//set the product review page
setPageTitle();

//adds the items to the DOM
displayGroceries();

// Don't worry too much about what is going on here, we will cover this when we discuss events.
document.addEventListener('DOMContentLoaded', () => {
  // When the DOM Content has loaded attach a click listener to the button
  const button = document.querySelector('.btn');
  button.addEventListener('click', markCompleted);
});
