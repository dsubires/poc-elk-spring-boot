# poc-elk-spring-boot
Monitor Spring Boot Application Performance with Elastic APM, Elasticsearch and Kibana 
& 
Collect and analyze Spring Boot logs using Filebeat and Elastic Stack (ELK)

# Deploy containers

1. git clone https://github.com/dsubires/poc-elk-spring-boot.git
2. mvn package 
3. docker-compose -f docker/docker-compose.yml up -d 

NOTE: If the APM Server service does not start, it is because it uses Elasticsearch and it takes a while for it to start. To solve this, just restart some containers using this command: docker-compose -f docker / docker-compose.yml subtract apm user-microservice


# More info
http://dasubipar.blogspot.com/2021/02/monitorizacion-y-logging-de.html
