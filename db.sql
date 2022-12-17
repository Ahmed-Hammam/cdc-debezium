create table alarms (id uuid, type varchar, priority varchar, originator varchar, status varchar, value varchar,created_on timestamp);
CREATE EXTENSION IF NOT EXISTS "uuid-ossp";
insert into alarms (id, type, priority, originator, status,value ,created_on)
 (select uuid_generate_v1(), 'Fire Alarm', 'High', 'Lab'||floor(random() * 10 + 1)::int, 'Open', 80, now());
insert into alarms (id, type, priority, originator, status,value ,created_on)
 (select uuid_generate_v1(), 'High Pressure Alarm', 'High', 'Lab'||floor(random() * 10 + 1)::int, 'Open', 56, now());
insert into alarms (id, type, priority, originator, status,value ,created_on)
 (select uuid_generate_v1(), 'High Heat Alarm', 'High', 'Lab'||floor(random() * 10 + 1)::int, 'Open', 0, now());
insert into alarms (id, type, priority, originator, status,value ,created_on)
 (select uuid_generate_v1(), 'Low Pressure Alarm', 'High', 'Lab'||floor(random() * 10 + 1)::int, 'Open', 1, now());