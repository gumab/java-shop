INSERT INTO member(id, name, email, passwd, reg_date)
values(null, 'chabae', 'chabae@ebay.com', '{bcrypt}$2a$10$3YFYqueXUHrP4ZtO9zmvDe1kjo.OK8ws0NwXw6Xx3S2UAcuhY4wmm', now());

INSERT INTO member(id, name, email, passwd, reg_date)
values(null, 'jaeshim', 'jaeshim@ebay.com', '{bcrypt}$2a$10$3YFYqueXUHrP4ZtO9zmvDe1kjo.OK8ws0NwXw6Xx3S2UAcuhY4wmm', now());

insert into member_role(id, name, member_id)
values( null, 'USER', 1);

insert into member_role(id, name, member_id)
values( null, 'ADMIN', 1);

insert into member_role(id, name, member_id)
values( null, 'USER', 2);

insert into item(id, name, price, image_url, reg_date)
VALUES (null, 'Denim jacket blue', 92500, 'https://colorlib.com/images/item-03.jpg', now());

insert into item(id, name, price, image_url, reg_date)
VALUES (null, 'item2', 2000, 'https://colorlib.com/images/item-04.jpg', now());

insert into item(id, name, price, image_url, reg_date)
VALUES (null, 'item3', 3000, 'https://colorlib.com/images/item-05.jpg', now());

insert into item(id, name, price, image_url, reg_date)
VALUES (null, 'item4', 4000, 'https://colorlib.com/images/item-06.jpg', now());

insert into cart(id, quantity, item_id, member_id, reg_date)
values (null, 2, 1, 1, now());

insert into cart(id, quantity, item_id, member_id, reg_date)
values (null, 2, 2, 1, now());

insert into cart(id, quantity, item_id, member_id, reg_date)
values (null, 3, 3, 1, now());