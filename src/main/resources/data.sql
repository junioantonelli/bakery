INSERT INTO order_products (
		id, 
		state, 
		due_time_date,
		customer_name,
		customer_address,
		details
		) VALUES
  (1, 'NEW',NULL, 'John', '9999 Swime St', 'detail 1'),
  (2, 'PROBLEM',NULL, 'Joseph', '7664 Coltred Ave', 'detail 2'),
  (3, 'CANCELLED',NULL, 'Mark', '97 Winner Rd', 'detail 3'),
  (4, 'DELIVERED',NULL, 'Phineas', '844 Blink St', 'detail 4'),
  (5, 'NEW',NULL, 'Mary', '3 Nether St', 'detail 5'),
  (6, 'DELIVERED',NULL, 'Adam', '51 Carlson St', 'detail 6'),
  (7, 'READY',NULL, 'Paul', '2 Pwersten Rd', 'detail 7'),
  (8, 'READY',NULL, 'Luke', '1685 Awlink Ave', 'detail 8'),
  (9, 'NEW',NULL, 'Titus', '355 Sblowski St', 'detail 9');
  
  INSERT INTO product (
		id, 
		name, 
		price
		) VALUES
  (1, 'Large Traditional Loaf', 1.99),
  (2, 'Small Traditional Loaf', 2.99),
  (3, 'Round Farmhouse', 0.99),
  (4, 'Long Farmhouse Bloomer', 1.69),
  (5, 'Sandwich Loaf', 2.49),
  (6, 'Long Bake', 3.99),
  (7, 'Ciabatta', 3.49),
  (8, 'Focaccia', 1.49),
  (9, 'Burger Buns', 2.99);
  
  INSERT INTO user (
		id, 
		name, 
		email,
		role
		) VALUES
  (1, 'John', 'john@gmail.com', 'admin'),
  (2, 'Mary', 'mary@gmail.com', 'office'),
  (3, 'Richard', 'richard@gmail.com', 'visitor');