### Spring boot request-response log

- There is two strategy 
  - Check filter package 
    - first package: it will not print response body
    - second package: it will print response body

### Curl Request - data will be populated when application starts up 

    curl --location --request GET 'localhost:8080/product'


    curl --location --request GET 'localhost:8080/product/3'


### Log in the console for second strategy

    API Request [method=GET;uri=/product/3;client=0:0:0:0:0:0:0:1;headers=[user-agent:"PostmanRuntime/7.29.2", accept:"*/*", postman-token:"a85d88e1-523a-4cae-a5ad-92cdd91e1f3b", host:"localhost:8080", accept-encoding:"gzip, deflate, br", connection:"keep-alive"]]


    API Response [statusCode=200;contentType=application/json;payload={"id":3,"name":"cZGoz","quantity":2,"price":4.0}]



For Exception : You need to write logic to print.




