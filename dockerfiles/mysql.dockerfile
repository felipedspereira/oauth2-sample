FROM mysql:8
MAINTAINER Felipe Pereira <felipe.dspereira@gmail.com>
ADD init.sql /docker-entrypoint-initdb.d