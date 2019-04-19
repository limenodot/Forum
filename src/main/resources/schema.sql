CREATE TABLE IF NOT EXISTS users (
  id BIGINT PRIMARY KEY,
  name VARCHAR(100) UNIQUE NOT NULL,
  email VARCHAR(100) UNIQUE NOT NULL,
  avatar BYTEA,
  password_hash VARCHAR(255),
  password_salt VARCHAR(32)
);

COMMENT ON TABLE users IS 'Table contains the forum users'' data';
COMMENT ON COLUMN users.id IS 'User''s identifier';
COMMENT ON COLUMN users.name IS 'User''s name';
COMMENT ON COLUMN users.email IS 'User''s email';
COMMENT ON COLUMN users.avatar IS 'Byte array with user''s photo';
COMMENT ON COLUMN users.password_hash IS 'User''s password hash';
COMMENT ON COLUMN users.password_salt IS 'A salt to calculate a password hash';

CREATE SEQUENCE IF NOT EXISTS user_id_sequence START WITH 1 MINVALUE 1 INCREMENT BY 1;
COMMENT ON SEQUENCE user_id_sequence IS 'Sequence for identifiers of table ''users''';


--todo date to timestamp
CREATE TABLE IF NOT EXISTS messages (
  id BIGINT PRIMARY KEY,
  date DATE,
  user_id BIGINT REFERENCES users (id) ON DELETE CASCADE,
  topic_id BIGINT REFERENCES topics (id) ON DELETE CASCADE,
  text VARCHAR(1000) NOT NULL,
  attached_images BYTEA
);

COMMENT ON TABLE messages IS 'Table contains information message''s information';
COMMENT ON COLUMN messages.id IS 'Message''s identifier';
COMMENT ON COLUMN messages.date IS 'Date of posting this message';
COMMENT ON COLUMN messages.user_id IS 'Identifier of user who posted this message';
COMMENT ON COLUMN messages.topic_id IS 'Identifier of topic which this message belongs to';
COMMENT ON COLUMN messages.text IS 'Message''s content';
COMMENT ON COLUMN messages.attached_images IS 'Message''s attached images';

CREATE SEQUENCE IF NOT EXISTS message_id_sequence START WITH 1 MINVALUE 1 INCREMENT BY 1;
COMMENT ON SEQUENCE message_id_sequence IS 'Sequence for identifiers of table ''messages''';



CREATE TABLE IF NOT EXISTS topics (
  id BIGINT PRIMARY KEY,
  title VARCHAR(100) UNIQUE NOT NULL,
  messages_id BIGINT[]
);

COMMENT ON TABLE topics IS 'Table contains the forum topics'' data';
COMMENT ON COLUMN topics.id IS 'Topic''s identifier';
COMMENT ON COLUMN topics.title IS 'Topic''s identifier';
COMMENT ON COLUMN topics.messages_id IS 'Column contains identifiers of each message on this topic';

CREATE SEQUENCE IF NOT EXISTS topic_id_sequence START WITH 1 MINVALUE 1 INCREMENT BY 1;
COMMENT ON SEQUENCE topic_id_sequence IS 'Sequence for identifiers of table ''topics''';