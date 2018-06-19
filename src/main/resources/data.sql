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