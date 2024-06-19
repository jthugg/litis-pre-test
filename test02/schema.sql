-- Define schema & data here
-- MySQL grammar
-- Check the test database configured by docker-compose.yml

CREATE TABLE TEAM (
    id BIGINT PRIMARY KEY,
    name VARCHAR(255),
    parent BIGINT
);

INSERT INTO TEAM (id, name, parent) VALUES (1, '대표이사', NULL);
INSERT INTO TEAM (id, name, parent) VALUES (2, '경영관리', 1);
INSERT INTO TEAM (id, name, parent) VALUES (3, '영업본부', 1);
INSERT INTO TEAM (id, name, parent) VALUES (4, '솔루션사업부', 1);
INSERT INTO TEAM (id, name, parent) VALUES (5, '연구소', 1);
INSERT INTO TEAM (id, name, parent) VALUES (6, '연구1팀', 5);
INSERT INTO TEAM (id, name, parent) VALUES (7, '연구2팀', 5);
INSERT INTO TEAM (id, name, parent) VALUES (8, '솔루션 개발', 7);
INSERT INTO TEAM (id, name, parent) VALUES (9, '시스템 개발', 7);
