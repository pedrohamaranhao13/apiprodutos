create table produto(
	id 							uuid  				primary key,
	nome 					varchar(100) 		not null,
	preco 					numeric(10,2) 	not null,
	quantidade 			int 					not null,
	datahoracriacao 	timestamp 		not null,
	ativo 					boolean 			not null,
	categoria_id			uuid					not null,
	foreign key (categoria_id)
		references categoria(id)
)


create table categoria (
	id 			uuid 				primary key,
	nome	 varchar(50) 	not null 		unique
)

insert into categoria(id, nome) values(gen_random_uuid(), "Eletrônicos");
insert into categoria(id, nome) values(gen_random_uuid(), "Informática");
insert into categoria(id, nome) values(gen_random_uuid(), "Papelaria");
insert into categoria(id, nome) values(gen_random_uuid(), "Vestuário");
insert into categoria(id, nome) values(gen_random_uuid(), "Cama, mesa e banho");
insert into categoria(id, nome) values(gen_random_uuid(), "Games");
insert into categoria(id, nome) values(gen_random_uuid(), "Outros");