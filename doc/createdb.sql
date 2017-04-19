#------------------------------------------------------------
#        Script MySQL.
#------------------------------------------------------------


#------------------------------------------------------------
# Table: fighting
#------------------------------------------------------------

CREATE TABLE fighting(
        id              int (11) Auto_increment  NOT NULL ,
        opponent        Varchar (50) NOT NULL ,
        points          Int NOT NULL ,
        opponent_points Int NOT NULL ,
        id_competition  Int NOT NULL ,
        PRIMARY KEY (id )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: competition
#------------------------------------------------------------

CREATE TABLE competition(
        id       int (11) Auto_increment  NOT NULL ,
        name     Varchar (25) NOT NULL ,
        fdate    Date NOT NULL ,
        location Varchar (25) ,
        result   Varchar (25) ,
        PRIMARY KEY (id )
)ENGINE=InnoDB;

ALTER TABLE fighting ADD CONSTRAINT FK_fighting_id_competition FOREIGN KEY (id_competition) REFERENCES competition(id);
