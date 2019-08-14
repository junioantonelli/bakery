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