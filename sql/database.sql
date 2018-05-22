create database sellacai;

use sellacai;

create table produtos(
    id_produto int primary key AUTO_INCREMENT,
    nome_produto varchar(255),
    fk_estoque_id int
)ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1;

create table estoque(
    id_estoque int primary key AUTO_INCREMENT,
    qnt_estoque int,
    validade date
)ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1;

create table venda(
    id_venda int primary key auto_increment,
    dt_venda date,
    valor_venda float
)ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1;

create table produto_venda(
    fk_produto_id int,
    fk_venda_id int,
    qnt_vendida int
)

alter table produtos add constraint fk_estoque
foreign key(fk_estoque_id) references estoque(id_estoque);

alter table produto_venda add constraint fk_produto
foreign key(fk_produto_id) references produtos(id_produto);

alter table produto_venda add constraint fk_venda 
foreign key(fk_venda_id) references venda(id_venda); 