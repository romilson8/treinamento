INSERT INTO API (NAME, VERSION)
VALUES
('API treinamento', 1);


--ENDERECO

INSERT INTO ENDERECO (id, rua, cep, bairro, cidade)
VALUES
(1,'Viriato Correia', '51030510', 'Boa Viagem', 'Recife');

INSERT INTO ENDERECO (id, rua, cep, bairro, cidade)
VALUES
(2,'Monoel Borba', '51001130', 'Boa Vista', 'Recife');

INSERT INTO ENDERECO (id, rua, cep, bairro, cidade)
VALUES
(3,'Machado de Assis', '50000510', 'Bairro Novo', 'Olinda');

INSERT INTO ENDERECO (id, rua, cep, bairro, cidade)
VALUES
(4,'Encanta Moça', '52000350', 'Pina', 'Recife');


--PESSOAS
INSERT INTO PESSOA (id, nome, peso, altura, profissao, sexo, datanascimento, cpf, endereco_id)
VALUES
(1,'Marcos Feliciano', 75.2, 1.75, 'desenvolvedor CL10', 'masculino', '1993-04-29', '04044664478', 2);

INSERT INTO PESSOA (id, nome, peso, altura, profissao, sexo, datanascimento, cpf, endereco_id)
VALUES
(2,'David Rodrigues', 60.2, 1.81, 'desenvolvedorCL11', 'masculino', '1998-05-13', '0406669997', 3);

INSERT INTO PESSOA (id, nome, peso, altura, profissao, sexo, datanascimento, cpf, endereco_id)
VALUES
(3,'Landerson Silva', 52.2, 1.66, 'desenvolvedorFront', 'masculino', '1999-11-30', '0406669997',4);

INSERT INTO PESSOA (id, nome, peso, altura, profissao, sexo, datanascimento, cpf, endereco_id)
VALUES
(4,'Myller Claudino', 75, 1.61, 'desenvolvedorCL10', 'masculino', '1991-11-03', '77799988855', 1);

--CARROS
INSERT INTO CARRO (id, modelo, ano, marca, pessoa_id)
VALUES
(1,'Coope SuperCharge', '2019-2020', 'Mini', 1);

INSERT INTO CARRO (id, modelo, ano, marca, pessoa_id)
VALUES
(2,'Honda Prius', '2018-2019', 'Honda', 1);

INSERT INTO CARRO (id, modelo, ano, marca, pessoa_id)
VALUES
(3,'Compass', '2018-2019', 'Jeep', 3);

