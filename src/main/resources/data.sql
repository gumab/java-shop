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
VALUES (null, 'item1', 1000, 'https://colorlib.com/etc/fashe/images/item-01.jpg', now());

insert into item(id, name, price, image_url, reg_date)
VALUES (null, 'item2', 2000, 'https://colorlib.com/etc/fashe/images/item-02.jpg', now());

insert into item(id, name, price, image_url, reg_date)
VALUES (null, 'item3', 3000, 'https://colorlib.com/etc/fashe/images/item-03.jpg', now());

insert into item(id, name, price, image_url, reg_date)
VALUES (null, 'item4', 4000, 'https://colorlib.com/etc/fashe/images/item-04.jpg', now());

insert into item(id, name, price, image_url, reg_date)
VALUES (null, 'item5', 4000, 'https://colorlib.com/etc/fashe/images/item-05.jpg', now());

insert into item(id, name, price, image_url, reg_date)
VALUES (null, 'item6', 4000, 'https://colorlib.com/etc/fashe/images/item-06.jpg', now());

insert into item(id, name, price, image_url, reg_date)
VALUES (null, 'item7', 4000, 'https://colorlib.com/etc/fashe/images/item-07.jpg', now());

insert into item(id, name, price, image_url, reg_date)
VALUES (null, 'item8', 4000, 'https://colorlib.com/etc/fashe/images/item-08.jpg', now());

insert into item(id, name, price, image_url, reg_date)
VALUES (null, 'item9', 4000, 'https://colorlib.com/etc/fashe/images/item-09.jpg', now());

insert into item(id, name, price, image_url, reg_date)
VALUES (null, 'item10', 4000, 'https://colorlib.com/etc/fashe/images/item-10.jpg', now());

insert into item(id, name, price, image_url, reg_date)
VALUES (null, 'item11', 4000, 'https://colorlib.com/etc/fashe/images/item-11.jpg', now());

insert into item(id, name, price, image_url, reg_date)
VALUES (null, 'item12', 4000, 'https://colorlib.com/etc/fashe/images/item-12.jpg', now());

insert into item(id, name, price, image_url, reg_date)
VALUES (null, 'item13', 4000, 'https://colorlib.com/etc/fashe/images/item-13.jpg', now());

insert into item(id, name, price, image_url, reg_date)
VALUES (null, 'item14', 4000, 'https://colorlib.com/etc/fashe/images/item-14.jpg', now());

insert into item(id, name, price, image_url, reg_date)
VALUES (null, 'item15', 4000, 'https://colorlib.com/etc/fashe/images/item-15.jpg', now());

insert into item(id, name, price, image_url, reg_date)
VALUES (null, 'item16', 4000, 'https://colorlib.com/etc/fashe/images/item-16.jpg', now());

insert into item(id, name, price, image_url, reg_date)
VALUES (null, 'item17', 4000, 'https://colorlib.com/etc/fashe/images/item-17.jpg', now());

insert into cart(id, quantity, item_id, member_id, reg_date)
values (null, 2, 1, 1, now());

insert into cart(id, quantity, item_id, member_id, reg_date)
values (null, 2, 2, 1, now());

insert into cart(id, quantity, item_id, member_id, reg_date)
values (null, 3, 3, 1, now());