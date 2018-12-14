CREATE SCHEMA gecko
  AUTHORIZATION local;

GRANT ALL ON SCHEMA gecko TO local;
GRANT ALL ON SCHEMA gecko TO postgres;
COMMENT ON SCHEMA gecko
  IS 'schema for gecko';