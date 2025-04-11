create database TP2;

use TP2;

create table Personne
( Id int primary key auto_increment,
  nom varchar(100),
  prenom varchar(100),
  email varchar(100),
  numTel varchar(15),
  adresse varchar(100)
);

create table Ordinateur
(adresse_Mac varchar(100) primary key,
 nom varchar(100),
 categorie varchar(100),
 version varchar(100),
 Id_Prop int,
 foreign key(Id_Prop) references Personne(Id)
);

create table Portable
(Imei varchar(100) primary key,
 nom varchar(100),
 categorie varchar(100),
 version varchar(100),
 Id_Prop int,
 foreign key(Id_Prop) references Personne(Id)
);