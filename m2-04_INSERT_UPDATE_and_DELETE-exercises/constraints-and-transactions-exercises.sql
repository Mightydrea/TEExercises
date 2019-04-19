-- Write queries to return the following:
-- The following changes are applied to the "pagila" database.**

-- 1. Add actors, Hampton Avenue, and Lisa Byway to the actor table.

INSERT INTO actor (first_name, last_name)
VALUES ('HAMPTON','AVENUE'), ('LISA', 'BYWAY');

-- 2. Add "Euclidean PI", "The epic story of Euclid as a pizza delivery boy in 
-- ancient Greece", to the film table. The movie was released in 2008 in English. 
-- Since its an epic, the run length is 3hrs and 18mins. There are no special 
-- features, the film speaks for itself, and doesn't need any gimmicks.	

INSERT INTO film (title, description, release_year, language_id, length)
VALUES ('EUCLIDEAN PI', 'The epic story of Euclid as a pizza delivery boy in ancient Greece', '2008', 1, 198)  

-- 3. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly 
-- overprotective mother, in the film, "Euclidean PI". Add them to the film.

INSERT INTO (actor_id, film_id)
VALUES (201, 1001), (202, 1001);
 
-- 4. Add Mathmagical to the category table.

INSERT INTO category (name)
VALUES ('Mathmagical');

-- 5. Assign the Mathmagical category to the following films, "Euclidean PI", 
-- "EGG IGBY", "KARATE MOON", "RANDOM GO", and "YOUNG LANGUAGE"

INSERT INTO film_category (film_id, category_id)
VALUES (1001, 17), (274, 17), (494, 17), (714, 17), (996, 17);

-- 6. Mathmagical films always have a "G" rating, adjust all Mathmagical films 
-- accordingly.
-- (5 rows affected)

UPDATE film 
SET rating = 'G'
WHERE film_id IN (SELECT category_id FROM film_category WHERE category_id = 17);

-- 7. Add a copy of "Euclidean PI" to all the stores.

INSERT INTO inventory (film_id, store_id)
VALUES (1001, 1), (1001, 2);

-- 8. The Feds have stepped in and have impounded all copies of the pirated film, 
-- "Euclidean PI". The film has been seized from all stores, and needs to be 
-- deleted from the film table. Delete "Euclidean PI" from the film table. 
-- (Did it succeed? Why?)  

--NO deleting the movie Euclidean PI did not succeed. Film_id was a primary
--key and its foreign key is in use in another table.

DELETE FROM film
WHERE film.film_id = 1001;

-- 9. Delete Mathmagical from the category table. 
-- (Did it succeed? Why?)
--NO, did not succeed because of key constraints, the category id is being used in other tables 

DELETE FROM category
WHERE category.name = 'Mathmagical';

-- 10. Delete all links to Mathmagical in the film_category tale. 
-- (Did it succeed? Why?)
--YES, this succeeded because I deleted the PK and the FK which deleted all links to Mathmagical and FK no longer being used

DELETE FROM film_category
WHERE film_category.category_id = 17; 

-- 11. Retry deleting Mathmagical from the category table, followed by retrying
-- to delete "Euclidean PI". 
-- (Did either deletes succeed? Why?)
--yes I was able to delete from category mathmagical since the PK category_id was no longer being used by another table
DELETE FROM category
WHERE category.name = 'Mathmagical';

--no this did not work and the title is still in the film table because the film_id is still being used in the inventory section as a foreign key
DELETE FROM film
WHERE film.title = 'Euclidean PI';

-- 12. Check database metadata to determine all constraints of the film id, and 
-- describe any remaining adjustments needed before the film "Euclidean PI" can 
-- be removed from the film table.

--in order for the Euclidean PI title to be removed the film_id must be removed for this title from the inventory table. 
--Once removed I can remove title from film table. 
SELECT kcu.constraint_name,
    kcu.table_name,
    kcu.column_name 
  FROM information_schema.key_column_usage kcu
     LEFT JOIN information_schema.table_constraints tc ON tc.constraint_name = kcu.constraint_name
  WHERE tc.constraint_type = 'FOREIGN KEY';