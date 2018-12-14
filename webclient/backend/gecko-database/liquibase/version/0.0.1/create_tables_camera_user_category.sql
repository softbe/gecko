CREATE TABLE public.user
(
  id bigserial NOT NULL,
  login CHARACTER VARYING NOT NULL,
  password CHARACTER VARYING NOT NULL,
  name CHARACTER VARYING,
  phoneNumber CHARACTER VARYING(100),
  active BOOLEAN DEFAULT FALSE NOT NULL,
  CONSTRAINT user_pkey PRIMARY KEY (id)
);

CREATE TABLE public.category
(
  id bigserial NOT NULL,
  name CHARACTER VARYING NOT NULL,
  description CHARACTER VARYING(1024),
  parent_id BIGINT,
  CONSTRAINT category_pkey PRIMARY KEY (id),
  CONSTRAINT fk_category_to_category FOREIGN KEY (parent_id) REFERENCES public.category (id)
);

CREATE TABLE public.camera
(
  id bigserial NOT NULL,
  login CHARACTER VARYING NOT NULL,
  password CHARACTER VARYING NOT NULL,
  name CHARACTER VARYING NOT NULL,
  description CHARACTER VARYING(1024),
  ip CHARACTER VARYING(100),
  port_rtsp INT,
  port_web INT,
  link_rtsp CHARACTER VARYING(512),
  pt2 BOOLEAN DEFAULT FALSE,
  category_id BIGINT,
  user_created_id BIGINT,
  CONSTRAINT camera_pkey PRIMARY KEY (id),
  CONSTRAINT fk_camera_to_category FOREIGN KEY (category_id) REFERENCES public.category (id),
  CONSTRAINT fk_camera_to_user FOREIGN KEY (user_created_id) REFERENCES public.user (id)
);

