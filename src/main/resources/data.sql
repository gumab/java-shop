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
VALUES (null, '회색 백팩', 1000, 'https://colorlib.com/etc/fashe/images/item-01.jpg', now());

insert into item(id, name, price, image_url, reg_date)
VALUES (null, '여행용 백팩', 2000, 'https://colorlib.com/etc/fashe/images/item-02.jpg', now());

insert into item(id, name, price, image_url, reg_date)
VALUES (null, '앞이 예쁜 청자켓', 3000, 'https://colorlib.com/etc/fashe/images/item-03.jpg', now());

insert into item(id, name, price, image_url, reg_date)
VALUES (null, '뒤가 예쁜 청자켓', 14000, 'https://colorlib.com/etc/fashe/images/item-04.jpg', now());

insert into item(id, name, price, image_url, reg_date)
VALUES (null, '검은 시계', 34000, 'https://colorlib.com/etc/fashe/images/item-05.jpg', now());

insert into item(id, name, price, image_url, reg_date)
VALUES (null, '청바지에 잘어울리는 신발', 24000, 'https://colorlib.com/etc/fashe/images/item-06.jpg', now());

insert into item(id, name, price, image_url, reg_date)
VALUES (null, '너무짧은 청반바지', 54000, 'https://colorlib.com/etc/fashe/images/item-07.jpg', now());

insert into item(id, name, price, image_url, reg_date)
VALUES (null, '갈색시계', 12000, 'https://colorlib.com/etc/fashe/images/item-08.jpg', now());

insert into item(id, name, price, image_url, reg_date)
VALUES (null, '비스듬히 봐야 예쁜 갈색시계', 32000, 'https://colorlib.com/etc/fashe/images/item-09.jpg', now());

insert into item(id, name, price, image_url, reg_date)
VALUES (null, '잠옷인지 뭔지', 2500, 'https://colorlib.com/etc/fashe/images/item-10.jpg', now());

insert into item(id, name, price, image_url, reg_date)
VALUES (null, '나는 이렇게 걷는다', 42000, 'https://colorlib.com/etc/fashe/images/item-11.jpg', now());

insert into item(id, name, price, image_url, reg_date)
VALUES (null, '음..', 143000, 'https://colorlib.com/etc/fashe/images/item-12.jpg', now());

insert into item(id, name, price, image_url, reg_date)
VALUES (null, '청바지', 242000, 'https://colorlib.com/etc/fashe/images/item-13.jpg', now());

insert into item(id, name, price, image_url, reg_date)
VALUES (null, '카라티', 35000, 'https://colorlib.com/etc/fashe/images/item-14.jpg', now());

insert into item(id, name, price, image_url, reg_date)
VALUES (null, '정말 뭘파는건지 모르겠다', 1000, 'https://colorlib.com/etc/fashe/images/item-15.jpg', now());

insert into item(id, name, price, image_url, reg_date)
VALUES (null, '얘는 뭐지', 23000, 'https://colorlib.com/etc/fashe/images/item-16.jpg', now());

insert into item(id, name, price, image_url, reg_date)
VALUES (null, '단화', 85000, 'https://colorlib.com/etc/fashe/images/item-17.jpg', now());

insert into my_order (id, member_id, reg_date)
values (null, 1, now());

insert into my_order (id, member_id, reg_date)
values (null, 1, now());

insert into my_order (id, member_id, reg_date)
values (null, 1, now());

insert into cart(id, quantity, item_id, member_id, reg_date)
values (null, 2, 1, 1, now());

insert into cart(id, quantity, item_id, member_id, reg_date)
values (null, 2, 2, 1, now());

insert into cart(id, quantity, item_id, member_id, reg_date)
values (null, 3, 3, 1, now());

insert into cart(id, quantity, item_id, member_id, reg_date)
values (null, 3, 4, 1, now());

insert into cart(id, quantity, item_id, member_id, reg_date)
values (null, 1, 14, 1, now());

insert into cart(id, quantity, item_id, member_id, reg_date)
values (null, 1, 16, 1, now());

insert into cart(id, quantity, item_id, member_id, reg_date)
values (null, 1, 17, 1, now());

insert into cart(id, quantity, item_id, member_id, order_id, reg_date)
values (null, 1, 7, 1, 1, now());

insert into cart(id, quantity, item_id, member_id, order_id, reg_date)
values (null, 2, 2, 1, 1, now());

insert into cart(id, quantity, item_id, member_id, order_id, reg_date)
values (null, 3, 3, 1, 1, now());

insert into cart(id, quantity, item_id, member_id, order_id, reg_date)
values (null, 1, 12, 1, 2, now());

insert into cart(id, quantity, item_id, member_id, order_id, reg_date)
values (null, 2, 11, 1, 2, now());

insert into cart(id, quantity, item_id, member_id, order_id, reg_date)
values (null, 5, 10, 1, 3, now());
