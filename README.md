## Project details

The following entities are given along with their attributes-

Supplier- supplier_id,supplier_name,supplier_rating 

Item- item_id, item_name,unit_price

purchase- supplier_id,item_id, quantity,  date ( this is the purchase of an item table where each purchase comes from a supplier with a supplier_id and each item with an item_id and total amount which is unit_price multiplied by quantity and also timestamp of purchase

The output is required in the following format-
Supplier_id, item_id, month , quantity, amount Note i need to arrange the data in Order of month of purchase ( like group by MONTH .. currently we are checking for a single year only ) 


## Tech Stack

Java, Spring Boot, JPA and H2 database
