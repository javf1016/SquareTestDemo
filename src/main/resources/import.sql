INSERT INTO categories (name, parent_category_id) VALUES ('Furniture', null);
INSERT INTO categories (name, parent_category_id) VALUES ('Electronics', null);
INSERT INTO categories (name, parent_category_id) VALUES ('Home Appliances', null);
INSERT INTO categories (name, parent_category_id) VALUES ('Major Appliances', 3);
INSERT INTO categories (name, parent_category_id) VALUES ('Minor Appliances', 3);
INSERT INTO categories (name, parent_category_id) VALUES ('Lawn and Garden', 3);

INSERT INTO category_keywords (category_id, keyword) VALUES (1, 'Furniture');
INSERT INTO category_keywords (category_id, keyword) VALUES (2, 'Electronics');
INSERT INTO category_keywords (category_id, keyword) VALUES (3, 'Home Appliances');
INSERT INTO category_keywords (category_id, keyword) VALUES (4, 'Major Appliances');
INSERT INTO category_keywords (category_id, keyword) VALUES (5, 'Minor Appliances');
INSERT INTO category_keywords (category_id, keyword) VALUES (6, 'Lawn');
INSERT INTO category_keywords (category_id, keyword) VALUES (6, 'Garden');
INSERT INTO category_keywords (category_id, keyword) VALUES (6, 'GardeningTools');