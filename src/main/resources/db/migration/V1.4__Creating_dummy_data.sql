INSERT INTO PRICING
VALUES (NEXT VALUE FOR pricing_id_seq, 1, 10, 'M', 10);

INSERT INTO LOT
VALUES (NEXT VALUE FOR lot_id_seq, 1, 'Cids Garage', 'Hammerhead', 20);

INSERT INTO TICKET
VALUES (NEXT VALUE FOR ticket_id_seq, 100, '2018-10-19', '10:15:10', '10:35:45', 30, false);