This project is a basic example of ELK stask. Upon running this project you run 3 containers -> E + L + K.
And then you can insert some data using logstash and see them in Kibana


## Step1: Run this project:
```
docker-compose up --build
```

## Step2: Run test case
```
vi file.log
#write some garbage there
nc localhost 5301 < file.log
```

## Step3: See results in kibana
Now inside the kibana/logfiles there is a file.log anything you write there will end up in kibana as log