select * from member;

delete from member where id = 'blueskyfog';

update member set pw = '1234' where id = 'blueskyfog';

drop table member cascade constraints;

create table member(
id varchar2(20),
pw varchar2(20),
name varchar2(50),
regiNo varchar2(50),
tel varchar2(20),
constraint member_id_pk primary key(id)
);

desc member;


create table quiz
(
question varchar2(200),
answer varchar2(50),
level varchar2(10),
constraine quiz_answer_pk primary key(answer)
);
desc quiz;
select * from quiz;
insert into quiz values('문제1', '답1', '상');
