let allItemsIncomplete = true;
const pageTitle = 'My Shopping List';
const groceries = [
  { id: 1, name: 'Oatmeal', completed: false },
  { id: 2, name: 'Milk', completed: false },
  { id: 3, name: 'Banana', completed: false },
  { id: 4, name: 'Strawberries', completed: false },
  { id: 5, name: 'Lunch Meat', completed: false },
  { id: 6, name: 'Bread', completed: false },
  { id: 7, name: 'Grapes', completed: false },
  { id: 8, name: 'Steak', completed: false },
  { id: 9, name: 'Salad', completed: false },
  { id: 10, name: 'Tea', completed: false }
];

/**
 * This function will get a reference to the title and set its text to the value
 * of the pageTitle variable that was set above.
 */
function setPageTitle() {
  const title = document.getElementById('title');
  title.innerText = pageTitle;
}

/**
 * This function will loop over the array of groceries that was set above and add them to the DOM.
 */
function displayGroceries() {
  const ul = document.querySelector('ul');
  groceries.forEach((item) => {
    const li = document.createElement('li');
    li.innerText = item.name;
    const checkCircle = document.createElement('i');
    checkCircle.setAttribute('class', 'far fa-check-circle');
    li.appendChild(checkCircle);
    ul.appendChild(li);
  });
}

document.addEventListener('DOMContentLoaded', () => {
  setPageTitle();
  displayGroceries();

  //reference for every item listed so a click listener can be added to each item in list
  const items = document.querySelectorAll('li')

  items.forEach((list) => {

    //this function marks a list item complete meaning it has been purchased
    list.addEventListener('click', () => {
      if (!list.classList.contains('completed')) {
        list.classList.add('completed')
        list.querySelector('i').classList.add('completed')
      }
    })
    //double click the item to remove the purchased check mark
    list.addEventListener('dblclick', () => {
      if (list.classList.contains('completed')) {
        list.classList.remove('completed')
        list.querySelector('i').classList.remove('completed')
      }
      allItemsIncomplete = false;

    })



    //mark all items as purchased
    //closes the purchaseAll Listener
  });// closes the forEach

  const purchaseAll = document.getElementById('toggleAll')

  purchaseAll.addEventListener('click', () => {
    listCompleteIncomplete();

  });

  function listCompleteIncomplete() {

    const button = document.getElementById('toggleAll');

    if (allItemsIncomplete) {
      items.forEach((list) => {
        list.classList.add('completed')
        list.querySelector('i').classList.add('completed')
        button.innerText = 'MARK All INCOMPLETE';

      })
      allItemsIncomplete = false;
    }
    else if (allItemsIncomplete === false) {
      items.forEach((list) => {
        list.querySelector('i').classList.remove('completed')
        list.classList.remove('completed')
        button.innerText = 'MARK All COMPLETE';

      })
      allItemsIncomplete = true;

    }
  }
});

