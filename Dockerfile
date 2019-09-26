FROM websphere-liberty:webProfile7

ADD target/MSDEVOPSPOC.war /config/dropins/

EXPOSE 9080

ENV LICENSE accept
