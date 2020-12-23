
CREATE TABLE public.order_json
(
id bigint PRIMARY KEY  NOT NULL GENERATED ALWAYS AS IDENTITY
	( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 9223372036854775807 CACHE 1 ),

request json);


CREATE PROCEDURE INSERT_JSON_REQUEST( request text)
LANGUAGE SQL
AS $BODY$
    INSERT INTO order_json(request)
    VALUES(request);
$BODY$;

create function INSERT_JSON_REQUEST_fn(request text)
  returns text
as
$$
    INSERT INTO order_json(request)
    VALUES(request);

  select 'ok';
$$
language sql;


